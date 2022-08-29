import java.util.Scanner;

public class ConsoleScannerExample2 {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter two numbers to be multiplied.");
        int num1 = myObj.nextInt();  // Read user input
        int num2 = myObj.nextInt();  // Read user input
        System.out.println("Num1 x Num2 is: " + num1*num2);  // Output user input
        myObj.close();
    }
}
