import arefsa.util.HashMapCustom;


public class Q4 {
    public static void showQ4() {
        HashMapCustom<Integer,String> myHashMap = new HashMapCustom<>();
        myHashMap.put(1,"Aref");
        myHashMap.put(2,"Ali");
        myHashMap.put(3,"Taha");
        myHashMap.put(3,"Saber");


        //check for contain a specific key
        System.out.println(myHashMap.contain(3));

        //check for isEmpty myHashMap or not
        System.out.println(myHashMap.isEmpty());

        myHashMap.printAll();

        myHashMap.replace(3,"Mohsen");

        myHashMap.printAll();

    }
}
