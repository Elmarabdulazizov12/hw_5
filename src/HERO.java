class Hero {
    private int health;
    private int damage;
    private String superpower;


    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }


    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = "Нет";
    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "health=" + health +
                ", damage=" + damage +
                ", superpower='" + superpower + '\'' +
                '}';
    }
}