public class Main {
    public static void main(String[] args) {
        System.out.println("Boss information:");
        Boss boss = new Boss(500, 50, "Barrier");
        System.out.println("Boss health: " + boss.getHealth() + " Boss damage: " + boss.getDamage() + " Boss protection: " + boss.getProtection());

        Hero[] heroes = createHeroes();
        System.out.println("Heroes Information: ");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Super Power: " + hero.getSuperpower());
        }
    }
    public static Hero[] createHeroes(){
        Hero hero = new Hero(250, 40, "Fireball");
        Hero hero1 = new Hero(240, 30);
        Hero hero2 = new Hero(230, 20, "Healing");
        return new Hero[]{hero, hero1, hero2};
        }


    }






