public class Life extends Policy {
    private int age;
    private int lifeCoverage;

    public Life() {
        super();
        this.age = 0;
        this.lifeCoverage = 0;
    }

    public Life(String firstName, String lastName, int age, int lifeCoverage) {
        super(firstName, lastName);
        this.age = age;
        this.lifeCoverage = lifeCoverage;
    }

    @Override
    public void computeCommission() {
        setCommission(lifeCoverage * 0.2);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLifeCoverage() {
        return lifeCoverage;
    }

    public void setLifeCoverage(int lifeCoverage) {
        this.lifeCoverage = lifeCoverage;
    }

    public void setInfo(String firstName, String lastName, int age, int lifeCoverage) {
        setFirstName(firstName);
        setLastName(lastName);
        this.age = age;
        this.lifeCoverage = lifeCoverage;
    }

    @Override
    public String toString() {
        return String.format(
            "Life Policy\n-----------\n%sAge: %d\nCoverage: $%,.2f\n", 
            super.toString(), age, (double) lifeCoverage
        );
    }
}
