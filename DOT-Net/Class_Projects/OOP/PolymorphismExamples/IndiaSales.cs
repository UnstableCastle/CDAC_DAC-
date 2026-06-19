//Profit = Incoming Money - Outgoing Money
//COGS - Cost of Good and Services
//Expense
//ActualSales
//GST

namespace PolymorphismExamples;

internal class IndiaSales
{
    //public double Addition(int i,double j)
    //{
    //    return i + j;
    //}
    //public double Addition(double j, int i)
    //{
    //    return i + j;
    //}
    public virtual int GovtTaxPercent()
    {
        return 18;
    }
    public double SalesNetProfit(double cogs,double expense,double actualSales)
    {
        return actualSales - (cogs + expense);
    }
    public double SalesNetProfit(double cogs, double expense, double actualSales,int gstPercent)
    {
        double gstAmount = actualSales * gstPercent / 100;
        return actualSales - (cogs + expense + gstAmount);
    }
    public void Message()
    {
        Console.WriteLine("We sale Indian Products!");
    }
}
