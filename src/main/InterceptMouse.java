//File end.
package main;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

import Util.FileUtil;;

public class InterceptMouse implements NativeMouseInputListener{

	@Override
	public void nativeMouseClicked(NativeMouseEvent cl) {
		if(cl.getClickCount() == NativeMouseEvent.BUTTON1){
			FileUtil.escreverTexto("<ms>");
		}
		
	}

	@Override
	public void nativeMousePressed(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeMouseDragged(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nativeMouseMoved(NativeMouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
