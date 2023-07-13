package studentMgmt;
import java.util.Scanner;

public class subjects {
    int isa1;
    int isa2;
    int esa;
    Scanner sc = new Scanner(System.in);

    subjects(){}

    public void addMarks()
    {
        System.out.println("Enter isa1 marks: ");
        isa1 = sc.nextInt();

        System.out.println("Enter isa2 marks: ");
        isa2 = sc.nextInt();

        System.out.println("Enter esa marks: ");
        esa = sc.nextInt();

    }

    public void displaySubjects()
    {
        System.out.println("Isa 1 marks: "+ isa1);
        System.out.println("Isa 2 marks: "+ isa2);
        System.out.println("Esa marks: "+ esa);
    }
    
}
