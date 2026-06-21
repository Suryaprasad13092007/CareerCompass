import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Career Compass");

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice;
        do{
            System.out.println("\n===== Career Compass Menu =====");
            System.out.println("1. Add Student ");
            System.out.println("2. Dispay Students ");
            System.out.println("3. Search Student ");
            System.out.println("4. Delete Student ");
            System.out.println("5. Exit! ");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
                    switch (choice) {
            case 1:
                System.out.println("Add Student Selected");
                break;
            case 2:
                System.out.println("Display Students Selected");
                break;
            case 3:
                System.out.println("Search Student Selected");
                break;
            case 4:
                System.out.println("Delete Student Selected");
                break;
            case 5:
                System.out.println("Thank you for using Career Compass!");
                break;
        
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        }while(choice!=5);



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


        System.out.println("\nEnter student name to delete : ");
        String deleteName = sc.nextLine();
        boolean deleted = false;
        for(int i = 0 ; i < students.size() ; i++){
            if(students.get(i).getName().equalsIgnoreCase(deleteName)){
                students.remove(i);
                deleted = true;
                break;
            }
        }

        if(deleted){
            System.out.println("Student deleted successfully.");
        }else{
            System.out.println("Student not found.");
        }

        System.out.println("\n===== Updated Student List =====");
        for(Student s : students){
            s.displayStudentInfo();;
            System.out.println();
        }
    }
}
