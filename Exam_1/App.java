public class App {
    public static void main(String[] args) {
 

        Student student = new Student ();
        
        student.surname = "Delos reyes";
        student.firstname = "Mark Simmone";
        student.middleInitial = 'E';
        student.dateOfBirth = 11/14/03;
        student.studentNumber = 2022101342;
        student.studentEmailAddress = "delosreyesme@students.national.edu.ph";
        student.iAmAwesome = true;

        student.sayMyStudentNumber();
        student.sayMyEmailAddress();
        student.sayamIAwesome();

   
    }
}

