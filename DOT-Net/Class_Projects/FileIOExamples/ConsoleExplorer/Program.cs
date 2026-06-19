namespace ConsoleExplorer;

internal class Program
{
    static void Main(string[] args)
    {
        try
        {
            foreach (var drive in DriveInfo.GetDrives())
            {
                if (drive.DriveType != DriveType.Network)
                {
                    Console.WriteLine(drive.Name);
                    DirectoryInfo directoryInfo = new DirectoryInfo(drive.Name);
                    foreach (var directory in directoryInfo.GetDirectories())
                    {
                        Console.WriteLine($"\t {directory.Name}");
                        try
                        {
                            foreach (var file in directory.GetFiles())
                            {
                                Console.WriteLine($"\t\t {file.Name}");
                            }
                        }
                        catch (UnauthorizedAccessException uae)
                        {
                            Console.WriteLine(uae.Message);
                        }
                    }
                }

            }
        }
        catch (UnauthorizedAccessException uae)
        {
            Console.WriteLine(uae.Message);
        }
        catch (Exception ex)
        {

            throw;
        }
    }
}
