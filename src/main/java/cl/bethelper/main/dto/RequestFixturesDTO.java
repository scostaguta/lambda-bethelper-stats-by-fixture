package cl.bethelper.main.dto;

//@Data
public class RequestFixturesDTO {
    private String id_fixture;
    private String league;
    private String season;

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getId_fixture() {
        return id_fixture;
    }

    public void setId_fixture(String id_fixture) {
        this.id_fixture = id_fixture;
    }

    @Override
    public String toString() {
        return "RequestFixturesDTO{" +
                "id_fixture='" + id_fixture + '\'' +
                ", league='" + league + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
