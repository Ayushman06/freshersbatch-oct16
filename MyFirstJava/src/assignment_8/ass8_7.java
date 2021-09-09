package assignment_8;
import java.util.HashMap;
import java.util.Set;

	public class ass8_7 {

	    public static void main(String[] args) {

	        HashMap<Integer,String > hashMap1 = new HashMap<>();

	        hashMap1.put(10,"i");
	        hashMap1.put(20,"am");
	        hashMap1.put(30,"a");
	        hashMap1.put(40,"good");
	        hashMap1.put(50,"boy");

	        Set s = hashMap1.entrySet();
	        StringBuilder str = new StringBuilder();

	        s.forEach(str1->str.append(str1));

	        System.out.println(str);

	    }
	}




