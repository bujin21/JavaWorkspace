package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	public void fileSave() {
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("아이폰", 1500000, "1111");
		arr[1] = new Phone("갤럭시", 1000000, "2121");
		arr[2] = new Phone("갤럭시플립", 1300000, "1313");
		
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("phone_arr.txt"));){
			for(Phone p : arr) {
				oos.writeObject(p);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void fileRead() {
		try(ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream("phone_arr.txt"));){
			// 더 이상 읽어들일 객체가 없는 경우, EOFExceoption을 발생시킨다.
			while(true) {
				Phone p = (Phone)ois.readObject();
				System.out.println(p);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
