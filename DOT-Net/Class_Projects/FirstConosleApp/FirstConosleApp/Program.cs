namespace FirstConosleApp
{
    internal class Program
    {

        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Hello, World!");
                int i = 100;
                int j = 200;
                int k = i + j;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }

        }
    }
}
