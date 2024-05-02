package WedJavaWeek2HomeWork;

public class Programme_3
{
    String name = "Prime";
   static String Surname = "Testing";

   public void instanceMethod()
   {
       System.out.println(name);
       System.out.println(Programme_3.Surname);
   }

   public static void staticMethod()
   {
       Programme_3 programme3 = new Programme_3();
       System.out.println(programme3.name);
       System.out.println(Surname);
   }
   public static void main(String[] args)
   {
       Programme_3 programme_3 = new Programme_3();
       programme_3.instanceMethod();;
       staticMethod();
   }



}
