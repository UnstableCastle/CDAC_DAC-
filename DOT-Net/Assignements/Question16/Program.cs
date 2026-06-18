namespace Question16
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Prime Numbers");

            //Console.Write("Enter Number to Check Prime or Not: ");
            //int num = Convert.ToInt32(Console.ReadLine());

            //bool prime = true;

            //if (num < 2)
            //{
            //    prime = false;
            //}
            //else
            //{
            //    for (int i = 2; i <= num / 2; i++)
            //    {
            //        if (num % i == 0)
            //        {
            //            prime = false;
            //            break;
            //        }
            //    }
            //}

            //if (prime)
            //    Console.WriteLine($"{num} is Prime");
            //else
            //    Console.WriteLine($"{num} is Not Prime");



            //    int count = 0;
            //    int num = 2;

            //    Console.WriteLine("First 25 Prime Numbers (do-while loop):");
            //    do
            //    {
            //        bool isPrime = true;
            //        int i = 2;
            //        if (num > 2)
            //        {
            //            do
            //            {
            //                if (num % i == 0)
            //                {
            //                    isPrime = false;
            //                    break; 
            //                }
            //                i++;
            //            } while (i * i <= num); 
            //        }

            //        if (isPrime)
            //        {
            //            Console.Write(num + " ");
            //            count++;
            //        }
            //        num++;
            //    } while (count < 25);
            int count = 0;
            int num = 2;
            Console.WriteLine("First 25 Prime Numbers (while loop):");

            while (count < 25)
            {
                bool isPrime = true;
                int i = 2;

              
                while (i * i <= num)
                {
                    if (num % i == 0)
                    {
                        isPrime = false;
                        break; 
                    }
                    i++;
                }

                if (isPrime)
                {
                    Console.Write(num + " ");
                    count++;
                }
                num++;
            }






        }

    }
}
    
