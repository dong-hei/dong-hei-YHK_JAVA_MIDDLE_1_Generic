package collection.generic.ex3;

import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();
//        AnimalHospitalV3<Integer> integer = new AnimalHospitalV3(); // Animal의 자식이거나 Animal로 한정지어서 컴파일 오류
        Dog dog = new Dog("멍무이", 100);
        Cat cat = new Cat("냥냥이", 140);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        //문제 : 개 병원에 고양이 전달하는 문제 해결
//        dogHospital.set(cat); // 다른 타입을 전달하면 컴파일 오류

        //문제 2 : 개 타입을 반환
        dogHospital.set(dog);
//        dogHospital.set(cat); // 여기서 Cat이 더 커서 Cat을 반환해야하는데 Cat을 반환 못하니까 캐스팅 에러 발생
        Dog bigger = dogHospital.bigger(new Dog("리트리버", 130));
        System.out.println("bigger = " + bigger);
    }
}
