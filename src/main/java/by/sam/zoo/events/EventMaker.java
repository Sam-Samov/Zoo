package by.sam.zoo.events;

import by.sam.zoo.entity.Tiger;

public class EventMaker {

    public void activateEvent() {

    }

    private void sleepEvent(Tiger tiger) {
        int stamina = tiger.getStamina();
        stamina = stamina + 20;
        if (stamina > 100) {
            stamina = 100;
        }
        tiger.setStamina(stamina);
        System.out.println("Тигр поспал! +20 к выносливости. Выносливость: " + Tiger.getStamina());
    }

}
