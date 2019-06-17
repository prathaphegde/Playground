
public class Main {
public static void main(String[] args) {
//write the logic for the main function
Customers obj1 = new Customers(1001,"Saakshi",9000000000l,"Bangalore","16-jul-1990",'F',"Lakme kajal,Salawar");
Customers obj2 = new Customers(1008,"Rahul",9000000001l,"Chennai","27-jan-1992",'M',"T-shirt,Jeans") ;
Suppliers sobj1 = new Suppliers(7901,"ABC Traders",8000000000l,"Mumbai",10,"paid",4.75F ) ;
Suppliers sobj2 = new Suppliers(7972,"XYZ Enterprises",8000000900l,"kolkata",7,"unpaid",4.35F);


 
obj1.display();
obj2.display();
sobj1.display();
sobj2.display();
//edit method
obj1.editAddress("Coimbatore");
sobj1.editAddress("Delhi");
//placeorder

obj1.placeOrder();

//increaseStocklevel
sobj1.increaseStockLevel(15);
sobj2.increaseStockLevel(17);
}

}

class Users {
//write the logic for the class Users 
public int id;
public String name;
public long mobileNumber;
public String shippingAddress;
public String dateOfBirth;
public char gender;
public String orderHistory;
}

class Customers extends Users{
//write the logic for the class Customers
public String newAdrs;
public Customers(int id,String name,long mobileNumber,String shippingAddress,String dateOfBirth,char gender,String orderHistory)
{
this.id = id;
this.name = name;
this.mobileNumber = mobileNumber;
this.shippingAddress = shippingAddress;
this.dateOfBirth = dateOfBirth;
this.gender = gender;
this.orderHistory = orderHistory;
}
public void editAddress(String newAdrs)
{
  this. newAdrs = newAdrs;
  System.out.println(name+","+" "+shippingAddress);
  System.out.println(name+","+" "+newAdrs);
}
public void placeOrder()
{
System.out.println("Order placed successfully!");
}
public void display()
{
System.out.println(name+","+" "+mobileNumber);
}
}


class Suppliers extends Users {
//write the logic for the class Suppliers
  public String newAdrs;
public String billingAddress;
public int itemStock;
public String paymentStatus;
public float feedbackRating;
public Suppliers(int id,String name,long mobileNumber,String billingAddress,int itemStock,String paymnetStatus,float feedbackRating)
{
this.id = id;
this.name = name;
this.mobileNumber = mobileNumber;
this.billingAddress = billingAddress;
this.itemStock = itemStock;
this.paymentStatus = paymentStatus;
this.feedbackRating = feedbackRating;
}
public void display()
{
System.out.println(name+","+" "+mobileNumber);
}
public void increaseStockLevel(int itemStock)
{
System.out.println(name+","+" "+itemStock);
}
  public void editAddress(String newAdrs)
{
   this.newAdrs = newAdrs;
  System.out.println(name+","+" "+billingAddress);
   System.out.println(name+","+" "+newAdrs);
}
}
  








