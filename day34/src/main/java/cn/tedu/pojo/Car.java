package cn.tedu.pojo;
//Car模型
public class Car {
    private Integer id;      //718
    private String name;     //保时捷
    private String type;     //Cayman T
    private String color;       //红色
    private Double price;    //641000

    //constructor
    public Car() {
    }
    public Car(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    //get/set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + "]";
    }
}
