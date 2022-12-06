
/*
 *  Here's the bottom line guideline: If a client can reasonably be expected
 *  to recover from an exception, make it a checked exception. If a client
 *  cannot do anything to recover from the exception, make it an unchecked 
 *  exception. (From Oracle Docs)
 */
public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException(String msg){
        super(msg);
    }
}
