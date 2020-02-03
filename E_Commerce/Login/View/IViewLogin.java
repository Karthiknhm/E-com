package View;

import Presenter.IPresenterLogin;

public interface IViewLogin
{
	void userlogin();
	void setPresenter(IPresenterLogin presenter);
	void updateStatusLabel(String result);
}