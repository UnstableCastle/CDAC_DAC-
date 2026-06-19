namespace ArrayExamples;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("1-D Array!");
        int[] numbers = new int[5] { 10, 20, 30, 40, 50 };
        for (int i = 0; i < numbers.Length; i++)
        {
            Console.WriteLine(numbers[i]);
        }
        Console.WriteLine("2-D Array!");
        int[,] tickets = new int[2, 2] { { 10, 20 }, { 40, 50 } };
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                Console.WriteLine($"Row {i} - Col - {tickets[i, j]}");
            }
        }

        //Jagged Array
        int[][] marks = new int[4][];
        marks[0] = new int[2] { 10, 20 };
        marks[1] = new int[4] { 10, 20, 30, 40 };
        marks[2] = new int[7] { 10, 20, 30, 40, 50, 60, 70 };
        marks[3] = new int[1] { 10 };
        Console.WriteLine("");
        for (int i = 0; i < 4; i++)
        {
            Console.WriteLine($"Marks Row Number {i}");
            for (int j = 0; j<marks[i].Length; j++) 
            {
                Console.Write($"\tSubject Number {marks[i][j]}!");
            }
            Console.WriteLine("");
        }

    }
}
