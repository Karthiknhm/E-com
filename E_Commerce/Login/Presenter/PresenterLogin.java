package Presenter;

import Model.IModelLogin;
import View.IViewLogin;

public class PresenterLogin implements IPresenterLogin 
{
	private IModelLogin modellogin;
	private IViewLogin viewlogin;

	public PresenterLogin(IViewLogin view, IModelLogin model)
	{
		this.modellogin = model;
		this.viewlogin = view;
	}
	
	//Pass method to call modellogin interface method of set with argument of Username and password
	public void pass(String username,String password)
	{
		modellogin.set(username,password);
	}
	
	//login method to call modellogin interface method of login 
	public void login() 
	{
	   try 
	   {
		String result =  modellogin.login();
		viewlogin.updateStatusLabel(result);
	   }
	   catch (Exception e)
	   {
		e.printStackTrace();
	   }
	}
}