package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Feedback;
import feedbackManagementSystem.repository.FeedbackRepository;

public class FeedbackRepositoryImpl implements FeedbackRepository {


    public void save(Feedback feedback) {
        feedbackList.add(feedback);
    }


    public Feedback fetchFeedback(String fId) {
        for(Feedback x: feedbackList){
            if(x.getfId().equals(fId))
                return x;
        }
        return null;
    }
}
