package MVC;

import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PView extends JFrame{
    JLabel lidi,lnama,lalamat,lnoHp,lposisi,lgajiPokok,llembur,ltunjangan,lpajak,ltotalGaji;
    JTextField txid,txnama,txalamat,txnoHp,txgajiPokok,txsimpan,txlembur,txtunjangan,txpajak,txtotalGaji;
    JButton home,gaji,simpan,data,petunjuk,exit,hitung;
    JTable tabel;
    JComboBox posisi;
    
    public PView(){
        lidi = new JLabel("Id Pegawai");
        lnama = new JLabel("Nama");  
        lalamat = new JLabel("Alamat");
        lnoHp = new JLabel("No Hp");
        lposisi = new JLabel("Posisi");  
        lgajiPokok = new JLabel("Gaji Pokok");
        llembur = new JLabel("Lembur");
        ltunjangan = new JLabel("Tunjangan");
        lpajak = new JLabel("Pajak");
        ltotalGaji = new JLabel("Total Gaji");
        
        String pilihan[] = {" ", "Direktur", "Manager", "Programmer", "Marketing", "Surveyor"};
        posisi = new JComboBox(pilihan);
        
        //atur textfield
        txid = new JTextField("");
        txnama = new JTextField("");
        txalamat = new JTextField("");
        txnoHp = new JTextField("");
        txgajiPokok = new JTextField("");
        txlembur= new JTextField("");
        txtunjangan = new JTextField("");
        txpajak = new JTextField("");
        txtotalGaji = new JTextField("");
        txsimpan = new JTextField("");
        //atur tombol
        home = new JButton("Home");
        gaji = new JButton("Gaji");
        simpan = new JButton("Simpan");
        data = new JButton("Data");
        petunjuk = new JButton("Petunjuk");
        exit = new JButton("Exit");
        hitung = new JButton("Hitung");
        
        setLayout(null);
        add(lidi);
        add(lnama);
        add(lalamat);
        add(lnoHp);
        add(lposisi);
        add(lgajiPokok);
        add(llembur);
        add(ltunjangan);
        add(lpajak);
        add(ltotalGaji);
        add(txid);
        add(txnama);
        add(txalamat);
        add(txnoHp);
        add(txgajiPokok);
        add(txlembur);
        add(txtunjangan);
        add(txpajak);
        add(txtotalGaji);
        add(posisi);
        add(txsimpan);
        add(home);
        add(gaji);
        add(data);
        add(petunjuk);
        add(exit);
        add(simpan);
        add(hitung);
       
        lidi.setBounds(230, 50, 70, 20);
        txid.setBounds(320, 50, 240, 20);
        exit.setBounds(650, 50, 80, 40);
        lnama.setBounds(230, 80, 70, 20);
        txnama.setBounds(320, 80, 240, 20);
        lposisi.setBounds(230, 110, 70, 20);
        posisi.setBounds(320, 110, 100, 20);
        lalamat.setBounds(230, 140, 100, 20);
        txalamat.setBounds(320, 140, 300, 20);
        lnoHp.setBounds(230, 170, 70, 20);
        txnoHp.setBounds(320, 170, 150, 20);
        lgajiPokok.setBounds(230, 200, 150, 20);
        txgajiPokok.setBounds(320, 200, 150, 20);        
        llembur.setBounds(230, 230, 150, 20);        
        txlembur.setBounds(320, 230, 150, 20);        
        ltunjangan.setBounds(230, 260, 150, 20);        
        txtunjangan.setBounds(320, 260, 150, 20);        
        lpajak.setBounds(230, 290, 150, 20);        
        txpajak.setBounds(320, 290, 150, 20);        
        ltotalGaji.setBounds(230, 320, 150, 20);        
        txtotalGaji.setBounds(320, 320, 150, 20);     
        hitung.setBounds(650, 310, 80, 40);
        simpan.setBounds(650, 360, 80, 40);
        home.setBounds(50, 50, 100, 30);
        gaji.setBounds(50, 90, 100, 30);
        data.setBounds(50, 130, 100, 30);
        petunjuk.setBounds(50, 170, 100, 30);
        
        
        setSize(800,600); //atur luas jendela
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
       public String getId(){
        return txid.getText();
    }
    
    public String getNama(){
        return txnama.getText();
    }
    
    public String getAlamat(){
        return txalamat.getText();
    }
    
    public String getNohp(){
        return txnoHp.getText();
    }

    public String getPosisi(){
        return posisi.getSelectedItem().toString();
    }
    
    public String getGajipokok(){
        return txgajiPokok.getText();
    }
    
    public String getLembur(){
        return txlembur.getText();
    }
    public String getTunjangan(){
        return txtunjangan.getText();
    }
    public String getPajak(){
        return txpajak.getText();
    }
    public String getTotalgaji(){
        return txtotalGaji.getText();
    }
}
