public class MultipleChoiceQuestion extends Question{
    @Override
    public boolean isMoreThanOneAnswerCorrect(){
        return false;
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
}
