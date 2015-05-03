import java.util.Random;
import java.util.TreeSet;
public class Demo{
    public static void main(String[] args){
        TreeSet<Integer> map = new TreeSet<Integer>();
        while(true){
            if(map.size()!=10){
                map.add(new Random().nextInt(100));
            }else{
                break;
            }
        }
        System.out.println(map);
         
    }
}
