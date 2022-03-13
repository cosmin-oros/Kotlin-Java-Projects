package codewars;

public class CreditCardMask {

	public static void main(String[] args) {
		String string = new Maskify("1234");
		System.out.println(string);
	}
	public class Maskify {
	    public static String maskify(String str) {
	        if (str.length() <= 4) return str;
	        String result = "";
	        for (int i = 0; i < str.length()-4; i++) {
	            result += "#";
	        }
	        return result + str.substring(str.length()-4);
	    }
	}
}
