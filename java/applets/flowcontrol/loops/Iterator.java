public class Iterator {
    public Iterator(){
        for(float i=0.0f;i<10.0;i=i+0.1f){

            System.out.println(""+i);
        }
    }
    public static void main(String args[]){
        new Iterator();
    }
}
