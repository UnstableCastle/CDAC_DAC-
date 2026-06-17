namespace Question14
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {

                Console.Write("Enter Number: ");
                int num = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Absolute Value = " + Math.Abs(num));

            }
            catch (FormatException e)
            {
                Console.WriteLine(e.Message);
            }
            catch (IOException e)
            {

                Console.WriteLine(e.Message);
            }
        }
    }
}
