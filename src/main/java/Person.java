@Component
public class Person (){
   
   // name of the person
   private String name;
   
   @Autowired
   private Address address;
   
   // getter for name
   public String getName(){
       return this.name;
   }
   
   // setter for name
   public void setName(String name){
       this.name = name;
   } 
   
   // setter for address
   public void setAddress(Address address){
	   this.address = address;
   }
	
   private String prop2;
}
