package vector.practice;

import java.util.Vector;

public class TrimToSize 
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
		System.out.println(v.capacity());
        System.out.println(v.size());
        v.trimToSize();
		System.out.println("After using trimtosize: "+v.size());
		System.out.println(v.capacity());

		
		
	}

}
