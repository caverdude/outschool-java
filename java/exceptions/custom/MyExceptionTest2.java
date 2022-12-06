

public class MyExceptionTest2 {
    public static void main(String args[]) throws MyException {
        for(int i=0;i<100;i++){
            System.out.println("The number i is:"+i);
            if(i==50) throw new MyException("I=50!");
        }
        while(true);
    }
}
