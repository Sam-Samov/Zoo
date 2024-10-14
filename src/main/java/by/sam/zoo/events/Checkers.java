package by.sam.zoo.events;

import by.sam.zoo.entity.Tiger;

public class Checkers {
    public void checkHealth100 (Tiger t) {
        int health = t.getHealth();
        if (health > 100) {
            health = 100;
        }
        t.setHealth(health);
    }

    public void checkStamina100 (Tiger t) {
        int stamina = t.getStamina();
        if (stamina > 100) {
            stamina = 100;
        }
        t.setStamina(stamina);
    }
}
