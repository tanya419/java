public class nesteduniversity 
{
static class department
{
    private String departmentname;
    private int facultycount;


public department(String departmentname, int facultycount)
{
    this.departmentname = departmentname;
    this.facultycount = facultycount;
}


public void displaydetails()
{
    System.out.println("departmentname:" +departmentname);
    System.out.println("facultycount:" +facultycount);
}
}

public static void main()
{
    nesteduniversity.department dept = new nesteduniversity.department("Diploma", 89);
    dept.displaydetails();
}
}
