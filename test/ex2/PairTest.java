package collection.generic.test.ex2;

public class PairTest {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>();
        pair.setFirst(1);
        pair.setSecond("Data1");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println("pair = " + pair);

        Pair<String, String> pair2 = new Pair<>();
        pair2.setFirst("k");
        pair2.setSecond("v");
        System.out.println(pair2.getFirst());
        System.out.println(pair2.getSecond());
        System.out.println("pair2 = " + pair2);
    }
}
