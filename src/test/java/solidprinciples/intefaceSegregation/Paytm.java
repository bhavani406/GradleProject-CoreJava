package solidprinciples.intefaceSegregation;

public class Paytm implements UPIPayments{
    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
// paytom doesn't support this functionality, so we shouldn't force paytm to override this method
    // instead create other interface for cahback
//    @Override
//    public void getCashBackAsCreditBal() {
//
//    }
}
