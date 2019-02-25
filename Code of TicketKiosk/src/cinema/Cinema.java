package cinema;

/** BankTest
 * @author xyWei 
 * driving the application
 */
import film.ShowFilms;

public class Cinema {

	public static void main(String[] args){
		ShowFilms sf = new ShowFilms();
		sf.setBounds(100, 100, 900, 600);
		sf.setVisible(true);
	}

}
