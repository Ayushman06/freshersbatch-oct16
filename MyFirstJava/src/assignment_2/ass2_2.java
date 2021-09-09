package assignment_2;

	class Employee{
	    int Empid;
	    String name;
	    private double salary;

	    public double getSalary()
	    {
	        return salary;
	    }
	    public Employee(int empid,String name,double salary)
	    {
	        this.Empid=empid;
	        this.name=name;
	        this.salary=salary;
	    }
	}

	class Manager extends Employee{
	    private int incentive;

	    public Manager(int empid, String name, double salary, int incentive) {
	        super(empid, name, salary);
	        this.incentive=incentive;
	    }

	    public double getSalary()               
	    {
	        double tSalary;
	        tSalary=super.getSalary()+incentive;
	        return tSalary;
	    }

	}

	class Labour extends Employee{
	    private  int overtime;

	    public Labour(int empid, String name, double salary,int ot) {
	        super(empid, name, salary);
	        this.overtime=ot;
	    }

	    public double getSalary()                   
	    {
	        double tSalary;
	        tSalary=super.getSalary()+(overtime*100);
	        return tSalary;
	    }
	}

	public class ass2_2 {
	    public static void main(String[] args) {

	        Employee E1 = new Employee(1001,"Rahul",20000);
	        System.out.println("Salary is "+E1.getSalary());

	        
	        Manager M1 = new Manager(1005,"Ayush",25000,1000);
	        Labour L1 = new Labour(1006,"Nitesh",20000,5);
	        System.out.println("M1 Salary is "+M1.getSalary());
	        System.out.println("L1 Salary is "+L1.getSalary());

	        System.out.println("Total Salary of all employee: "+(E1.getSalary()+ M1.getSalary()+ L1.getSalary()));


	    }

	}


