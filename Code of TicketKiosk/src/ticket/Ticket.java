package ticket;

import film.Film;
import schedule.Schedule;
import schedule.ScheduleItem;

/**
 * Ticket
 * @author Ning yc
 * 
 */
public class Ticket {
	
	private String id;
	private String sid;
	private String ftitle;
	private double price;
	private String time;
	private String screen;
	private String seat;
	private String type;

	public Ticket(){
		
	}
	
	public Ticket(String time, String screen){
		this.id = "";
		this.time = time;
		this.screen = screen;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getFtitle() {
		return ftitle;
	}

	public void setFtitle(String ftitle) {
		this.ftitle = ftitle;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getSeat(){
		return seat;
	}
	
	public void setSeat(String seat){
		this.seat = seat;
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
   
	
}
