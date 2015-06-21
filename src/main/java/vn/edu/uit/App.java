package vn.edu.uit;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Sake> response = restTemplate.getForEntity("https://data.sparkfun.com/streams/dZ4EVmE8yGCRGx5XRX1W.json", Sake.class);
        if (HttpStatus.OK == response.getStatusCode()) {
            System.out.println("\tSuccess: " + response.getBody().getSuccess());
            System.out.println("\tPublicKey: " + response.getBody().getPublicKey());
            System.out.println("\tStream: ");
            System.out.println("\t\t_doc: ");
            System.out.println("\t\tTags: ");
            int n = response.getBody().getStream().getDoc().getTags().length;
            for (int i =0; i < n; i++){
                System.out.println("\t\t\t " + response.getBody().getStream().getDoc().getTags()[i]);
            }
            
            System.out.println("\t\tLocation: ");
            System.out.println("\t\t\tCity: " + response.getBody().getStream().getDoc().getLocation().getCity());
            System.out.println("\t\t\tCountry: " + response.getBody().getStream().getDoc().getLocation().getCountry());
        } else {
        System.out.println("Error");
    }
        
        // Sake page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Sake.class);
        
        // Sake.Location location = new Sake.Location();
        // location = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Sake.Location.class);
        
        
        /*System.out.println("\tName: " + page.getName());
        System.out.println("\tPhone: " + page.getPhone());
        System.out.println("\tAbout " + page.getAbout());
        System.out.println("\tWebsite " + page.getWebsite());
        
        System.out.println("\tLocation: " );
        System.out.println("\t\tCity: " + location.getCity());
        System.out.println("\t\tCountry: " + location.getCountry() );
                */
    }
}
