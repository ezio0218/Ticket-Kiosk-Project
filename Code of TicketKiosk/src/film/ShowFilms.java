package film;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;

import schedule.ListSchedule;

import java.io.*;
import java.util.ArrayList;

/**
 * ShowFilms
 * @author CaiXr
 * Print the table to select a film
 */
public class ShowFilms extends JFrame{
	//JFrame filmFrame = new JFrame("film");
	JTable table;
	ArrayList<Film> fl = new FilmList().filmlist;
	
	

   
	Object[][] tableData = 
	{ 
		new Object[]{fl.get(0).getTitle(), fl.get(0).getLength(), fl.get(0).getPic()},
		new Object[]{fl.get(1).getTitle(), fl.get(1).getLength(), fl.get(1).getPic()},
		new Object[]{fl.get(2).getTitle(), fl.get(2).getLength(), fl.get(2).getPic()},
		new Object[]{fl.get(3).getTitle(), fl.get(3).getLength(), fl.get(3).getPic()},
		new Object[]{fl.get(4).getTitle(), fl.get(4).getLength(), fl.get(4).getPic()},
	};
    
	//title of table
	String[] columnTitle = {"Title" , "Duration" , "Cover"};
    
	/**
     * create the frame
     */
	public ShowFilms()
	{
		
		ExtendedTableModel model = new ExtendedTableModel(columnTitle , tableData);
		//以ExtendedTableModel来创建JTable
		table = new JTable(model);
		table.setRowSelectionAllowed(true);
		table.setRowHeight(200);
		
        TableColumn lastColumn = table.getColumnModel().getColumn(2);
		//adopt custom painter
		lastColumn.setCellRenderer(new ImageTableCellRenderer());
		//control the size of table
		table.setPreferredScrollableViewportSize(new Dimension(850,480));


	    JPanel panel1 = new JPanel();
	    JPanel panel2 = new JPanel();
	    add(panel1,BorderLayout.NORTH);
	    add(panel2,BorderLayout.SOUTH);
		panel1.add(new JScrollPane(table));
		JButton btn = new JButton("OK");
		panel2.add(btn);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener(new ActionListener() {
			  @Override
              public void actionPerformed(ActionEvent e) {			   
				   int row = table.getSelectedRow();
				   String title = (String) table.getValueAt(row,0);
					setVisible(false);
					ListSchedule ls = new ListSchedule();
					ls.setVisible(true);
					ls.listSchedule(title);
			  }
		});
		
	}
	

}

/**
 * create table
 */
class ExtendedTableModel extends DefaultTableModel
{
	
	public ExtendedTableModel(String[] columnNames , Object[][] cells)
	{
		super(cells , columnNames);
	}
	
	
	public Class getColumnClass(int c) 
	{
		return getValueAt(0 , c).getClass();
	}
} 


/**
 * A class to contain image
 */
class ImageTableCellRenderer extends JPanel implements TableCellRenderer
{
	private String cellValue;

	public Component getTableCellRendererComponent(JTable table, Object value, 
		boolean isSelected, boolean hasFocus, int row, int column)
	{
		cellValue = (String)value;
		//paint edge
		if (hasFocus)
		{
			setBorder(UIManager.getBorder("Table.focusCellHighlightBorder"));
		}
		else
		{
			setBorder(null);
		}
		return this;
	}

	
	public void paint(Graphics g)
	{
		
		drawImage(g , new ImageIcon(cellValue).getImage()); 
	}
	
	private void drawImage(Graphics g , Image image)
	{
		g.drawImage(image, 10, 10, 130, 180, null);

	}
}