package film;

import java.util.ArrayList;

/**
 * Film
 * @author CaiXr
 * A class that contain all information of a film
 */
public class Film {
	private String title;
	private String length;
	private String pic;
	private double price;
	
	public Film() {
		
	}
	public Film(String title, String length, String pic, Double price){
		this.title = title;
		this.length = length;
		this.pic = pic;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
