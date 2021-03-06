package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public interface IAccount extends Remote {
    public void deposit(Cheque c) throws RemoteException, AlreadyBoundException;
    public void deposit(int cents) throws RemoteException;
    public void withdraw(int cents)throws RemoteException;


}
