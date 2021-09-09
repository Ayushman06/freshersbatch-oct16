package assignment_6;
import java.util.TreeMap;
public class ass6_1 {


		public static void main(String[] args) {
			
			TreeMap<Long,String> map=new TreeMap<Long,String>();
			
			map.put((long) 1, "Ayush");
			map.put((long) 2, "Nitesh");
			map.put((long) 3, "Sayan");
			
			
			System.out.println("all the keys: "+map.keySet());
			System.out.println("all the values: "+map.values());
			System.out.println("all key-value pairs: "+map.keySet()+map.values());
			System.out.println("descendingMap: "+map.descendingMap());
		}

	}



