package com.huet.ismet;

import com.flexycore.iphone.uikit.UIApplication;
import com.flexycore.iphone.uikit.UIApplicationDelegate;
import com.flexycore.iphone.uikit.UINavigationController;
import com.flexycore.iphone.uikit.UIScreen;
import com.flexycore.iphone.uikit.UIViewController;
import com.flexycore.iphone.uikit.UIWindow;
import com.huet.ismet.view.Console;

public class BlankDelegate extends UIApplicationDelegate {
	
	private UINavigationController nav;
	
	
	
	public BlankDelegate() {
		super();
	}



	public void applicationDidFinishLaunching(UIApplication application) {
		UIWindow window = new UIWindow();
        window.initWithFrame(UIScreen.mainScreen().bounds());
        
        this.nav = new UINavigationController();
        
        UIViewController viewController = new UIViewController();
        viewController.init();
        viewController.setTitle("Console");
        viewController.setView(new Console(viewController));
        
        this.nav.initWithRootViewController(viewController);
		
        window.addSubview(this.nav.view());
		window.makeKeyAndVisible();
	}
}
