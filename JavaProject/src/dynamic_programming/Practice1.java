package dynamic_programming;

import java.util.Scanner;

public class Practice1 {
	
    private static int [] partPrice;
    private static int [] maxPricePerLength;
	 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	Scanner sc2 = new Scanner(System.in);
    	int sLen = sc.nextInt();
    	String sPrice = sc2.nextLine();
    	String[] stickPrice = sPrice.split(" ");

    	 partPrice = new int[sLen+1];
    	for(int i = 1; i < sLen; i++)
    		partPrice[i] = Integer.parseInt(stickPrice[i-1]);
    	
    	maxPricePerLength = new int [sLen+1];
    	
    	for (int i = 1; i <= sLen; i++) {
    		int max = 0;
    		for (int j = 1; j <= i; j++) {
    			max = Math.max(max, maxPricePerLength[i-j] + partPrice[j]);
    		}
    		maxPricePerLength[i] = max;
    		System.out.println("Á¤´äÀº "+maxPricePerLength[i]);
    	}
    	
    	System.out.println(maxPricePerLength[sLen]);
    	
    }
}
