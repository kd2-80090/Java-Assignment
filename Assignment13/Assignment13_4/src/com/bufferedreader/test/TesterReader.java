package com.bufferedreader.test;

import java.io.BufferedReader;
import java.io.FileReader;

public class TesterReader {
	public static void main(String[] args) {
		System.out.println("\nLines from the file :");
//		line<--BufferedWriter<--FileWriter<--file.txt;
		try(FileReader fr = new FileReader("/home/sunbeam/DAC/Sunbeam/java/Java-Assignment/Assignment13/Assignment13_3/file.txt")){
			try(BufferedReader br = new BufferedReader(fr)) {
				String line;
				while((line=br.readLine())!=null) {
					System.out.println(line);
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
