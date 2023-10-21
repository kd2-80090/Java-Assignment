package com.bufferedwriter.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TesterWriter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		BufferedWriter-->FileWriter-->file.txt;
		
		try(FileWriter fw = new FileWriter("file.txt")){
			try(BufferedWriter bw = new BufferedWriter(fw)) {
				for (int i = 0; i < 4; i++) {
					System.out.println("Enter a line :");
					String line = sc.nextLine();
					bw.write(line);
					bw.newLine();//add \n in file
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Lines have written in the file successfully");
	}
}
