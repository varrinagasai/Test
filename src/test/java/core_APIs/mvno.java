package core_APIs;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
public class mvno {
	public static String username;
	public static String password;
	public static String mvno;
	public static List<String> details;

	public static String random_number()
	{
		String ranNum = Double.toString((Math.random()*800000 + 100000));
				return ranNum;
	}
	public static String random_String()
	{
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd'T'HH-mm-ss");
		String email = "regression" + sdf.format(date) + "@popmail.com";
		return email;
	}
}
