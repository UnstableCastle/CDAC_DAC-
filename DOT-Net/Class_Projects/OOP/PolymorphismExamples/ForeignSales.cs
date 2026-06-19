namespace PolymorphismExamples;

internal class ForeignSales:IndiaSales
{
    public double SalesNetProfit(double cogs, double expense, double actualSales, int gstPercent,double transportAmount)
    {
        double gstAmount = actualSales * gstPercent / 100;
        return actualSales - (cogs + expense + gstAmount + transportAmount);
    }
    public override int GovtTaxPercent()
    {
        return 30;
    }
    //Shodowing
    public new void Message()
    {
        Console.WriteLine("We sale Indian Products in Foreign Countries!");
    }
}
