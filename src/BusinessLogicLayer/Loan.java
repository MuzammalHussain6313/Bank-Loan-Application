/*
 * Free to distribute and modify.
 *
 */
package BusinessLogicLayer;

public class Loan {

    private String amount;
    private String duration;
    public Loan(){}
    public Loan(String amount, String duration) {
        this.amount = amount;
        this.duration = duration;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getAmount() {
        return amount;
    }

    public String getDuration() {
        return duration;
    }

}
