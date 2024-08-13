package  cl.bethelper.main.vo; ; 
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
public class Root{
    @JsonProperty("get") 
    public String getGet() { 
		 return this.get; } 
    public void setGet(String get) { 
		 this.get = get; } 
    String get;
    @JsonProperty("parameters") 
    public Parameters getParameters() { 
		 return this.parameters; } 
    public void setParameters(Parameters parameters) { 
		 this.parameters = parameters; } 
    Parameters parameters;
    @JsonProperty("errors") 
    public ArrayList<Object> getErrors() {
		 return this.errors; } 
    public void setErrors(ArrayList<Object> errors) { 
		 this.errors = errors; } 
    ArrayList<Object> errors;
    @JsonProperty("results") 
    public int getResults() { 
		 return this.results; } 
    public void setResults(int results) { 
		 this.results = results; } 
    int results;
    @JsonProperty("paging") 
    public Paging getPaging() { 
		 return this.paging; } 
    public void setPaging(Paging paging) { 
		 this.paging = paging; } 
    Paging paging;
    @JsonProperty("response") 
    public ArrayList<Response> getResponse() { 
		 return this.response; } 
    public void setResponse(ArrayList<Response> response) { 
		 this.response = response; } 
    ArrayList<Response> response;
}
