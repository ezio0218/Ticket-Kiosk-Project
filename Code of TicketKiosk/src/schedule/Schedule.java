package schedule;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import film.FilmList;

/** 
 * Schedule
 * @author xyWei 
 * read schedule file and store them in arraylist
 */
public class Schedule {
	private ArrayList<ScheduleItem> item = null;

	public Schedule() {
		this.item = new ArrayList<ScheduleItem>();
	}

	public Schedule(ArrayList<ScheduleItem> item) {
		this.item = item;
	}
	

	/**
	 * 
	 * @return the arraylist that contains all films' arrangement
	 * @throws Exception
	 */
	public ArrayList<ScheduleItem> loadSchedule() throws Exception{
		FileInputStream fs = new FileInputStream("data/schedule.txt");
		InputStreamReader inputRead = new InputStreamReader(fs);
		BufferedReader buff = new BufferedReader(inputRead);
		new FilmList();
		String s1 = null;
		String s2 = null;
		String reg = "screen\\S{0,}";
		while((s1=buff.readLine())!=null){
			ScheduleItem it = new ScheduleItem();
			if(s1.matches(reg)){
				it.setScreen(s1);
				s1 = buff.readLine().trim();
				for(int i=0;i<FilmList.filmlist.size();i++){
					s2=FilmList.filmlist.get(i).getTitle();
					//System.out.println(s2);
					if(s1.equals(s2))
						it.setFilm(FilmList.filmlist.get(i));
				}
				s1 = buff.readLine();
				it.setTime(s1.split(","));
				item.add(it);
				/*
				String [] ss;
				ss = it.getTime();
				for(int i=0;i<ss.length;i++)
					System.out.println(ss[i]);*/
			}	
		}
		buff.close();
		return item;
	}
	
	/**
	 * 
	 * @return String format of current time
	 */
	public String getCurrentTime(){
		Date currentTime = new Date();  
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
        String dateString = formatter.format(currentTime);  
        return dateString;  
    }  
	
	/**
	 * 
	 * @param t1 a time in String type
	 * @param t2 another time in String type
	 * @return the result of comparation
	 */
	public int timeCompare(String t1,String t2){  
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");  
        Calendar c1=Calendar.getInstance();  
        Calendar c2=Calendar.getInstance();  
        try {  
            c1.setTime(formatter.parse(t1));  
            c2.setTime(formatter.parse(t2));  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        int result=c1.compareTo(c2);  
        return result;  
    }  
	
	public static void main(String[] args){
		Schedule schedule = new Schedule();
		ArrayList<ScheduleItem> t = new ArrayList<>();
		try {
			t = schedule.loadSchedule();
			for(int i=0;i<t.size();i++){
				if(t.get(i).getFilm().getTitle().equals("BEAUTY AND THE BEAST")){
					int j=0;
					while(j<t.get(i).getTime().length){
						System.out.println(t.get(i).getTime()[j] + t.get(i).getScreen());
						j++;
					}
				}
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
