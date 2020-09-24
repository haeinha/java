import java.io.*;

public class InputExample {
    public static void main(String[] args){

        InputStreamReader rd= new InputStreamReader(System.in);
           try{
            while(true){
                int a=rd.read();
                if(a==-1) break;
                System.out.print((char)a);
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
