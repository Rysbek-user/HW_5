public class Boss {
    private int health;
    private int damage;
    private String protection;
    public Boss(int bossHealth, int bossDamage, String bossProtection){
        this.health = bossHealth;
        this.damage = bossDamage;
        this.protection = bossProtection;

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }
}
