package collection.generic.ex3;

import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Dog dog = new Dog("멍무이", 100);
        Cat cat = new Cat("냥냥이", 110);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        //문제 : 개 병원에 고양이 전달 -> 불가능, 타입 안정성이 높다.
//        dogHospital.set(cat);

        //문제 2 : 개 타입을 반환
        dogHospital.set(dog);
        Dog bigger = dogHospital.bigger(new Dog("리트리버", 130));
        System.out.println("bigger = " + bigger);
    }
}
