package feedbackManagementSystem.service;


import feedbackManagementSystem.repository.QuestionRepository;
import feedbackManagementSystem.repository.impl.AdminRepositoryImpl;
import feedbackManagementSystem.repository.impl.BatchRepositoryImpl;
import feedbackManagementSystem.repository.impl.QuestionRepositoryImpl;
import feedbackManagementSystem.repository.impl.StudentRepositoryImpl;

public interface Service {
    StudentRepositoryImpl studentRepo=new StudentRepositoryImpl();
    AdminRepositoryImpl adminRepo=new AdminRepositoryImpl();
    BatchRepositoryImpl batchRepo=new BatchRepositoryImpl();
    QuestionRepositoryImpl questionRepo=new QuestionRepositoryImpl();

    void signup(String name,String phoneNumber,String password,String role);
    boolean signin(String phoneNumber,String password,String role);
    void createBatch(String adminPhoneNumber,String batchName,String bId);
    void assignBatch(String adminPhoneNumber,String studentPhoneNumber,String bId);
    void createQuestion(String question,String qId);
    void createFeedback(String fId);
}
