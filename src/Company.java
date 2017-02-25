import java.util.ArrayList;

public class Company {

    private ArrayList<Customer> customersList;
    private ArrayList<Order> ordersList;
    private ArrayList<Book> booksList;
    private ArrayList<Device> DevicesList;

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }
    public ArrayList<Order> getOrdersList() {
        return ordersList;
    }                           //getters
    public ArrayList<Book> getBooksList() {
        return booksList;
    }
    public ArrayList<Device> getDevicesList() {
        return DevicesList;
    }

    public void setCustomersList(ArrayList<Customer> customersList) {
        this.customersList = customersList;
    }
    public void setOrdersList(ArrayList<Order> ordersList) {
        this.ordersList = ordersList;
    }
    public void setBooksList(ArrayList<Book> booksList) {this.booksList = booksList; }                         //setters
    public void setDevicesList(ArrayList<Device> devicesList) {
        DevicesList = devicesList;
    }

    public ArrayList<Order> unShippedOrders(){
        ArrayList<Order> unShippedOrders = new ArrayList<>();
        for (int i = 0; i < ordersList.size();i++) {                      //if variable shipped in Order class is false
            if(!ordersList.get(i).isShipped()){                         //that we add this object to unShippedOrders value and
                unShippedOrders.add(ordersList.get(i));                  //return this value
            }
        }
        return unShippedOrders;
    }

    public double totalBookSales(){                                        // To variable salesMoney add price of each book
        double salesMoney = 0;                                              //and return this variable
        for (Book books : booksList) {
            salesMoney+=books.price;
        }
        return salesMoney;
    }

    public ArrayList<Order> customerOrder(int id){                          //if variable id(in method's signature) equals
        ArrayList<Order> ordersFromOneCustomer = new ArrayList<>();         //to the id of order's customer, that we add this order
        for (Order order : ordersList) {                                    //to ordersFromOneCustomer and in the end we will have
            if(order.getClient().getId() == id){                            // list of orders per customer
                ordersFromOneCustomer.add(order);
            }
        }
        return ordersFromOneCustomer;
    }

    public ArrayList<Customer> moreBooks(){
        ArrayList<Customer> customerMoreBooks = new ArrayList<>();      //scroll through the list of customer's orders and order's
        double bookPrice = 0, devicePrice = 0;                          //price(using completed methods customerOrder)
        for (Customer customer : customersList) {                       //and add to variable bookPrice price for books
            for (Order order: customerOrder(customer.getId())) {        //to variable devicePrice - price for device
                for (Item item : order.getItems()) {
                    if(item instanceof Book){
                        bookPrice += item.price;
                    }else if(item instanceof Device){
                        devicePrice += item.price;
                    }

                }
            }
            if(bookPrice != 0 && devicePrice !=0 && bookPrice > devicePrice){
                customerMoreBooks.add(customer);
            }
            bookPrice = 0;
            devicePrice = 0;
        }


        return customerMoreBooks;
    }

    public String highest(){                                        //scroll through the list of customer's orders and order's
        double maxSale = 0;                                         //price and assign price to the variable midleSale
        double midleSale = 0;                                       //compare midleSale and maxSale and if midleSale biger
        Customer highestBought = new Customer();                    // than maxSale, than assign maxSale value of midleSale
        for (Customer customer : customersList) {                   //and do this operation every time, when this condition is true
            for (Order order : customerOrder(customer.getId())) {
                midleSale += order.total(order.getItems());
            }
            if(midleSale > maxSale){
                maxSale = midleSale;
                highestBought.setName(customer.getName());
            }else{
                highestBought.setName(customersList.get(0).getName());      //if customer sale equals 0, than return
            }                                                               //name of first customer(you can write here
        }                                                                   // different text
        return highestBought.getName() ;
    }




}
