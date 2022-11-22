import java.util.ArrayList;

public abstract class Answer implements Answers{
    private static ArrayList<String> types = new ArrayList<String>();
    public static String[] getAnswerTypes(){
        return (String[]) types.toArray();
    }
    public static void registerAnswerType(String type){
        types.add(type);
    }
}
