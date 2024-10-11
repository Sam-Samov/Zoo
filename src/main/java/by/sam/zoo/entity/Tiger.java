package by.sam.zoo.entity;

public class Tiger {
    private int health = 100;
    private int stamina = 100;
    private double actionConst = 2.5;

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
    public double getJaws() {
        return this.actionConst;
    }
}
