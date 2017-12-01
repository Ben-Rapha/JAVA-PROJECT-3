
package project3;

/**
 *
 * @author rachb
 */
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.GridLayout;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author KINGSLEY OTTO
 */


public class DateGUI extends JFrame {
	
        
        // CREATE GUI STYLE
        public DateGUI(String title, int height, int width) {
	    setTitle(title);
	    setSize(height,width);
            setLocation  (600,200);
	    createMenu();
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new GridLayout(1,2));
            setVisible(true);
   } //SSNGUI
       
  
      
	
     private void createMenu( ) {
      JMenuItem   item;
      JMenuBar    menuBar  = new JMenuBar();
      JMenu       fileMenu = new JMenu("File");
      FileMenuHandler fmh  = new FileMenuHandler(this);
      item = new JMenuItem("Open");    //Open...
      item.addActionListener( fmh );
      fileMenu.add( item );
      item = new JMenuItem("Quit");       //Quit...
      item.addActionListener( fmh );
      fileMenu.add( item );
      setJMenuBar(menuBar);
      menuBar.add(fileMenu);
      
    } //CREATE MENU

 }