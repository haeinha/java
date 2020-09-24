public class ForEachExmple {
    enum Week { 월,화,수,목,금,토,일};
    public static void main(String[] args){

        int[] intArray={1,2,3,4,5,6,7,8,9,10};

        for(int a : intArray){
            System.out.println(a);
        }

        String[] names={"hi","hello","bye"};

        for(String s : names) System.out.println(s);


        for(Week w: Week.values()) System.out.println(w);



    }
}
