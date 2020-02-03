package Presenter;

import java.sql.SQLException;

import Model.IModelAdmin;
import View.IViewAdmin;


public class PresenterAdmin implements IPresenterAdmin 
{
	private IModelAdmin modeladmin;
	private IViewAdmin viewadmin;
	
	public PresenterAdmin(IViewAdmin view, IModelAdmin model)
	{
		this.modeladmin = model;
		this.viewadmin = view;
	}
	public String addproducts(Object details) throws SQLException
	{
		return modeladmin.adddetails(details);
	}
	public String removeProducts(int S_No) throws SQLException
	{
		return modeladmin.removefromtable(S_No);
	}
	
}