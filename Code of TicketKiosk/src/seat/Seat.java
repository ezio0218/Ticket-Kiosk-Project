package seat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/** 
 * Seat
 * @author xyWei 
 * record the state of seats
 */
public class Seat {
	private int [] flag = new int[32];
	
	public Seat() {
		
	}
	
	/**
	 * get states of seats of one screen, if all available create new file
	 * @param time_screen
	 * @return
	 */
	public int[] readSeat(String time_screen){
		File file = new File(time_screen);
		if(file.exists()){
			try{
				FileInputStream fis = new FileInputStream(time_screen);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
				
				int i = 0;
				int tempchar;
		        while ((tempchar = br.read()) != -1) {
		        	if (((char) tempchar) != '\r') {
		        		flag[i]=tempchar-48; 
		        		i++;
		        	} 
		        }
				
		        
				br.close();
				isr.close();
				fis.close();
				
			} catch (FileNotFoundException e) {
				// TODO: handle exception
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			try {
				file.createNewFile();
				FileOutputStream fos = new FileOutputStream(time_screen);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				BufferedWriter bw = new BufferedWriter(osw);
				
				for(int i=0;i<flag.length;i++)
					bw.write(0+"");
				
				bw.close();
				osw.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;	
		
	}
	
	/**
	 * mark a seat while it is not available
	 * @param time_screen 
	 * @param a
	 */
	public void markSeat(String time_screen,int [] a){
		
		try {
			FileOutputStream fos = new FileOutputStream(time_screen);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(int i=0;i<a.length;i++)
				bw.write(a[i]+"");
			
			bw.close();
			osw.close();
			fos.close();
		
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
