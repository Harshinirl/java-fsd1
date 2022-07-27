package EmailID;
import java.util.regex.*;    
import java.util.*; 
public class ValidateEmailID {  
public static void main(String args[]){
	ArrayList<String> emails = new ArrayList<String>(); 
	emails.add("harshini.name@gmail.com");  
    emails.add("harshini#@gmail.co.in"); 
    emails.add("harshini@gmail.co.in"); 
    emails.add("harshini@gmail.com");  
    emails.add("harshini@gmailcom");  
    emails.add("@yahoo.com");  
    emails.add("harshini#gmail.com");    
    String regex = "^(.+)@(.+)$";   
    Pattern pattern = Pattern.compile(regex);    
    for(String email : emails){  
        Matcher matcher = pattern.matcher(email);  
        System.out.println(email +" : "+ matcher.matches()+"\n");  
    }  
}  

}

				