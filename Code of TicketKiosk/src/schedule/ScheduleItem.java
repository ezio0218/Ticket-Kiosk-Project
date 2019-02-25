package schedule;

import film.Film;
import screen.*;

/** 
 * ScheduleItem
 * @author xyWei 
 * A class contains how each film is arranged
 */
public class ScheduleItem implements Comparable<ScheduleItem>{
	private String[] time;//time
	private Film film;
	private String screen;
	private Screen1 s1;
	private Screen2 s2;
	private Screen3 s3;
	
	public ScheduleItem(String[] time, Film film, String screen) {
		this.time = time;
		this.film = film;
		this.screen = screen;
	}
	public ScheduleItem() {

	}
	public String[] getTime() {
		return time;
	}
	public void setTime(String[] time) {
		this.time = time;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	
	public String getScreen() {
		return screen;
	}
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
	public Screen1 getS1() {
		return s1;
	}
	public void setS1(Screen1 s1) {
		this.s1 = s1;
	}
	public Screen2 getS2() {
		return s2;
	}
	public void setS2(Screen2 s2) {
		this.s2 = s2;
	}
	public Screen3 getS3() {
		return s3;
	}
	public void setS3(Screen3 s3) {
		this.s3 = s3;
	}
	@Override
	public int compareTo(ScheduleItem o) {
		// TODO Auto-generated method stub
		return this.getFilm().getTitle().compareTo(o.getFilm().getTitle());
	}
	
}
