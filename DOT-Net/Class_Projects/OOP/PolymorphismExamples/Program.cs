namespace PolymorphismExamples
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Infoway Sales Net Profit Calculator!!!");
            ForeignSales sales = new ForeignSales();
            Console.WriteLine($"Sales net profit without GST is {sales.SalesNetProfit(12000, 13000, 150000)}");
            Console.WriteLine($"Sales net profit with 18% GST is {sales.SalesNetProfit(12000, 13000, 150000, 18)}");
            Console.WriteLine($"Foreign Sales net profit with 18% GST is {sales.SalesNetProfit(12000, 13000, 150000, 18, 2500)}");
            Console.WriteLine("");
            IndiaSales ind1 = new IndiaSales();
            Console.WriteLine($"India Tax Percent {ind1.GovtTaxPercent()}");
            ind1.Message();
            ForeignSales fgSales = new ForeignSales();
            Console.WriteLine($"India Tax Percent {fgSales.GovtTaxPercent()}");
            fgSales.Message();
            IndiaSales indiaSales = new ForeignSales();
            Console.WriteLine($"Indian in Foreign Country {indiaSales.GovtTaxPercent()}");
            indiaSales.Message();
        }
    }
}
