package collection.generic.ex3;

import collection.generic.animal.Cat;
import collection.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();
        Dog dog = new Dog("멍무이", 100);
        Cat cat = new Cat("냥냥이", 140);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        //문제 : 개 병원에 고양이 전달 -> 가능
        dogHospital.set(cat); // 매개변수 체크 실패 : 컴파일 오류 없어짐

        //문제 2 : 개 타입을 반환
        dogHospital.set(dog);
//        dogHospital.set(cat); // 여기서 Cat이 더 커서 Cat을 반환해야하는데 Cat을 반환 못하니까 캐스팅 에러 발생
        Dog bigger = (Dog) dogHospital.bigger(new Dog("리트리버", 130));
        System.out.println("bigger = " + bigger);
    }
}
