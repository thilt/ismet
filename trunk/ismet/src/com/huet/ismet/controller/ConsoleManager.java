/**
 * 
 */
package com.huet.ismet.controller;

import com.flexycore.iphone.uikit.UITextViewDelegate;
import com.flexycore.iphone.uikit.UIViewController;

/**
 * @author tibo
 *
 */
public class ConsoleManager extends UITextViewDelegate {

	
	private UIViewController viewController;
	
	
	public ConsoleManager(UIViewController viewCtr){
		super();
		init();
		this.viewController= viewCtr;
	}


	public UIViewController getViewController() {
		return this.viewController;
	}


	public void setViewController(UIViewController viewController) {
		this.viewController = viewController;
	}
	
	
}
