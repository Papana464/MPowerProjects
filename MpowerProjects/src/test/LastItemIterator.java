package test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LastItemIterator {
	static int res2;
	public static void main(String[] args) {

		last();
	}
	public static void last() {
		List<Integer> res = new ArrayList<Integer>();
		res.add(55);
		res.add(25);
		res.add(71);
		res.add(69);
		Iterator<Integer> itr = res.iterator();
		while(itr.hasNext()) {
			res2 = itr.next();
		}
		System.out.println(res2);
	}
	
}
