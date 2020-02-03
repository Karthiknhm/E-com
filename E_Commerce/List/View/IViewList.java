package View;

import java.sql.SQLException;

import Presenter.IPresenterList;



public interface IViewList 
{
	void setPresenter(IPresenterList prese) throws SQLException;
}