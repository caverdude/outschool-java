public class Main {

    public static void main(String[] args) {
        Assignment test = new Assignment(3);
        System.out.println(test.name);
        System.out.println(test.count);
        Assignment test2 = new Assignment("hi");
        System.out.println(test2.name);
        System.out.println(test2.count);
        Assignment test3 = new Assignment();
        System.out.println(test3.name);
        System.out.println(test3.count);
    }

}

class Assignment {
    int count;
    String name;


    public Assignment() {
        return;
    }
    public Assignment(String newName){
        name = newName;
    }
    public Assignment(int newNum){
        count = newNum;
    }
} class Main {
    
}
