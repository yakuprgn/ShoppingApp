/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package girisekrani;

/**
 *
 * @author yakup
 */
public class ContactInfo {
    private String adress;
    private String cellp_no;

    public ContactInfo(String adress, String cellp_no) {
        this.adress = adress;
        this.cellp_no = cellp_no;
    }
    
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCellp_no() {
        return cellp_no;
    }

    public void setCellp_no(String cellp_no) {
        this.cellp_no = cellp_no;
    }
    
    
}
