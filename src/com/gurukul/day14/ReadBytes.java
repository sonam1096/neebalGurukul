package com.gurukul.day14;

import java.io.BufferedInputStream;
import java.io.IOException;

public class ReadBytes {
	private static void readByteArray() {
		BufferedInputStream bis = new BufferedInputStream(System.in);
		try {
			System.out.println("Enter Input:");
			byte[] b = new byte[5];
			/* StringBuilder sb= new StringBuilder(); */
			String s = "";
			int pos = 0;
			while (true) {
				bis.read(b);
				/* sb.append(new String(b)); */
				if (pos == -1)

					break;
				s += new String(b, 0, pos);

				if (b[pos - 1] == '\n')
					break;
				b = new byte[5];
			}
			System.out.println("Input Was :" + b);
		} catch (IOException e) {
			System.out.println("Error");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * BufferedInputStream bf=new BufferedInputStream(); try {
		 * System.out.println("Enter input :"); int a=System.in.read();
		 * System.out.println("Input was:"+a); } catch(IOException e) {
		 * System.out.println("Error"); } }
		 */
	//	ReadBytes obj=new ReadBytes(System.in);
		readByteArray();
	}
}
