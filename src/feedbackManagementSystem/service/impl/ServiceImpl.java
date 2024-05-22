package feedbackManagementSystem.service.impl;

import feedbackManagementSystem.entity.Admin;
import feedbackManagementSystem.entity.Batch;
import feedbackManagementSystem.entity.Student;
import feedbackManagementSystem.service.Service;

public class ServiceImpl implements Service {


    public void signup(String  name, String phoneNumber,String password, String role) {
        if(role.equalsIgnoreCase("admin")){
            Admin obj=new Admin(name,phoneNumber,password);
            adminRepo.save(obj);
        }
        else{
            Student obj=new Student(name,phoneNumber,password);
            studentRepo.save(obj);
        }

    }


    public boolean signin(String phoneNumber, String password, String role) {
        if(role.equalsIgnoreCase("admin")){
            Admin admin=adminRepo.fetchAdmin(phoneNumber);
            if(admin != null){
                if(password.equals(admin.getPassword()))
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
        else{
            Student student=studentRepo.fetchStudent(phoneNumber);
            if(student != null){
                if(password.equals(student.getPassword()))
                    return true;
                else
                    return false;
            }
            else
                return false;
        }
    }


    public void createBatch(String adminPhoneNumber,String batchName,String bId) {
        if(adminRepo.isAdmin(adminPhoneNumber)){
            Batch batch=new Batch(batchName,bId);
            batchRepo.save(batch);
        }
        else
            System.out.println("Cannot create");

    }


    public void assignBatch(String adminPhoneNumber, String studentPhoneNumber,String bId) {
        if(adminRepo.isAdmin(adminPhoneNumber)){
            Student student= studentRepo.fetchStudent(studentPhoneNumber);
            student.setBatchId(bId);
            student.setBatchName(batchRepo.fetchBatch(bId).getName());
            batchRepo.addStudentToBatch(student,bId);
        }
        else
            System.out.println("cannot assign");
    }
}
