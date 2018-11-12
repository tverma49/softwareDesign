import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Name extends Remote{


	public void updateSurname(String s) throws RemoteException;
	
	public String readName() throws RemoteException;
}
