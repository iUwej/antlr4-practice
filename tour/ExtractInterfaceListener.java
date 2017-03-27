import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class ExtractInterfaceListener extends JavaBaseListener{

	JavaParser parser;



	public ExtractInterfaceListener(JavaParser parser){ this .parser = parser;}

	public void enterImportDeclaration(JavaParser.ImportDeclarationContext ctx){
		System.out.println(parser.getTokenStream().getText(ctx));

	}

	public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx){

		System.out.println("\ninterface I"+ctx.Identifier()+"{");
	}

	public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx){
		System.out.println("}");
	}

	public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx){
		TokenStream tokens = parser.getTokenStream();
		String type = "void";
		if(ctx.type() !=null){
			type = tokens.getText(ctx.type());
		}
		String args = tokens.getText(ctx.formalParameters());
		System.out.println("\t"+type+ " "+ctx.Identifier()+args+";");
	}
}