public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Career Compass");

        Student student = new Student("Surya","CSE",1,"Software Engineering");
        System.out.println("Student object created sucessfully");

        System.out.println("Name : "+ student.getName());
        System.out.println("Branch : "+student.getBranch());
        System.out.println("Year : "+student.getYear());
        System.out.println("Interest : "+student.getInterest());
    }
}
