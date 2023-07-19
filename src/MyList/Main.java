package MyList;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        System.out.println("List of : " + (list.isEmpty() ? "Empty" : "Full"));
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println("Index : " + list.indexOf(20));
        System.out.println("Index : " + list.indexOf(100));
        System.out.println("Index : " + list.lastIndexOf(20));
        Object[] array = list.toArray();
        System.out.println("Object array's first element : " + array[0]);
        MyList<Integer> subList = list.subList(0, 3);
        System.out.println(subList.toString());
        System.out.println("Value 20 in the list : " + list.contains(20));
        System.out.println("Value 120 in the list : " + list.contains(120));
        list.clear();
        System.out.print("List emptied : ");
        System.out.println(list.toString());
    }
}
