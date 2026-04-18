import java.io.*;

public class RandomAccessFIleDemo {
    public static void main(String[] args) throws IOException {

        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;

        try {
            File f1 = new File("abc.txt");
            File f2 = new File("mno.txt");

            raf1 = new RandomAccessFile(f1, "r");
            raf2 = new RandomAccessFile(f2, "rw");

            System.out.println(raf1.getFilePointer());

            raf1.seek(10);
            System.out.println(raf1.getFilePointer());

            int x;
            while ((x = raf1.read()) != -1) { 
                System.out.println(x);
                raf2.write(x);
            }

            System.out.println("Success!!");

        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
           raf1.close(); 
           raf2.close(); 
        }
    }
}