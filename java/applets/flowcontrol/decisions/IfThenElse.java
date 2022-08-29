public class IfThenElse {
    int a=5;
    int b=33;
    boolean t=true;
    boolean f=false;
    String name1="Larry";
    String name2="Larry";
    String name3="John";
    public IfThenElse(){
        if(a==b){
            System.out.println("a is = to b");
        }
        if(a!=b){
            System.out.println("a is not = to b");
        }
        /*if(a=b){  // can not convert from int to boolean!
         *
        }*/
        // no truthy or falsy in Java. 
        System.out.println("t=f "+(t=f));
        if(t=f){ // this assignes value of f to t so both are false.
            System.out.println("t is = to f");
        }
        System.out.println("f=t "+(f=t));
        if(f=t){
            System.out.println("t is = to f");
        }
        t=true;
        if(t!=f){ // not does nothing here because it's a math unary operator
                  // so t is still set to false
            System.out.println("t is not = to f");
            System.out.println("t:"+t+" f:"+f);
        }
        if(t==f){
            System.out.println("t is = to f");
        }
        if(t!=f){
            System.out.println("t is not = to f");
        }
        if(name1==name2){
            System.out.println("name1 is = to name2");
        }
        if(name1.equals(name2)){
            System.out.println("name1 is equal to name2");
        }
        if(name1.equals(name3)){
            System.out.println("name1 is equal to name3");
        }else{
            System.out.println("name1 is not equal to name3");
        }

    }
    public static void main(String args[]){
       new IfThenElse();

    }
}
