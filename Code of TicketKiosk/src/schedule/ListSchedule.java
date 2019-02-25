package schedule;

import javax.swing.JButton;
import javax.swing.JFrame;

import film.Film;
import film.ShowFilms;
import screen.*;
import seat.Seat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/** 
 * ListSchedule
 * @author xyWei 
 * show the arrangement of films
 */
public class ListSchedule extends JFrame implements ActionListener {
	private JButton[] b = new JButton[10];
	private ArrayList<ScheduleItem> t = new ArrayList<>();
	private Film f;
	/**
	 * Create the frame.
	 */
	public ListSchedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("back");
		button.setBounds(300, 500, 117, 29);
		getContentPane().add(button);
		button.addActionListener(this);
	}
	
	/**
	 * Print a film's schedule during this day
	 * @param title
	 */
	public void listSchedule(String title) {
		
		Schedule schedule = new Schedule();
		String curTime = schedule.getCurrentTime();
		
		try {
			t = schedule.loadSchedule();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0,k=0;i<t.size();i++){
			if(t.get(i).getFilm().getTitle().equals(title)){
				f=t.get(i).getFilm();
				int j=0;
				while(j<t.get(i).getTime().length){
					//System.out.println(t.get(i).getTime()[j] + t.get(i).getScreen());

					b[k] = new JButton();
					b[k].setBounds(300, 126+k*50, 300, 23);
					getContentPane().add(b[k]);
					b[k].setText(t.get(i).getTime()[j] + " " + t.get(i).getScreen());
					b[k].setActionCommand(k+"");
					b[k].addActionListener(this);
					//if(schedule.timeCompare(t.get(i).getTime()[j],curTime)<0)
						//b[k].setEnabled(false);
					j++;
					k++;
				}
				
			}
		}	

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton)e.getSource();
		//int index = Integer.valueOf(button.getActionCommand());
		//System.out.println(index);
		if(button.getText().indexOf("screen1")!=-1){
			//setVisible(false);
			Seat seat = new Seat();
			int i [] = new int[32];
			String ss = button.getText().replaceAll(" ", "");
			i=seat.readSeat("seatcond/"+ss.replaceAll(":", "")+".txt");
			Screen1 s1 = new Screen1(f,button.getText(),i);
			s1.setVisible(true);
		} 
		if(button.getText().indexOf("screen2")!=-1){
			//setVisible(false);
			Seat seat = new Seat();
			int i [] = new int[32];
			String ss = button.getText().replaceAll(" ", "");
			i=seat.readSeat("seatcond/"+ss.replaceAll(":", "")+".txt");
			Screen2 s2 = new Screen2(f,button.getText(),i);
			s2.setVisible(true);
		} 
		if(button.getText().indexOf("screen3")!=-1){
			//setVisible(false);
			Seat seat = new Seat();
			int i [] = new int[32];
			String ss = button.getText().replaceAll(" ", "");
			i=seat.readSeat("seatcond/"+ss.replaceAll(":", "")+".txt");
			Screen3 s3 = new Screen3(f,button.getText(),i);
			s3.setVisible(true);
		} 
		if(button.getText().equals("back")){
			setVisible(false);
			ShowFilms sf = new ShowFilms();
			sf.setVisible(true);
		}
			
			
	}
}
