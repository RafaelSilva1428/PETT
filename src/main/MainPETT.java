//File end. 1.0
package main;

import java.io.File;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import View.ViewMain;

public class MainPETT {

	public static void main(String[] args) {
		
		File file = new File("pett");
		file.mkdir();
		
		ViewMain tp = new ViewMain();
		tp.setVisible(true);
		
	    try {
	    	GlobalScreen.registerNativeHook();
	    }catch (NativeHookException ex) {
	              System.err.println("Ops, ocorreu um problema ao tentar registrar o NativeHook");
	              System.err.println(ex.getMessage());
	   
	              System.exit(1);
	          }
	   
	          GlobalScreen.addNativeKeyListener(new InterceptKeyboard());
	          GlobalScreen.addNativeMouseListener(new InterceptMouse());
	          GlobalScreen.addNativeMouseMotionListener(new InterceptMouse());
	      }
		

}
