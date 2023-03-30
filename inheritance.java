class User{
    String name;
    String location;

    public User(String name, String location){
        this.name=name;
        this.location=location;
    }public User(){
         this.name="anonymus";
         this.location="unknown";
    }
             //////////////////////////////

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void viewshow(){
        System.out.print("i can see the listed show");
    }

    @Override 
    public String toString(){
        return "Name  :"+this.name+"   location :"+this.location;
    }

}
class registeredUser extends User{
    String emailid;
    long phoneno;
    public registeredUser(String name, String location, String emailid, long phoneno) {
        super(name,location);
        this.emailid = emailid;
        this.phoneno = phoneno;
    }
    public registeredUser(String emailid, long phoneno) {
        this.emailid = emailid;
        this.phoneno = phoneno;
    }
    public registeredUser(){
        this.emailid="rajatchaudhary@gmail.com";
        this.phoneno=99913098443L;
    
     }
     

    //////////
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public long getPhoneno() {
        return phoneno;
    }
    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }
    

}

public class inheritance {
    public static void main(String[] args){
     User obj1 = new User("raj","canada");
    //  obj1.name="Rajat";
    //  obj1.location="india";
    //  System.out.println(obj1.name+" "+obj1.location);
    //  obj1.viewshow();

     registeredUser obj2 = new registeredUser("paras","australia","paras@gmail.com",9034100566l);

    //  System.out.println(obj2.name+" "+obj2.emailid);
    //  obj2.viewshow();

   
    // Object obj3 = new Object();  // object class
    // class type refernce 
    // Class c1 = obj1.getClass();
    // System.out.print(c1.getName());
            
    // StringBuilder sb = new StringBuilder();
    // Class c2 = sb.getClass();
    // System.out.print(c2.getName());


    System.out.println(obj1);
    System.out.print(obj1.toString());
    }
}
