package  cl.bethelper.main.vo; ; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Parameters{
    @JsonProperty("fixture") 
    public String getFixture() { 
		 return this.fixture; } 
    public void setFixture(String fixture) { 
		 this.fixture = fixture; } 
    String fixture;
}
