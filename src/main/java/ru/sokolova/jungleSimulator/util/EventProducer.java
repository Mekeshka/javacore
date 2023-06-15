package ru.sokolova.jungleSimulator.util;

import ru.sokolova.jungleSimulator.model.Parrot;

public class EventProducer {
    public void activateEvent() {

    }

    private void eatNuts(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 4;
        if (energy > 100) {
            energy = 100;
        }

        health = health + (int) (parrot.getBeak()*3);
        if (health>100){
            health = 100;
        }
        parrot.setEnergy(energy);
        parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void eatBugs(Parrot parrot) {
        int energy = parrot.getEnergy();
        int health = parrot.getHealth();
        energy = energy - 2;
        if (energy > 100) {
            energy = 100;
        }
        health = health + (int) (parrot.getBeak()*2);
        if (health>100) {
            health = 100;
            parrot.setEnergy(energy);
            parrot.setHealth(health);
            energyChecker(parrot);
        }    }
    private void eatBerries(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy + 3;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private void flyAwayFromCatcher(Parrot parrot) {
        int health = parrot.getHealth();
        health=health-10;
        if (health<0){
        health=0;
        }
        parrot.setHealth(health);
        energyChecker(parrot);
    }

    private void buildNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 5;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private void fly(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 7;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private void fightOtherParrot(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 8;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private void sleepInNest(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private void restOnBranch(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy + 6;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private void wetFromRain(Parrot parrot) {
        int energy = parrot.getEnergy();
        energy = energy - 3;
        if (energy > 100) {
            energy = 100;
        }
        parrot.setEnergy(energy);
        energyChecker(parrot);
    }

    private boolean statusChecker(Parrot parrot) {
        if(parrot.getHealth()<=0)
        return false;

    }else {
        return true;
    }
    private void energyChecker(Parrot parrot) {
        if (parrot.getEnergy() <=0){
            int health=parrot.getHealth();
            health=health-7;
            if (health <0){
                health=0;
            }
            parrot.setHealth(health);
        }

    }

}
