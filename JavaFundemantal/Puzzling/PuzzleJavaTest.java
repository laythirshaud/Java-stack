import java.util.Arrays;
import java.util.ArrayList;

public class PuzzleJavaTest {
    public static void main(String[] args){
        double[] arr= {3,5,1,2,7,9,8,13,25,32};
        System.out.println(PuzzleJava.sumG(arr));


        //////#2
      ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        System.out.println(PuzzleJava.Names(names));

        // 3
        PuzzleJava.alphabet();
        // 4+5
        System.out.println(PuzzleJava.tenRandoms());
        // # 6
        PuzzleJava.fiveStr();
         // #7
        System.out.println(Arrays.toString(PuzzleJava.tenWords()));
    }   

}


