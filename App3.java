/**
 * Created by Uzed on 04.05.2017.
 */
public class App3 {
    public static void main(String[] args){

        int[] ints = null;
        ints = new int[10];


       // System.out.println(ints[0]);
       // System.out.println(ints[9]);
       // System.out.println(ints[8]);
       // System.out.println(ints[1]);

        ints = new int[]{0,0,5,4,3,5,8,4};
       // System.out.println(ints[3]);
       // System.out.println(ints[6]);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        float[][] a = new float[3][3];

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = i + j;
            }
        }

        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        double[][] d = new double[10][];

        for (int i = 0; i < d.length; i++){
            d[i] = new double[i + 1];
        }

        for (int i = 0; i < d.length; i++){
            System.out.println("Длинна " + d[i].length);
        }







    }
}
