public class dout_two_main 
{
    public static void main(String[] args)
    {
        System.out.println("hello");
        dout a = new dout();
        System.out.println(a.b);
        dout.main(args);
    }
    
}

class dout
{
    public static void main(String[] args)
    {
    }

    Integer b = 5;
}
