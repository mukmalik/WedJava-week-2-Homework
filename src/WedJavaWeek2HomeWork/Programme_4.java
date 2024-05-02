package WedJavaWeek2HomeWork;

public class Programme_4
{
    String Name = "primt";
    String surname = "testing";

    static boolean a = true;
    static boolean b = false;

    public void instanceMethod()
    {
        System.out.println(Name);
        System.out.println(surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }

    public static void staticMethod()
    {
        Programme_4 programe_4 = new Programme_4();
        System.out.println(programe_4.Name);
        System.out.println(programe_4.surname);
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        Programme_4 programme4 = new Programme_4();
        programme4.instanceMethod();
        staticMethod();
    }

}
