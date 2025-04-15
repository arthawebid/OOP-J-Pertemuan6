package pertemuan601;

/**
 *
 * @author Made Artha
 * TGL: 15 April 2025
 */
public class VolumeBalok {
    private int panjang,lebar,tinggi;
    private int hasil;
    
    public int Volume(){
        this.hasil = this.panjang*this.lebar*this.tinggi;
        return this.hasil;
    }
    public void setPanjang(int pj){
        this.panjang = pj;
    }
    
    public void setLebar(int lb){
        this.lebar = lb;
    }
    
    public void setTinggi(int tg){
        this.tinggi = tg;
    }
    
    public int getPanjang(){
        return this.panjang;
    }
    public int getLebar(){
        return this.lebar;
    }
    public int getTinggi(){
        return this.tinggi;
    }
}
