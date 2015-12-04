import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;


public class Start  {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Start window = new Start();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Initialize
	public Start(){
		initialize();
	}	
	/**
	 * Create the frame.
	 * @return 
	 */
	public void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 500, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		getFrame().setLocationRelativeTo(null);
		
		JButton btnStartButton = new JButton("Start");
		btnStartButton.setIcon(new ImageIcon(Start.class.getResource("/com/sun/java/swing/plaf/windows/icons/HomeFolder.gif")));
		btnStartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					boolean value = true;
					
					if( value == true){
						getFrame().dispose();
						
						Menu menu = new Menu();
						menu.appear();
						}
					}catch(Exception f){
						
					
			}
		}
		});
		btnStartButton.setForeground(new Color(255, 250, 250));
		btnStartButton.setBackground(new Color(255, 69, 0));
		btnStartButton.setBounds(163, 283, 156, 23);
		getFrame().getContentPane().add(btnStartButton);
		
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
