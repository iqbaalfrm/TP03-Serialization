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
public class limit implements Serializable {
    private transient String id;
    private static String nama;
    private List<EmailConfig> emailConfigs;
    private int dataUsageLimit;
    
     public void setId(String id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEmailConfigs(List<EmailConfig> emailConfigs) {
        this.emailConfigs = emailConfigs;
    }
    
    public void setDataUsageLimit(int dataUsageLimit) {
        this.dataUsageLimit = dataUsageLimit;
    }
    
@Override
public String toString() {
    String result = "Limit:\n";
    result += "ID: " + id + "\n";
    result += "Nama: " + nama + "\n";
    result += "=======================\n";
    result += "Data Usage Limit: " + (dataUsageLimit / 1024) + " GB\n";
    result += "Your Email Configuration:\n"; 
    if (emailConfigs != null) {
        for (EmailConfig emailConfig : emailConfigs) {
            result += emailConfig.toString() + "\n";
        }
    }
    return result;
}

    
}
