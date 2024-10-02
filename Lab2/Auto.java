public class Auto{
        private String firstName;
        private String lastName;
        private String model;
        private double liabilityCoverage;
        private double collisionCoverage;
        private double commision; // (liabilityCoverage * collisionCoverage) * 0.3;

    public Auto(){
        this.firstName = "";
        this.lastName = "";
        this.model = "";
        this.liabilityCoverage = 0;
        this.collisionCoverage = 0;
    }

    public Auto(String firstName, String lastName, String model,String make, double liabilityCoverage, double collisionCoverage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.model = model + " " + make;
        this.liabilityCoverage = liabilityCoverage;
        this.collisionCoverage = collisionCoverage;
    }

    public void computeCommission(){
        commision = (liabilityCoverage + collisionCoverage) * 0.3;
    }

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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLiabilityCoverage() {
        return liabilityCoverage;
    }

    public void setLiabilityCoverage(double liabilityCoverage) {
        this.liabilityCoverage = liabilityCoverage;
    }

    public double getCollisionCoverage() {
        return collisionCoverage;
    }

    public void setCollisionCoverage(int collisionCoverage) {
        this.collisionCoverage = collisionCoverage;
    }

    public double getCommision() {
        return commision;
    }
    @Override
    public String toString() {
        return String.format(
            "Auto Policy\n-----------\nName: %s %s\nMake: %s\nModel: %s\nLiability: $%,.2f\nCollision: $%,.2f\nCommission: $%,.2f\n",
            firstName, lastName, model, model, liabilityCoverage, collisionCoverage, commision
        );
    }
    public void setInfo(String firstName, String lastName, String model, double liabilityCoverage, double collisionCoverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.model = model;
        this.liabilityCoverage = liabilityCoverage;
        this.collisionCoverage = collisionCoverage;
    }
}