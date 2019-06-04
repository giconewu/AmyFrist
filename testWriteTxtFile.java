package com.foya.tw;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class test3 {

	
	
	public static void main(String[] args) {

		BufferedWriter fw = null;

		try {
			File file = new File("c://temp//text.txt");
			
			fw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "BIG5"));
			
			fw.append("我寫入的內容");
	
			fw.newLine();
	
			fw.append("我又寫入的內容");
	
			fw.flush(); // 全部寫入緩存中的內容
	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
