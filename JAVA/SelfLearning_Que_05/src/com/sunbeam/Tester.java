package com.sunbeam;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = sc.nextLine();

        TextAnalyzer.Result result = TextAnalyzer.analyze(input);

        System.out.println("\nAnalysis Result:");
        System.out.println(result);

        sc.close();
    }
}
