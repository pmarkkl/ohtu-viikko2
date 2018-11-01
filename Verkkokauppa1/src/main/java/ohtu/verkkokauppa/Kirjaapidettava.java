
package ohtu.verkkokauppa;

import java.util.ArrayList;

public interface Kirjaapidettava {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}
