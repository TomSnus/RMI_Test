package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class Server {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        IAccount acc = new AccountImpl();
        IAccount stub = (IAccount) UnicastRemoteObject.exportObject(acc, 0);

        Registry r = LocateRegistry.createRegistry(1099);
        r.bind("Account", stub);

    }
}
