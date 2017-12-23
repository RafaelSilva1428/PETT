//File end.
package Util;

import java.util.Date;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailUtil {	
	
	public static void send(String destiny, String msg) throws EmailException{
		
		SimpleEmail email = new SimpleEmail();
		Date dateCurrent = new Date();
		
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.addTo(destiny, "Relatório");
		email.setFrom("develop@pett.com", "P.E.T.T");
		email.setSubject("Relatório "+dateCurrent.toString());
		email.setMsg(msg);
		email.setSSL(true);
		email.setAuthentication("pett.centerdevelopment@gmail.com", "pett@2017");
		email.send();
		
	}

}
