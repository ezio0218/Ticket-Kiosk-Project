package film;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * FilmList
 * @author CaiXr
 * Get all films
 */
public class FilmList {
	public static ArrayList<Film> filmlist = new  ArrayList<>();
	
	public FilmList(){
		loadFilm();
	}
	
	/**
	 * Get all films from plain text and store them into arraylist
	 */
	public void loadFilm() {
		try{
			FileInputStream fs = new FileInputStream("data/film.txt");
			InputStreamReader inputReader = new InputStreamReader(fs);
			BufferedReader buff = new BufferedReader(inputReader);
			int count = Integer.parseInt(buff.readLine());
			for(int i =0; i < count ; i++){
				Film film = new Film();
				film.setTitle(buff.readLine());
				film.setLength(buff.readLine());
				film.setPic(buff.readLine());
				film.setPrice(Double.parseDouble(buff.readLine()));
				filmlist.add(film);
				if("##".equals(buff.readLine()))
					continue;
			}
			buff.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//return filmlist; 
		
	}
	
	public static void main(String[] args) {
		new FilmList();
		for (Film film : filmlist) {
			System.out.println(film.getTitle()+film.getLength()+
			film.getPic()+
			film.getPrice());
			
		}
	}
}
