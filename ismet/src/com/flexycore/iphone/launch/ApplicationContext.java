package com.flexycore.iphone.launch;

import com.flexycore.iphone.uikit.UIApplicationDelegate;
import com.huet.ismet.BlankDelegate;

public class ApplicationContext {
	private UIApplicationDelegate delegate = null;
	
	public ApplicationContext()
	{
		delegate = new BlankDelegate();
	}
	
	public UIApplicationDelegate getDelegate()
	{
		return delegate;
	}
}