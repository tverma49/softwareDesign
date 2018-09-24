package testGUI1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class start {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	JCheckBox checkBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					start window = new start();
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
	public start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label1 = new JLabel("Value1");
		label1.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		label1.setBounds(44, 27, 69, 21);
		frame.getContentPane().add(label1);
		
		JLabel label2 = new JLabel("Value2");
		label2.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		label2.setBounds(44, 70, 69, 14);
		frame.getContentPane().add(label2);
		
		textField1 = new JTextField();
		textField1.setBounds(154, 29, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(154, 69, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = Integer.parseInt(textField1.getText());
				int val2 = Integer.parseInt(textField2.getText());
				int res = val1 + val2;
				textField3.setText("" + res);
				
				if (res>10)
					checkBox.setSelected(true);
				else
					checkBox.setSelected(false);
				
			}
		});
		btnAdd.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		btnAdd.setBounds(44, 116, 79, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("Subtract");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int val1 = Integer.parseInt(textField1.getText());
				int val2 = Integer.parseInt(textField2.getText());
				int res = val1 - val2;
				textField3.setText("" + res);
				if (res>10)
					checkBox.setSelected(true);
				else
					checkBox.setSelected(false);
			}
		});
		btnSub.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		btnSub.setBounds(133, 116, 107, 23);
		frame.getContentPane().add(btnSub);
		
		JLabel label3 = new JLabel("Result");
		label3.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		label3.setBounds(44, 170, 69, 14);
		frame.getContentPane().add(label3);
		
		textField3 = new JTextField();
		textField3.setBounds(154, 169, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		checkBox = new JCheckBox("Greater than 10");
		checkBox.setFont(new Font("Segoe Print", Font.PLAIN, 16));
		checkBox.setBounds(67, 210, 173, 23);
		frame.getContentPane().add(checkBox);
	}
}
