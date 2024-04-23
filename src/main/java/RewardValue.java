public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.setMilesValue(cashValue);
    }

    public RewardValue(int miles) {
        this.milesValue = miles;
        this.setCashValue(miles);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void setMilesValue(double cashValue) {
        this.milesValue = cashValue / CONVERSION_RATE;
    }

    public void setCashValue(double miles) {
        this.cashValue = miles * CONVERSION_RATE;
    }
}