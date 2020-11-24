public abstract class PaymentCard {

    private String cardType;
    private String cardNumber;

    public PaymentCard(String cardType, String cardNumber) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
    }

    public String getCardType() {
        return this.cardType;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
}
