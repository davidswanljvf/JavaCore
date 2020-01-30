package homework1.competitors;


public class Team {

    private Competitor[] competitors;


    public Team(Competitor... competitors) {
        this.competitors = competitors;
    }

    public Competitor[] getCompeptitor() {
        return competitors;
    }

}
