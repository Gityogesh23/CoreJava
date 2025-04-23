public class Simple {
    public static void main(String[] args){
        // Creating String with string literal
        String s1 = "Yogesh";

        // Creating character array
        char[] ch = {'K','I','R','A','N'};

        // Converting char array to String
        String s2 = new String(ch);

        // Converting String into character array
        char[] s3 = s1.toCharArray();

        // Creating Java string using new keyword
        String s4 = new String("Satodkar");

        // Printing results
        System.out.println("String s1: " + s1);
        System.out.println("String s2 (from char array): " + s2);

        // Properly printing char array
        System.out.print("Char array s3 (from s1): ");
        for (char c : s3) {
            System.out.print(c + " ");
        }

        System.out.println(); // for newline
        System.out.println("String s4: " + s4);
    }
}
