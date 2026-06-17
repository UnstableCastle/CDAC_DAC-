namespace Question13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.Write("Enter Date (dd/mm/yyyy): ");
                DateTime dt = Convert.ToDateTime(Console.ReadLine());

                Console.WriteLine("Month : " + dt.ToString("MMMM"));
                Console.WriteLine("Days  : " + DateTime.DaysInMonth(dt.Year, dt.Month));

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
