package session_06;

import java.io.*;
public class ARMDEmo {	
	public static void main(String[] args) 
			throws IOException {
		try(FileOutputStream fos = 
				new FileOutputStream("mno.txt");
			FileInputStream fis = 
					new FileInputStream("abc.txt")	
			)
		{
			//read from abc.txt
			//write to mno.txt
		}catch (Exception e) {
			// TODO: handle exception
		}	
	}
}
