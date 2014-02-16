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
	
	private JLabel jlblSTerms = new JLabel("Search Terms:");
	private JTextField jtfSTerms = new JTextField(20);
	private JRadioButton jrbAll = new JRadioButton("All of the Search Terms");
	private JRadioButton jrbAny = new JRadioButton("Any of the Search Terms");
	private JRadioButton jrbExact = new JRadioButton("Exact Phrase");
	private JButton jbtSearh = new JButton("Search");
	private JButton jbtMaintenance = new JButton("Maintenance");
	private JButton jbtAbout = new JButton("About");
	private JTextArea jtaDisplayFiles = new JTextArea(15, 50);
	
	
	public static void main(String[] args){
		SerchEng frame = new SerchEng();
		//frame.setSize(710, 400);
		frame.pack();
		frame.setTitle("Search Engine");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
	
	public SerchEng()
	{
		JPanel jpLabel = new JPanel();
		jpLabel.setLayout(new BorderLayout(10, 5));
		jpLabel.add(new JLabel("Search Terms:"), BorderLayout.WEST);
		jpLabel.add(jlblSTerms, BorderLayout.WEST);
		add(jpLabel, BorderLayout.NORTH);
		
		JPanel jpTextField = new JPanel();
		jpTextField.setLayout(new BorderLayout(20, 2));
		jpTextField.add(new JTextField("Search Terms:"), BorderLayout.CENTER);
		jpTextField.add(jtfSTerms, BorderLayout.CENTER);
		add(jpTextField, BorderLayout.WEST);
		
		JPanel jpButton = new JPanel();
		jpButton.setLayout(new BorderLayout(5, 2));
		jpButton.add(new JButton("Search"), BorderLayout.CENTER);
		jpButton.add(jbtSearh, BorderLayout.CENTER);
		add(jpButton, BorderLayout.CENTER);
		
		JPanel jpButton1 = new JPanel();
		jpButton1.setLayout(new BorderLayout(5, 2));
		jpButton1.add(new JButton("Maintenance"), BorderLayout.CENTER);
		jpButton1.add(jbtMaintenance, BorderLayout.CENTER);
		add(jpButton1, BorderLayout.NORTH);
		
		
		JPanel jpButton2 = new JPanel();
		jpButton2.setLayout(new BorderLayout(5, 2));
		jpButton2.add(new JButton("About"), BorderLayout.CENTER);
		jpButton2.add(jbtAbout, BorderLayout.CENTER);
		add(jpButton2, BorderLayout.SOUTH);
		
		
		
		//JPanel jpRadioButtons = new JPanel(new FlowLayout(FlowLayout.CENTER, 2,2));
		JPanel jpRadioButtons = new JPanel(new GridLayout(2,3,1,1));
		
		jpRadioButtons.add(jrbAll);
		jpRadioButtons.add(jrbAny);
		jpRadioButtons.add(jrbExact);
		add(jpRadioButtons, BorderLayout.EAST);
		
		ButtonGroup group = new ButtonGroup();
		group.add(jrbAll);
		group.add(jrbAny);
		group.add(jrbExact);
		jpRadioButtons.add(jpButton, BorderLayout.WEST);
		jpRadioButtons.add(jpLabel, BorderLayout.CENTER);
		jpRadioButtons.add(jpTextField, BorderLayout.EAST);
		jpRadioButtons.setBorder(new TitledBorder("Search Area"));
		
		JPanel jpTextArea = new JPanel();
		jpTextArea.setLayout(new BorderLayout(5, 10));
		//jpTextArea.add(new JLabel("File goes here"), BorderLayout.WEST);
		jpTextArea.add(jtaDisplayFiles, BorderLayout.EAST);
		add(jpTextArea, BorderLayout.SOUTH);
		jpTextArea.add(jpButton1, BorderLayout.EAST);
		jpTextArea.add(jpButton2, BorderLayout.WEST);
		jpTextArea.setBorder(new TitledBorder("Maintenance"));
		
		}
		
	}

	


