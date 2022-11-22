import java.util.ArrayList;

public abstract class Question implements Questions{
    private static ArrayList<String> types = new ArrayList<String>();
    public static String[] getQuestionTypes(){
        return (String[]) types.toArray();
    }
    public static void registerQuestionType(String type){
        types.add(type);
    }

    public String question;
    public String answer1;
    public String answer2;
    public String answer3;
    public String answer4;
    public boolean score1 = false;
    public boolean score2 = false;
    public boolean score3 = false;
    public boolean score4 = false;
    public Question(){

    }
    public Question(String question, String answer1, String answer2, String answer3, String answer4, boolean[] score){
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.score1=score[0];
        this.score2=score[1];
        this.score2=score[2];
        this.score2=score[3];
    }
    public String toString(){
        String aString = question+"\n" + answer1+"\n"+answer2+"\n"+answer3+"\n"+answer4+"\n"+score1+"\n"+score2+"\n"+score3+"\n"+score4+"\n";
        System.out.println(""+question);
        System.out.println(""+answer1);
        System.out.println(""+answer2);
        System.out.println(""+answer3);
        System.out.println(""+answer4);
        System.out.println(""+score1);
        System.out.println(""+score2);
        System.out.println(""+score3);
        System.out.println(""+score4);
        return aString;
    }
    @Override
    public int correctAnswer() {
        if (score1 == true){
            return 1;
        } 
        if (score2 == true){
           return 2;
        }
        if (score3 == true){
            return 3;
        }
        if (score4 == true){
           return 4;
        }
        return 0;
    }
}
