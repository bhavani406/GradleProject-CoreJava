package solidprinciples.singleResp;

//clt+alt+L
//WE HAVE 5 PRINCIPLES WHICH USED TO MAINTAIN THE CODE, AVOID DUPLICATION, FlEXIBLE
//SINGLE RES:
//	Each class should have one sole purpose not filled with execess functionality.
//this class violating singleresponsilbilty as it is doing multiple functionalities
// so we will devide the classes based on their functionality
public class BankService {

    public long deposit(Double amount, int accountNo) {
        return 0;
    }

    public long withDraw(Double amount, int accountNo) {
        return 0;
    }

}
