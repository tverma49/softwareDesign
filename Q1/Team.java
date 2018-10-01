import java.awt.EventQueue;

import javax.swing.JFrame;

public class Team {

	private Counter games_played;
	private Counter points;
	private String team_name;
	
	Team(String n, int gp, int pt)
	{
		team_name = n;
		games_played = new Counter(gp);
		points = new Counter(pt);
	}
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Team window = new Team();
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
	public Team() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	void win()
	{
		points.increment();
		points.increment();
		points.increment();
		games_played.increment();		
	}
	void draw()
	{
		points.increment();
		games_played.increment();	
	}
	void loss()
	{
		games_played.increment();	
	}
	public String print_details()
	{
		return("Team name : "+readName()+"\n Games played : "+readPlayed()+"\nPoints scored : "+readPoints());
	}
	public String readName()
	{
		return this.team_name;
	}
	public int readPlayed()
	{
		return games_played.read_value();
	}
	int  readPoints()
	{
		return points.read_value();
	}


}
