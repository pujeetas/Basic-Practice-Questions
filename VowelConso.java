import java.util.HashSet;

public class VowelConso {
    public static void main(String[] args) {
        char c = 'c';

    HashSet<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');

    if(vowels.contains(c)){
        System.out.println("It is vowel");
    }
    else{
        System.out.println("It is a consonant");
    }
    }
}
