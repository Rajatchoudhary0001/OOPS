 interface itheater{
   String industry=" bolywoood"; // final public   final variables does not change
    String bookshow();  // public abstract
   
    void viewshow();
 }
 class Theater implements itheater{
          
    String name; 

    public void viewshow(){
        System.out.println("book show");
    }
    public String bookshow(){
        System.out.println(" view show");
        return "tickets";
    }
 }
 
 
 class driver {
    public static void main(String[] args){
        Theater pvr = new Theater();
        pvr.name=" hind cinema";

        pvr.bookshow();


        Theater pvr2 =new Theater();
        pvr2.name ="kessel mall";

        pvr.viewshow();
    }
    
}
