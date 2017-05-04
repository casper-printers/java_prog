/**
 * Created by Uzed on 04.05.2017.
 */
public class App {

    public static void main(String[] args){
            byte b;
            short s;
            int i;
            long l;


            b=10;
            System.out.println(b);
            b=100;
            System.out.println(b);
            b = (byte)128;
            System.out.println(b);

            i = 234;
            System.out.println(i);
            i = 0xFF;
            System.out.println(i);
            i = 067;
            System.out.println(i);
            i = 15;
            System.out.println(i);


            l = 2323232323221321321L;
            System.out.println(l);

            float f;
            double d;

            f = 0.1f;
            System.out.println(f);

            f = 1.5E-3f;
            System.out.println(f);

            d = 0.25454545;
        System.out.println(d);
        d = -3.8E+6;
        System.out.println(d);

        char c = 'a';
        System.out.println(c);
        c = '+';
        System.out.println(c);

        boolean bool;
        bool = true;
        System.out.println(bool);
        bool = false;
        System.out.println(bool);

        i = 1 << 2 ;
        System.out.println(i);
         i = 16 >> 2;
        System.out.println(i);



    }

}
