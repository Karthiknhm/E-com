package View;

import java.sql.SQLException;

import Presenter.IPresenterCustomer;

public interface IViewCustomer 
{
	void setPresenter(IPresenterCustomer presenetr) throws SQLException;
	void buy(int product_Id) throws SQLException;
	public void addToCart(int product_id) throws SQLException;
}