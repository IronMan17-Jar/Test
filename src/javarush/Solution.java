package javarush;

import java.util.Arrays;

public class Solution{

        public static void main(String[]args){

            int[] mass = new int[20];
            for(int x = 0;x< mass.length; x++) {
                mass[x]= (int) (Math.random()*30);
                System.out.println(mass[x]);

            }
            System.out.println();

            Arrays.sort(mass);
            System.out.println("Минимум равен" + " " + mass[0]);

            System.out.println();
            System.out.println("Максимум равен" + " " + mass[19]);

            System.out.println();

            int sum = 0;
            for(int value : mass){
                sum = sum+value;
            }
            double srednee = sum/ mass.length;
            System.out.println("Среднее число равно" + " " + srednee);

    }
    }





