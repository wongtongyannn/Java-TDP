public class L04StringMethods {
    public static void main(String[] args) {
        String word = "The quick brown fox jumps over the lazy dog";
        // calling the 'toUpperCase' method on the string inside the 'word' variable
        System.out.println(word.toUpperCase());

        // the 'contains' returns true if a sub-string is found within the string
        System.out.println(word.contains("fox"));

        // a method to receive more than one parameter
        System.out.println(word.substring(4,9));
        // the end index would not included
    }
}
