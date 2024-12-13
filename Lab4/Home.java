public class Home extends Policy {
    private int squareFootage;
    private int dwellingCoverage;
    private int contentCoverage;
    private int liabilityCoverage;

    public Home() {
        super();
        this.squareFootage = 0;
        this.dwellingCoverage = 0;
        this.contentCoverage = 0;
        this.liabilityCoverage = 0;
    }

    public Home(String firstName, String lastName, int squareFootage, int dwellingCoverage, int contentCoverage, int liabilityCoverage) {
        super(firstName, lastName);
        this.squareFootage = squareFootage;
        this.dwellingCoverage = dwellingCoverage;
        this.contentCoverage = contentCoverage;
        this.liabilityCoverage = liabilityCoverage;
    }

    @Override
    public void computeCommission() {
        setCommission((liabilityCoverage * 0.3) + ((dwellingCoverage + contentCoverage) * 0.2));
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getDwellingCoverage() {
        return dwellingCoverage;
    }

    public void setDwellingCoverage(int dwellingCoverage) {
        this.dwellingCoverage = dwellingCoverage;
    }

    public int getContentCoverage() {
        return contentCoverage;
    }

    public void setContentCoverage(int contentCoverage) {
        this.contentCoverage = contentCoverage;
    }

    public int getLiabilityCoverage() {
        return liabilityCoverage;
    }

    public void setLiabilityCoverage(int liabilityCoverage) {
        this.liabilityCoverage = liabilityCoverage;
    }
    
    public void setInfo(String firstName, String lastName, int squareFootage, int dwellingCoverage, int contentCoverage, int liabilityCoverage) {
        setFirstName(firstName);
        setLastName(lastName);
        this.squareFootage = squareFootage;
        this.dwellingCoverage = dwellingCoverage;
        this.contentCoverage = contentCoverage;
        this.liabilityCoverage = liabilityCoverage;
    }

    @Override
    public String toString() {
        return String.format(
            "Home Policy\n-----------\n%sFootage: %d\nDwelling: $%,.2f\nContents: $%,.2f\nLiability: $%,.2f\n", 
            super.toString(), squareFootage, (double) dwellingCoverage, (double) contentCoverage, (double) liabilityCoverage
        );
    }
}
