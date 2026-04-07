package main;

public class LootFactory {

    public static Loot create(String[] csvRow) {

        String type = csvRow[0];
        String name = csvRow[1];
        String rarity = csvRow[2];

        switch (type) {
            case "Weapon":
                int damage = Integer.parseInt(csvRow[3]);
                return new Weapon(name, rarity, damage);
            case "Consumable":
                int restoreAmount = Integer.parseInt(csvRow[3]);
                return new Consumable(name, rarity, restoreAmount);
            default:
                return null;
        }
    }
}
