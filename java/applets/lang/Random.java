public class Random {
    public Random(){
        Double aRandomNumber = Math.random();
        System.out.println("Random Number:"+aRandomNumber);
        int largest = 100;
        int randomWholeNumber=(int)(aRandomNumber*largest);
        System.out.println("Random Number: "+randomWholeNumber);
        System.out.println("Random Number Near 1.0: "+(int)(100*.9999999999999999));
        System.out.println("Random Number Near 0.01: "+(int)(100*.0112334855673558));
        System.out.println("Random Number Less than 0.00: "+(int)(100*.0012334855673558));
        System.out.println("Random two Die role is: "+random(6,false)+
                                                 " "+random(6,false));
        System.out.println("Random Roulette spin is: "+random(37,true));
        System.out.println("Random Card pulled from deck(No Jokers) is: "+random(52,false));
        System.out.println("Random Card pulled from deck(With Jokers) is: "+random(54,false));
        System.out.println("Random dollar ammount: $"+String.format("%3.2f",randomDollar(100, true)));
        System.out.println("Random dollar ammount: $"+String.format("%3.2f",randomDollar(100, false)));
        
    }
    public int random(int largest, boolean zero){
        int randomNum = (int)(Math.random()*largest);
        if(zero)return randomNum;
        return randomNum+1;
    }
    public double randomDollar(int largest, boolean change){
        //cast to int rounds decimal part to 0, it's then stored in a double
        //+1 means whole dollar number, so if you use 50 your highest is 50 not 49
        //cast to double is needed because it will think we are doing interger
        // division without the cast
        double randomNum = (double)((int)(Math.random()*largest*100)+1)/100; 
        if(change)return randomNum;
        // makes an int to drop the change to 0 and returns as double
        return (int)(randomNum); 
    }


    public static void main(String args[]){
        new Random();
    }
}
