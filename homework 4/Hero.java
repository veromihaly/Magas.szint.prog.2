import java.util.Comparator;

public class Hero {
    private String Name;
    private int Age;
    private String Nickname;
    private String isGood;

    public Hero(String Name, int Age, String Nickname, String isGood) throws IllegalArgumentException {
        if (Age > 1000 || Age == 0) {
            throw new IllegalArgumentException("Age is not valid");
        }
        this.Name = Name;
        this.Age = Age;
        this.Nickname = Nickname;
        this.isGood = isGood;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getIsGood() {
        return isGood;
    }

    public void setIsGood(String isGood) {
        this.isGood = isGood;
    }

    @Override
    public String toString() {
        if(Nickname == ""){
            this.Nickname = null;
        }
        return "Hero{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Nickname=" + Nickname +
                ", isGood=" + isGood +
                '}';
    }
}
class SortybyAge implements Comparator<Hero> {


    @Override
    public int compare(Hero o1, Hero o2) { return o1.getAge() - o2.getAge(); }
}

class SortbyName implements Comparator<Hero>{

    @Override
    public int compare(Hero o1, Hero o2) { return o1.getName().compareTo(o2.getName());}
}

class Tank extends Hero {
    private int shield;

    public Tank(String Name, int Age, String Nickname,String isGood, int shield){
        super(Name, Age, Nickname, isGood);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    @Override
    public String toString() {
        return "Tank{" +
                ", shield=" + shield +
                ",  name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", Nickname=" + super.getNickname() +
                ", isGood=" + super.getIsGood() +
                '}';
    }
}

class Support extends Hero {
    private int healing;

    public Support(String Name, int Age, String Nickname,String isGood, int healing){
        super(Name, Age, Nickname, isGood);
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }

    @Override
    public String toString() {
        return "Warlock{" +
                ", healing=" + healing +
                ",  name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", Nickname=" + super.getNickname() +
                ", isGood=" + super.getIsGood() +
                '}';
    }
}

class Dps extends Hero {
    private int dps;

    public Dps(String Name, int Age, String Nickname,String isGood, int dps){
        super(Name, Age, Nickname, isGood);
        this.dps = dps;
    }

    public int getDps() {
        return dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    @Override
    public String toString() {
        return "Hexblade{" +
                ", dps=" + dps +
                ",  name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", Nickname=" + super.getNickname() +
                ", isGood=" + super.getIsGood() +
                '}';
    }
}


