public class overload
{
    void demo (int a)
    {
        System.out.println("int a");
    }
    void demo (int a, int b)
    {
        System.out.println("a and b: " + a + " " + b);
    }
    double demo (double a)
    {
        System.out.println("double a");
        return a * a;
    }

    
}
class Methodoverloading
{
    public static void main(String args[])
    {
        overload obj = new overload();
        double result;
        obj.demo(10);
        obj.demo(10, 20);
        result = obj.demo(5.5);
        System.out.println("O/P: " + result);
    }
}
