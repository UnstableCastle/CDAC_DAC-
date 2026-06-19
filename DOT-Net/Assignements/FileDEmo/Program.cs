namespace FileDemo;

internal class Program
{
    static void Main(string[] args)
    {
    string filePath = "sample.txt";
    string copyPath = "sampleCopy.txt";

    File.WriteAllText(filePath, "Hello ");

    if (File.Exists(filePath))
    {
        Console.WriteLine("File Exists");

        string content = File.ReadAllText(filePath);
        Console.WriteLine(content);

        File.Copy(filePath, copyPath, true);
        Console.WriteLine("File Copied");

        File.Delete(copyPath);
        Console.WriteLine("Copied File Deleted");
    }
    else
    {
        Console.WriteLine("File Not Found");
    }
}
}