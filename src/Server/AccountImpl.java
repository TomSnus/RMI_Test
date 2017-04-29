package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class AccountImpl implements IAccount {



    @Override
    public void deposit(int cents) throws RemoteException {
        System.out.println("Deposit: " + cents);
    }

    public void deposit(Cheque c) throws RemoteException {
        new Thread(new ValidationHandler(c)).start();
        System.out.println("Deposit: " + c.getCents());
    }



    @Override
    public void withdraw(int cents) throws RemoteException{
        System.out.println("Withdraw: " + cents);
    }
}
