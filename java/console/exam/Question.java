import java.util.ArrayList;

public abstract class Question implements Questions{
    private static ArrayList<String> types = new ArrayList<String>();
    static String[] getQuestionTypes(){
        return (String[]) types.toArray();
    }
    static void registerQuestionType(String type){
        types.add(type);
    }

    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer1() {
        return answer1;
    }
    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }
    public String getAnswer2() {
        return answer2;
    }
    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }
    public String getAnswer3() {
        return answer3;
    }
    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }
    public String getAnswer4() {
        return answer4;
    }
    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }
    public boolean isScore1() {
        return score1;
    }
    public void setScore1(boolean score1) {
        this.score1 = score1;
    }
    public boolean isScore2() {
        return score2;
    }
    public void setScore2(boolean score2) {
        this.score2 = score2;
    }
    public boolean isScore3() {
        return score3;
    }
    public void setScore3(boolean score3) {
        this.score3 = score3;
    }
    public boolean isScore4() {
        return score4;
    }
    public void setScore4(boolean score4) {
        this.score4 = score4;
    }

    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private boolean score1 = false;
    private boolean score2 = false;
    private boolean score3 = false;
    private boolean score4 = false;
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
        System.out.println("[question]\n"+question);
        System.out.println("[answer]\n"+answer1);
        System.out.println("[answer]\n"+answer2);
        System.out.println("[answer]\n"+answer3);
        System.out.println("[answer]\n"+answer4);
        System.out.println("[score]\n"+score1);
        System.out.println("[score]\n"+score2);
        System.out.println("[score]\n"+score3);
        System.out.println("[score]\n"+score4);
        return aString;
    }
    @Override
    public int getCorrectAnswer() {
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
