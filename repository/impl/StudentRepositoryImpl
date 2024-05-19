package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Student;
import feedbackManagementSystem.repository.StudentRepository;


public class StudentRepositoryImpl implements StudentRepository {

    
    public void save(Student student) {
        studentList.add(student);
    }

    
    public Student fetchStudent(String studentPhoneNumber) {
        for(Student x: studentList){
            if(x.getPhoneNumber().equals(studentPhoneNumber))
                return x;
        }
        return null;
    }
}
