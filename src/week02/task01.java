package week02;

import java.util.Arrays;
import java.util.Random;

public class task01 {
    public static void main(String[] args){

        int [] numbers = new int[10];
        int total = 0;
        int even = 0;
        int odd = 0;

        Random random = new Random();

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(1, 101);
            total = Arrays.stream(numbers).sum();
        }
        System.out.println("Average number: " + total / numbers.length);


        int max = Arrays.stream(numbers).max().getAsInt();
        System.out.println("Max: " + max);

        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Min: " + min);

        for(int j = 0; j < numbers.length; j++){
            switch(numbers[j] % 2){
                case 0 -> even++;
                case 1 -> odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
