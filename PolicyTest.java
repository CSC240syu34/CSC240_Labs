

public class PolicyTest {

    public static class Auto{
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
    }
    public static class Home{
        private String firstName;
        private String lastName;
        private int squareFootage;
        private int dwellingCoverage;
        private int contentCoverage;
        private int liabilityCoverage;
        private int commision = 0; //(liabilityCoverage*0.3) + ((dwellingCoverage + contentCoverage) * 0.3);

        public Home(){
            this.firstName = "";
            this.lastName = "";
            this.squareFootage = 0;
            this.dwellingCoverage = 0;
            this.contentCoverage = 0;
            this.liabilityCoverage = 0;
        }

        public Home(String firstName, String lastName, int squareFootage, int dwellingCoverage, int contentCoverage, int liabilityCoverage){
            this.firstName = firstName;
            this.lastName = lastName;
            this.squareFootage = squareFootage;
            this.dwellingCoverage = dwellingCoverage;
            this.contentCoverage = contentCoverage;
            this.liabilityCoverage = liabilityCoverage;
        }

        public void computeCommission(){
            commision = (int)(liabilityCoverage*0.3) + (int)((dwellingCoverage + contentCoverage) * 0.2);
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

        public int getSquareFootage() {
            return squareFootage;
        }

        public void setFootage(int squareFootage) {
            this.squareFootage = squareFootage;
        }

        public int getDwellingCoverage() {
            return dwellingCoverage;
        }

        public void setDwelling(int dwellingCoverage) {
            this.dwellingCoverage = dwellingCoverage;
        }

        public int getContentCoverage() {
            return contentCoverage;
        }

        public void setContents(int contentCoverage) {
            this.contentCoverage = contentCoverage;
        }

        public int getLiabilityCoverage() {
            return liabilityCoverage;
        }

        public void setLiability(int liabilityCoverage) {
            this.liabilityCoverage = liabilityCoverage;
        }

        public int getCommision() {
            return commision;
        }
        @Override
        public String toString() {
            return String.format(
                "Home Policy\n-----------\nName: %s %s\nFootage: %d\nDwelling: $%,.2f\nContents: $%,.2f\nLiability: $%,.2f\nCommission: $%,.2f\n",
                firstName, lastName, squareFootage, (double) dwellingCoverage, (double) contentCoverage, (double) liabilityCoverage, (double)commision
            );
        }
    }

    public static class Life{
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
    }


       public static void main(String[] args)

       {

             // Create and set an Auto policy object setting data using constructor

             Auto a = new Auto("Jerry", "Seinfed", "Chevy", "Malibu", 10000.0, 50000.0);

            

             // Compute commission

             a.computeCommission();

            

             // Print auto policy

             System.out.println(a);

            

             // Create and set a Home policy object setting data using setters

             Home h = new Home();

             h.setFirstName("Elaine");

             h.setLastName("Benes");

             h.setContents(5000);

             h.setDwelling(32000);

             h.setFootage(4000);

             h.setLiability(10000);

            

             // Compute commission

             h.computeCommission();

 

             // Print home policy

             System.out.println(h);

            

             // Create and set an Life policy object setting data using constructor

             Life l = new Life("Cosmo", "Kramer", 35, 50000);

            

             // Compute commission

             l.computeCommission();

            

             // Print life policy

             System.out.println(l);

            

             // Test getters

             System.out.println("Get life firstName: " + l.getFirstName());

             System.out.println("Get life lastName: " + l.getLastName());

             System.out.println("Get life age: " + l.getAge());

             System.out.println("Get life term: " + l.getTerm());

       }

}