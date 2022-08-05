package MainProject;
import java.io.IOException;
import java.util.Scanner;
public class MainFile {
	public static void main(String[] args) throws IOException {
			Scanner sc=new Scanner(System.in);
			DisplayFile df=new DisplayFile();
			CreateFile cf=new CreateFile();
			DeleteFile def=new DeleteFile();
			SearchFile sf=new SearchFile();
			System.out.println("1.Display the files in Ascending Order 2.Create/Delete/Search a file. Enter the number you want to Choose ");
			int value =sc.nextInt();
			switch(value) {
			case 1:
					df.df();
					break;
				case 2:while(true) {
					System.out.println("1.Createfile 2,Deletefile 3.Searchfile...Enter the file number: ");
					int num=sc.nextInt();
					  switch(num){
						  case 1: cf.cf();break;
						  case 2: def.def();break;
						  case 3: sf.sf();break;
						  case 4: System.exit(0);
					  }	  
				}
				case 3:break;
			}
	}
}