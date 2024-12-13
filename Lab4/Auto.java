public class Auto extends Policy {
    private String model;
    private double liabilityCoverage;
    private double collisionCoverage;

    public Auto() {
        super();
        this.model = "";
        this.liabilityCoverage = 0;
        this.collisionCoverage = 0;
    }

    public Auto(String firstName, String lastName, String model, double liabilityCoverage, double collisionCoverage) {
        super(firstName, lastName);
        this.model = model;
        this.liabilityCoverage = liabilityCoverage;
        this.collisionCoverage = collisionCoverage;
    }

    @Override
    public void computeCommission() {
        setCommission((liabilityCoverage + collisionCoverage) * 0.3);
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

    public void setCollisionCoverage(double collisionCoverage) {
        this.collisionCoverage = collisionCoverage;
    }

    public void setInfo(String firstName, String lastName, String model, double liabilityCoverage, double collisionCoverage) {
        setFirstName(firstName);
        setLastName(lastName);
        this.model = model;
        this.liabilityCoverage = liabilityCoverage;
        this.collisionCoverage = collisionCoverage;
    }

    @Override
    public String toString() {
        return String.format(
            "Auto Policy\n-----------\n%sModel: %s\nLiability: $%,.2f\nCollision: $%,.2f\n", 
            super.toString(), model, liabilityCoverage, collisionCoverage
        );
    }
}
