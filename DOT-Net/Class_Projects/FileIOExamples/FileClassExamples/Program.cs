namespace FileClassExamples;

internal class Program
{
    static void Main(string[] args)
    {
        Console.WriteLine("File Class Examples!");
        string path = @"C:\Dotnet-June-2026\logger.txt";
        if (!File.Exists(path)) 
        {
            FileStream FS=File.Create(path);
            FS.Close();
            StreamWriter SW= File.AppendText(path);
            SW.WriteLine("Welcome To Infoway!");
            SW.Close();
            SW.Dispose();
        }
        else
        {
            foreach (var log in File.ReadAllLines(path))
            {
                Console.WriteLine(log);
            }
        }
    }
}
