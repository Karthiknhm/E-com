package View;

import java.sql.SQLException;
import Presenter.IPresenterLogin;

public interface IViewLogin
{
	void userlogin();
	void signup() throws SQLException;
	void delete_account() throws SQLException;
	void setPresenter(IPresenterLogin presenter);
	void updateStatusLabel(String result);
}