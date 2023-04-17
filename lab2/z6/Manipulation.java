package lab2.z6;

public class Manipulation {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Last symbol: " + lastChar);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Ends with '!!!': " + endsWithExclamation);

        boolean startsWithILike = str.startsWith("I like");
        System.out.println("starts with 'I like': " + startsWithILike);

        boolean containsJava = str.contains("Python");
        System.out.println("Contain 'Python': " + containsJava);

        int javaIndex = str.indexOf("Java");
        System.out.println("Index of 'Java': " + javaIndex);

        String replacedStr = str.replace('a', 'o');
        System.out.println("Unaltered string: " + replacedStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowerase string: " + lowerCaseStr);

        String cutStr = str.substring(7, 11);
        System.out.println("Crop string: " + cutStr);
    }
}