namespace File_io;

internal class Program
{
    static void Main(string[] args)
    {
        //string filepath = @"C:\Users\Amaan\OneDrive\Desktop\files\a.txt";
        //string copypath = @"C:\Users\Amaan\OneDrive\Desktop\files\copy.txt";

        //if (File.Exists(filepath))
        //{
        //    Console.WriteLine("file exists");

        //    File.WriteAllText(filepath, "hello world!!");

        //    string content = File.ReadAllText(filepath);

        //    Console.WriteLine($"content = {content}");


        //    File.Copy(filepath,copypath);
        //    Console.WriteLine("File Copied");

        //    File.Delete(filepath);
        //    Console.WriteLine("Deleted");

        //}
        //else {

        //    Console.WriteLine("file not found!");

        //}


        string dir = @"C:\";

        DirectoryInfo directoryInfo = new DirectoryInfo(dir);
        Console.WriteLine($"Current Dir = {directoryInfo.Root}");




        try
        {
            foreach (var drive in DriveInfo.GetDrives() )
            {
                if (drive.DriveType != DriveType.Network) {
                    Console.WriteLine($"Driver info {drive.Name} ");
                
                }
            }
        }
        catch (UnauthorizedAccessException e)
        {

            Console.WriteLine(e.StackTrace);
        }







        //-------------------------------------------------

        foreach (var directory in directoryInfo.GetDirectories() ){

            Console.WriteLine($"\t\t FolderName: {directory.Name}");
            try
            {
                foreach (var item in directory.GetFiles())
                {
                    Console.WriteLine($"\t\t\t\t file name = {item.Name}");
                }
            }
            catch (UnauthorizedAccessException e)
            {

                Console.WriteLine(e.StackTrace);
            }
        
        
        
        
        }



    }
}