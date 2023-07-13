package studentMgmt;
import java.util.ArrayList;
import java.util.Scanner;


public class student extends person {
    int sid;
    String school;
    Scanner sc = new Scanner(System.in);
    subjects s = new subjects();
    
    ArrayList<subjects> sub = new ArrayList<subjects>(2);
    


    public void addStudent()
    {
        System.out.println("Enter roll no: ");
        sid = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter name: ");
        pname = sc.nextLine();


        System.out.println("Enter school name: ");
        school = sc.nextLine();

    }

    public void displayStudent()
    {
        System.out.println("Student roll no: "+sid);
        System.out.println("Student name: "+ pname);
        System.out.println("School name: "+school);
    }

    public void addMark()
    {
        s.addMarks();
        sub.add(s);

    }


    
}
