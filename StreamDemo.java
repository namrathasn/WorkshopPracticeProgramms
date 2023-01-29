import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(2);
        list.add(3);
        List<Integer> collect=list.stream().collect(Collectors.toList());
        System.out.println(collect);
        List<Boolean> map=list.stream().map(x->x*2==0).collect(Collectors.toList());
        System.out.println(map);
        List<Integer> filter=list.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(filter);

        List<Student>myList=new ArrayList<>();
        myList.add(new Student(1000,"Marble white"));
        myList.add(new Student(800,"Marble green"));

        List<Student> collects=myList.stream().filter(x->x.getId()==1000).collect(Collectors.toList());
        System.out.println(collects);




    }

}
