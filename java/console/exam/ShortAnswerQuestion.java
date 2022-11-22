public class ShortAnswerQuestion extends Question {
    
    private int a;
    private String b = "hello";

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public int getNumberOfAnswers() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setNumberOfAnswers(int numberOfAnswers) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isAnswerNumberCorrect(int answerNumber) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isMoreThanAnswerCorrect() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
