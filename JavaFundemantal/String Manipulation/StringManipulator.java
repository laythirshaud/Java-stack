
public class StringManipulator {
    public static String trimAndConcat(String s1 , String s2) {
        String st1 =s1.trim();
        String st2=s2.trim();
        String s3= st1.concat(st2);
        return s3;
    }



    public static Integer getIndexOrNull(String str, char letter) {
		int x = str.indexOf(letter);
		if (x == -1) {
			return null;
		}
		return x;
    }




	public static Integer getIndexOrNull(String str, String letter) {
		int x = str.indexOf(letter);
		if (x == -1) {
			return null;
		}
		return x;
    }




	public static String concatSubstring(String str1, int num1, int num2, String str2) {
		String str = str1.substring(num1, num2) + str2;
		return str;
	}
    public static void main(String[] args) { 
        System.out.println(StringManipulator.trimAndConcat("    Hello     ","     World    "));
        System.out.println(StringManipulator.getIndexOrNull("Coding", 'd'));
            String str1="hello";
            String substr1="llo";
            String notsubstr1="world";
            System.out.println(StringManipulator.getIndexOrNull(str1,substr1 ));
            System.out.println(StringManipulator.getIndexOrNull(str1,notsubstr1 ));
        System.out.println(StringManipulator.concatSubstring("Hello", 1, 2, "world"));
}
}