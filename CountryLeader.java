import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.lang.*;
import java.util.HashMap;
import java.util.Arrays;

class CountryLeader{
	public static void main(String[] args) throws IOException {
		/**
		Input and write to a file
		**/
	FileInputStream fstream = new FileInputStream("/Users/yixinsun/Desktop/A-small-attempt0.in");
	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	PrintWriter pw = new PrintWriter(new FileWriter("outfile001.txt"));
	int caseNum = Integer.parseInt(br.readLine());
	for (int i = 0; i < caseNum; i++) {
		int wordNum = Integer.parseInt(br.readLine());
		int[] result = new int[wordNum];
		for (int j = 0; j < wordNum; j++) {

			String line = br.readLine();
			result[j] = helper(line);
		}
		int haha = getMax(result);
		pw.write("Case #", i,  haha);
		}

	br.close();
	pw.close();

    }


	private static int helper(String input) {
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


	private static int getMax(int[] inputArray){
	    int maxValue = inputArray[0];
	    for(int i = 1;i < inputArray.length;i++){
	      if(inputArray[i] > maxValue){
	         maxValue = inputArray[i];
	      }
	    }
	    return maxValue;
	  }














}
