package com.twu.biblioteca;

/**
 * Created by shuwenli on 15-3-3.
 */
public class UserAccount {
    String number;
    String password;
    String name;
    String email;
    String phone;
    enum Privilege {Librarian,Customer};
    Privilege privilege;

    public UserAccount(String number, String password, String name, String email, String phone,String pri) {
        this.number = number;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.privilege = Privilege.valueOf(pri);
    }

    @Override
    public String toString(){
        return "name:"+name+"\nemail:"+email+"\nphone:"+phone;
    }

    public String getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPrivilege() {
        return privilege.toString();
    }

    public void setPrivilege(String privilege) {
        this.privilege = Privilege.valueOf(privilege);
    }


    public boolean isMatch(String number, String password) {
        if (getNumber().equals(number)&&getPassword().equals(password))
            return true;
        return false;
    }
}
