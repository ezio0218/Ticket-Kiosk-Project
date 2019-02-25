package screen;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import film.Film;
import seat.Seat;
import ticket.TicketGui;

/** 
 * Screen3
 * @author xyWei 
 * third type screen
 */
public class Screen3 extends JFrame implements ActionListener{

	private Film film;
	private String time_screen;
	
	ImageIcon img = new ImageIcon("img/seat.png");
	ImageIcon img1 = new ImageIcon("img/seat1.png");
	JButton[] seat = new JButton[32];
	JButton bconfirm = new JButton("confirm");
	JButton bBack = new JButton("back");
	
	
	boolean b [] = new boolean[32];
	int [] flag = new int[32];
	

	/**
	 * Create the frame.
	 */
	public Screen3(Film f,String text,int [] is) {
	
		film = f;
		time_screen=text;
		flag = is;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		getContentPane().setLayout(null);
		
		for(int i=0;i<seat.length;i++){
			if(flag[i]==0){
				seat[i] = new JButton(img);
				b[i] = false;//the seat is available
			}else {
				seat[i] = new JButton(img1);
				b[i] = true; //the seat is not available
			}
		}
		
		
		seat[0].setBounds(148, 58, 70, 67);
		seat[0].setActionCommand("E8");
		getContentPane().add(seat[0]);
		
		seat[1].setBounds(218, 58, 70, 67);
		seat[1].setActionCommand("E7");
		getContentPane().add(seat[1]);
		
		seat[2].setBounds(288, 58, 70, 67);
		seat[2].setActionCommand("E6");
		getContentPane().add(seat[2]);
		
		seat[3].setBounds(358, 58, 70, 67);
		seat[3].setActionCommand("E5");
		getContentPane().add(seat[3]);
		
		seat[4].setBounds(428, 58, 70, 67);
		seat[4].setActionCommand("E4");
		getContentPane().add(seat[4]);
		
		seat[5].setBounds(498, 58, 70, 67);
		seat[5].setActionCommand("E3");
		getContentPane().add(seat[5]);
		
		seat[6].setBounds(568, 58, 70, 67);
		seat[6].setActionCommand("E2");
		getContentPane().add(seat[6]);
		
		seat[7].setBounds(638, 58, 70, 67);
		seat[7].setActionCommand("E1");
		getContentPane().add(seat[7]);
		
		seat[8].setBounds(102, 154, 70, 67);
		seat[8].setActionCommand("D6");
		getContentPane().add(seat[8]);
		
		seat[9].setBounds(173, 154, 70, 67);
		seat[9].setActionCommand("D5");
		getContentPane().add(seat[9]);
		
		seat[10].setBounds(358, 154, 70, 67);
		seat[10].setActionCommand("D4");
		getContentPane().add(seat[10]);
		
		seat[11].setBounds(428, 154, 70, 67);
		seat[11].setActionCommand("D3");
		getContentPane().add(seat[11]);
		
		seat[12].setBounds(611, 154, 70, 67);
		seat[12].setActionCommand("D2");
		getContentPane().add(seat[12]);
		
		seat[13].setBounds(682, 154, 70, 67);
		seat[13].setActionCommand("D1");
		getContentPane().add(seat[13]);
		
		seat[14].setBounds(102, 256, 70, 67);
		seat[14].setActionCommand("C6");
		getContentPane().add(seat[14]);
		
		seat[15].setBounds(173, 256, 70, 67);
		seat[15].setActionCommand("C5");
		getContentPane().add(seat[15]);
		
		seat[16].setBounds(358, 256, 70, 67);
		seat[16].setActionCommand("C4");
		getContentPane().add(seat[16]);
		
		seat[17].setBounds(428, 256, 70, 67);
		seat[17].setActionCommand("C3");
		getContentPane().add(seat[17]);
		
		seat[18].setBounds(611, 256, 70, 67);
		seat[18].setActionCommand("C2");
		getContentPane().add(seat[18]);
		
		seat[19].setBounds(682, 256, 70, 67);
		seat[19].setActionCommand("C1");
		getContentPane().add(seat[19]);
		
		seat[20].setBounds(102, 360, 70, 67);
		seat[20].setActionCommand("B6");
		getContentPane().add(seat[20]);
		
		seat[21].setBounds(173, 360, 70, 67);
		seat[21].setActionCommand("B5");
		getContentPane().add(seat[21]);
		
		seat[22].setBounds(358, 360, 70, 67);
		seat[22].setActionCommand("B4");
		getContentPane().add(seat[22]);
		
		seat[23].setBounds(428, 360, 70, 67);
		seat[23].setActionCommand("B3");
		getContentPane().add(seat[23]);
		
		seat[24].setBounds(611, 360, 70, 67);
		seat[24].setActionCommand("B2");
		getContentPane().add(seat[24]);
		
		seat[25].setBounds(682, 360, 70, 67);
		seat[25].setActionCommand("B1");
		getContentPane().add(seat[25]);
		
		seat[26].setBounds(102, 462, 70, 67);
		seat[26].setActionCommand("A6");
		getContentPane().add(seat[26]);
		
		seat[27].setBounds(173, 462, 70, 67);
		seat[27].setActionCommand("A5");
		getContentPane().add(seat[27]);
		
		seat[28].setBounds(358, 462, 70, 67);
		seat[28].setActionCommand("A4");
		getContentPane().add(seat[28]);
		
		seat[29].setBounds(428, 462, 70, 67);
		seat[29].setActionCommand("A3");
		getContentPane().add(seat[29]);
		
		seat[30].setBounds(611, 462, 70, 67);
		seat[30].setActionCommand("A2");
		getContentPane().add(seat[30]);
		
		seat[31].setBounds(682, 462, 70, 67);
		seat[31].setActionCommand("A1");
		getContentPane().add(seat[31]);
		
		bconfirm.setBounds(537, 530, 117, 29);
		bconfirm.setActionCommand("confirm");
		getContentPane().add(bconfirm);
		
		bBack.setBounds(257, 530, 117, 29);
		bBack.setActionCommand("back");
		getContentPane().add(bBack);
		
		for(int i=0;i<seat.length;i++)
			seat[i].addActionListener(this);
		
		bconfirm.addActionListener(this);
		bBack.addActionListener(this);
	}
	
