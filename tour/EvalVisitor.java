
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer>{

	Map<String,Integer> memory = new HashMap<String,Integer>();

	public Integer visitAssign(LabeledExprParser.AssignContext ctx){
		String id = ctx.ID().getText();
		int value = visit(ctx.expr());
		memory.put(id,value);
		return value;
	}

	public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx){
		Integer value = visit(ctx.expr());
		System.out.println(value);
		return 0;
	}

	public Integer visitInt(LabeledExprParser.IntContext ctx){
		return Integer.valueOf(ctx.INT().getText());
	}

	public Integer visitId(LabeledExprParser.IdContext ctx){
		String id = ctx.ID().getText();
		if(memory.containsKey(id)) return memory.get(id);
		return 0;
	}

	public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx){
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));
		if(ctx.op.getType() == LabeledExprParser.MUL) return left * right;
		return left / right;
	}

	public Integer visitAddSub(LabeledExprParser.AddSubContext ctx){
		int left = visit(ctx.expr(0));
		int right = visit(ctx.expr(1));

		if(ctx.op.getType()== LabeledExprParser.ADD) return left + right;
		return left -right;
	}

	public Integer visitParens(LabeledExprParser.ParensContext ctx){
		return visit(ctx.expr());
	}
	public Integer visitClear(LabeledExprParser.ClearContext ctx) { 
		memory = new HashMap<String,Integer>();
		return 0;
	 }
}