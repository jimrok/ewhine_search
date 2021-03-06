import java.io.IOException;
import java.io.StringReader;

import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.wltea.analyzer.lucene.IKAnalyzer;


public class TestAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IKAnalyzer analyzer = new IKAnalyzer();
		
		TokenStream ts = analyzer.tokenStream("hello", new StringReader("哈哈，这下可以搜索了吧"));

		Token token;
		try
	    {
			 while(ts.incrementToken())
	      {
	        System.out.println(ts.getAttribute(CharTermAttribute.class));
	      }
	    }
	    catch (IOException ioe)
	    {
	      ioe.printStackTrace();
	    }

	}

}
