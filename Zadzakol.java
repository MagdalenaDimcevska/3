package proekt_4;
import java.util.Scanner;
public class Zadzakol {

	public static void main(String[] args) {
		Scanner tastatura=new Scanner(System.in);
		int f,p=0,g=0;
		System.out.println("Vnesi broj na frlanja");
		f tastatura=nextInt();
		int r;
		for(int i=0;i<=f;i++) {
			if(r==0)
			{
				p++;
			}
			else
			{
				g++;
			}
		}
		System.out.println("Pismo"+p);
		System.out.println("Glava"+g);
		System.out.println(p/g);

	}

}
