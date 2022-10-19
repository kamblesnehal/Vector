package vector.practice;

import java.util.Vector;

public class EnsureCapacity 
{
	public static void main(String[] args) 
	{ 
		Vector v = new Vector(10);
		System.out.println(v.capacity());
		v.ensureCapacity(45);
		System.out.println(v.capacity());

	}

}
