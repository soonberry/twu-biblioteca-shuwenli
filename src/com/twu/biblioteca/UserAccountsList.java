package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by shuwenli on 15-3-3.
 */
public class UserAccountsList {
    List<UserAccount> userAccountList;

    public UserAccountsList() {
        this.userAccountList = new ArrayList<UserAccount>();
        UserAccount user1=new UserAccount("111-1111","111","1","1@1","11111111","Librarian");
        UserAccount user2=new UserAccount("222-2222","222","2","2@2","22222222","Customer");

        this.userAccountList.add(user1);
        this.userAccountList.add(user2);
    }

    public boolean checkLogin(String number, String password) {
        boolean match=false;
        if(isCorrectVersion(number)){
            Iterator<UserAccount> iterator=userAccountList.iterator();
            while (iterator.hasNext()){
                if (iterator.next().isMatch(number,password)) {
                    match = true;
                    break;
                }
            }
        }

        return match;
    }

    public boolean isCorrectVersion(String number) {
        String regEx="\\d{3}-\\d{4}";
        Pattern pattern=Pattern.compile(regEx);
        Matcher matcher=pattern.matcher(number);
        return matcher.matches();
    }

    public UserAccount getUserAccount(String number,String password) {
        Iterator<UserAccount> iterator=userAccountList.iterator();
        while (iterator.hasNext()){
            UserAccount userAccount=iterator.next();
            if (userAccount.isMatch(number,password))
                return userAccount;
        }
        return null;
    }
}
