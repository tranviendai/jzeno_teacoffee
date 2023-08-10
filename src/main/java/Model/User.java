
package Model;

import java.sql.Date;
import java.sql.Timestamp;

public class User {
    private String id;
    private String name;
    private Date dob;
    private String gender;
    private String mobile;
    private String passWord;
    private Timestamp addDate;
    private boolean role;
    
    public User(){}
    public User(String id, String name, Date dob, String gender, String mobile, String passWord, Timestamp addDate, boolean role) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mobile = mobile;
        this.passWord = passWord;
        this.addDate = addDate;
        this.role = role;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassWord() {
        return this.passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Timestamp getAddDate() {
        return this.addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public boolean isRole() {
        return this.role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
    
}
