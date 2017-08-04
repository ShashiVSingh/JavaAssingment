package StringProg;

import java.io.DataInputStream;
import java.io.IOException;

public class DemoDIS {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the first no");
		DataInputStream dis = new DataInputStream (System.in);
		int a = dis.readInt();
		System.out.println("enter 2nd nnumber");
		dis = new DataInputStream (System.in);
		int b= dis.readInt();
		int c = a+b;
		System.out.println("total=\t"+c);

	}

}
