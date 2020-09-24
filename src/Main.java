import java.io.*;

public class Main{

    public static int Fibonacci(int n){
        if(n<=2) return 1;
        else return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int d=Integer.parseInt(br.readLine());
        System.out.println(Fibonacci(d));


    }
}