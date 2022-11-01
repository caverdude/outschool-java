public class Main {

    public static void main(String[] args) {
        Assignment test = new Assignment();

        System.out.println(test.assignment("Hi"));
        System.out.println(test.assignment(3));
        test.assignment();
        
    }

}

class Assignment {
    

    public Assignment(){

    }


    public void assignment() {
        System.out.println("Did not return anything.");
        return;
    }
    public String assignment(String newName){
       
        return newName;
    }
    public int assignment(int newNum){
        
        return newNum;
    }
} 