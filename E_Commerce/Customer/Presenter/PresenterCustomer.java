package Presenter;

import java.sql.SQLException;

import Model.IModelCustomer;
import View.IViewCustomer;


public class PresenterCustomer implements IPresenterCustomer 
{
	IModelCustomer modelcustomer;
	IViewCustomer viewcustomer;
	
	public PresenterCustomer(IViewCustomer view, IModelCustomer model)
	{
		this.modelcustomer = model;
		this.viewcustomer = view;
	}

	 public String buy(int product_Id,int quantity,int price) throws SQLException
	 {
		 return modelcustomer.buy(product_Id,quantity,price);
	 }
	 
	 public String cart(int product_id) throws SQLException
	 {
		 return modelcustomer.cart(product_id);
	 }
	 
	 public Object showcart(String customer) throws SQLException
	 {
		 return modelcustomer.showcart(customer);
	 }
	 
	 public String removecart(int S_No) throws SQLException
	 {
		 return modelcustomer.removecart(S_No);
	 }
}