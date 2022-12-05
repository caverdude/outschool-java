import javax.swing.JOptionPane;

public class CauseError {

    public static void main(String args[]){
        // try the folowing with .methodA() and .methodC()
        new CauseError().methodC();
    }

    public void methodA(){
        methodB();
    }
    public void methodB(){
        methodA();
    }

    public void methodC(){
        try{
            methodA();
        }catch(StackOverflowError sofe){
            // try this with the following line commented out
            // you will see no output at all, the program just stops
            //sofe.printStackTrace();
            // try the toString()
            //System.out.println(""+sofe.toString());
            // try a custom text message
            //System.out.println("Stack Overflow Error!!!!! Program halted.");
            // try GUI message box
            JOptionPane.showMessageDialog(null, "Stack Overflow Error!!!!! Program halted.");
        }
    }
}
