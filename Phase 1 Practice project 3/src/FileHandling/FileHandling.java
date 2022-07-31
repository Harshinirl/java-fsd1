package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileHandling {
	public static void main(String[] args) {
		try {
			File myobj = new File("C:\\New folder\\FileHandling.txt");
	    	if(myobj.exists()) {
	    		FileWriter writefile=new FileWriter("C:\\New folder\\FileHandling.txt");
	    		writefile.write("Hello Everyone ");
	    		System.out.println("file written successfully");
	    		BufferedWriter appendtxt=new BufferedWriter (writefile);
	    		System.out.println("enter the content to be append");
	    		Scanner sc=new Scanner(System.in);
	    		String data=sc.nextLine();
	    		appendtxt.append(data);
	    		appendtxt.close();
	    		writefile.close();
	    		System.out.println("file appended successfully");
	    		Scanner readfile=new Scanner(myobj);
	    		while(readfile.hasNext()) {
	    			String texts=readfile.nextLine();
	    			System.out.println("content in the files:"+" "+texts);
	    			System.out.println("file read successfully");
	    		}
	    		readfile.close();
	    	}
	    	else if(myobj.createNewFile()) {
	    		System.out.println("file created:"+" "+myobj.getName());
	    		System.out.println("file created successfully");    }
	    	    else{
	    	    	System.out.println("file not created");   
	    	    }
		}
		catch(Exception e) {
			System.out.println("Error occurred");
	    	e.printStackTrace();
	       }
		}
}