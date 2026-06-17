namespace Question10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("basic calculator ");

            
                int ch = -1;
                Console.WriteLine("Enter num1");
                int num1 = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Enter num2");
                int num2 = Convert.ToInt32(Console.ReadLine());

                do
                {
                try

                {
                    Console.WriteLine("Enter 1 to Add");
                    Console.WriteLine("Enter 2 to Sub");
                    Console.WriteLine("Enter 3 to Divide");
                    Console.WriteLine("Enter 4 to Multiply");
                    Console.WriteLine("Enter 5 to Exit");
                    Console.WriteLine("Enter choice");

                     ch = Convert.ToInt32(Console.ReadLine());

                    switch (ch)
                    {
                        case 1:
                            int sum = num1 + num2;
                            Console.WriteLine($" {num1} + {num2} = {sum}");
                            break;
                        case 2:
                            int sub = num1 - num2;
                            Console.WriteLine($" {num1} - {num2} = {sub}");
                            break;
                        case 3:
                            int div = num1 / num2;
                            Console.WriteLine($" {num1} / {num2} = {div}");
                            break;
                        case 4:
                            int mul = num1 * num2;
                            Console.WriteLine($" {num1} * {num2} = {mul}");
                            break;
                        case 5: Environment.Exit(0);
                            break;

                        default:
                            break;
                    }
                }
                catch (DivideByZeroException d)
                {
                    Console.WriteLine(d.Message);
                }

                catch (FormatException e)

                {

                    //Console.WriteLine(e.StackTrace);
                    Console.WriteLine(e.Message);
                }


                catch (Exception e2)

                {

                    Console.WriteLine(e2.Message);
                }
            } while (ch != 5);

         

        }
    }
}
