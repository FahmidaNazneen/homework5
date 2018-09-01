package array;

import java.util.Random;


public class UseArray_Random {
    public static void main(String[] args) {

       ;
        Random random = new Random();

        int[] employee = new int[5];
        System .out.println("enter numbers");
        for(int i=0; i<employee.length; i++){
            employee[i] = random.nextInt(20);
        }

        for(int j=0; j<employee.length; j++){
            System.out.println("emmploye index value:" + employee[j]);

        }



    }
}
