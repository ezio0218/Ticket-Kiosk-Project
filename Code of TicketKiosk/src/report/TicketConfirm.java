package report;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import ticket.Ticket;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * TicketConfirm
 * @author yawen.shi
 * Print the ticket
 */
public class TicketConfirm{
	public TicketConfirm(){}
	public void confirm(Ticket array){
		
		FNew f = new FNew(array);
		
		//System.out.println("sdd");

	}//confirm

}


/**
 * create the frame
 */
class FNew extends JFrame implements ActionListener{
	//private PNew p;
	private JButton b1;
	//private JScrollPane s1;

	public FNew(Ticket array ){
		setTitle("All Ticket");
		setLocation(200,200);
		setSize(600,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(true);
		setLayout(new BorderLayout());			

		

		PNew p = new PNew(array);
		JScrollPane s1 = new JScrollPane(p);
		//System.out.println("jiale");
		
		//JPanel pp = new JPanel();
		//pp.setSize(1200,500);
		//s1.setViewportView(p);
		//pp.add(p);
		add(s1);

		b1 = new JButton("Confirm");
		b1.addActionListener(this);


		add(b1, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent arg0){
		ReportGeneration rg = new ReportGeneration();
		rg.print();
		this.dispose();
		
	}
	


}

/**
 * create panel
 *
 */
class PNew extends JPanel{
		
	public PNew(Ticket t){
		setLayout(new GridLayout(1,1,10,20));
		setBorder(new EmptyBorder(10,10,10,10));
		setBackground(Color.gray);


			JPanel2 p = new JPanel2(new GridLayout(4,1,5,10));
			p.setBorder(new EmptyBorder(10,10,10,10));
			p.setBackground(Color.pink);
			

			JPanel2 p1 = new JPanel2(new GridLayout(1,2,5,10));
			p1.add(new JLabel2("Screen: "+t.getScreen()));
			p1.add(new JLabel2("Time: "+t.getTime()));
			p.add(p1);
			//line 1
			JPanel2 p2 = new JPanel2(new GridLayout(1,1,5,10));
			p2.add(new JLabel2("Title: "+t.getFtitle()));
			p.add(p2);
			//line 2
			JPanel2 p3 = new JPanel2(new GridLayout(1,3,5,10));
			p3.add(new JLabel2("Seat: "+t.getSeat()));
			p3.add(new JLabel2("Type:"+t.getType()));
			p3.add(new JLabel2("Price: "+t.getPrice()));
			p.add(p3);
			//line 3
			
			JPanel2 p4 ;
			if(t.getType().equals("student card")){
				p4 = new JPanel2(new GridLayout(1,2,5,10));
				p4.add(new JLabel2("Ticket ID: "+t.getId()));
				p4.add(new JLabel2("Student ID: "+t.getSid()));
			}
			else{
				p4 = new JPanel2(new GridLayout(1,1,5,10));
				p4.add(new JLabel2("Ticket ID: "+t.getId()));
			}
				
			p.add(p4);
			//line 4

			add(p);
			
			setVisible(true);
		
	
	}
	
}


class JLabel2 extends JLabel{
	
	public JLabel2(String title){
		super(title);
		setFont(new java.awt.Font("Dialog",1,15));
		setOpaque(true);
		setForeground(Color.red);
		setBackground(Color.white);
		setHorizontalAlignment(SwingConstants.CENTER);
		//setBorder(new BevelBorder(BevelBorder.LOWERED));
		
	}
	
}

class JPanel2 extends JPanel{
	
	public JPanel2(LayoutManager L){
		super(L);
		setBackground(Color.pink);
		
		

	}
	public JPanel2(){
		super();
		setBackground(Color.pink);
				

	}
	
}
