package proekt_4;
import java.util.Scanner;
public class Zadzakol {

	public static void main(String[] args) {
		Scanner tastatura=new Scanner(System.in);
		int f,p=0,g=0;
		System.out.println("Vnesi broj na frlanja");
		f =tastatura.nextInt();
		for(int i=0;i<f;i++) {
			int r = tastatura.nextInt();
			if(r==0)
			{
				p++;
			}
			else
			{
				g++;
			}
		}
		System.out.println("Pismo"+p+"pati");
		System.out.println("Glava"+g+"pati");
		double razlika=g/p;
		System.out.println(razlika);

	}

}