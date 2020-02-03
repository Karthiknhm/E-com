package Model;

public interface IModelLogin 
{
	void set(String username,String password);
	String login() throws Exception;
}