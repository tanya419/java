class Employee 
 {
    public void work()
    {
        
        System.out.println("they are working");
    }
    
    
    public int getSalary()
    {
        return 70000;

    }
}
    
    class Hrmanager extends Employee
    {
        public void work()
        {
            System.out.println("HR owl is working");
        }

        public void addEmployee()
        {
            System.out.println("HR owl has added new employee");
        }
    }

 class task
 {
    public static void main(String[] args)
    {
        

        
        Employee E1 = new Employee();
        E1.work();
                
            System.out.println("Employee salary:" +E1.getSalary());
        

            Hrmanager h1 = new Hrmanager();
            h1.work();
            
        
            System.out.println("hrmanager salary:" +h1.getSalary());
    }

          

        
    }
 
