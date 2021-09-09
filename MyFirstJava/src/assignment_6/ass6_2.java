package assignment_6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ass6_2 {

		public static void main(String[] args) {
			ArrayList<String> obj=new ArrayList<>();
			obj.add("flash");
			obj.add("13 reasons why?");
			obj.add("riverdale");
			obj.add("breaking bad");
			obj.add("dark");
			obj.add("money heist");
			obj.add("prison break");
			obj.add("stranger things");
			obj.add("how to sell drugs online");
			obj.add("little things");
			obj.add("sacred games");
			HashSet<String> set=new HashSet<String>(obj);
			set.add("how to sell drugs online");
			
			Iterator<String> itr=set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
	}



