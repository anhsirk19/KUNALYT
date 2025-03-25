package AATCS;

public class RemoveSpaces {
    public static void main(String[] args) {
        String originalString = "Hello World! This is a test.";
        String stringWithoutSpaces = originalString.replace(" ", "");
        
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String Without Spaces: \"" + stringWithoutSpaces + "\"");
    }

    public static void main(String[] args) {
        String originalString = "Hello World! This is a test.";
        String stringWithoutSpaces = originalString.replaceAll("\\s+", ""); // Removes all whitespace characters
        
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String Without Spaces: \"" + stringWithoutSpaces + "\"");
    }

    public static void main(String[] args) {
        String originalString = "Hello World! This is a test.";
        StringBuilder stringBuilder = new StringBuilder();
        
        for (char c : originalString.toCharArray()) {
            if (c != ' ') { // Check if the character is not a space
                stringBuilder.append(c);
            }
        }
        
        String stringWithoutSpaces = stringBuilder.toString();
        System.out.println("Original String: \"" + originalString + "\"");
        System.out.println("String Without Spaces: \"" + stringWithoutSpaces + "\"");
    }
}
