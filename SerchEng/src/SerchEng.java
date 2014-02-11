import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;


@SuppressWarnings("serial")
public class SerchEng extends JFrame {
	
	/*public SerchEng(){
		setLayout(new GridLayout(1, 4, 5, 5));
		
		add(new JLabel("Search Terms:"));
		add(new JRadioButton("All of the Search Terms"));
		add(new JRadioButton("Any of the Search Terms"));
		add(new JRadioButton("Exact Phrase"));
	}
	*/
	//private JLabel jlbTitle = new JLabel("Search Engine", JLabel.CENTER);
	
	private JLabel jlblSTerms = new JLabel("Search Terms");
	private JTextField jtfSTerms = new JTextField(30);
	private JRadioButton jrbAll = new JRadioButton("All of the Search Terms");
	private JRadioButton jrbAny = new JRadioButton("Any of the Search Terms");
	private JRadioButton jrbExact = new JRadioButton("Exact Phrase");
	private JTextArea jtaDisplayFiles = new JTextArea(15, 30);
	
	
	public static void main(String[] args){
		SerchEng frame = new SerchEng();
		frame.setSize(600, 400);
		//frame.pack();
		frame.setTitle("Search Engine");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	public SerchEng()
	{
		JPanel jpLabel = new JPanel();
		jpLabel.setLayout(new BorderLayout(10, 5));
		jpLabel.add(new JLabel("Search Terms"), BorderLayout.WEST);
		jpLabel.add(jlblSTerms, BorderLayout.WEST);
		add(jpLabel, BorderLayout.NORTH);
		
		JPanel jpTextField = new JPanel();
		jpTextField.setLayout(new BorderLayout(10, 5));
		jpTextField.add(new JTextField("Search Terms"), BorderLayout.CENTER);
		jpTextField.add(jtfSTerms, BorderLayout.CENTER);
		add(jpTextField, BorderLayout.NORTH);
		
		
		/*JPanel jpLabel = new JPanel();
		jpLabel.setLayout(null);
		jpLabel.add(jlbTitle);
		add(jpLabel, BorderLayout.NORTH);*/
		
		/*JPanel jpLabel = new JPanel();
		jpLabel.setLayout(new FlowLayout());
		JLabel jlblSTerms = new JLabel();
        setLayout(new FlowLayout());
        add(jlblSTerms = new JLabel("Search Terms"));*/
        
        @SuppressWarnings("unused")
		JLabel jlblSTerms = new JLabel("Search Terms", JLabel.LEFT);
        setLayout(new FlowLayout()); 
        add(jlblSTerms = new JLabel("Searh Terms"));
              
        
        /*JPanel jpLabel = new JPanel();
		jpLabel.setLayout(new GridLayout(1,1));
		jpLabel.add("jlbSTerms");*/
		
		JPanel jpRadioButtons = new JPanel();
		jpRadioButtons.setLayout(new GridLayout(3,1));
		jpRadioButtons.add(jrbAll);
		jpRadioButtons.add(jrbAny);
		jpRadioButtons.add(jrbExact);
		add(jpRadioButtons, BorderLayout.EAST);
		
		ButtonGroup group = new ButtonGroup();
		group.add(jrbAll);
		group.add(jrbAny);
		group.add(jrbExact);
		
		JPanel jpTextArea = new JPanel();
		jpTextArea.setLayout(new BorderLayout(5, 10));
		//jpTextArea.add(new JLabel("File goes here"), BorderLayout.WEST);
		jpTextArea.add(jtaDisplayFiles, BorderLayout.EAST);
		add(jpTextArea, BorderLayout.SOUTH);
		
		}
		
	}

	


