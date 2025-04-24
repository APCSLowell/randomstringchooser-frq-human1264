import java.util.*;
public class RandomStringChooser
{
  private ArrayList<String> a = new ArrayList<String>();
  RandomStringChooser(String[]b){
    for(int i = 0; i < b.length;i++){a.add(b[i]);}
  }
  
  public String getNext(){
    private int th = (int)(Math.random()*a.size()); private String temp;
    if(a.size() > 0){
    return(a.remove(th););
  } else{return("none");}
}
  public void addTo(String c){a.add(c);}
}
