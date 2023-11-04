
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.rmi.*;
import java.rmi.registry.*;
public interface RmiInterface extends Remote {
	
	public void uploadFileToServer(byte[] mybyte, String serverpath, int length) throws RemoteException;
	public byte[] downloadFileFromServer(String servername) throws RemoteException;


}
