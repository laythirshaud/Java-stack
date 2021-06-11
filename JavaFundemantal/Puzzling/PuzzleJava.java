import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
 
public class PuzzleJava {

    public static ArrayList<Double> sumG(double[] arr){
        double sum=0;
        ArrayList<Double> greater = new ArrayList<Double>();
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(arr[i]>10){
                greater.add(arr[i]);
            }
        }
    System.out.println(sum);
    return greater;
    }

    public static ArrayList<String> Names(ArrayList<String> names) {
        ArrayList<String> longNames = new ArrayList<String>();
        Collections.shuffle(names);
        for (String name : names) {
            System.out.println(name);
            if (name.length() > 5){
                longNames.add(name);
            }
        }
        return longNames;
    }

    public static ArrayList<Character> alphabet() {
        ArrayList<Character> letters = new ArrayList<Character>();
        char letter = 'a';
        letters.add(letter);
        int number = letter;
        for (int i = 0; i < 25; i++) {
            number += 1;
            letter = (char) number;
            letters.add(letter);
        }
        Collections.shuffle(letters);
        System.out.println(letters.get(25));
        System.out.println(letters.get(0));
        if (letters.get(0) == 'a' || letters.get(0) == 'u' || letters.get(0) == 'e' || letters.get(0) == 'i' || letters.get(0) == 'o' ) {
            System.out.println("A vowel");
        }
        return letters;
    
    }
    public static ArrayList<Integer> tenRandoms() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            
            numbers.add(r.nextInt(45) + 55);
        }
        Collections.sort(numbers);
        System.out.println(String.format("The Minimum is: %d",numbers.get(0)));
        System.out.println(String.format("The Maximum is: %d",numbers.get(9)));
        return numbers;
    }
    public static String fiveStr() {
        String str = "";
        Random r = new Random();
        ArrayList<Character> letters = alphabet();
        for (int i = 0; i < 5; i++) {
            str = str + letters.get(r.nextInt(25));
        }
        System.out.println(str);
        return str;
    }
    public static String[] tenWords() {
        String[] words;
        words = new String[10];
        for (int i = 0; i < 10; i++) {
            words[i] = fiveStr();
        }
        return words;
    }
}