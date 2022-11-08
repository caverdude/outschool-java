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
}
