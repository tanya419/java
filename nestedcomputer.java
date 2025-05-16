class computer 
{
   class processor
   {
     public void displaydetails()
     {
        System.out.println("processor brand :philips");
        System.out.println("processor speed :4.5ghz");
     }
   } 

   void displaydetails()
   {
      processor processor = new processor();
      processor.displaydetails();
   }

   public static void main(String[] args)
   {
    computer computer = new computer();
    computer.displaydetails();
   }
}

