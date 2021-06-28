package cn.tedu.pojo;

public class UserInfo {
    private int id;
    private String userName;
    private String userAddr;
    private int userAge;

    public UserInfo() {
    }

    public UserInfo(int id, String userName, String userAddr, int userAge) {
        this.id = id;
        this.userName = userName;
        this.userAddr = userAddr;
        this.userAge = userAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddr() {
        return userAddr;
    }

    public void setUserAddr(String userAddr) {
        this.userAddr = userAddr;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", userNanme='" + userName + '\'' +
                ", userAddr='" + userAddr + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
