package feedbackManagementSystem.repository;

import feedbackManagementSystem.entity.Question;

import java.util.ArrayList;

public interface QuestionRepository {
    ArrayList<Question> questionList=new ArrayList<>();

    void save(Question question);
    Question fetchQuestion(String qId);
}
