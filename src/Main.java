import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Career Compass");

        CareerPath softwareEngineer =
        new CareerPath(
                "Software Engineer",
                "Develops software applications and systems."
        );

CareerPath aiEngineer =
        new CareerPath(
                "AI/ML Engineer",
                "Builds machine learning and artificial intelligence solutions."
        );

CareerPath dataScientist =
        new CareerPath(
                "Data Scientist",
                "Analyzes data and extracts insights."
        );

CareerPath devOpsEngineer =
        new CareerPath(
                "DevOps Engineer",
                "Manages deployment, cloud and automation."
        );

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;
        do{
            System.out.println("\n===== Career Compass Menu =====");
            System.out.println("1. Add Student ");
            System.out.println("2. Dispay Students ");
            System.out.println("3. Search Student ");
            System.out.println("4. Delete Student ");
            System.out.println("5. View Student Count");
            System.out.println("6. Recommend Career");
            System.out.println("7. Exit! ");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
                    switch (choice) {
            case 1:
        System.out.println(" How many students do you want to add ? ");
        int count = sc.nextInt();
        sc.nextLine();

        for(int i =1 ; i <= count ; i++){
        
        System.out.println("\nStudent " + i);

        System.out.println(" Enter name : ");
        String name = sc.nextLine();

        System.out.println(" Enter Branch : ");
        String branch = sc.nextLine();

        System.out.println(" Enter year : ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println(" Enter interest : ");
        String interest = sc.nextLine();


        Student student = new Student(name,branch,year,interest);
        students.add(student);
        }
         System.out.println(" Students Added Successfully!");

                break;
            case 2:

            if(students.isEmpty()){
                System.out.println("No Students Available.");
            }else{
        System.out.println("\n====== Student List ======");

        for(Student s : students){
            s.displayStudentInfo();
            System.err.println();
        }
            }
                
                break;
            case 3:
                if(students.isEmpty()) {

        System.out.println("No students available.");

    } else {

        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for(Student s : students) {

            if(s.getName().equalsIgnoreCase(searchName)) {

                System.out.println("\nStudent Found:");
                s.displayStudentInfo();

                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Student not found.");
        }
    }
                break;
            case 4:
                if(students.isEmpty()) {

        System.out.println("No students available.");

    } else {

        System.out.print("Enter student name to delete: ");
        String deleteName = sc.nextLine();

        boolean deleted = false;

        for(int i = 0; i < students.size(); i++) {

            if(students.get(i).getName().equalsIgnoreCase(deleteName)) {

                students.remove(i);

                deleted = true;

                break;
            }
        }

        if(deleted) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
                break;

            case 5 :
                System.out.println("Total Students : "+ students.size());
                break;

            case 6 :
                System.out.print("Enter Student Name: ");
String searchName = sc.nextLine();
boolean found = false;

for(Student s : students)
{
    if(s.getName().equalsIgnoreCase(searchName))
    {
        found = true;

        String interest = s.getInterest();

        // Recommendation Logic Here
        if(interest.equalsIgnoreCase("Coding"))
{
    softwareEngineer.displayCareerPath();
}
else if(interest.equalsIgnoreCase("AI"))
{
    aiEngineer.displayCareerPath();
}
else if(interest.equalsIgnoreCase("Data"))
{
    dataScientist.displayCareerPath();
}
else if(interest.equalsIgnoreCase("Cloud"))
{
    devOpsEngineer.displayCareerPath();
}
else
{
    System.out.println("No recommendation available.");
}
    }
}
if(!found)
{
    System.out.println("Student not found!");
}
break;

            case 7:
                System.out.println("Thank you for using Career Compass!");
                break;
        
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        }while(choice!=7);
    }
}
