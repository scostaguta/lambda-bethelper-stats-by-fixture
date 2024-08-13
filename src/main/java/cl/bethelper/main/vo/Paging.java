package  cl.bethelper.main.vo; ; 
import com.fasterxml.jackson.annotation.JsonProperty; 
public class Paging{
    @JsonProperty("current") 
    public int getCurrent() { 
		 return this.current; } 
    public void setCurrent(int current) { 
		 this.current = current; } 
    int current;
    @JsonProperty("total") 
    public int getTotal() { 
		 return this.total; } 
    public void setTotal(int total) { 
		 this.total = total; } 
    int total;
}
