public interface Questions {
    
    int getNumberOfAnswers();
    void setNumberOfAnswers(int numberOfAnswers);
    int getCorrectAnswer();
    boolean isAnswerNumberCorrect(int answerNumber);
    boolean isMoreThanAnswerCorrect();

}