	/**
	 * choose seat
	 */
	public void actionPerformed(ActionEvent e){
		
		switch(e.getActionCommand()){
		case "E8":
		seat[0].setIcon(img1);
		b[0] = !b[0];
		if (!b[0]&&flag[0]!=1) {
			seat[0].setIcon(img);
		};
		break;
		case "E7":
		seat[1].setIcon(img1);
		b[1] = !b[1];
		if (!b[1]&&flag[1]!=1) {
			seat[1].setIcon(img);
		};
		break;
		case "E6":
		seat[2].setIcon(img1);
		b[2] = !b[2];
		if (!b[2]&&flag[2]!=1) {
			seat[2].setIcon(img);
		};
		break;
		case "E5":
		seat[3].setIcon(img1);
		b[3] = !b[3];
		if (!b[3]&&flag[3]!=1) {
			seat[3].setIcon(img);
		};
		break;
		case "E4":seat[4].setIcon(img1);
		b[4] = !b[4];
		if (!b[4]&&flag[4]!=1) {
			seat[4].setIcon(img);
		};
		break;
		case "E3":seat[5].setIcon(img1);
		b[5] = !b[5];
		if (!b[5]&&flag[5]!=1) {
			seat[5].setIcon(img);
		};
		break;
		case "E2":seat[6].setIcon(img1);
		b[6] = !b[6];
		if (!b[6]&&flag[6]!=1) {
			seat[6].setIcon(img);
		};
		break;
		case "E1":seat[7].setIcon(img1);
		b[7] = !b[7];
		if (!b[7]&&flag[7]!=1) {
			seat[7].setIcon(img);
		};
		break;
		case "D6":seat[8].setIcon(img1);
		b[8] = !b[8];
		if (!b[8]&&flag[8]!=1) {
			seat[8].setIcon(img);
		};
		break;
		case "D5":seat[9].setIcon(img1);
		b[9] = !b[9];
		if (!b[9]&&flag[9]!=1) {
			seat[9].setIcon(img);
		};
		break;
		case "D4":seat[10].setIcon(img1);
		b[10] = !b[10];
		if (!b[10]&&flag[10]!=1) {
			seat[10].setIcon(img);
		};
		break;
		case "D3":seat[11].setIcon(img1);
		b[11] = !b[11];
		if (!b[11]&&flag[11]!=1) {
			seat[11].setIcon(img);
		};
		break;
		case "D2":seat[12].setIcon(img1);
		b[12] = !b[12];
		if (!b[12]&&flag[12]!=1) {
			seat[12].setIcon(img);
		};
		break;
		case "D1":seat[13].setIcon(img1);
		b[13] = !b[13];
		if (!b[13]&&flag[13]!=1) {
			seat[13].setIcon(img);
		};
		break;
		case "C6":seat[14].setIcon(img1);
		b[14] = !b[14];
		if (!b[14]&&flag[14]!=1) {
			seat[14].setIcon(img);
		};
		break;
		case "C5":seat[15].setIcon(img1);
		b[15] = !b[15];
		if (!b[15]&&flag[15]!=1) {
			seat[15].setIcon(img);
		};
		break;
		case "C4":seat[16].setIcon(img1);
		b[16] = !b[16];
		if (!b[16]&&flag[16]!=1) {
			seat[16].setIcon(img);
		};
		break;
		case "C3":seat[17].setIcon(img1);
		b[17] = !b[17];
		if (!b[17]&&flag[17]!=1) {
			seat[17].setIcon(img);
		};
		break;
		case "C2":seat[18].setIcon(img1);
		b[18] = !b[18];
		if (!b[18]&&flag[18]!=1) {
			seat[18].setIcon(img);
		};
		break;
		case "C1":
			seat[19].setIcon(img1);
		b[19] = !b[19];
		if (!b[19]&&flag[19]!=1) {
			seat[19].setIcon(img);
		};
		break;
		case "B6":seat[20].setIcon(img1);
		b[20] = !b[20];
		if (!b[20]&&flag[20]!=1) {
			seat[20].setIcon(img);
		};
		break;
		case "B5":seat[21].setIcon(img1);
		b[21] = !b[21];
		if (!b[21]&&flag[21]!=1) {
			seat[21].setIcon(img);
		};
		break;
		case "B4":seat[22].setIcon(img1);
		b[22] = !b[22];
		if (!b[22]&&flag[22]!=1) {
			seat[22].setIcon(img);
		};
		break;
		case "B3":seat[23].setIcon(img1);
		b[23] = !b[23];
		if (!b[23]&&flag[23]!=1) {
			seat[23].setIcon(img);
		};
		break;
		case "B2":seat[24].setIcon(img1);
		b[24] = !b[24];
		if (!b[24]&&flag[24]!=1) {
			seat[24].setIcon(img);
		};
		break;
		case "B1":seat[25].setIcon(img1);
		b[25] = !b[25];
		if (!b[25]&&flag[25]!=1) {
			seat[25].setIcon(img);
		};
		break;
		case "A6":seat[26].setIcon(img1);
		b[26] = !b[26];
		if (!b[26]&&flag[26]!=1) {
			seat[26].setIcon(img);
		};
		break;
		case "A5":seat[27].setIcon(img1);
		b[27] = !b[27];
		if (!b[27]&&flag[27]!=1) {
			seat[27].setIcon(img);
		};
		break;
		case "A4":seat[28].setIcon(img1);
		b[28] = !b[28];
		if (!b[28]&&flag[28]!=1) {
			seat[28].setIcon(img);
		};
		break;
		case "A3":seat[29].setIcon(img1);
		b[29] = !b[29];
		if (!b[29]&&flag[29]!=1) {
			seat[29].setIcon(img);
		};
		break;
		case "A2":seat[30].setIcon(img1);
		b[30] = !b[30];
		if (!b[30]&&flag[30]!=1) {
			seat[30].setIcon(img);
		};
		break;
		case "A1":seat[31].setIcon(img1);
		b[31] = !b[31];
		if (!b[31]&&flag[31]!=1) {
			seat[31].setIcon(img);
		};
		break;
		case "confirm":
			for(int i=0;i<b.length;i++){
				if(b[i]==true&&flag[i]!=1){
					
					String[] tt=time_screen.split("\\s+");
					TicketGui a= new TicketGui(film.getPrice());
					a.ticketgui(film.getTitle(),tt[0],tt[1],seat[i].getActionCommand(),flag,i);
					System.out.println(seat[i].getActionCommand());
			        
				}
			}
		break;
		case "back":
			dispose();
		}
		
	}
}

