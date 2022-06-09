import java.io.*; //for getbytes's exception

public class strings {
    public static void main(String[] args) {
        char chars[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        // to create an empty string
        // format - String s=new String();
        String s1 = new String();
        // to create a string that have initial values
        String s2 = new String(chars);
        // to create a string as a subrange of character arrays
        // format - String(char chars[],int startindex,int numchars)
        String s3 = new String(chars, 2, 3);
        // to construct a string object that contains same character sequence as another
        // string object
        String s4 = new String(chars);
        String s5 = new String(s3);
        // getchars - to extract multiple consecutive characters from string object
        // format -char [] characters = string.getChars(srcBegin, srcEnd, dst,
        // dstBegin);
        char[] s6 = new char[3];
        s2.getChars(1, 4, s6, 0);
        // getbytes - exporting a string value into an environment that doesnt support
        // 16 bit unicode characters

        String Str1 = new String("Aditya Bahl");
        try {
            String Str2 = new String(Str1.getBytes("UTF-8"));
            System.out.println(Str2);
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported character set");
        }
        // toCharArray() - store string in an array
        char[] charsary = Str1.toCharArray();
        // displaying
        System.out.println(s1);// prints null
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s1.length());
        System.out.println(s6);
        System.out.println(charsary);
    }
}