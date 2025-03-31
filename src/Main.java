import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) {
        List<Integer> numere=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<15;i++){
            numere.add(random.nextInt(100));
        }
        for(int num:numere){
            System.out.println(num);
        }
        HashSet<String> set=new HashSet<>();
        set.add("TEST1");
        set.add("TEST2");
        for(String element:set){
            System.out.println(element);
        }
    }
}