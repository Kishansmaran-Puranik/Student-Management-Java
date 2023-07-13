package studentMgmt;
import java.util.ArrayList;

public class school {
    ArrayList<student> st = new ArrayList<student>(2);
    student s = new student();
    school(){}

    public void admitStudent()
    {
        s.addStudent();
        st.add(s);
        
    }
    public void entryMarks(int sid)
    {
        for(int i=0;i<st.size();i++)
        {
            if(st.get(i).sid == sid)
            {
                st.get(i).addMark();
            }

        }
    }

    public void display()
    {
        for(int i=0;i<st.size();i++)
        {
            st.get(i).displayStudent();
            st.get(i).sub.get(i).displaySubjects();

        }
    }

    public static void main(String[] args) {
        school sch = new school();
        sch.admitStudent();
        sch.entryMarks(0);
        sch.display();

    }

}
