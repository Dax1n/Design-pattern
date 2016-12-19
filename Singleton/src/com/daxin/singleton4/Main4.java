package com.daxin.singleton4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main4 {

	public static void main(String[] args) {

		FileOutputStream out = null;
		ObjectOutputStream objWriter = null;
		Singleton4 instance =null;
		
		//单例对象序列化
		try {
			 instance = Singleton4.getInstance();

			out = new FileOutputStream("data\\singleton4.dat");
			objWriter = new ObjectOutputStream(out);

			objWriter.writeObject(instance);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		} finally {

			if (objWriter != null) {
				try {
					objWriter.close();
					// 关闭设置为null是为了便于垃圾回收器回收
					objWriter = null;
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (out != null) {
					try {
						out.close();
						// 关闭设置为null是为了便于垃圾回收器回收
						out = null;
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		//单例对象反序列化
		FileInputStream in = null;
		ObjectInputStream objReader =null;
		try {
			  in =new  FileInputStream("data\\singleton4.dat");
			  objReader =new ObjectInputStream(in);
			  Singleton4 instance1 =  (Singleton4) objReader.readObject();
			  
			  
			  //com.daxin.singleton4.Singleton4.readResolve()方法有无影响结果：
			  //自行调试吧
			  System.out.println("序列化与反序列化对象是一个对象吗 ？ "+(instance1==instance));
			  
			  
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
