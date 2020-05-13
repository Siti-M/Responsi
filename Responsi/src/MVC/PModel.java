
package MVC;

/**
 *
 * @author HP
 */
public class PModel {
    
    private String id,nama,noHp,posisi,alamat,gajiPokok,lembur, tunjangan,pajak,totalGaji;
    //contructor
    public void setMhsModel(String jid, String nnama, String ealamat, String gnoHp, String sposisi, String rgajiPokok, String llembur, String ttunjangan, String ppajak, String ttotalGaji){
        this.id = jid;
        this.nama= nnama;
        this.alamat= ealamat;
        this.noHp= gnoHp;
        this.posisi= sposisi;
        this.gajiPokok= rgajiPokok;
        this.lembur =llembur;
        this.tunjangan = ttunjangan;
        this.pajak =ppajak;
        this.totalGaji=ttotalGaji;
    }
    
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getNohp(){
        return noHp;
    }
    
    public void setNohp(String noHp){
        this.noHp = noHp;
    }
    
    public String getPosisi(){
        return posisi;
    }
    
    public void setPosisi(String posisi){
        this.posisi = posisi;
    }

    public String getGajipokok(){
        return gajiPokok;
    }
    
    public void setGajipokok(String gajiPokok){
        this.gajiPokok = gajiPokok;
    }
    
    public String getLembur(){
        return lembur;
    }
    
    public void setLembur(String lembur){
        this.lembur = lembur;
    }
    
    public String getTunjangan(){
        return tunjangan;
    }
    
    public void setTunjangan(String tunjangan){
        this.tunjangan = tunjangan;
    }
    
    public String getPajak(){
        return pajak;
    }
    
    public void setPajak(String pajak){
        this.pajak = pajak;
    }
    
    public String getTotalgaji(){
        return totalGaji;
    }
    
    public void setTotalgaji(String totalGaji){
        this.totalGaji =totalGaji;
    }
}