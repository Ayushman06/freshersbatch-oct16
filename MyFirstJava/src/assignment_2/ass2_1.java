package assignment_2;

	class Singleton{
	    private Singleton(){}

	    private static Singleton instance = null;
	    public static  Singleton createObject()
	    {
	        if(instance==null)
	            instance = new Singleton();
	        return  instance;
	    }
	}

	public class ass2_1 {
	    public static void main(String[] args) {

	        Singleton S1 = Singleton.createObject();
	        Singleton S2 = Singleton.createObject();
	        System.out.println("Address of S1: "+ S1.hashCode());
	        System.out.println("Address of S2: "+ S2.hashCode());
	    }


	}

