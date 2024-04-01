/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serialisasi;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author IQBAL
 */
public class EmailConfig {
    private String emailAddress;
    private String id;
    private String nama;
    private List<EmailConfig> items; // Menambahkan properti untuk menyimpan daftar item

    public EmailConfig(String emailAddress, String id, String nama) {
        this.emailAddress = emailAddress;
        this.id = id;
        this.nama = nama;
    }

    
// Getter and setter methods for emailAddress, id, and nama
    
    public List<EmailConfig> getItems() {
        return items;
    }

    public void setItems(List<EmailConfig> items) {
        this.items = items;
    }

    public void setId(String id) {
    this.id = id;
}
        public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }


    @Override
    public String toString() {
        return "Email: " + emailAddress + ", ID: " + id + ", Nama: " + nama + "\n";
    }
}