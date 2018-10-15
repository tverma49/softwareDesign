
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Account  Application  ");
	private JLabel l1 = new JLabel("Max ");
	private JTextField t1=new JTextField(" ",8);
	private JLabel l2 = new JLabel("Count ");
	private JTextField t2=new JTextField("0",8);

	private JButton b1=new JButton("Remove");

	private JButton b2=new JButton("Add");

	private JLabel l3 = new JLabel("Message ");
	private JTextField t5=new JTextField(" ",8);
	private JPanel p1=new JPanel();
	
	private RestrictedOuting o =new RestrictedOuting(0,   20);
	private final JButton b3 = new JButton("Check available");
	private final JTextField textField = new JTextField();
	
	public MyFrame2(String s){
		super(s);
		textField.setColumns(10);
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(4,2));
		l0.setFont(f);  l1.setFont(f);
		content.add(l0);
		p1.add(l1); p1.add(t1);
		p1.add(l2); p1.add(t2);
		p1.add(b1); p1.add(b2); 
		p1.add(l3); p1.add(t5);
		content.add(p1);
		b1.addActionListener(this);   
		b2.addActionListener(this);  
 
		t1.setText("20");
		t2.setText(""+o.readCount());
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		         	textField.setText(""+o.print_details());
			}
		});
				
		getContentPane().add(b3);
		
		getContentPane().add(textField);
		setSize(210,250);    setVisible(true);}
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	t5.setText("");
	 	if (target==b1){
	          		boolean res =o.cancel();
	             	t2.setText(""+o.readCount());
	             	if (res==false)t5.setText("Already 0");
	             }
	 	if (target==b2){
      		    boolean res= o.add();
            	t2.setText(""+o.readCount());
         	    if (res==false)t5.setText("Exceeds Max");
         }
//	 	if (target==b3){      		
//         	textField.setText(""+o.print_details());
//         }
	 	
	 }

}