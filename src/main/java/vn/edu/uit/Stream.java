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
public class Stream {
    
    @JsonProperty("_doc")
    private doc _doc;
    
    public doc getDoc() {
        return _doc;
    }
    
}
