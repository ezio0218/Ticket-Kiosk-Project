package ticket;

import java.io.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import report.TicketConfirm;
import seat.Seat;

/**
 * TicketGui
 * @author Ning yc
 * To choose the type of ticket
 */
public class TicketGui{
	JFrame frame;
	private ButtonGroup bg;
	private JRadioButton b1,b2,b3,b4;
	
	String time;
	String screentype;
	int [] flag = new int[32];
	int kk;
	
	Ticket t3;
	double money;
	String student_id;//deliver parameter
	public TicketGui(double d)
	{
		this.money=d;
	}
	
	/**
	 * choose child type
	 * @param id
	 * @param filmname
	 * @param date
	 * @param time
	 * @param price
	 * @param seat_number
	 */
	public void child(String id, String filmname, String date, String time, double price, String seat_number)//write file
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			File f = new File("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
		    f.createNewFile();
			fw = new FileWriter("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
            bw = new BufferedWriter(fw);
			String[] content = {
				id,
				filmname,
				seat_number,
				date,
				time,
				"child card",
				price+""
			};
            for(int i=0;i<content.length;i++)
			{
				bw.write(content[i]+"\n");
			}				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
			bw.close();
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
	
	/**
	 * choose adult type
	 * @param id
	 * @param filmname
	 * @param date
	 * @param time
	 * @param money
	 * @param seat_number
	 */
	public void adult(String id, String filmname, String date, String time, double price, String seat_number)//write file
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			File f = new File("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
		    f.createNewFile();
			fw = new FileWriter("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
            bw = new BufferedWriter(fw);
			String[] content = {
				id,
				filmname,
				seat_number,
				date,
				time,
				"Adult card",
				price+""
			};
            for(int i=0;i<content.length;i++)
			{
				bw.write(content[i]+"\n");
			}				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
			bw.close();
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
	
	/**
	 * choose senior type
	 * @param id
	 * @param filmname
	 * @param date
	 * @param time
	 * @param money
	 * @param seat_number
	 */
	public void senior(String id, String filmname, String date, String time, double price ,String seat_number)//write file
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			File f = new File("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
		    f.createNewFile();
			fw = new FileWriter("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
            bw = new BufferedWriter(fw);
			String[] content = {
				id,
				filmname,
				seat_number,
				date,
				time,
				"Senior card",
				price+""
			};
            for(int i=0;i<content.length;i++)
			{
				bw.write(content[i]+"\n");
			}				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
			bw.close();
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
	
	/**
	 * choose student type
	 * @param id
	 * @param filmname
	 * @param date
	 * @param time
	 * @param money
	 * @param seat_number
	 * @param student_ID
	 */
	public void student(String id, String filmname, String date, String time, double price, String seat_number, String student_ID)//write file
	{
		FileWriter fw=null;
		BufferedWriter bw=null;
		try{
			File f = new File("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
		    f.createNewFile();
			fw = new FileWriter("ticketdata/"+id+filmname.replaceAll(":", "")+time.replaceAll(":", "")+".txt");
            bw = new BufferedWriter(fw);
			String[] content = {
				id,
				filmname,
				date,
				time,
				"student card",
				price+"",
				student_ID
			};
            for(int i=0;i<content.length;i++)
			{
				bw.write(content[i]+"\n");
			}				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
			bw.close();
			fw.close();
		}catch(Exception e){
			System.out.println(e);
		}
		}
	}
	
	/**
	 * create choose type frame
	 */
	public String[] ticketgui(String filename, String time, String screentype, String seat, int[] flag, int kk)//ticket gui
	{
		this.time = time;
		this.screentype = screentype;
		this.flag = flag;
		this.kk = kk;
		
		frame=new JFrame("Ticket price");
		
		b1=new JRadioButton("Child");
		b1.setBounds(116, 36, 121, 23);
		frame.getContentPane().add(b1);
		
		b2=new JRadioButton("Adult");
		b2.setBounds(116, 80, 121, 23);
		frame.getContentPane().add(b2);
		
		b3=new JRadioButton("Senior");
		b3.setBounds(116, 127, 121, 23);
		frame.getContentPane().add(b3);
		
		b4=new JRadioButton("Student");
		b4.setBounds(116, 169, 121, 23);
		frame.getContentPane().add(b4);
		
		bg=new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		bg.add(b4);
		
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setSize(400, 300);
		frame.setVisible(true);
		
		JButton btnNewButton = new JButton("cancel");
		btnNewButton.setBounds(43, 214, 93, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new Listener());		
		JButton btnNewButton_1 = new JButton("confirm");
		btnNewButton_1.setBounds(221, 214, 93, 23);
		frame.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new Listener());
		
		/*
		JButton a=new JButton("Child");
		JButton b=new JButton("Adult");
		JButton c=new JButton("Senior");
		JButton d=new JButton("Student");
		
		a.setBounds(75,40,200,150);
		b.setBounds(350,40,200,150);
		c.setBounds(75,225,200,150);
		d.setBounds(350,225,200,150);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.getContentPane().add(a);
		frame.getContentPane().add(b);
		frame.getContentPane().add(c);
		frame.getContentPane().add(d);
		a.addActionListener(new listener());
		b.addActionListener(new listener());
		c.addActionListener(new listener());
		d.addActionListener(new listener());*/
		String e[]={filename,time,screentype,seat};
		
		RandomTktNo rto = new RandomTktNo();
		t3 = new Ticket();
		t3.setId(rto.generateId());
		t3.setFtitle(filename);
		
		t3.setScreen(screentype);
		t3.setSeat(seat);
		t3.setTime(time);
		return e;
	}
	class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String a= String.valueOf(money*0.5);
			String b= String.valueOf(money);
			String c= String.valueOf(money*0.8);
			String d= String.valueOf(money*0.85);
		JButton i=(JButton)e.getSource();
		if(i.getText().equals("cancel")){
			frame.dispose();
		}
		else{
		if(b1.isSelected()){
			int ijk=JOptionPane.showConfirmDialog(null, "The price of ticket is "+a,"congratulation",JOptionPane.YES_NO_OPTION);
			if(ijk == JOptionPane.YES_OPTION){
				
				TicketConfirm ti = new TicketConfirm();
				t3.setPrice(Double.parseDouble(a));
				t3.setType("child card");
				ti.confirm(t3);
				child(t3.getId(), t3.getFtitle(), "date", t3.getTime(), t3.getPrice(), t3.getSeat());
				frame.dispose();	
				
				flag[kk]=1;
				Seat s = new Seat();
				String time_screen = time +" "+ screentype;
				System.out.println(time_screen);
				String ss = time_screen.replaceAll(" ", "");
				s.markSeat("seatcond/"+ss.replaceAll(":", "")+".txt", flag);
			} 
		}
		else if(b2.isSelected()){
			int ijk=JOptionPane.showConfirmDialog(null, "The price of ticket is "+b,"congratulation",  JOptionPane.YES_NO_OPTION);
			if(ijk == JOptionPane.YES_OPTION){
				
				TicketConfirm ti = new TicketConfirm();
				t3.setPrice(Double.parseDouble(a));
				t3.setType("Adult card");
				ti.confirm(t3);
				adult(t3.getId(), t3.getFtitle(), "date", t3.getTime(), t3.getPrice(), t3.getSeat());
				frame.dispose();
				
				flag[kk]=1;
				Seat s = new Seat();
				String time_screen = time +" "+ screentype;
				System.out.println(time_screen);
				String ss = time_screen.replaceAll(" ", "");
				s.markSeat("seatcond/"+ss.replaceAll(":", "")+".txt", flag);
			}
		}
		else if(b3.isSelected()){
			int ijk=JOptionPane.showConfirmDialog(null, "The price of ticket is "+c,"congratulation",  JOptionPane.YES_NO_OPTION);
			if(ijk == JOptionPane.YES_OPTION){
				
				TicketConfirm ti = new TicketConfirm();
				t3.setPrice(Double.parseDouble(a));
				t3.setType("Senior card");
				ti.confirm(t3);
				senior(t3.getId(), t3.getFtitle(), "date", t3.getTime(), t3.getPrice(), t3.getSeat());
				frame.dispose();
				
				flag[kk]=1;
				Seat s = new Seat();
				String time_screen = time +" "+ screentype;
				System.out.println(time_screen);
				String ss = time_screen.replaceAll(" ", "");
				s.markSeat("seatcond/"+ss.replaceAll(":", "")+".txt", flag);
			}
		}
		else if(b4.isSelected()){
			student_id = JOptionPane.showInputDialog("Please Enter Your Student_ID:");//"deliver student_id"
			int ijk = JOptionPane.showConfirmDialog(null, "The price of ticket is "+d,"congratulation",  JOptionPane.YES_NO_OPTION);
			if(ijk == JOptionPane.YES_OPTION){
				
				TicketConfirm ti = new TicketConfirm();
				t3.setPrice(Double.parseDouble(d));
				t3.setType("student card");
				t3.setSid(student_id);
				student(t3.getId(), t3.getFtitle(), "date", t3.getTime(), t3.getPrice(), t3.getSeat(), t3.getSid());
				ti.confirm(t3);
				frame.dispose();
				
				flag[kk]=1;
				Seat s = new Seat();
				String time_screen = time +" "+ screentype;
				System.out.println(time_screen);
				String ss = time_screen.replaceAll(" ", "");
				s.markSeat("seatcond/"+ss.replaceAll(":", "")+".txt", flag);
			}
		}
		}
	}
	}
}