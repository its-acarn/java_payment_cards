public class Debit extends PaymentCard {

    private String accountNum;
    private String sortCode;

    public Debit(String cardType, String cardNumber, String accountNum, String sortCode) {
        super(cardType, cardNumber);
        this.accountNum = accountNum;
        this.sortCode = sortCode;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getSortCode() {
        return sortCode;
    }
}
