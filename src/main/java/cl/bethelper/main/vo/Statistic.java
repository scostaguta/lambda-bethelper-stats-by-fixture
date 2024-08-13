package  cl.bethelper.main.vo; ; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Statistic{
    @JsonProperty("type") 
    public String getType() { 
		 return this.type; } 
    public void setType(String type) { 
		 this.type = type; } 
    String type;
    @JsonProperty("value") 
    public Object getValue() { 
		 return this.value; } 
    public void setValue(Object value) { 
		 this.value = value; } 
    Object value;
}
