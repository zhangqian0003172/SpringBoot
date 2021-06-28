package cn.tedu.pojo;

public class Dept {
    private int id;
    private String dname;
    private String loc;

    public Dept() {
    }

    public Dept(int id, String name, String loc) {
        this.id = id;
        this.dname = name;
        this.loc = loc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
