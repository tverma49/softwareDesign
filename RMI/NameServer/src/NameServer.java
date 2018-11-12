import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class NameServer {

	public static void main(String[] args) { 
		
		try { 
        LocateRegistry.createRegistry(1099); 
        System.out.println("java RMI registry created.");
    } catch (RemoteException e) {}
	
    try {
         NameImpl n1 = new NameImpl("John", "Smith");
         Naming.rebind( "toaster",(Remote) n1 );
    }
    catch( Exception e ) { System.out.println( "Error: " + e ); }

	}

}
