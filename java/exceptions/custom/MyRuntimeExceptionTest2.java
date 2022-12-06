
public class MyRuntimeExceptionTest2 {
    public static void main(String args[]) {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("The number i is:" + i);
                if (i == 50)
                    throw new MyRuntimeException("I=50!");
            }
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        while (true);
    }
}
