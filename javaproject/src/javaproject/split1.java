package javaproject;
//import java.util.regex.Pattern;
public class split1 {

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
        String s = "He is a very very good boy, isn't he?";
        String outPut[] = s.split("(\\s+|!+|,+|\\?+|_+|'+|@+|\\.+)+");
        System.out.println(outPut.length);
        System.out.println(String.join("\n", outPut));
	}

}
