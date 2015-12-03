import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.SystemColor;

import javax.swing.UIManager;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
		btnStartButton.setForeground(UIManager.getColor("Button.focus"));
		btnStartButton.setBackground(UIManager.getColor("Button.background"));
		btnStartButton.setBounds(163, 283, 156, 23);
		getFrame().getContentPane().add(btnStartButton);
		
		JButton btnInfoButton = new JButton("Information");
		btnInfoButton.setBounds(163, 320, 156, 23);
		getFrame().getContentPane().add(btnInfoButton);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
