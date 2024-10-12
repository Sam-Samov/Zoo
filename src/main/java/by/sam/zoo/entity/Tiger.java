package by.sam.zoo.entity;

public class Tiger {
    private int health = 100;
    private int stamina = 100;
    private double addHealthMod = 2.5; // коэф.прибавления здоровья
    private double subHealthMod = 5; // коэф.уменьшения здоровья
    private double addStaminaMod = 1.5; //коэф.прибавления выносливости
    private double subStaminaMod = 2.5; //коэф.уменьшения выносливости

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }

    public double getAddHealthMod() {
        return this.addHealthMod;
    }

    public double getSubHealthMod () {
        return this.subHealthMod;
    }

    public double getAddStaminaMod () {
        return this.addStaminaMod;
    }

    public double getSubStaminaMod () {
        return this.subStaminaMod;
    }
}
