
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Kurs {
   private Kierowca kierowca ;
   private Date wyjazd,powrot;
   private int ilosc_km ;
   private int cza_h ;
   public final int stawka_za_h = 14;
   public final int stawka_za_km = 5;
   int w;
   
   public Kierowca getKierowca(){return kierowca; }
   public Kurs setKierowca(Kierowca k)
   {
       this.kierowca=k;
               return this;
   }
   public Date getDataWyjazdu(){return wyjazd;}
   public Kurs setDatawyjazdu( Date wyjazd) 
   {
       this.wyjazd = wyjazd;
       return this;
   }
   public Date getDataPowtoru(){return powrot;}
   public Kurs setDataPowrotu( Date powrot) 
   {
       this.powrot = powrot;
       return this;
   }
    public int getIloscKm(){return ilosc_km;}
   public Kurs setIloscKm( int ilosc_km ) 
   {
       this.ilosc_km = ilosc_km;
       return this;
   }
   
    
    static public List<Kurs> listaKursow = new ArrayList();
    
    public long czas()
    {
        Duration d =Duration.between(wyjazd.toInstant(), powrot.toInstant());
        return d.toHours();
        
    }
    public Kurs setCzas(int cza_h){
        this.cza_h=cza_h;
        return this;
    }
        
    
    public int wynagrodzenie()
    {      
        w= (int) ((czas()*stawka_za_h )+ (ilosc_km*stawka_za_km));
        return w;
    }
    
    
    
}
