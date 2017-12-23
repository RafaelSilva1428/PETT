//File end.
package Util;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAddressIpMachineUtil {
	
	public static String ipAddress() throws UnknownHostException{
		return "\n IP Machine: "+InetAddress.getLocalHost().getHostAddress().toString();
	}

}
