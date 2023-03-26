import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to collection framework");
        ArrayList<String> names=new ArrayList<String>();
        names.add("Dharmendra Tiwari");
        names.add("Krishna");
        names.add("Naveen");
        names.add("Roshini");
        names.add("rahul");
        names.remove("Krishna");
        System.out.println(names);
        System.out.println(names.get(1));
        System.out.println("Size = "+names.size());
        System.out.println(names.contains("Durgesh"));

        for(String str:names){
            System.out.println(str+"\t"+str.length());
        }
        System.out.println("____________________________");

        Vector<String> vec=new Vector<String>();
        vec.addAll(names);
        System.out.println(vec);

        System.out.println("_____________________________");

        LinkedList list=new LinkedList();
        list.add("Dharmendar");
        list.add(03);
        list.add(81.02);
        list.add(true);
        System.out.println(list);
        System.out.println("______________________________");

        HashSet<Double> hst=new HashSet<>();
        hst.add(14.14);
        hst.add(23.088676);
        hst.add(534562.9732);
        hst.add(99.3);
        hst.add(99.0);
        System.out.println(hst);
        System.out.println("______________________________");

        TreeSet<Double> tst=new TreeSet<>();
        tst.addAll(hst);
        System.out.println(tst);
    }
}