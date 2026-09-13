import java.util.*;

public class shortestpath {


    public static float getDirection(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }else if(dir == 'E'){
                x++;
            }else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }
/*
Question: How do direction moves translate into net displacement and shortest path distance?
Example: "WNEENESENNN" -> compute the final straight-line distance from origin.
*/
public static void main(String[] args) {
    String str = "WNEENES";
    float shortpath =getDirection(str);
    System.out.println(shortpath);

}

}