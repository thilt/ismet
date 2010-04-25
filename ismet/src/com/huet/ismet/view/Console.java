/**
 * 
 */
package com.huet.ismet.view;

import com.flexycore.iphone.coregraphics.CGRect;
import com.flexycore.iphone.uikit.UIFont;
import com.flexycore.iphone.uikit.UIKeyboardType;
import com.flexycore.iphone.uikit.UIReturnKeyType;
import com.flexycore.iphone.uikit.UITextView;
import com.flexycore.iphone.uikit.UIViewController;
import com.huet.ismet.controller.ConsoleManager;

/**
 * @author tibo
 *
 */
public class Console extends UITextView {

	private UITextView console;

	public Console(UIViewController viewController) {
		super();
		init();
		this.console = new UITextView();
		this.console.setText("console");
		this.console.initWithFrame(new CGRect().init(30, 10, 260, 100));
		this.console.setFont(UIFont.fontWithNameSize("Courier New", 16));
		this.console.setEditable(true);
		this.console.setKeyboardType(UIKeyboardType.UIKeyboardTypeASCIICapable);
		this.console.setReturnKeyType(UIReturnKeyType.UIReturnKeyDefault);
		this.console.setUITextViewDelegate(new ConsoleManager(viewController));
		addSubview(this.console);
	}
	
	
}
