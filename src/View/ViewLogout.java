//File end.
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ViewLogout extends JFrame{
	
	FlowLayout layout = new FlowLayout();
	JLabel msgLogoutJLabel;
	JLabel emailJLabel;
	JLabel passwordLabel;
	JTextField emailField;
	JPasswordField passwordField;
	JButton enterButton;
	JButton exitButton;
	
	public ViewLogout(){
		
		setTitle("Logout !");
		setLayout(layout);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(200,200);
		setResizable(false);
		
		msgLogoutJLabel = new JLabel("Enter user name and password !");
		add(msgLogoutJLabel);
		
		emailJLabel = new JLabel("E-mail: ");
		emailField = new JTextField(15);
		add(emailJLabel);
		add(emailField);
		
		passwordLabel = new JLabel("Password: ");
		passwordField = new JPasswordField(15);
		add(passwordLabel);
		add(passwordField);
		
		enterButton = new JButton("Enter");
		exitButton = new JButton("Exit");
		add(enterButton);
		add(exitButton);
		
		enterButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(emailField.getText().length() != 0 && passwordField.getText().length() != 0){
					if(emailField.getText().equals("teste15teste100@outlook.com") && passwordField.getText().equals("pett@2017")){
						System.exit(0);
						dispose();
					}else{
						JOptionPane.showMessageDialog(null, "Error email or password", "Error Email and Password", JOptionPane.ERROR_MESSAGE);
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "No typed email and password", "Error Email and Password", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				ViewMain vp = new ViewMain();
				vp.setVisible(true);
			}
		});
		
	}
}
