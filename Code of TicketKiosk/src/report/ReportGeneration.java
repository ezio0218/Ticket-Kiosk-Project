package report;

import java.io.*;
import java.util.ArrayList;

/**
 * ReportGeneration
 * @author yawen.shi
 * Generate the statistic of ticket purchase
 */
public class ReportGeneration{
	private int totalTicketNumber=0;
	private double childSale=0;
	private double adultSale=0;
	private double seniorSale=0;
	private double studentSale=0;
	private double kongSale=0;
	private double loganSale=0;
	private double beautySale=0;
	private double moonlightSale=0;
	private double laSale=0;

	public ReportGeneration(){}
	public void print(){
		//String[] readLine1 = new String[7];
		File file = new File("ticketdata/");
		File flist[] = file.listFiles();


		for(File f : flist){
			ArrayList<String> a = new ArrayList<String> ();

		try{
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			for(String readLine = br.readLine();readLine!=null;readLine = br.readLine()){
			a.add(readLine);
			}
			
			br.close();
		}catch (Exception e){e.printStackTrace();}
		//System.out.println(readLine1);

		//the number of ticket
					totalTicketNumber++;
		//each type sale
					if((a.get(5)).equals("child card")){
						childSale=childSale + Double.parseDouble(a.get(6));
					}
					if((a.get(5)).equals("Adult card")){
						adultSale=adultSale + Double.parseDouble(a.get(6));
					}
					if((a.get(5)).equals("Senior card")){
						seniorSale=seniorSale + Double.parseDouble(a.get(6));
					}
					if((a.get(5)).equals("student card")){
						studentSale=studentSale + Double.parseDouble(a.get(6));
					}
		//each film sale
					if((a.get(1)).equals("KONG: SKULL ISLAND")){
						kongSale=kongSale + Double.parseDouble(a.get(6));
					}
					if((a.get(1)).equals("LOGAN")){
						loganSale=loganSale + Double.parseDouble(a.get(6));
					}
					if((a.get(1)).equals("BEAUTY AND THE BEAST ")){
						beautySale=beautySale + Double.parseDouble(a.get(6));
					}
					if((a.get(1)).equals("MOONLIGHT")){
						moonlightSale=moonlightSale + Double.parseDouble(a.get(6));
					}
					if((a.get(1)).equals("LA LA LAND ")){
						laSale=laSale + Double.parseDouble(a.get(6));
					}


	}//for
		//generate statistic report
		try{
			File f= new File("statisticReport.txt");
			
			String writeLine = "Total Ticket Number: "+totalTicketNumber + "\r\n"
					+"Total Sale of Child Type: "+childSale+"\r\n" 
					+"Total Sale of Adult Type: "+adultSale+"\r\n"  
					+"Total Sale of Senior Type: "+seniorSale+"\r\n" 
					+"Total Sale of Student Type: "+studentSale+"\r\n" 
					+"Total Sale of KONG: SKULL ISLAND: "+kongSale+"\r\n" 
					+"Total Sale of LOGAN: "+loganSale+"\r\n" 
					+"Total Sale of BEAUTY AND THE BEAST: "+beautySale+"\r\n" 
					+"Total Sale of MOONLIGHT: "+moonlightSale+"\r\n" 
					+"Total Sale of LA LA LAND: "+laSale+"\r\n" ;

			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(writeLine);
			bw.close();

		}catch (Exception e){e.printStackTrace();}


	}//print
}//class