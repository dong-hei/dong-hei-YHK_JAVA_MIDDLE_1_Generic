package collection.generic.ex3;

import collection.generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal) {
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 사이즈 = " + animal.getSize());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
