import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> a = new ArrayList<String>();
  RandomStringChooser(String[]b){
    for(int i = 0; i < b.length;i++){a.add(b[i]);}
  }
  
  public String getNext(){
     int th = (int)(Math.random()*a.size()); 
     String temp;
    if(a.size() > 0){
      temp = a.get(th);
      a.remove(th);
      return(temp);
  } else{return("NONE");}
}
  public void addTo(String c){a.add(c);}
}
