
import java.util.Scanner;

public class InputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int j=0;
        int T=5;


        while(0<T--) {
            i = sc.nextInt();
            if (j < i) j = i;
        }

        System.out.println(j);

        int[] intArray=new int[5];

    }


}
