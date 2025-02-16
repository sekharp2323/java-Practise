import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C9 {
    public static void main(String[] args) {
        int[] arr={12,35,1,10,34,2};
        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            } else if (num>second && num!=first)  {
                second=num;
            }
        }
        List<Integer> list= IntStream.of(arr).boxed()
                        .collect(Collectors.toList());
        List<Integer> sortedlist=list.stream()
                        .sorted(Collections.reverseOrder())
                                .collect(Collectors.toList());
        sortedlist.forEach(num->System.out.println("num: " + num));
        System.out.println("Second :"+second);
    }
}
