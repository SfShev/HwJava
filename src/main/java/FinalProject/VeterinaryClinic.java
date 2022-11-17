package FinalProject;

import java.util.HashSet;
import java.util.Set;

public class VeterinaryClinic {
    public static void main(String[] args) {
        Cat bonya = new Cat(001, "Боня", "британец", 1, "серый", "Анна", "прививка");
        Cat bony = new Cat(001, "Боня", "британец", 1, "серый", "Анна", "прививка");
        Cat kokos = new Cat(002, "Кокос", "Сиамская", 3, "рыжий", "Валерий", "кострация");
        Cat musya = new Cat(003, "Муся", "шотландец", 7, "голубой", "Виктория", "сломана лапа");

//        System.out.println(bonya.toString());

        Set<Cat> catSet = new HashSet<>();

        catSet.add(bonya);
        catSet.add(bony);
        catSet.add(kokos);
        catSet.add(musya);


        System.out.println(catSet.toString());
//        System.out.println(kokos.hashCode());


    }
}

class Cat {
    private int age;
    private int id;
    private String nickname;
    private String breed;
    private String color;
    private String owner;
    private String lastvisit;


    public Cat(int id, String nickname, String breed, int age, String color, String owner, String lastvisit) {
        this.id = id;
        this.nickname = nickname;
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.owner = owner;
        this.lastvisit = lastvisit;
    }

    @Override
    public String toString() {
        return String.format("\nid-%d, кличка-%s, возраст-%d, цвет-%s, последная запись-%s", id, nickname, age, color, lastvisit);
    }

    @Override
    public boolean equals(Object obj) {
        Cat compareСat = (Cat) obj;
        return id == compareСat.id && owner == compareСat.owner && nickname == compareСat.nickname &&
                breed == compareСat.breed && age == compareСat.age && color == compareСat.color && lastvisit == compareСat.lastvisit;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
