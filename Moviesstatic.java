import java.util.*;
import java.io.*;
public class Moviesstatic {
    String name;
    int duration;

    static String Language = "hindi";
Moviesstatic(){

}
Moviesstatic(String name,int duration){
    this.name = name;
    this.duration= duration;
}
    

public static void main(String args[]){
    Moviesstatic avg = new Moviesstatic("koi mil gya",6);
    System.out.print( Moviesstatic.Language);   // call static keyword with class name
    
}
}