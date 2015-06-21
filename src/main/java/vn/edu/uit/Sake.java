/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.uit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author xuananuit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Sake {
    
    private String success;
    private String publicKey;
    
    @JsonProperty("stream")
    private Stream stream;
    
    public String getSuccess() {
        return success;
    }
    
    public String getPublicKey() {
        return publicKey;
    }
    
    public Stream getStream() {
        return stream;
    }
}
