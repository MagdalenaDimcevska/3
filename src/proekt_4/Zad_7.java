package proekt_4;

import java.util.Scanner;

public class Zad_7 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Vnesi broevi:");
	        int size = scanner.nextInt();
	        int[] n= new int[size];
	        for (int i = 0; i <size; i++) {
	            n[i] = scanner.nextInt();}
	        int min=n[0];
	        for (int i = 1; i < size; i++) {
	        	if(n[i]<min) {
	        		min=n[i];
	        	}}
	        System.out.print(min);

	}

}
