package assignment_8;

import java.util.ArrayList;
import java.util.List;

		class Orders{

		    int orderid;
		    int orderPrice;
		    String status;

		    public Orders(int orderid, int orderPrice, String status) {
		        this.orderid = orderid;
		        this.orderPrice = orderPrice;
		        this.status = status;
		    }

		    /*public void display{
		        System.out.println("order id :"+this.orderid+"\norderPrice: "+this.orderPrice+" \norderStatus: "+this.status);
		    }*/
		    public void display(){
		        System.out.println("Orderid:"+this.orderid+"  Price: "+this.orderPrice+"  Status: "+this.status);
		    }
		}

		interface checking{
		    public void check(Orders obj);
		}
		public class ass8_2 {
		    public static void main(String[] args) {
		        Orders o1 = new Orders(1001,16000,"Accepted");
		        Orders o2 = new Orders(1002,31500,"completed");
		        Orders o3 = new Orders(1003,8900,"Accepted");
		        Orders o4= new Orders(1074,15099,"dispatched");

		        checking c1 = (Orders obj)->{
		          if (obj.orderPrice>10000&&(obj.status.equalsIgnoreCase("accepted")||obj.status.equalsIgnoreCase("completed")))
		              obj.display();
		        };

		        c1.check(o1);
		        c1.check(o2);
		        c1.check(o3);
		        c1.check(o4);


		    }
		}

