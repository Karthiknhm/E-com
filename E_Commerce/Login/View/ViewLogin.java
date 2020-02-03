package View;

import java.util.Scanner;
import Model.ModelLogin;
import Presenter.IPresenterLogin;
import Presenter.PresenterLogin;

public class ViewLogin implements IViewLogin 
{
	private IPresenterLogin presenterlogin; 
	
	public static void main(String args[]) 
	{
		//create the view class object
		ViewLogin view = new ViewLogin();
		
		//call the setPresenter method and then
		//Argument of create the PresenterLogin class object
		//PresenterLogin class object Argument of view class object and ModelLogin class object
		view.setPresenter(new PresenterLogin(view,new ModelLogin()));
	}
	
	public void setPresenter(IPresenterLogin presenter) 
	{
		this.presenterlogin = presenter;
		userlogin();
	}
	
	//UserLogin method to get UserName and Password 
	//call the Interface presenterlogin methods
	public void userlogin() 
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Username");
		String username = sc1.nextLine();
		System.out.println("Enter the password");
		String password = sc1.nextLine();
		
		
		presenterlogin.pass(username,password);
		presenterlogin.login();
	}
	
	public void updateStatusLabel(String result) 
	{
		System.out.println(result);
	}
}