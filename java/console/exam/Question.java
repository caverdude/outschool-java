public class Question{
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
    public Question(String question, String answer1, String answer2, String answer3, String answer4, int score){
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        if (score == 1){
            score1 = true;
        } else if (score == 2){
            score2 = true;
        } else if (score == 3){
            score3 = true;
        } else if (score == 4){
            score4 = true;
        }
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
}
