package presa_5;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args){
        int[] array1 = {1, 2, 5, 3, 8, 6, 7};

        Arrays.sort(array1);
        int result = array1[array1.length - 2];

        System.out.println(result);

        }

    }


