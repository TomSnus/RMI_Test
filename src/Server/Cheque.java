package Server;

import java.io.Serializable;

/**
 * Created by Faßreiter on 29.04.2017.
 */
public class Cheque implements Serializable {

    private int cents;

    public Cheque(int cents) {
        this.cents = cents;
    }


    public int getCents() {
        return cents;
    }

    public void setCents(int cents) {
        this.cents = cents;
    }
}
