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
		
		//�����������л�
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
					// �ر�����Ϊnull��Ϊ�˱�����������������
					objWriter = null;
				} catch (IOException e) {
					e.printStackTrace();
				}

				if (out != null) {
					try {
						out.close();
						// �ر�����Ϊnull��Ϊ�˱�����������������
						out = null;
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		//�����������л�
		FileInputStream in = null;
		ObjectInputStream objReader =null;
		try {
			  in =new  FileInputStream("data\\singleton4.dat");
			  objReader =new ObjectInputStream(in);
			  Singleton4 instance1 =  (Singleton4) objReader.readObject();
			  
			  
			  //com.daxin.singleton4.Singleton4.readResolve()��������Ӱ������
			  //���е��԰�
			  System.out.println("���л��뷴���л�������һ�������� �� "+(instance1==instance));
			  
			  
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
