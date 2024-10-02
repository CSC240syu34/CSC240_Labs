public class Life{
    private String firstName;
    private String lastName;
    private int age;
    private int lifeCoverage;
    private double commision = 0;

    public Life(){
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.lifeCoverage = 0;
    }

    public Life(String firstName, String lastName, int age, int lifeCoverage ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lifeCoverage = lifeCoverage;
    }

    public void computeCommission(){
    commision = (int)(lifeCoverage * 0.2);
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTerm() {
        return lifeCoverage;
    }

    public void setLifeCoverage(int lifeCoverage) {
        this.lifeCoverage = lifeCoverage;
    }

    public double getCommision() {
        return commision;
    }

    @Override
    public String toString() {
        return String.format(
            "Life Policy\n-----------\nName: %s %s\nAge: %d\nTerm: $%,.2f\nCommission: $%,.2f\n",
            firstName, lastName, age, (double)lifeCoverage, commision
        );
    }
    public void setInfo(String firstName, String lastName, int age, int lifeCoverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.lifeCoverage = lifeCoverage;
    }
}