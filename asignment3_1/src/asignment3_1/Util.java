/**
 * 
 */
package asignment3_1;
import java.text.DateFormat;
import java.util.Date;
/**
 * @author 611092
 *
 */
public class Util {

	public static String dateAsString(Date d) {
		DateFormat f = DateFormat.getDateInstance(DateFormat.SHORT);
		return f.format(d);
		}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/

}
