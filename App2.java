/**
 * Created by Uzed on 04.05.2017.
 */
public class App2 {

    public static void main(String[] args){

        if (1 < 2){
            System.out.println("1 < 2");

        }else{
            System.out.println("1 > 2");
        }

        int i = 1 < 2 ? 10 : 12;

        System.out.println(i);

        i = 12;

        switch (i){
            case 1:
                break;
            case 2:
                break;
            case 12:
                System.out.println("i == 12");
                break;

            default:
                System.out.println("NO ");
                break;
        }

        for (int j=0; j<10; j++ ) {
            System.out.println(j);

        }

        int k = 0;
        while (k<5){
            System.out.println(k);
            k++;
        }

        do {
            System.out.println(k);
            k--;
        }while (k>0);

       // int l = 0;
      //  while (true){
      //      System.out.println(l);
      //      break;
     //   }

        boolean b = false;

        while (b){
            System.out.println(b);
            if (b){
                b= false;

            }
        }

        b = true || false;
        b = false && false;
        b = !true;
        b = false ^ false;
        System.out.println(b);
    }

}
