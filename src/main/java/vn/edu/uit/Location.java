/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.uit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author xuananuit
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String city;
        private String country;
        
        public String getCity(){
            return city;
        }
        public String getCountry(){
            return country;
        }
    
}
