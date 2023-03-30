public class Movies {
    int duration;
    String name;
    double ratings;
    String genre;
    

public static void main(String args[]){
    Movies avenger1 = new Movies();  

    avenger1.duration = 120;
    avenger1.name = "Avenger loki";
    avenger1.ratings = 3.0;
    avenger1.genre ="action";

    System.out.println(avenger1.name +" "+avenger1.ratings);
}
}