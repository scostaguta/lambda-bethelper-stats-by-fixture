package  cl.bethelper.main.vo; ; 
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
public class Response{
    @JsonProperty("team") 
    public Team getTeam() { 
		 return this.team; } 
    public void setTeam(Team team) { 
		 this.team = team; } 
    Team team;
    @JsonProperty("statistics") 
    public ArrayList<Statistic> getStatistics() {
		 return this.statistics; } 
    public void setStatistics(ArrayList<Statistic> statistics) { 
		 this.statistics = statistics; } 
    ArrayList<Statistic> statistics;
}
