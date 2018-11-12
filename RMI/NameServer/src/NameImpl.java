import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class NameImpl extends UnicastRemoteObject implements Name {

	private String first, surname;
	public NameImpl(String f, String s) throws RemoteException
	{   
		first=f;surname=s;
	}
	public void updateSurname(String s) throws RemoteException
	{
		surname=s;
	}


	public String readName() throws RemoteException
	{

		return first +" "+ surname;
	}
}
