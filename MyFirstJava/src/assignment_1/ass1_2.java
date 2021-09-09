package assignment_1;
public class ass1_2 {
   public static void main(String args[]){

      for (int i = 100; i<1000; i++){
         int check, rem, sum = 0;
         check = i;
         while(check != 0) {
            rem = check % 10;
            sum = sum + (rem * rem * rem);
            check = check / 10;
         }
         if(sum == i){
            System.out.println(""+i+" is an Armstrong number.");
         }
      }
   }
}

