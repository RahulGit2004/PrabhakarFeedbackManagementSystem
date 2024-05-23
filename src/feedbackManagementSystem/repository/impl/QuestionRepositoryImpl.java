package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.repository.QuestionRepository;
import feedbackManagementSystem.entity.Question;

public class QuestionRepositoryImpl implements QuestionRepository {



    public void save(Question question) {
        questionList.add(question);
    }


    public Question fetchQuestion(String qId) {
        for(Question x: questionList){
            if(x.getqId().equals(qId))
                return x;
        }
        return null;
    }
}
