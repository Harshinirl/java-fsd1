package MainProject;
import java.io.File;
public class DisplayFile {
	public void df() {
			String path="C:\\New folder\\";
	        File f=new File(path);
			//display operation
			File filenames[]=f.listFiles();
			for(File ff:filenames) {
				System.out.println(ff.getName());
			}
	}
}
