package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public interface IAuthority extends Remote {
    public void approve(Cheque c) throws RemoteException;

}
