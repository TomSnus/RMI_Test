package Server;

import java.rmi.RemoteException;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class AccountImpl implements IAccount {
    @Override
    public void deposit(int cents) throws RemoteException {
        System.out.println("Deposit: " + cents);
    }

    @Override
    public void withdraw(int cents) throws RemoteException{
        System.out.println("Withdraw: " + cents);
    }
}
