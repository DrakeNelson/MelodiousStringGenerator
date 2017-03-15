import java.util.Scanner;

public class Main {
    private static final String vowels = "aeiou";
    private static final String consonants = "bcdfghjklmnpqrstvwxz";
    private static final String letters = vowels+consonants;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();

        permutation("", k);

    }

    private static void permutation(String prefix, int lengthOfPermutationString) {
        if (prefix.length() == lengthOfPermutationString) {
            System.out.println(prefix);
        } else {
            if(prefix==""){
                for (int i = 0; i < letters.length(); i++) {
                    permutation(prefix + letters.charAt(i), lengthOfPermutationString);
                }
            }else if(prefix.charAt(prefix.length()-1)=='a'||
               prefix.charAt(prefix.length()-1)=='e'||
               prefix.charAt(prefix.length()-1)=='i'||
               prefix.charAt(prefix.length()-1)=='o'||
               prefix.charAt(prefix.length()-1)=='u'){
                for (int i = 0; i < consonants.length(); i++) {
                    permutation( prefix + consonants.charAt(i), lengthOfPermutationString);
                }
            }else{
                for (int i = 0; i < vowels.length(); i++) {
                    permutation( prefix + vowels.charAt(i), lengthOfPermutationString);
                }
            }
        }
    }
}