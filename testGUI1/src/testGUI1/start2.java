package testGUI1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;

public class start2 {

	private JFrame frame;
	private JTextField textField;
	private int value = 0;
	JCheckBox checkBox0;
	
	Counter c = new Counter(0);
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start2 window = new start2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public start2() {
		initialize();
		textField.setText(""+value);
		
		checkBox0 = new JCheckBox("Already 0");
		checkBox0.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		checkBox0.setBounds(115, 198, 124, 23);
		frame.getContentPane().add(checkBox0);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value = 0;
				myRefresh();
			}
		});
		mnOptions.add(mntmReset);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnOptions.add(mntmExit);
		//myRefresh();
	}
	
	public void myRefresh()
	{
		textField.setText(""+value);
	}
	
	public void stepUp()
	{
		value++;
		checkBox0.setSelected(false);
	}
	public void stepDown()
	{
		if(value==0)
		{
			checkBox0.setSelected(true);
		}
		else
		{
			value--;
			checkBox0.setSelected(false);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblValue = new JLabel("Value");
		lblValue.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		lblValue.setBounds(84, 61, 46, 14);
		frame.getContentPane().add(lblValue);
		
		textField = new JTextField();
		textField.setBounds(179, 60, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnIncr = new JButton("Incr");
		btnIncr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stepUp();
				myRefresh();
			}
		});
		btnIncr.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		btnIncr.setBounds(67, 122, 89, 23);
		frame.getContentPane().add(btnIncr);
		
		JButton btnDecr = new JButton("Decr");
		btnDecr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stepDown();
				myRefresh();
			}
		});
		btnDecr.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		btnDecr.setBounds(176, 122, 89, 23);
		frame.getContentPane().add(btnDecr);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBounds(179, 157, 86, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v1 = Integer.parseInt(textField.getText());
				int v2 = Integer.parseInt((String)comboBox.getSelectedItem()); 
				value= v1+v2;
				myRefresh();
				checkBox0.setSelected(false);
			}
		});
		btnAdd.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		btnAdd.setBounds(67, 156, 89, 23);
		frame.getContentPane().add(btnAdd);
	}
}
