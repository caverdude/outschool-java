


public class StaticInitializerBlocks {
    static{
        System.out.println("Run before class loads");
    }

    {
        System.out.println("Run before object is created.");
    }

    public StaticInitializerBlocks(){
        
        System.out.println("Create noargs object");

    }
    public StaticInitializerBlocks(int a){
        
        System.out.println("Create object with args");
    }

    public static void main(String args[]){
        new StaticInitializerBlocks();
        new StaticInitializerBlocks(0);
        new StaticInitializerBlocks();
        new StaticInitializerBlocks(2);
    }

    
}
