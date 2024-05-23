package feedbackManagementSystem.repository;

import feedbackManagementSystem.entity.Feedback;

import java.util.ArrayList;

public interface FeedbackRepository {
    ArrayList<Feedback> feedbackList=new ArrayList<>();

    void save(Feedback feedback);
    Feedback fetchFeedback(String fId);
}
