package Week1.Types;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(numbers);


        int[][] numbers1=new int[3][3];
        numbers1[0][0]=1;
        System.out.println(Arrays.deepToString(numbers1));

    }

}
