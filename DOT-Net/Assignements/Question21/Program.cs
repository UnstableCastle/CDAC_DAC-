namespace Question21
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ch;

            do
            {
                try
                {
                    Console.WriteLine("\nArea & Perimeter");
                    Console.WriteLine("1. Square");
                    Console.WriteLine("2. Circle");
                    Console.WriteLine("3. Rectangle");
                    Console.WriteLine("4. Exit");

                    Console.Write("Enter Choice: ");
                    ch = Convert.ToInt32(Console.ReadLine());

                    switch (ch)
                    {
                        case 1:
                            Console.Write("Enter Side: ");
                            double s = Convert.ToDouble(Console.ReadLine());

                            Console.WriteLine("Area = " + (s * s));
                            Console.WriteLine("Perimeter = " + (4 * s));
                            break;

                        case 2:
                            Console.Write("Enter Radius: ");
                            double r = Convert.ToDouble(Console.ReadLine());

                            Console.WriteLine("Area = " + (3.143 * r * r));
                            Console.WriteLine("Perimeter = " + (2 * 3.143 * r));
                            break;

                        case 3:
                            Console.Write("Enter Length: ");
                            double l = Convert.ToDouble(Console.ReadLine());

                            Console.Write("Enter Breadth: ");
                            double b = Convert.ToDouble(Console.ReadLine());

                            Console.WriteLine("Area = " + (l * b));
                            Console.WriteLine("Perimeter = " + (2 * (l + b)));
                            break;

                        case 4:
                            Environment.Exit(0);    
                             break;

                        default:
                            Console.WriteLine("Invalid Choice!");
                            break;
                    }
                }
                catch (FormatException)
                {
                    Console.WriteLine("Please enter valid numeric input.");
                    ch = -1;
                }

            } while (ch != 4);
        }
    }
}