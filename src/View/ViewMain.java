//File end.
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Util.FileUtil;

public class ViewMain extends JFrame {
	
	FlowLayout layout = new FlowLayout();
	JLabel textMain;
	JButton sendEmailButton;
	JButton invisibleButton;
	JButton exitButton;
	
	public ViewMain(){
		setLayout(layout);
		setTitle("Main screen !");
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setSize(300,70);
		
		invisibleButton = new JButton("Invisible");
		add(invisibleButton);
		
		sendEmailButton = new JButton("Send E-mail");
		add(sendEmailButton);
		
		exitButton = new JButton("Exit");
		add(exitButton);
		
		invisibleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				setVisible(false);
				
			}
		});
		
		sendEmailButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				ViewSendEmail sendEmail = new ViewSendEmail();
				sendEmail.setVisible(true);
				dispose();
				
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewLogout vl = new ViewLogout();
				vl.setVisible(true);
				dispose();
			}
		});
		
	}
	
}
