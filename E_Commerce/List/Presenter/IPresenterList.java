package Presenter;


import java.sql.SQLException;

public interface IPresenterList
{
	Object category() throws SQLException;
	Object categoryS_No(String i) throws SQLException;
}
