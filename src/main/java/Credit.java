public class Credit extends PaymentCard {

    private double riskMultiplier;
    private double creditLimit;

    public Credit(String cardType,  String cardNumber, double riskMultiplier, double creditLimit) {
        super(cardType, cardNumber);
        this.riskMultiplier = riskMultiplier;
        this.creditLimit = creditLimit;
    }

    public double getRiskMultiplier() {
        return this.riskMultiplier;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }
}
