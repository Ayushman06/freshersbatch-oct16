package assignment_1;
public class ass1_7 { 
		public static int linearSearch(int[] arr, int key){    
		        for(int i=0;i<arr.length;i++){    
		            if(arr[i] == key){    
		                return i;    
		            }    
		        }    
		        return -1;    
		    }    
		    public static void main(String a[]){    
		        int[] a1= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};    
		        int key = 19;    
		        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
		    }    
		}   