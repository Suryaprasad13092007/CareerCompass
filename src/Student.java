public class Student{
    private String name;
    private String branch;
    private int year;
    private String interest;

    public Student(String name , String branch , int year , String interest){
        this.name = name ;
        this.branch = branch;
        this.year = year;
        this.interest = interest;
    }

    public String getName(){
        return name;
    }

    public String getBranch(){
        return branch;
    }

    public int getYear(){
        return year;
    }

    public String getInterest(){
        return interest;
    }

}