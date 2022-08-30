import java.util.ArrayList;
import java.util.Iterator;

public class Loops {
    public Loops() {
        int[] cards=new int[52];
        System.out.println("Building card deck...");
        for (int i = 0; i < 52; i++) {
            cards[i]=random(52,false);
        }
        System.out.println("For Loop");
        
        int i=0;
        for (; i < 52; i++) {
            System.out.print(" "+cards[i]);
        }
        System.out.println("\n");
        System.out.println("For Each Loop");
        // c is incremented implicitly, it stops at end of array length.
        for(int c:cards){ // for each card loop
            System.out.print(" "+c);
        }
        System.out.println("\n");
        System.out.println("While Loop");
        i=0; // initialize counter
        while(i<52){
            //use current counter value the increment it
            System.out.print(" "+cards[i++]); 
            // could also put i++ here, no ++ in index
        }
        System.out.println("\n");

        System.out.println("Do While Loop");
        i=0;
        // not the best example of a use of do while loop
        do{ // loop is executed at least once
            System.out.print(" "+cards[i++]);
        }while(i<52);
        System.out.println("\n");
        // <Integer> means this is a parameterized collection.
        // This means it holds Integer objects.
        ArrayList<Integer> cardsList = new ArrayList<Integer>();
        // List is a collection type or data structure
        System.out.println("Building ArrayList...");
        // index is created implicitly and is not visible
        for(int c:cards){ // for each card loop where c is the value, not index
            cardsList.add(c); // int is converted to Integer implicitly
        }
        System.out.println("\n");

        System.out.println("Iterator While Loop");
        // Iterator is a design pattern
        Iterator<Integer> cardsIterator = cardsList.iterator();


        while(cardsIterator.hasNext()){
            System.out.print(" "+cardsIterator.next()); // implicit call to toString()
        }
        System.out.println("\n");

        System.out.println("ArrayList forEach method");
        /*  This looks much more elegant but
         * it's more complex to describe
         * -> is a java lambda function with one statement to output 
         * the card. card variahle in this case is an Integer. 
         * counter and loop is done internally in the forEach method 
         * call implicitly. Lambda functions are an advanced topic
         * but you should know how to recognize them. 
         */
        cardsList.forEach(card -> System.out.print(" "+card));  

        System.out.println("\nLoop using a float variable.");
        // also works with f++ for whole numbers
        for(float f=0.0f;f<10.0;f=f+0.1f){
            System.out.printf("%2.1f\n",f);
        }
    }
    public int random(int largest, boolean zero){
        int randomNum = (int)(Math.random()*largest);
        if(zero)return randomNum;
        return randomNum+1;
    }

    public static void main(String args[]){
        new Loops();
    }

    

}
