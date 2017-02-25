public class Device extends Item{

    private String type;
    private String name;



    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public Device(int code, double price, String type, String name){
        this.code = code;
        this.price = price;
        this.type = type;
        this.name = name;
    }



}
