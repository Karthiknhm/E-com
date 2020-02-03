package Model;

import java.sql.Statement;

import Presenter.PresenterAdmin;
import Presenter.PresenterCustomer;
import View.IViewAdmin;
import View.IViewCustomer;
import View.ViewAdmin;
import View.ViewCustomer;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;

public class ModelLogin implements IModelLogin
{
	  private String username;
	  private String password;
	  
		public void set(String username,String password) 
	    {
	        this.username = username;
	        this.password = password;
	    } 
		
		//Login method to connect the sqlserver and get the datas
		public String login() throws SQLException  
		{
			Connection c = DriverManager.getConnection("jdbc:sqlserver://106.51.1.63; database = {fresher_ecom_task}","ecomfresher","Change@Fresher");
			Statement s1 = c.createStatement();
			ResultSet rs = s1.executeQuery("select*from login");
		
			String result = "Enter valid credinals";

			while(rs.next())
			{
				String name  = rs.getString("User_Name");
				String password = rs.getString("Password");
			
				//check the given username and password is correct or not
				//Already username and password is stored in database
			    if(name.equalsIgnoreCase(this.username) && password.equals(this.password)) 
			    {
				    if(username.contains("@admin"))
				    {
				    	IViewAdmin viewadmin = new ViewAdmin();
						viewadmin.setPresenter(new PresenterAdmin(viewadmin,new ModelAdmin()));
						
				    }
				    else
				    {
						IViewCustomer view = new ViewCustomer(username);
						view.setPresenter(new PresenterCustomer(view,new ModelCustomer()));
				    }
			    	result = "Login Successfully";
				   break;
			    }
		  	}
			return result;
		}
}