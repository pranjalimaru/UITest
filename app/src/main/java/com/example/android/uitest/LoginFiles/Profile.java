package com.example.android.uitest.LoginFiles;


public class Profile {

    public String userEmail;
    public String userName;
    public String userNo;
    public float value;
    public String msg;

    public Profile(){}

    public Profile(String userEmail,String userName,String userNo)
    {

        this.userEmail = userEmail;
        this.userName = userName;
        this.userNo = userNo;
    }
    public Profile(String userEmail,String userName, String userNo, float value, String msg)
    {

        this.userName = userName;
        this.userEmail = userEmail;
        this.userNo = userNo;
        this.value = value;
        this.msg = msg;
    }




    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }



    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}
