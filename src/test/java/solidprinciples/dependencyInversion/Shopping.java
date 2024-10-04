package solidprinciples.dependencyInversion;

// High-level modules should not depend on low-level modules. Both should depend on abstractions.
//componenets should depend on the abstractions not on concretions
// so here if we want credit card we need to update everything with credit card instead of that use INTERFACE
// BankCard
public class Shopping {
    private BankCard bankCard;

    public Shopping(BankCard bankCard){
        this.bankCard = bankCard;
    }
    public void doPurchase(long amount){
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        BankCard bankCard = new CreditCard();
        Shopping shp = new Shopping(bankCard);
        shp.doPurchase(2000);
    }
}
