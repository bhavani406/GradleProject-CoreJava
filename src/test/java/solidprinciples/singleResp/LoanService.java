package solidprinciples.singleResp;

public class LoanService {
    public void getLoanInterest(String loanType) {
        if (loanType.equals("homeloan")) {
            System.out.println(" do ");
        } else if (loanType.equals("vehileLoan")) {
            System.out.println("do");
        }
    }
}
