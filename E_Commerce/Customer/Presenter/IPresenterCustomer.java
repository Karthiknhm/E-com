package Presenter;

import java.sql.SQLException;

public interface IPresenterCustomer 
{
	String buy(int product_Id,int quantity,int price) throws SQLException;
	public String cart(int product_id) throws SQLException;
	Object showcart(String customer) throws SQLException;
	 public String removecart(int S_No) throws SQLException;
}