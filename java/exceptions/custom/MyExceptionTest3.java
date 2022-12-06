

public class MyExceptionTest3 {
    public static void main(String args[]) {

        for(int i=0;i<100;i++){
            System.out.println("The number i is:"+i);
            try{
            if(i==50) throw new MyException("I=50!");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        while(true);
    }
}
