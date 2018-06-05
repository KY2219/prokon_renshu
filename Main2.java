import java.util.Scanner;
 
public class Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String[] out_s = s.split("");
		int i = 0;
		int flag = 0;
		while(i < out_s.length){
			if(i == 0){
				out_s[i] = out_s[i].toUpperCase();
			}
			if(out_s[i].equals(" "))
				out_s[i+1] = out_s[i+1].toUpperCase();
		
			i++;
		}
		
		int j = 0;
		while(j < out_s.length){
			//if(out_s[j] != "\u0020")
			System.out.print(out_s[j]);
			j++;
		}
		System.out.println("");
	
	}
 
}