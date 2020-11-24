public abstract class PaymentCard {

    private String cardType;
    private String cardIssuer;
    private int balance;
    private int limit;
    private int cardNumber;

    public PaymentCard(String cardType, String cardIssuer, int balance, int limit, int cardNumber) {
        this.cardType = cardType;
        this.cardIssuer = cardIssuer;
        this.balance = balance;
        this.limit = limit;
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardIssuer() {
        return cardIssuer;
    }

    public void setCardIssuer(String cardIssuer) {
        this.cardIssuer = cardIssuer;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}
