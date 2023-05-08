/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;
import java.io.Serializable;
/**
 *
 * @author RKM
 */
public class Registeration implements Serializable {
    private String name;
    private String idnumber;
    private int phoneno;
    private String email;
    private String gender;
    private String address;
    private String position;

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }
}
