package feedbackManagementSystem.entity;

public class Question {
    //attributes
    private String qId;
    private String question;
    private String answer;

    //constructor
    public Question(String question,String  qId) {
        this.question=question;
        this.qId = qId;
    }

    //getter & setter
    public String getqId() {
        return qId;
    }

    public void setqId(String qId) {
        this.qId = qId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
