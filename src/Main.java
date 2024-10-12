public class Main {
    public static void main(String[] args) {
        
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(30);
        boss.setDefenseType("Щит");


        System.out.println(boss);


        Hero[] heroes = createHeroes();


        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Летучесть");
        Hero hero2 = new Hero(80, 15); // Суперспособность по умолчанию
        Hero hero3 = new Hero(120, 25, "Невидимость");

        return new Hero[]{hero1, hero2, hero3};
    }
}