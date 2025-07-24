package com.example.la;
import java.util.*;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] < 10) {
                numbers[i] *= 2;  
            }
            sum += numbers[i]; 
        }
        double average = (double) sum / 5;
        System.out.println("Average: " + average);


	}

}
