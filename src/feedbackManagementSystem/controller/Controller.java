package feedbackManagementSystem.controller;

import feedbackManagementSystem.service.impl.ServiceImpl;

public class Controller {

    ServiceImpl service=new ServiceImpl();

   public void signup(String name,String phoneNumber,String password,String role){
        service.signup(name,phoneNumber,password,role);
    }

   public boolean signin(String phoneNumber,String password,String role){
       return  service.signin(phoneNumber,password,role);
    }

   public void creatBatch(String adminPhoneNumber,String batchName,String bId){
        service.createBatch(adminPhoneNumber,batchName,bId);
    }

   public void assignBatch(String adminPhoneNumber,String studentPhoneNumber,String bId){
        service.assignBatch(adminPhoneNumber,studentPhoneNumber,bId);
    }
}
