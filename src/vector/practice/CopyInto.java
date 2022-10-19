package vector.practice;

import java.util.Vector;

public class CopyInto
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
		Integer arr[]= new Integer[6];
		v.copyInto(arr);
		System.out.println("Elements in array are: ");
		for(Integer num:arr)
		{
			System.out.println(num);
			
		}

        
		
	}

 }
