package collection.generic.test.ex3.unit;

public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle = new Shuttle<>();
        shuttle.in(new Marine("마린", 42));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 32));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 90));

        UnitPrinter.printV1(shuttle);
        UnitPrinter.printV2(shuttle);
    }
}
