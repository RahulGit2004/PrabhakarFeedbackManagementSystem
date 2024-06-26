package feedbackManagementSystem.entity;

import java.util.ArrayList;

public class Batch {
    //attribute
    private String name;
    private String bId;
    private String feedbackTemplateId;



    private ArrayList<Student> studentList= new ArrayList<>();
    private ArrayList<Feedback> feedbackList=new ArrayList<>();

    //Contructor
    public Batch(String name, String bId) {
        this.name = name;
        this.bId = bId;
    }

    //getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(ArrayList<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    public String getFeedbackTemplateId() {
        return feedbackTemplateId;
    }

    public void setFeedbackTemplateId(String feedbackTemplateId) {
        this.feedbackTemplateId = feedbackTemplateId;
    }
    public void addStudent(Student student){
        studentList.add(student);
    }
}
