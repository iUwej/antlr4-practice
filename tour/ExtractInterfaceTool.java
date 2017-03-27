import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class ExtractInterfaceTool{

	public static void main(String[] args) throws Exception{
		String inputFile =null;
		if(args.length < 1){
			throw new RuntimeException("Must provide file for analysis");
		}
		inputFile = args[0];
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(inputFile));
		JavaLexer lexer = new JavaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JavaParser parser = new JavaParser(tokens);
		ParseTree tree = parser.compilationUnit();
		ParseTreeWalker walker = new ParseTreeWalker();
		ExtractInterfaceListener extractor  = new ExtractInterfaceListener(parser);
		walker.walk(extractor,tree);


	}
}