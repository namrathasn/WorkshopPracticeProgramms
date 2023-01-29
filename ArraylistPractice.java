//comparrable and comparator
package sortPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(40,"namratha"));
        list.add(new Student(10,"Anup"));
        list.add(new Student(20,"viju"));
        System.out.println(list);
        //comparrable-single logic sorting
//        Collections.sort(list);
        Collections.sort(list,new IdComparator());
        System.out.println(list);

        List<Student>list1=new ArrayList<>(list);
        Collections.sort(list1,new NameComparator());
        System.out.println(list1);





    }
}
