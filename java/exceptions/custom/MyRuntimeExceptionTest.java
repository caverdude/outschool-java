

public class MyRuntimeExceptionTest {
    public static void main(String args[]){
        for(int i=0;i<100;i++){
            System.out.println("The number i is:"+i);
            if(i==50) throw new MyRuntimeException("I=50!");
        }
        while(true);
    }
}
