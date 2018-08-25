package programming;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Check {

	public void getCountFromFile() throws FileNotFoundException{
		File file = new File("C:\\Users\\User1\\Desktop\\git commands.txt");
		FileInputStream fis = new FileInputStream(file);
		Scanner sc = new Scanner(fis);
		
		int charCount = 0 ;
		int wordCount = 0 ;
		int lineCount = 0;
		
		while(sc.hasNextLine()){
			String line_data = sc.nextLine();
			System.out.println(line_data);
			charCount+= line_data.length() ;
			wordCount+= new StringTokenizer(line_data, " ").countTokens();
			lineCount++ ;
			
			System.out.println("Character Count = "+charCount);
			System.out.println("Word Count = "+wordCount);
			System.out.println("line Count = "+lineCount);
			
		}/*
		System.out.println("Character Count = "+charCount);
		System.out.println("Word Count = "+wordCount);
		System.out.println("line Count = "+lineCount);*/
		
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Check check = new Check();
		check.getCountFromFile();
	}
}
