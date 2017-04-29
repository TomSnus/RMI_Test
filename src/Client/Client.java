package Client;

import Server.Cheque;
import Server.IAccount;

import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class Client {
    public static void main(String[] args) throws RemoteException, NotBoundException, AlreadyBoundException {
        Registry r = LocateRegistry.getRegistry("localhost", 1099);
        IAccount stub = (IAccount) r.lookup("Account");

        Cheque c = new Cheque(500);
        stub.deposit(c);
    }
}
