public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to Career Compass");

        Student student = new Student("Surya","CSE",1,"Software Engineering");
        System.out.println("Student object created sucessfully");

        student.displayStudentInfo();

        CareerPath careerPath = new CareerPath("Software Engineer","Designs and develops software applications.");

        careerPath.displayCareerPath();
    }
}
