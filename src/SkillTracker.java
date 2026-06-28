import java.util.ArrayList;

public class SkillTracker {
   private String studentName;
   private ArrayList<String> skills;

   public SkillTracker(String studentName)
{
    this.studentName = studentName;
    skills = new ArrayList<>();
}

public void addSkill(String skill)
{
    skills.add(skill);
}

public void displaySkills()
{
    System.out.println("Student : " + studentName);

    for(String skill : skills)
    {
        System.out.println("- " + skill);
    }
}

public String getStudentName()
{
    return studentName;
}

public ArrayList<String> getSkills(){
    return skills;
}

}
