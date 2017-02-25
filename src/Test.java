import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // to create an object of company
        Company c=new Company();
        // to create an array list of device
        Device d1=new Device (123,2000,"Galaxy S7","Mobile");
        Device d2=new Device (124,1500,"Smart LED","TV");
        Device d3=new Device (125,150,"watch xyz","Watch");
        ArrayList devices = new ArrayList<>();
        // to add the device objects to the array list
        Collections.addAll(devices,d1,d2,d3);
        // to set the devices of company
        c.setDevicesList(devices);



        Book b1=new Book(201,1250,"12345","How to program");
        Book b2=new Book(202,2250,"55345","Qatar History");
        Book b3=new Book(203,7525,"245345","Computer ethics");
        ArrayList books=new ArrayList<>();
        Collections.addAll(books,b1,b2,b3);
        c.setBooksList(books);

        Customer c1=new Customer (1,"Ahmed");
        Customer c2=new Customer (2,"Sara");
        Customer c3=new Customer (3,"Nasaer");
        Customer c4=new Customer (4,"Khaled");
        ArrayList customers=new ArrayList<>();
        Collections.addAll(customers,c1,c2,c3,c4);
        c.setCustomersList(customers);

        ArrayList<Item> items1=new ArrayList<>();
        Collections.addAll(items1,d1,d2);
        ArrayList<Item> items2=new ArrayList<>();
        Collections.addAll(items2,b1,b3);
        ArrayList<Item> items3=new ArrayList<>();
        Collections.addAll(items3,d3,b1,b2);
        ArrayList<Item> items4=new ArrayList<>();
        Collections.addAll(items4,d1,d2,d3);
        ArrayList<Item> items5=new ArrayList<>();
        Collections.addAll(items5,d2,d2,b1,b2,b3);

        Order o1=new Order (1,c1,items1,false);
        Order o2=new Order (2,c2,items2,true);
        Order o3=new Order (3,c3,items3,true);
        Order o4=new Order (4,c4,items4,false);
        Order o5=new Order (5,c4,items5,true);

        ArrayList orders=new ArrayList<>();
        Collections.addAll(orders,o1,o2,o3,o4,o5);
        c.setOrdersList(orders);

        // to test unshiped method
        System.out.println("Unshiped orders:");
        for (Order o:c.unShippedOrders()){
            System.out.println(o.getNo());
            System.out.println("----------------------------");}
        // to test totalBookSale
        System.out.println("Total of book sale:");
        System.out.println(c.totalBookSales());

        System.out.println("----------------------------");
        // to test customer order
        System.out.println("The orders of customer no 4");
        for (Order o:c.customerOrder(4)){
        System.out.println(o.getNo());

        System.out.println("----------------------------");}
        //to test moreBook
        System.out.println("Customers who spent money to buy books more than devices");
        for (Customer cust:c.moreBooks()) {
            System.out.println(cust.getName());
        }
        System.out.println("----------------------------");
        //to test highest method
        System.out.println("The best customer :");
        System.out.println(c.highest());
        }

} 