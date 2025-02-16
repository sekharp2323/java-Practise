import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        List<Integer> list= IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        //list.forEach(num->System.out.println("num: " + num));
        List<Integer> reversedList=list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
        reversedList.forEach(num->System.out.println("num: " + num));
    }
}
