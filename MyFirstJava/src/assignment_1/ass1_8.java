package assignment_1;
public class ass1_8 {
	    static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int t = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                   
	                                 t = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = t;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	    public static void main(String[] args) {  
	                int arr[] ={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	                   
	                bubbleSort(arr);  
	                 
	                System.out.println("Array After Bubble Sort");  
	                for(int i=0; i < arr.length; i++){  
	                        System.out.print(arr[i] + " ");  
	                }  
	   
	        }  
	}  


