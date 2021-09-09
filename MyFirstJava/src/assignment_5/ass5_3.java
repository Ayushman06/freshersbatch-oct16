package assignment_5;

public class ass5_3 {
	    public static <E> E[] exchArr(E[] arr, int p1, int p2){

	    E temp = arr[p1];
	    arr[p1]=arr[p2];
	    arr[p2]=temp;

	    return arr;



	    }
	    public static void main(String[] args) {

	        Integer[] intarr = new Integer[]{1,2,3,4,5,6,7,8,9};
	        

	        for (int i:exchArr(intarr,1,5)
	             ) {
	            System.out.println(i);

	        }
	    }



	}


