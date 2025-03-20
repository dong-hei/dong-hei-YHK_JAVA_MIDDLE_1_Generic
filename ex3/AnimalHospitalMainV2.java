package collection.generic.ex3;

import collection.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Dog> catHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Integer> integer = new AnimalHospitalV2();
        AnimalHospitalV2<Object> object = new AnimalHospitalV2();
    }
}
