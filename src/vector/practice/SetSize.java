package vector.practice;

import java.util.Vector;

public class SetSize {
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(40);
		v.add(55);
		v.add(90);
		v.add(47);
		v.add(40);
		v.add(17);
		
		System.out.println(v);
		System.out.println(v.size());
		v.setSize(9);
		
		System.out.println("After using setSize () method:" +v.size());

	}

}
