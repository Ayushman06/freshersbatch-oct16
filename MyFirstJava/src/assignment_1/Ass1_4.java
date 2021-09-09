package assignment_1;
import java.util.Scanner;

public class Ass1_4 {

    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("enter the mark of first subject: ");
        m1 = obj.nextInt();
        System.out.println("enter the mark of second subject: ");
        m2 = obj.nextInt();
        System.out.println("enter the mark of third subject: ");
        m3 = obj.nextInt();

        if(m1>60&&m2>60&&m3>60)
            System.out.println("PASSED");
        else if((m1>60&&m2>60)||(m1>60&&m3>60)||(m2>60&&m3>60))
            System.out.println("Promoted");
        else
            System.out.println("Failed");
        obj.close();
    }
}