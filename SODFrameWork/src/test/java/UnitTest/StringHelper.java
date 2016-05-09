package UnitTest;

public class StringHelper {
	// convert from UTF-8 -> internal Java String format
    public static String convertFromUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("ISO-8859-1"), "UTF-8");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }
 
    // convert from internal Java String format -> UTF-8
    public static String convertToUTF8(String s) {
        String out = null;
        try {
            out = new String(s.getBytes("UTF-8"), "ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            return null;
        }
        return out;
    }
 
    public static void main(String args[]) throws Exception {
        String s = new String("–".getBytes("UTF-8"), "UTF-8");;
        System.out.println(s);
//        byte ptext[] = s.getBytes("UTF8");
//        for (int i = 0; i < ptext.length; i++) {
//          System.out.print(ptext[i] + ",");
//        }
      }

}
