import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Career Compass");
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

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

        System.out.println("\n====== Student List ======");

        for(Student s : students){
            s.displayStudentInfo();
            System.err.println();
        }

        System.out.println("\nEnter student name to search : ");
        String searchName = sc.nextLine();

        boolean found = false;
        for(Student s : students){
            if(s.getName().equalsIgnoreCase(searchName)){
                System.out.println("\nStudent Found : ");
                s.displayStudentInfo();

                found = true ;
                break;
            }
        }

        if(!found){
            System.out.println("Student not found.");
        }

        CareerPath careerPath = new CareerPath("Software Engineer","Designs and develops software applications.");

        careerPath.displayCareerPath();
    }
}
