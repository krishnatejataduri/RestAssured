package APITesting.api;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringReverse1();
		fibonacci();
			}
	
	public static void printPrimes(){
		System.out.println("Enter the limit: ");
		int num = new Scanner(System.in).nextInt();
		for(int i = 2;i<=num;i++){
			int counter = 0;
			for(int j = i/2;j>=1;j--){
				if(i%j==0){
					counter+=1;
				}
			}
			if(counter==1){
				System.out.println(i);
			}
		}

	}
	
	public static void stringReverse1(){
		System.out.println("Enter the word to be reversed: ");
		String word = new Scanner(System.in).nextLine();
		char[] stringSplit = word.toCharArray();
		for(int l = stringSplit.length-1;l>=0;l--){
			System.out.print(stringSplit[l]);
		}
		
	}
	
	public static void fibonacci(){
		System.out.println("Enter the limit: ");
		int num = new Scanner(System.in).nextInt();
		int a =0;
		int b=0;
		int c=1;
		for(int i=0;i<=num;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		
	}

}
