package feedbackManagementSystem.entity;

public class Admin {
    //attributes
    private String name;
    private String phoneNumber;
    private String password;
    private String profilePhoto;

    //Constructor
    public Admin(String name, String phoneNumber, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    //getter & setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
