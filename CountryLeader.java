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
	FileInputStream fstream = new FileInputStream("/Users/yixinsun/Desktop/A-small-attempt4.in");
	BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	PrintWriter pw = new PrintWriter(new FileWriter("outfile1.txt"));
	int caseNum = br.nextInt();
	for (int i = 0; i < caseNum; i++) {
		String line = br.nextLine();
		int result = helper(line);
	}



	}




	br.close();
    pw.close();


}



}
