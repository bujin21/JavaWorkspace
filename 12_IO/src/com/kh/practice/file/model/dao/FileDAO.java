package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean chekName(String file) {
		boolean result = false;
		File f = new File(file);
		return f.isFile();
	}
	public void fileSave(String file, String s) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file, true);
			
			fw.write(s);
		} catch (IOException e) { 
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		sb.append(file);
		return sb;
	}
	public void fileEdit(String file, String s) {
		fileSave(file, s);
	}
}
