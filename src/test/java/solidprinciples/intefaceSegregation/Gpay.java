package solidprinciples.intefaceSegregation;

import javax.security.auth.callback.CallbackHandler;

public class Gpay implements  UPIPayments, CashBackManager {
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }

    @Override
    public void getCashBackAsCreditBal() {

    }
}
