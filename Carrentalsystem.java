import java.util.Arraylist;
import java.util.List;
import java.util.Scanner;
class Car{
  private String carid;
 private String brand;
 private String model;
 private double basepriceperday;
private boolean isAvailable;

public Car(String carid,String brand,String model,double basepriceperday)
{
  this.carid=carid;
 this.brand=brand;
this.model=model;
this.basepriceperday=basepriceperday;
this.isAvailable=true;
}
public String getcarid(){
  return carid;
}
public String getbrand(){
  return brand;
}
public String getmodel(){
  return model;
}
public double calculatorprice(int rentaldays){
  return  basepriceperday*rentaldays;
}
public boolean isAvailable(){
  return isAvailable;
}
public void rent(){
isAvailable=true;
}
}
class Customer
{
 private String customerid;
 private String name;

public Customer(String customerid,String name)
{
 this.customerid=customerid;
 this.name=name;
}
 public Sting getcustomerid(){
 return customerid;
}
public String getname(){
  return name;
}
}
class Rental
{
 private Car car;
private Customer customer;
private int days;
public Rental(Car car,Customer customer,int days){
   this.car=car;
  this.customer=customer;
  this.days=days;
}
public Car getcar(){
  return car;
}
public Customer getcustomer(){
  return customer;
}
public int getdays(){
  return days;
}
}
class Carrentalsystem{
     private List<Car>cars;
     private List<Customer>customers;
     private List<Rental>rentals;
  
public Carrentalsystem(){
 cars=new ArrayList<>();
customers=new ArrayList<>();
rentals=new ArrayList<>();
}
public void addCar(Car car){
  cars.add(car);
}
public void addCustomer(Customer customer){
  customers.add(customer);
}
public void rentCar(Car car,Customer customer,int days){
  if(car.isAvailable()){
car.rent();
rentals.add(new Rental(car,customer,days));
}
else{
System.out.println("car is not available for rent");
}
}
public void returnCar(Car car){
car.returnCar();
Rental rentalToRemove=null;
for(Rental rental:rentals){
 if(rental.getCar()==car){
rentalToRemove=rental;
break;
}
}
if(rentalToRemove!=null){
rentals.remove(rentalToRemove);
System.out.println(("car return succefully");
}else{
System.out.println("car was not rented");
}
}
 public void menu(){
 Scanner sc=new Scanner(System.in);
while(true){
 System.out.println("===car rental system===");
 System.out.println("1.rent a car");
System.out.println("2.return a car");
System.out.println("3.exit");
System.out.println("enter your choice");

int choice=Scanner.nextInt();
Scanner.nextInt();

if(choice==1){
 System.out.println("\n===rent a car===\n");
System.out.println("enter your name");
String customername=Scanner.nextLine();
System.out.println("\n Available cars \n");
for(Car car:cars){
if(car.isAvailable()){
System.out.println(car.getCarid()+" - "+car.getbrand()+" "+car.getmodel());
}
}
System.out.println("\n enter the carid that you want to rent \n");
 String carid=scanner.nextLine();
System.out.println("enter the no of days for rent");
int rentaldays=Scanner.nextInt();
Scanner.nextLine();

Customer=new Customer(customer "CUS"+(customer.size()+1),customername);
addCustomer(newCustomer);

Car selectCar=null;
for(Car car:cars)
{
 if(car.getCarid().equals(carid) && car.isAvailable()){
 selectedCar=car;
break;
}
}
if(selectedCar!=null)
{
 double totalprice=selectedCar.calculateprice(rentaldays);
System.out.println("\n==rental information ==\n");
System.out.println("Customer id :"+newCustomer.getCustomerid());
System.out.println("Customer name :"+newCustomer.getname());
System.out.println("Car :"+selectedCar.getbrand()+" "+selectedCar.getmodel());
System.out.println("rental days:"+rentaldays);
System.out.println("total price: $%.2f%n",totalprice);

System.out.println("conform rental(Y/N"):");
String conform=Scanner.nextLine();

if(conform.equalsIgnoreCase(anotherString "Y")){
rentCar(selectedCar,newCustomer,rentaldays);
System.out.println("car rented successfully");
}else{
System.out.println("rental canceled");
}
}else{
System.out.println("\n invalid car selection or car not available for rent \n");
}
}else if(choice==2){
System.out.println("\n return a car \n");
System.out.println("enter the car id that you want to return");
String carid=Scanner.nextLine();

Car carToReturn=null;
for(Car car:cars){
if(car.getCarid().equals(carid)&&!=car.isAvailable()){
carToReturn=car;
break;
}
}













