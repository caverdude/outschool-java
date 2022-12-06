import javax.swing.*;
import java.io.*;

public class ClassCastExceptionExample {
    public static void main(String args[]){

        while(true){
            try{
                FoodBasket foodBasket = new FoodBasket();
                Apple apple = new Apple();
                Tomato tomato = new Tomato();
        
                foodBasket.add(apple);
                foodBasket.add(tomato);
                
                System.out.println("Apple is an instance of Fruit is "+
                    (foodBasket.get(0)instanceof Fruit));
                System.out.println("Apple-"+(Vegetable)foodBasket.get(0));
                System.out.println("Tomato-"+foodBasket.get(1));

            }catch(ClassCastException cce){
                cce.printStackTrace();
                StringWriter sw = new StringWriter();
                PrintWriter pw = new PrintWriter(sw);
                cce.printStackTrace(pw);
                String sStackTrace = sw.toString();
                JOptionPane.showMessageDialog(null,
                sStackTrace,
                "Inane warning",
                JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
        }
    }
}
