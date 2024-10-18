public abstract class Policy {
    protected String firstName;
    protected String lastName;
    protected double commission;

    public Policy() {
        this.firstName = "";
        this.lastName = "";
        this.commission = 0;
    }
    
    public Policy(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.commission = 0;
    }

    public abstract void computeCommission();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCommission() {
        return commission;
    }

    protected void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return String.format("Policy Holder: %s %s\nCommission: $%,.2f\n", firstName, lastName, commission);
    }
}
