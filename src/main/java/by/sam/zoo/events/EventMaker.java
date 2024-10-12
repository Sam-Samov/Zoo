package by.sam.zoo.events;

import by.sam.zoo.entity.Tiger;

public class EventMaker {

    // проверка что тигр жив. Если да, то генератор случайного события
    public void startSimulation(Tiger t) {
        int i = 1;
        while (aliveCheck(t)) {
            if (i <= 1000) {
                int random = (int) (Math.random() * 100);
                if (random >= 0 && random <= 10) {
                    System.out.println(i);
                    sleepEvent(t);
                } else if (random > 10 && random <= 30) {
                    System.out.println(i);
                    eatGazel(t);
                } else if (random > 30 && random <= 50) {
                    System.out.println(i);
                    drinkWater(t);
                } else if (random > 50 && random <= 100) {
                    System.out.println(i);
                    attackHunter(t);
                }
                System.out.println("Здоровье " + t.getHealth() + " Выносливость " + t.getStamina());
                System.out.println();
                i++;
            }
        }

    }

    // 1.тигр поспал (50%)
    private void sleepEvent(Tiger t) {
        int stamina = t.getStamina();
        stamina = stamina + (int) (10 * t.getAddStaminaMod());
        if (stamina > 100) {
            stamina = 100;
        }
        t.setStamina(stamina);
        System.out.println("Тигр поспал! +" + (int) (10 * t.getAddStaminaMod()) + " к выносливости.");
    }

    // 2.тирг съел газель (50%)
    private void eatGazel(Tiger t) {
        int stamina = t.getStamina();
        int health = t.getHealth();
        int tempPreviousStamina = t.getStamina();
        int tempStamina;
        stamina = stamina - (int) (5 * t.getSubStaminaMod());
        if (stamina < 0) {
            stamina = 0;
            tempStamina = tempPreviousStamina;
        } else tempStamina = (int) (5 * t.getSubStaminaMod());

        health = health + (int) (10 * t.getAddHealthMod());
        if (health > 100) {
            health = 100;
        }

        t.setStamina(stamina);
        t.setHealth(health);
        System.out.println("Тигр догнал и съел газель! +" + (int) (10 * t.getAddHealthMod()) + " к здоровью; -" + tempStamina + " к выносливости.");
    }

    // 3.тигр попил
    private void drinkWater(Tiger t) {
        int stamina = t.getStamina();
        stamina = stamina + (int) (7 * t.getAddHealthMod());
        if (stamina > 100) {
            stamina = 100;
        }
        t.setStamina(stamina);
        System.out.println("Тигр попил! +" + (int) (7 * t.getAddHealthMod()) + " к выносливости.");
    }

    // 4.на тигра напал охотник
    private void attackHunter(Tiger t) {
        int stamina = t.getStamina();
        int health = t.getHealth();
        int tempPrevStamina = t.getStamina();
        if (stamina >= 10 * t.getSubStaminaMod()) {
            stamina = stamina - (int) (10 * t.getSubStaminaMod());
            t.setStamina(stamina);
            System.out.println("На тигра напал охотник! Тигр смог убежать! -" + (int) (10 * t.getSubStaminaMod()) + " к выносливости.");
            return;
        } else if (health > 5 * t.getSubHealthMod()) {
            health = health - (int) (5 * t.getSubHealthMod());
            stamina = 0;
            t.setHealth(health);
            t.setStamina(stamina);
            System.out.println("На тигра напал охотник! Тигр слишком устал, чтобы убегать, и был ранен! -" + (int) (5 * t.getSubHealthMod()) + " к здоровью; -" + tempPrevStamina + " к выносливости");
            return;
        } else
            health = 0;
        stamina = 0;
        t.setHealth(health);
        t.setStamina(stamina);
        System.out.println("На тигра напал охотник! Тигр слишком устал, чтобы убегать, и был убит!");
    }

    private boolean aliveCheck(Tiger t) {
        if (t.getHealth() > 0) {
            return true;
        } else return false;
    }
}

