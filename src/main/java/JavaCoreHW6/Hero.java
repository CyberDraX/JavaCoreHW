package JavaCoreHW6;

class HeroTest {
    public static void main(String[] args) {
        //Hero hero = new Hero();
        Hero hero = new Hero("Stranger", 50);

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}
class Hero {
    private String name;
    private int hp;

    public Hero() {
        name = "Paratrooper";
        hp = 100;
    }

    public Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}