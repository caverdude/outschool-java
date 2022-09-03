import java.io.PrintStream;
import java.nio.charset.Charset;

public class WindowsCharSet {
    public static void main(String[] args) throws Exception{
        Charset utf8Charset = Charset.forName("UTF-8");
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println(defaultCharset);
        // charset is windows-1252
    
        String unicodeMessage = "\u4e16\u754c\u4f60\u597d\uff01";
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        System.out.println(unicodeMessage);
        char sp='\u9824'; // unicode spades black
        char di='\u9830'; // unicode diamonds black
        char he='\u9829'; // unicode hearts black
        char cl='\u9827'; // unicode clubs black

        char wsp='\u9828'; // unicode spades black
        char wdi='\u9826'; // unicode diamonds black
        char whe='\u9825'; // unicode hearts black
        char wcl='\u9831'; // unicode clubs black
        System.out.println("cards:"+sp+di+he+cl+wsp+wdi+whe+wcl);
    
        byte[] sourceBytes = unicodeMessage.getBytes("UTF-8");
        String data = new String(sourceBytes , defaultCharset.name());
    
        //PrintStream out = new PrintStream(System.out, true, utf8Charset.name());
        out.println(data);
    }
}
