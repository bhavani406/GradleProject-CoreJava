package solidprinciples.intefaceSegregation;

//Clients should not be forced to implement interfaces they do not use.
// This means having small, specific interfaces rather than one large, general-purpose interface.

public interface UPIPayments {

    public void payMoney();
    public void getScratchCard();

}
