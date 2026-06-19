namespace OperatorOverloading;

internal class Program
{
    static void Main(string[] args)
    {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);

        Complex c3 = c1 + c2;

        c3.Display();
    }
}