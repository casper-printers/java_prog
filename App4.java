import java.util.Scanner;

/**
 * Created by Uzed on 04.05.2017.
 */

import java.util.Scanner;

public class App4 {
    public static void main(String[] args){
    /*
        System.out.println("asdasdasdasd");
        System.err.println("ОШИБКА!!!");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        System.out.println(i);

        float[] f;
        System.out.println("Введите длинну массива");
        int length = scanner.nextInt();

        f = new float[length];

        for (int j = 0; j < f.length; j++){
            System.out.println("Введите число №" + j + " = ");
            f[j] = scanner.nextFloat();
        }

        for (int j = 0; j < f.length; j++){
            System.out.println("Число " + j + " = " + f[j]);
        }
*/
        System.out.println(String.format("%d %d", 200, 100));
        System.out.println(String.format("%d %.2f", 200, 100f));


        float max;
        float[] arr;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну массива");

        int length = scanner.nextInt();

        arr = new float[length];
        for (int i = 0; i < arr.length; i++){
            System.out.printf("Введите %d- элемент ", i+1);
            arr[i] = scanner.nextFloat();
        }

        max = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (max > arr[i]){
                max = arr[i];
            }
        }

        System.out.printf("максимальный элемент = %g", max);




    }
}
