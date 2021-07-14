public class hexadecimal {
    public static String hexadecimal(String ascii)
    {

        String hex = "";

        for (int i = 0; i < ascii.length(); i++) {

            char ch = ascii.charAt(i);

            int in = (int)ch;

            String part = Integer.toHexString(in);

            hex += part;
        }

        return hex;
    }

    // Driver Function
    public static void main(String[] args)
    {

        System.out.println(hexadecimal("Ridhima"));
    }
}

