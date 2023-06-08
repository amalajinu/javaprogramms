package mavenPackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>c=new ArrayList<String>();
		c.add("Blue");
		c.add("Red");
		c.add("Green");
		c.add("Yellow");
		Iterator i=c.iterator();//42 c iterte through all elements in an arraylist
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println(c.get(0));//retrieve an element from the given arraylist 42 b
		c.remove(2);//42 d remove 3rd element from arrayalist
		System.out.println(c);
		boolean ans=c.contains("Blue");//42 e search an element in arraylist
		if(ans)
		{
			System.out.println("arraylist contains color blue");
		}
		else
		{
			System.out.println(no);
		}
	}

}
