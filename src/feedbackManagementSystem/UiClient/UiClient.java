package feedbackManagementSystem.UiClient;
import feedbackManagementSystem.controller.Controller;



public class UiClient {
    public static void main(String[] args) {
        Controller controller=new Controller();


        //Populate some admin
        populateAdmin(controller);
        //Populate some Student
        populateStudent(controller);

        controller.signin("7348891347","1234","admin");

        controller.creatBatch("7348891347","Cage-1","c1");
        controller.creatBatch("7348891347","Cage-2","c2");
        controller.creatBatch("7348891347","Cage-3","c3");

        controller.assignBatch("7348891347","9798825716","c1");
        controller.assignBatch("7348891347","7050577303","c1");
        controller.assignBatch("7348891347","7463890034","c1");
        controller.assignBatch("7348891347","9472683541","c1");
        controller.assignBatch("7348891347","9110091744","c1");
        controller.assignBatch("7348891347","9142202033","c2");
        controller.assignBatch("7348891347","8987211979","c2");
        controller.assignBatch("7348891347","9546468148","c2");
        controller.assignBatch("7348891347","9525588208","c2");
        controller.assignBatch("7348891347","9576219441","c2");
        controller.assignBatch("7348891347","8809208891","c3");
        controller.assignBatch("7348891347","1234567890","c3");
        controller.assignBatch("7348891347","7644844528","c3");
        controller.assignBatch("7348891347","7493991930","c3");


    }


// ********************************Ignore below this**************************************************************** //
    //populateAdmin
    private static void populateAdmin(Controller controller){
        controller.signup("Rishi Rich","7348891347","1234","admin");
        controller.signup("Pallavi Kumari","9693243217","1234","admin");
        controller.signup("Abhishek kumar jha","8622074071","1234","admin");
        controller.signup("Gaurav Kashyap","9113170895","1234","admin");
    }

    //populateStudent
    private static void populateStudent(Controller controller){
        //for batch-1
        controller.signup("Prabhakar","9798825716","1234","student");
        controller.signup("Anshal","7050577303","1234","student");
        controller.signup("Ayush","7463890034","1234","student");
        controller.signup("Kriti","9472683541","1234","student");
        controller.signup("Ujjawal","9110091744","1234","student");

        //for batch-2
        controller.signup("Manjeet","9142202033","1234","student");
        controller.signup("Amit","8987211979","1234","student");
        controller.signup("Rohit","9546468148","1234","student");
        controller.signup("Aditya","9525588208","1234","student");
        controller.signup("Kishan","9576219441","1234","student");

        //for batch-3
        controller.signup("Rahul","8809208891","1234","student");
        controller.signup("Prince","1234567890","1234","student");
        controller.signup("Ritik","7644844528","1234","student");
        controller.signup("Aman","7493991930","1234","student");
    }
}
