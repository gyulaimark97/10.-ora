package Exceptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		
		int[] array= new int [5];
		
		/*
		for(int i=0; i<5;i++) {
			array[i]=scan.nextInt();
		}
		*/
		/*for(int i=0; i<5;i++) {
			array[i]=Integer.parseInt(scan.nextLine());
		}*/
		
		
		for(int i=0; i<5;i++) {
			System.out.println(array[i]);
		}
		
		
		
		
		scan.close();
	}
	
	public int[] reader(int numberOfElements) throws Exception {
		Scanner scan = new Scanner(System.in);
		int [] array=new int[numberOfElements];
		int tempint = 0;
		for(int i=0; i<5;i++) {
			tempint=scan.nextInt();
		
		try {
			if (tempint<=0)
				throw new Exception();
			}
		catch(Exception e){
			tempint=1;
			}
		array[i]=tempint;
		}
		return array;
		}
		
		
		
	
}


