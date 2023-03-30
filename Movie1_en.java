public class Movie1_en {
 private  int duration;
 private  String name;
 private  String genre;
 private  double ratings;

// setters
 public void setduration(int newduration){
    duration= newduration;
 }
 public void setname(String newname){
    name= newname;
 }
 public void setgenre(String newgenre){
    genre= newgenre;
 }
 public void setratings(double newrating){
    ratings= newrating;
 }
//getters
public String getname(){
    return name;
}
public int getduration(){
    return duration;
}
public double getratings(){
    return ratings;
}
public String getgenre(){
 return genre;
}


public static void main(String args[]){

    Movie1_en avngers1= new Movie1_en();

    avngers1.setduration(100);
    avngers1.setname("avengers ultraa");
    avngers1.setgenre("action");
    avngers1.setratings(5.0);


    System.out.println(avngers1.getname()+ " " + avngers1.getduration() +" "+ avngers1.getgenre()+" "+avngers1.getratings());
}
}