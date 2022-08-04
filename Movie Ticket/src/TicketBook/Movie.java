package TicketBook;
import java.util.ArrayList;
import java.util.Scanner;
public class Movie {
	public static void main(String[] args) {
		CustomerDetails cd=new CustomerDetails("Shyam",6,2000);
		ArrayList<CustomerDetails> al=new ArrayList();
		al.add(cd);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book id");
		String bookid=sc.next();
		for(CustomerDetails ccd:al) {
			if(ccd.bookid.equals(bookid)) {
			System.out.println(ccd.name + ccd.noOfPeople+ ccd.paycal);
			}
		}
	}
}
