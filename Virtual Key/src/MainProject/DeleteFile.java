package MainProject;
import java.io.File;
import java.util.Scanner;
public class DeleteFile {
	public void def() {
		String path="C:\\New folder\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the filename you want to delete");
		String filename=sc.next();
		String finalpath=path+filename;
		File f=new File(finalpath);
		//delete operation
		f.delete();
		System.out.println("file gets deleted");
	}
}
