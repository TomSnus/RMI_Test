package Server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class ValidationHandler implements Runnable {

    private Cheque c;

    public ValidationHandler(Cheque c) {
        this.c = c;
    }

    @Override
    public void run() {
        try {
            checkForValidation(c);
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private void checkForValidation(Cheque c) throws AlreadyBoundException, RemoteException {
        try {
            Registry r = LocateRegistry.getRegistry("localhost", 1099);
            IAuthority stub = (IAuthority) r.lookup("Authority");
            stub.approve(c);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
