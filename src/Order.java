import java.util.ArrayList;

public class Order {

    private int no;
    private Customer client;
    private ArrayList<Item> items;
    private boolean shipped;

    public void setNo(int no) {this.no = no;}
    public void setClient(Customer client) {
        this.client = client;
    }
    public void setShipped(boolean shipped) {
        this.shipped = shipped;
    }
    public void setItems(ArrayList<Item> items) {this.items = items;}

    public int getNo() {
        return no;
    }
    public Customer getClient() {
        return client;
    }
    public boolean isShipped() {
        return shipped;
    }
    public ArrayList<Item> getItems() {return items;}

    public double total(ArrayList<Item> items){         //each element from ArrayList in method's signature
        double allPrice = 0;                            //add to previous element and return the amount of item's price
        for (int i = 0; i < items.size(); i++) {
            allPrice+= items.get(i).price;

        }
        return allPrice;
    }


    public Order(int no, Customer client, ArrayList<Item> items, boolean shipped){
        this.no = no;
        this.client = client;
        this.items = items;
        this.shipped = shipped;
    }



}
