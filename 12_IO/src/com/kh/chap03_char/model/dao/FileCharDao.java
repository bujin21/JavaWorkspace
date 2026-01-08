package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	public void fileSave() {
		// FileWriter : 파일로 데이터를 2byte단위로 출력하는 스트림
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("b_char.txt", true);
			
			fw.write("재밌는 io시간..\n");
			fw.write("잘 즐기고 계신가요..\n");
			fw.write(' ');
			
			char[] arr = {'a','p','p','l','e'};
			fw.write(arr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close(); // 버퍼라는 공간에 넣어놓다가 한번에 전달하기 때문에 close를 해야 push를 해서 전달을 한다. 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("b_char.txt");
			
			int value = 0;
			while((value = fr.read()) != -1){
				System.out.print((char)value);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
