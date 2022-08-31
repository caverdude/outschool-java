public class BreakContinueLabelReturn {
    
    BreakContinueLabelReturn(){
        System.out.println("Break example");
        int i;
        //breaks out of loop at 50
        for( i=0;i<100;i++){
            // print does not use carriage return which is \n in a string
            System.out.print(".");
            if(i==50)break;
        }
        System.out.println("i="+i);
        System.out.println("Continue example");
        for( i=0;i<100;i++){
            // 0 skips even numbers
            if(i%2==0) continue; // % means give remainder of division 0 or 1 in this case
            System.out.println("i="+i);
        }
        doSomething();
        doSomething2();
        doSomething3();
        // Label is the closest thing Java has to GOTO. 
        // And its very specific to beginning of static code blocks or loops.
        // myLabel:{      }  or myLabel:for{   } or myLabel:while{  } 
        // or myLabel:do{ }while()
        label();
        label2();
        // Labels must occur before the break or continue statements in code
        // Or compiler won't see the label.

    }

    public void doSomething(){
        System.out.println("\n\nReturn example to exit method.");
        for( int i=0;i<100;i++){
            // print does not use carriage return which is \n in a string
            System.out.print(".");
            if(i==50) return;
        }
        System.out.println("We never get here...");
    }

    public void doSomething2(){
        System.out.println("\n\nBreak example to exit loop.");
        for( int i=0;i<100;i++){
            
            System.out.print(".");
            if(i==50) break;
        }
        // break ends the loop
        System.out.println("We do get here...");
    }


    public void doSomething3(){
        System.out.println("\n\nContinue example example to jump to start of loop."+
                " Or Skip the remainder of the loop.");
        char A ='A';
        int intA = A; // converts a char to an int value for that char
        for( int i=0;i<26;i++){
            // Next we print out the char+i for each letter in alphabet            
            if(i==20) continue;// skips char number 20
            System.out.print(""+(char)(intA+i));
        }
        System.out.println("\n\nWhat character is missing? "+(char)(intA+20));
    }

    public void label(){
        System.out.println("Label test 1.");
        again1:{  // label  not used
            System.out.println("Starting loop");
            again:for(int i=0;i<3;i++){
                // if 2 skips the statements after continue 
                // starts at beginning of loop again.
                if (i==2) continue again;
                System.out.println("Hello.");
                
            }
            System.out.println("Ending loop");
        }

    }
    public void label2(){
        System.out.println("Label test  2.");
        again:{
            System.out.println("Starting loop");
            for(int i=0;i<3;i++){
                // label must be before break or continue statemetns
                if (i==2) break again;  
                System.out.println("Hello.");
            }
            // does not execute this next output
            System.out.println("Ending loop");
        } // break ends this code block, not just the loop.

    }

    public static void main(String args[]){
        // use of new keyword is a creational pattern called prototype
        new BreakContinueLabelReturn();
    }
}
