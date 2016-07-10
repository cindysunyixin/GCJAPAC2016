import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.lang.*;
import java.util.HashMap;

class CountryLeader{
	public static void main(String[] args) throws IOException {
		/**
		Input and write to a file
		**/
	FileInputStream fstream = new FileInputStream("/Users/yixinsun/Desktop/A-small-attempt0.in");
	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	PrintWriter pw = new PrintWriter(new FileWriter("outfile001.txt"));
	int caseNum = br.nextInt();
	for (int i = 0; i < caseNum; i++) {
		int wordNum = br.nextInt();
		for (int j = 0; j < wordNum; j++) {
			int[] result = new int[wordNum];
			String line = br.nextLine();
			result[j] = helper(line);
		}
		Arrays.sort(result);
		pw.write("Case #" + i.toString() + (result[0]).toString());
		}

	br.close();
	pw.close();

    }


	private int helper(String input) {
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
    	for (int i = 0; i < input.length(); i++) {
        	isItThere[input.charAt(i)] = true;
    	}
		int count = 0;
    	for (int i = 0; i < isItThere.length; i++) {
        	if (isItThere[i] == true){
            	count++;
        	}
    	}
		return count;
		}














}
