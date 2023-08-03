import java.util.Random;
//fight panel
public class Player {

    String name;
    int gold;
    int health;
    int ctr;
    Random rand = new Random();

    int[] inventory=new int [4];
    String weaponEquipped;
    Player(){
        gold=100;
        health=100;
        inventory [0]=80;
        inventory [1]=50;
        inventory [2]=10;
        inventory [3]=5;
    }
    Player(Player py){
        name=py.name;
        ctr=py.ctr;
        gold=py.gold;
        health=py.health;
        inventory [0]=py.inventory[0];
        inventory [1]=py.inventory[1];
        inventory [2]=py.inventory[2];
        inventory [3]=py.inventory[3];
    }

    public void attack_p(Enemy e){
        if(weaponEquipped.equals("SMALL SWORD")) {
            int minDmg = 5;
            int maxDmg = 14;
            int Dmg = rand.nextInt(maxDmg)+minDmg;
            e.health -= Dmg;
            inventory[0]-= rand.nextInt(5);
        }
        else {
            int minDmg = 10;
            int maxDmg = 25;
            int Dmg = rand.nextInt(maxDmg)+minDmg;
            e.health -= Dmg;
            inventory[1]-= rand.nextInt(5);
        }
    }
    public void potion(int i){
        if(i==1){
            int minHeal = 10;
            int maxHeal = 18;
            int Heal = rand.nextInt(maxHeal)+minHeal;
            health += Heal;
            inventory[2]--;
        } else if (i==2) {
            int minHeal = 20;
            int maxHeal = 25;
            int Heal = rand.nextInt(maxHeal)+minHeal;
            health += Heal;
            inventory[3]--;
        }

    }
}