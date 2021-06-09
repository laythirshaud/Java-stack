public class FizzBuzz {
    public static String fizzBuzz(int number) {
        
            if (((number % 5) == 0) && ((number % 3) == 0)) {
                return "fizzbuzz";
            }
            else if ((number % 5) == 0) {
               return "fizz";
            }
            else if ((number % 3) == 0) { 
               return "buzz";
            }    
            else {
                String s = String.format("%o", number);
               return s;
            }
        
    }
    public static void main(String[] args) {
            System.out.println(FizzBuzz.fizzBuzz(5));
    }

}
