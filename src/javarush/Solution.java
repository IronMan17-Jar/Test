package javarush;

import java.util.Arrays;

public class Solution{

    public static void main (String[] args) throws  Exception {


        int[] array = new int[20];
        int min= array[0];
        int max= array[0];
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 30);
            if(array[x]<min)
              min=array[x];
            if(array[x]>max)
            max=array[x];
        }
        System.out.println(min);
        System.out.println();
        System.out.println(max);
    }
}





