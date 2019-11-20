package budzko;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionalTask {

    public static void main(String[] args) {
        int n = 0;
        while (true) {
            System.out.println("Введите количество чисел");
            Scanner in = new Scanner(System.in);
            try {
                n = in.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не число");
            }

        }
        String[] numb = new String[n];
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < numb.length; i++) {
            System.out.println("Введите число №" + (i + 1));
            numb[i] = in2.nextLine();
        }

        int min = 10, max = 0;
        String minNumber = null, maxNumber = null;
        for (String a : numb) {
            System.out.println(a);
            if (a.length() < min) {
                min = a.length();
                minNumber = a;
            }
            if (a.length() > max) {
                max = a.length();
                maxNumber = a;
            }
        }
        System.out.println("Минимальное число " + minNumber + " состоит из " + min
                + " цифр\nМаксимальное число " + maxNumber + " состоит из " + max
                + " цифр");

        // Вывод цифр в порядке возрастания их слины
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-1 ; j++) {
                if(numb[j].length() == numb[j+1].length()) {
                    int first_counter = 0;
                    int second_counter = 0;
                    for (int k = 0; k < numb[j].length()-1; k++) {
                        if (Character.isDigit(numb[j].charAt(k))) first_counter++;
                        if (Character.isDigit(numb[j+1].charAt(k))) second_counter++;
                    }
                    if (first_counter > second_counter){
                        String temp = numb[j];
                        numb[j] = numb[j+1];
                        numb[j+1]= temp;
                    }
                } else if (numb[j].length() > numb[j+1].length()){
                    String temp = numb[j];
                    numb[j] = numb[j+1];
                    numb[j+1]= temp;
                }

            }

        }
        int maxLength = numb[n-1].length();
        System.out.println("Числа по возрастанию их длины");
        for (int i = 0; i < n ; i++) {
            System.out.println(numb[i]);

        }


    }
}
