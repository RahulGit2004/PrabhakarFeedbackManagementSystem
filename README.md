Feedback Management System:

Requirements:

        * A user can signup using with admin or student role.  (Done)
        * Admin can create a batch.(done)
        * Admin can assign a batch to a student. (Done)
        * An admin user can create/edit/delete questions for feedback for different batches. (In Progress)
        * A student can see all the feedbacks for his assigned batch and submit the feedback.
        * The admin can see the feedback of a individual student as well.
        * The admin should be able to see all the feedbacks of students batchwise.


Implimentation:

1.Entity

    a. Student
            //attributes
                name
                phoneNumber
                password
                batchId
                batchName
                profilePhotoUrl
                list<feedback>

            //Consructor
                Student(name,phoneNumber,password)

            //getter & setter

    b. Admin
            //attributes
                name
                phoneNumber
                password
                profilePhotoUrl

            //Consructor
                Admin(name,phoneNumber,password)

            //getter & setter
    
    c. Batch
        //attributes
            name
            bId
            list<Student>
            list<feedback>

        //constructor
            Batch(name,bId)
       //behavior
              void addStudent(student object)  ----> It will add a student in the studentList of the batch

    d. Feedback
            //attributes
                fID
                studentPhoneNumber
                list<Question>


            //getter & setter

    e. Question
            //attributes
                qID
                question
                answer

            //getter & setter
                
2.UiClient

    a.StudentUiClient
        signup(name,phoneNumber,password,"student")   -----> call Controller signup function.
        signin(phoneNumber,password,"student")        -----> call Controller signin function.

    b.AdminUiClient
        signup(name,phoneNumber,password,"admin")     -----> call Controller signup function.
        signin(phoneNumber,password,"admin")          -----> call Controller signin function.
        createBatch(AdminPhoneNumber)                 -----> call Controller createBatch function.
        assignBatch(AdminPhoneNumber,StudentPhoneNumber)  -----> call Controller assingBatch function.


3.Controller

    a.Controller
        //attributes
            object of Service
            
        //behavior
            void signup(name,phoneNumber,password,role)                 -----> call Service signup() function.
            boolean signin(phoneNumber,password)                        -----> call Service signin() functon.
            void createBatch(adminPhoneNumber,batchName,bId)            -----> call service createBatch() function.
            void assignBatch(adminPhoneNumber,studentPhoneNumber,bId)   -----> call Service assignBatch() function.

4.Service

    a.Service
        //attributes
            object of StudentRepository.
            object of AdminRepository.
            object of BatchRepository.

        //behavior
            void signup(name,phoneNumber,password,role)             ----> create an appropriate object and save it in the  repository  by calling save() function of respective repository.
            boolean signin(phoneNumber,password,role)               ----> fetch matching phoneNumber user from respective Repository and match password . after succesfull authentication return true.
            void createBatch(adminPhoneNumber,batchName,bId)        ----> authenticate admin then create a batch object and call save() of BatchRepository.
            void assignBatch(adminPhoneNumber,studentPhoneNumber,bId)   ----> authenticate admin then fetch the matching student and set its batch and call addStudentToBatch() of BatchRepository.

           

5.Repository

    a.StudentRepository
        //attributes
            list<student>
            

        //behavior
            void save(Student obj)                      ----> it will add obj in the list appropriate list according to role provided.
            Student fetchStudent(studentPhoneNumber)    ----> It will search student from list and returns it.
    
    b.AdminRepository
        //attributes
            list<Admin>

        //behavior
            void save(Admin obj)                        ----> it will add obj in the list appropriate list according to role provided.
            Admin fetchAdmin(AdminPhoneNumber)          ----> It will search admin from list and return it.
            boolean isAdmin(adminPhoneNumber)           ----> searches for admin and return true if found.

    c. BatchRepository
        //attributes
            list<Batch>

        //behavior 
            void save(Batch obj)                     ----> It will add the obj in the batch list.
            void addStudentToBatch(Student obj,bId)  ----> It will add the student in respective batch's students list.

    
    
