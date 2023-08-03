import java.util.Random;
public class Enemy {
    String name;
    String weaponEquipped;
    String weapons[]={"SMALL SWORD","LONG SWORD","MONSTER","ANIMAL"};
    Random rand=new Random();
    int health;
    Enemy(){

        weaponEquipped = weapons[rand.nextInt(2)];
        name=weapons[(rand.nextInt(2))+2];
        health=100;
    }
    public void attack_e(Player p){
        if(weaponEquipped.equals("SMALL SWORD")) {
            int minDmg = 8;
            int maxDmg = 10;
            int Dmg = rand.nextInt(maxDmg)+minDmg;
            p.health -= Dmg;
        }
        else {
            int minDmg = 5;
            int maxDmg = 22;
            int Dmg = rand.nextInt(maxDmg)+minDmg;
            p.health -= Dmg;
        }
        //health of the player decreases according to weapon Equipped
    }
}
