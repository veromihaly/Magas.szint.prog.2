import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class Hero {
    private String name;
    private int age;
    private Character gender;
    private ArrayList<String> Skills;

    public Hero(String name, int age, Character gender, ArrayList<String> skills) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        Skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public ArrayList<String> getSkills() {
        return Skills;
    }

    public void setSkills(ArrayList<String> skills) {
        Skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age && name.equals(hero.name) && gender.equals(hero.gender) && Skills.equals(hero.Skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, Skills);
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Skills=" + Skills +
                '}';
    }
}

class SortybyAge implements Comparator<Hero> {


    @Override
    public int compare(Hero o1, Hero o2) { return o1.getAge() - o2.getAge(); }
}

class Sortbyname implements Comparator<Hero>{

    @Override
    public int compare(Hero o1, Hero o2) { return o1.getName().compareTo(o2.getName());}
}

class Monk extends Hero{

    private String subclass;

    private int kipoints;

    public Monk(String name, int age, Character gender, ArrayList<String> skills, String subclass, int kipoints){
        super(name, age, gender, skills);
        this.subclass = subclass;
        this.kipoints = kipoints;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public int getKipoints() {
        return kipoints;
    }

    public void setKipoints(int kipoints) {
        this.kipoints = kipoints;
    }

    @Override
    public String toString() {
        return "Monk{" +
                "subclass='" + subclass + '\'' +
                ", kipoints=" + kipoints +
                ",  name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", Skills=" + super.getSkills() +
                '}';
    }
}
class Fighter extends Hero{

    private String subclass;

    private int extraattack;

    public Fighter(String name, int age, Character gender, ArrayList<String> skills, String subclass, int extraattack){
        super(name, age, gender, skills);
        this.subclass = subclass;
        this.extraattack = extraattack;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public int getExtraattack() {
        return extraattack;
    }

    public void setExtraattack(int extraattack) {
        this.extraattack = extraattack;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "subclass='" + subclass + '\'' +
                ", extraattack=" + extraattack +
                ",  name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", Skills=" + super.getSkills() +
                '}';
    }
}
class Angel extends Hero{

    private String subclass;

    private int divine;

    public Angel(String name, int age, Character gender, ArrayList<String> skills, String subclass, int divine){
        super(name, age, gender, skills);
        this.subclass = subclass;
        this.divine = divine;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public int getDivine() {
        return divine;
    }

    public void setDivine(int divine) {
        this.divine = divine;
    }

    @Override
    public String toString() {
        return "Angel{" +
                "subclass='" + subclass + '\'' +
                ", divine points=" + divine +
                ",  name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", gender=" + super.getGender() +
                ", Skills=" + super.getSkills() +
                '}';
    }
}