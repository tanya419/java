public class bankaccount 
{
    
  private String accountnumber;
  private int balance;


    private static String Bankname;
    private static double interestrate;


    public bankaccount(String accountnumber,int balance)
{
        this.accountnumber= accountnumber;
        this.balance = balance ;

}
    public static String getBankName() 
    {
        return Bankname;
    }
   public static void setBankName(String name) 
   {
        Bankname = name;
    }

    public static double getinterestrate()
    {
        return interestrate;
    }
     public static void setInterestrate(double rate)
     {
        interestrate = rate;
     }
    
    

     public void printdetails()
     {
        System.out.println("accountnumber:" +accountnumber);
        System.out.println("balance:" +balance);
        System.out.println("bankname:" +Bankname);
        System.out.println("intersetrate:" +interestrate + "%");
     }

     public static void main(String[] args)
     {
        bankaccount.setBankName("State bank of india");
        bankaccount.setInterestrate(3.5);
     
        bankaccount b1 = new bankaccount("54637877", 1000);
        bankaccount b2 = new bankaccount("5625336",500);

        b1.printdetails();
        System.out.println();
        b2.printdetails();
     }
    }


