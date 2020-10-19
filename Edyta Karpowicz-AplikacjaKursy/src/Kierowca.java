
import java.util.ArrayList;
import java.util.List;


public class Kierowca {
    
    String imie,nazwisko ;
    int rok_uzyk_pj, rok_rozp_p;
    
    static public List<Kierowca> listaKierowcow = new ArrayList();
    
 Kierowca(String imie, String nazwisko, int rok_uzyk_pj, int rok_rozp_p)
 {
     this.imie=imie;
     this.nazwisko=nazwisko;
     this.rok_uzyk_pj=rok_uzyk_pj;
     this.rok_rozp_p=rok_rozp_p;
     
     
 }
       
}
