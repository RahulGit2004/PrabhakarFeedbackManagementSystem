package feedbackManagementSystem.repository.impl;

import feedbackManagementSystem.entity.Admin;
import feedbackManagementSystem.repository.AdminRepository;

public class AdminRepositoryImpl implements AdminRepository {


    
    public void save(Admin admin) {
        adminList.add(admin);
    }

    
    public Admin fetchAdmin(String phoneNumber) {
        for(Admin x: adminList){
            if(x.getPhoneNumber().equals(phoneNumber))
                return x;
        }
        return null;
    }

   
    public boolean isAdmin(String phoneNumber) {
        for(Admin x: adminList){
            if(x.getPhoneNumber().equals(phoneNumber))
                return true;
        }
        return false;
    }
}
