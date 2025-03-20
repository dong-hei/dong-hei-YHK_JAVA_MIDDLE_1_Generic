package collection.generic.ex3;


public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkUp(){
        animal.toString();
        animal.equals(null);

        //T의 타입 메소드를 정의하는 시점에는 알수 없다. Object의 기능만 사용
//        System.out.println("동물 이름 = " + animal.getName());
//        System.out.println("동물 사이즈 = " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
        return null;
//        return animal.getSize() > target.getSize() ? animal : target;
    }

}
