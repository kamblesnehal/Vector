package vector.practice;

import java.util.Vector;

public class RemoveElement
   {
	public static void main(String[] args) 
	{
		Vector v = new Vector();
	v.add(40);
	v.add(55);
	v.add(90);
	v.add(47);
	v.add(40);
	v.add(17);
	
	System.out.println(v);
	v.removeElement(17);
	System.out.println(v);

		
	}

}
