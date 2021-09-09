package assignment_5;

public class ass5_4 {

	public static void main(String[] args) {

		pair<String,String> myObj=new pair<>();
		myObj.setKey("Ayush");
		myObj.setValue("is my name");
		System.out.println("key: "+myObj.getKey()+"\n"+"value: "+myObj.getValue());
		pair<String,java.util.Date>myobj=new pair<>();
		myobj.setKey("Today is");
		myobj.setValue(new java.util.Date());
		System.out.println("key: "+myobj.getKey()+"\n"+"value: "+myobj.getValue());
		System.out.println("\nProgram is end");
	}

}
