package feedbackManagementSystem.entity;

import java.util.ArrayList;

public class Feedback {
    //attributes
    private String fId;
    private String studentPhoneNumber;
    private ArrayList<Question> questionList=new ArrayList<>();

    //Contructor
    public Feedback(String fId) {
        this.fId = fId;
    }

    //getter & setter
    public String getfId() {
        return fId;
    }

    public void setfId(String fId) {
        this.fId = fId;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public ArrayList<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(ArrayList<Question> questionList) {
        this.questionList = questionList;
    }
}
