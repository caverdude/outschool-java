import java.util.ArrayList;
import java.util.Iterator;

public class Loops {
    public Loops() {
        int[] cardsID=new int[52]; // no number 1 card, ace is number1
        String[] cards = {
            "2Sp","3Sp","4Sp", "5Sp","6Sp","7Sp","8Sp","9Sp", "10Sp",
            "JackSp","QueenSp","KingSp","AceSp",
            "2Di","3Di","4Di", "5Di","6Di","7Di","8Di","9Di", "10Di",
            "JackDi","QueenDi","KingDi","AceDi",
            "2He","3He","4He", "5He","6He","7He","8He","9He", "10He",
            "JackHe","QueenHe","KingHe","AceHe",
            "2Cl","3Cl","4Cl", "5Cl","6Cl","7Cl","8Cl","9Cl", "10Cl",
            "JackCl","QueenCl","KingCl","AceCl",
        };
        System.out.println("\n");
        System.out.println("Cards length:"+cards.length);
        for (int i=0; i < cards.length; i++) { 
            System.out.print(" "+cards[i]);
        }

        char sp='\u9824'; // unicode spades black
        char di='\u9830'; // unicode diamonds black
        char he='\u9829'; // unicode hearts black
        char cl='\u9827'; // unicode clubs black

        char wsp='\u9828'; // unicode spades black
        char wdi='\u9826'; // unicode diamonds black
        char whe='\u9825'; // unicode hearts black
        char wcl='\u9831'; // unicode clubs black
        
        
        String[] cards2 = {
            "2"+sp,"3"+sp,"4"+sp, "5"+sp,"6"+sp,"7"+sp,"8"+sp,"9"+sp, "10"+sp,
            "Jack"+sp,"Queen"+sp,"King"+sp,"Ace"+sp,
            "2\u9826","3\u9826","4\u9826", "5\u9826","6\u9826","7\u9826","8\u9826","9\u9826", "10\u9826",
            "Jack\u9826","Queen\u9826","King\u9826","Ace\u9826",
            "2He","3He","4He", "5He","6He","7He","8He","9He", "10He",
            "JackHe","QueenHe","KingHe","AceHe",
            "2Cl","3Cl","4Cl", "5Cl","6Cl","7Cl","8Cl","9Cl", "10Cl",
            "JackCl","QueenCl","KingCl","AceCl",
        };
        System.out.println("\n");
        System.out.println("Cards2 length:"+cards2.length);
        // this doesn't work because windows console doesn't have
        // a unicode font that I can find. It should work in an applet 
        // though somehow, either with drawString or maybe in text area box
        // it would work for html text strings also
        for (int i=0; i < cards2.length; i++) { 
            System.out.print(" "+cards2[i]);
        }
        System.out.println("\n");
       
        System.out.println("Building card deck...");

        // i is defined in loop scope
        for (int i = 0; i < 52; i++) {
            cardsID[i]=random(52,false);
        }
        System.out.println("For Loop");
        // can initialize I here external to the loop but it's
        // in method scope not loop scope
        System.out.println("First Name of cards.");
        for (int i=0; i < 52; i++) {
            System.out.print(" "+cards[cardsID[i]]);
        }
        System.out.println("Next four examples of cardID.");
        for (int i=0; i < 52; i++) {
            System.out.print(" "+cardsID[i]);
        }
        System.out.println("\n");
        System.out.println("For Each Loop");
        // c is incremented implicitly, it stops at end of array length.
        for(int c:cardsID){ // for each card loop
            System.out.print(" "+c);
        }
        System.out.println("\n");
        System.out.println("While Loop");
        int i=0; // initialize counter again
        while(i<52){
            //use current counter value the increment it
            System.out.print(" "+cardsID[i++]); 
            // could also put i++ here, no ++ in index
        }
        System.out.println("\n");

        System.out.println("Do While Loop");
        i=0; // initialize i one more time
        // not the best example of a use of do while loop
        do{ // loop is executed at least once
            System.out.print(" "+cardsID[i++]);
        }while(i<52);
        System.out.println("\n");
        // <Integer> means this is a parameterized collection.
        // This means it holds Integer objects.
        ArrayList<Integer> cardsIDList = new ArrayList<Integer>();
        // List is a collection type or data structure
        System.out.println("Building ArrayList...");
        // index is created implicitly and is not visible
        for(int c:cardsID){ // for each card loop where c is the value, not index
            cardsIDList.add(c); // int is converted to Integer implicitly
        }
        System.out.println("\n");

        System.out.println("Iterator While Loop");
        // Iterator is a design pattern
        Iterator<Integer> cardsIDIterator = cardsIDList.iterator();


        while(cardsIDIterator.hasNext()){
            System.out.print(" "+cardsIDIterator.next()); // implicit call to toString()
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
        cardsIDList.forEach(card -> System.out.print(" "+card));  

        System.out.println("\nLoop using a float variable.");
        // also works with f++ for whole numbers
        for(float f=0.0f;f<10.0;f=f+0.1f){
            System.out.printf("%2.1f\n",f);
        }
    }

    // see borrowed from Random examples class
    public int random(int largest, boolean zero){
        int randomNum = (int)(Math.random()*largest);
        if(zero)return randomNum;
        return randomNum+1;
    }



    public static void main(String args[]){
        new Loops();
    }

    

}
