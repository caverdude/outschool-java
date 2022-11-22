public interface Answers {
    String getAnswer();
    void setAnswer(String answer);
    void setCorrectAnswer();
    boolean isAnswerCorrect();
    void setAnswerPoints(float points);
    float getAnswerPoints();
}
