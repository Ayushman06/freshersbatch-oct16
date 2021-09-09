package assignment_5;
import java.util.HashSet;

	class employee{
	    int id;
	    String name,dept;
	    private double salary;
	    HashSet<employee> set1 = new HashSet<>();

	    public employee(int id, String name, String dept, double salary) {
	        this.id = id;
	        this.name = name;
	        this.dept = dept;
	        this.salary = salary;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    void displaydetails(){
	        System.out.println("name:"+this.name);
	        System.out.println("dept:"+this.dept);
	        System.out.println("id:"+this.id);
	    }
	    public <T> void addtoHash(T object){
	        set1.add((employee) object);
	        System.out.println(set1);
	    }
	    public String toString(){
	        return "Employee name:"+this.name;
	    }
	}
	public class ass5_1 {
	    public static void main(String[] args) {

	        employee emp1 = new employee(1,"Ayush","ece",20000);
	        employee emp2 = new employee(2,"Nitesh","ece",30000);
	        emp1.addtoHash(emp1);
	        emp2.addtoHash(emp2);
	       
	    }
	}

