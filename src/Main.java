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
        ArrayList<SkillTracker> trackers = new ArrayList<>();

        int choice;
        do{
            System.out.println("\n===== Career Compass Menu =====");
            System.out.println("1. Add Student ");
            System.out.println("2. Dispay Students ");
            System.out.println("3. Search Student ");
            System.out.println("4. Delete Student ");
            System.out.println("5. View Student Count");
            System.out.println("6. Recommend Career");
            System.out.println("7. View career road map ");
            System.out.println("8. Track Skills ");
            System.out.println("9. View Skills ");
            System.out.println("10. Exit! ");

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


           case 7 :
            System.out.print("Enter Career Name: ");
String careerName = sc.nextLine();
if(careerName.equalsIgnoreCase("Software Engineer"))
{
    System.out.println("\nSoftware Engineer Roadmap");

    System.out.println("1. Learn Java");
    System.out.println("2. Learn OOP");
    System.out.println("3. Learn DSA");
    System.out.println("4. Learn SQL");
    System.out.println("5. Learn Git & GitHub");
    System.out.println("6. Build Projects");
}
else if(careerName.equalsIgnoreCase("AI/ML Engineer"))
{
    System.out.println("\nAI/ML Engineer Roadmap");

    System.out.println("1. Python");
    System.out.println("2. Data Structures");
    System.out.println("3. Statistics");
    System.out.println("4. Machine Learning");
    System.out.println("5. Deep Learning");
    System.out.println("6. AI Projects");
}
else if(careerName.equalsIgnoreCase("Data Scientist"))
{
    System.out.println("\nData Scientist Roadmap");

    System.out.println("1. Python");
    System.out.println("2. SQL");
    System.out.println("3. Statistics");
    System.out.println("4. Data Analysis");
    System.out.println("5. Machine Learning");
    System.out.println("6. Data Projects");
}
else if(careerName.equalsIgnoreCase("DevOps Engineer"))
{
    System.out.println("\nDevOps Engineer Roadmap");

    System.out.println("1. Linux");
    System.out.println("2. Networking");
    System.out.println("3. Git");
    System.out.println("4. Docker");
    System.out.println("5. Cloud");
    System.out.println("6. CI/CD");
}
else
{
    System.out.println("Roadmap not available.");
}

           break;

           case 8:

System.out.print("Enter Student Name: ");
String studentName = sc.nextLine();

SkillTracker tracker = null;

for(SkillTracker t : trackers)
{
    if(t.getStudentName().equalsIgnoreCase(studentName))
    {
        tracker = t;
        break;
    }
}

if(tracker == null)
{
    tracker = new SkillTracker(studentName);
    trackers.add(tracker);
}

System.out.print("Enter Skill: ");
String skill = sc.nextLine();

tracker.addSkill(skill);

System.out.println("Skill Added Successfully!");

break;

case 9:

System.out.print("Enter Student Name: ");
String name = sc.nextLine();

boolean foundSkill = false;

for(SkillTracker t : trackers)
{
    if(t.getStudentName().equalsIgnoreCase(name))
    {
        t.displaySkills();
        foundSkill = true;
        break;
    }
}

if(!foundSkill)
{
    System.out.println("No skills found.");
}

break;


            case 10:
                System.out.println("Thank you for using Career Compass!");
                break;
        
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        }while(choice!=10);
    }
}
