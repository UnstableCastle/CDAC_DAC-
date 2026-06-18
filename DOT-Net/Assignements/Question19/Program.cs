namespace Question19
{
    internal class Program
    {

        static bool checkPrime(int n) {

            if(n == 1) { return true; }

            for (int i = 2; i <= n / 2; i++) {

                if (n%i==0)
                {
                    return false;
                }

            }


            return true;
        }

        static void Main(string[] args)
        {
            Console.WriteLine("Check Prime");
            Console.WriteLine("Enter Number");

            int n = Convert.ToInt32(Console.ReadLine());

            if (checkPrime(n))
            {
                Console.WriteLine("Prime Number");
            }
            else
            {
                Console.WriteLine("Not Prime");


        }


    }
    }
}   

