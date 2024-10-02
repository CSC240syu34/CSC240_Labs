public class Home{
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
    public void setInfo(String firstName, String lastName, int squareFootage, int dwellingCoverage, int contentCoverage, int liabilityCoverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.squareFootage = squareFootage;
        this.dwellingCoverage = dwellingCoverage;
        this.contentCoverage = contentCoverage;
        this.liabilityCoverage = liabilityCoverage;
    }
}