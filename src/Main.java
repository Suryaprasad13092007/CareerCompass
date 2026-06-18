import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Career Compass");
        Scanner sc = new Scanner(System.in);
        

        System.out.println(" Enter name : ");
        String name = sc.nextLine();

        System.out.println(" Enter Branch : ");
        String branch = sc.nextLine();

        System.out.println(" Enter year : ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.println(" Enter interest : ");
        String interest = sc.nextLine();


        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student(name,branch,year,interest);
        students.add(student);

        for(Student s : students){
            student.displayStudentInfo();
        }

        CareerPath careerPath = new CareerPath("Software Engineer","Designs and develops software applications.");

        careerPath.displayCareerPath();
    }
}
