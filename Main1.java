import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String sort_s = s.replace("ta", "");
		System.out.println(sort_s);
	}
 
}