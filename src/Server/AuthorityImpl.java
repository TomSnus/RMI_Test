package Server;

import java.rmi.RemoteException;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class AuthorityImpl implements IAuthority {

    @Override
    public void approve(Cheque c) throws RemoteException {
        System.out.println("Validating: " + c.getCents());
    }
}
