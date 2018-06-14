package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapMethodsImplementation {

	public static void main(String[] args) {
		MapMethodsImplementation obj =new MapMethodsImplementation();
		obj.methods();

	}
	public void methods() {
		Map<Integer,String > users = new TreeMap<>();
		// put() method
		users.put(1, "Govardhan");
		users.put(2, "reddy");
		users.put(3, "papana");
		users.put(4, "vishnu");
		users.put(5, "shobha");
		users.put(6, "sekhar");
		// get() method
		String name = users.get(1);
		System.out.println(name);
		// containsKey() method
		if(users.containsKey(2)) {
			System.out.println(users.get(2));
		}
		// containsValue() method
		if(users.containsValue("papana")) {
			System.out.println("Found the value in Map");
		}
		// size() method
		System.out.println("The size of the Map is: "+ users.size());
		// keySet() method
		Set<Integer> num = users.keySet();
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			String name1 =users.get(key);
			System.out.println("userId: "+key+"   userName: "+name1);
		}
		// values() method
		Collection<String> names= users.values();
		System.out.println("The list of Names in the map are: ");
		for(String st:names) {
			System.out.println( st);
		}
		// entrySet() method
		Set<Map.Entry<Integer, String>> mapSet =users.entrySet();
		System.out.println("From the entrySet method");
		for(Map.Entry<Integer, String> mapSe:mapSet) {
			int num1 = mapSe.getKey();
			String name2 = mapSe.getValue();
			System.out.println(num1+" : "+name2);
		}
		// with Lambda expression and forEach()
		System.out.println("with Lambda expression and forEach() ");
		users.forEach((num2,name3)->System.out.println(num2+" => "+ name3));
		// replace() method
		System.out.println("Replace the value of key 3: "+users.replace(3, "P")+"\n" + users);
		// remove() method
		System.out.println("Removed the value of key 3: "+users.remove(3)+"\n"+ users);
		// hashCode() method
		System.out.println("HashCode for the map is: "+users.hashCode() );
		// isEmpty() method
		if(users.isEmpty()) {
			System.out.println("Map is empty");
		}else {
			System.out.println("Map is not Empty");
		}
		// putAll() method
		Map<Integer, String> city= new HashMap<>();
		city.put(7, "kadapa");
		city.put(8, "hyderabad");
		city.putAll(users);
		System.out.println("Mixed Map:\n"+city);
		// clear() method
		users.clear();
		System.out.println(users);
	}

}
