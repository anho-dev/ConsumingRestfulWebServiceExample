/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.uit;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author xuananuit
 */
public class doc {
    
    @JsonProperty("tags")
    private String[] tags;
    
    public String[] getTags(){
        return tags;
    }
    
    
    
    @JsonProperty("location")
    private Location location;
    
    public Location getLocation() {
        return location;
    }
}
