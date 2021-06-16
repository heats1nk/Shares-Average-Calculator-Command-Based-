public class Shares {

    private int quantity;
    private double sharePrice;

    public double getSharePrice() {
        return sharePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double avgCalculation(Shares obj1, Shares obj2) {
        double totalAmountOld = obj1.getQuantity() * obj1.getSharePrice();
        double totalAmountNew = obj2.getQuantity() * obj2.getSharePrice();
        double totalUnits = obj1.getQuantity() + obj2.getQuantity();
        double sumAmount = totalAmountNew + totalAmountOld;

        double avg = sumAmount / totalUnits;
        return avg;
    }

    @Override
    public String toString() {
        return "{" +
                "quantity=" + quantity +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
