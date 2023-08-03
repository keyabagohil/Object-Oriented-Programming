import java.awt.*;
import java.awt.event.*;
//import java.io.*;
import javax.swing.*;

public class Main {

    public static final int lvlctr = 3;

    static JFrame f;
    static JPanel p1,p2,p3,p4,p5,info;

    static JLabel health,gold,weapon1,weapon2,weapon3,weapon4,name;
     static Font f1= new Font("Courier", Font.BOLD, 15);

    static void createHomePage(Player temp){

        Player q=new Player(temp);
        p3.setVisible(false);

        JPanel p2_temp= new JPanel();
        JPanel p3_temp= new JPanel();

        weapon1.setText("SMALL SWORD : "+q.inventory[0]);
        weapon2.setText("LONG SWORD : "+q.inventory[1]);
        weapon3.setText("SMALL POTION : "+q.inventory[2]);
        weapon4.setText("LARGE POTION : "+q.inventory[3]);
        weapon1.setFont(f1);
        weapon2.setFont(f1);
        weapon3.setFont(f1);
        weapon4.setFont(f1);
        weapon1.setVisible(true);
        weapon2.setVisible(true);
        weapon3.setVisible(true);
        weapon4.setVisible(true);
        weapon1.setForeground(Color.WHITE);
        weapon2.setForeground(Color.WHITE);
        weapon3.setForeground(Color.WHITE);
        weapon4.setForeground(Color.WHITE);
        

        info.setPreferredSize(new Dimension(80,80));
        info.setBackground(Color.BLACK);
        p3_temp.setLayout(new GridLayout());
        p2_temp.setBackground(Color.GRAY);

        JButton quickLoad=new JButton("SAVE");
        JButton load=new JButton("LOAD");
        JButton shop=new JButton("SHOP");

        JButton door1=new JButton();
        JButton door2=new JButton();
        JButton door3=new JButton();
        door1.setBackground(Color.BLACK);
        Icon d2 = new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\27a2d85ebbc4778735aaad7ceffa4c57.jpg");
        Icon d1 = new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\door_1.jpg");
        door2.setIcon(d2);
        door1.setIcon(d1);
        Icon d3 = new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\D2.png");
        door3.setIcon(d3);
        door3.setBackground(Color.BLACK);




        health.setFont(f1);
        gold.setFont(f1);
        name.setFont(f1);
        health.setForeground(Color.WHITE);
        gold.setForeground(Color.WHITE);
        name.setForeground(Color.WHITE);


        health.setVisible(true);
        gold.setVisible(true);
        name.setVisible(true);

        load.setBackground(Color.WHITE);
        quickLoad.setBackground(Color.WHITE);
        shop.setBackground(Color.WHITE);

        shop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p2_temp.setVisible(false);
                p3_temp.setVisible(false);
                p5.setVisible(true);
                p4.setVisible(true);
                createShop(q);
            }
        });

        load.setVisible(true);
        quickLoad.setVisible(true);
        shop.setVisible(true);
        door1.setVisible(true);
        door2.setVisible(true);
        door3.setVisible(true);

        door1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(q.ctr < lvlctr){
                    q.ctr++;
                } else {
                    p2_temp.setVisible(false);
                    p3_temp.setVisible(false);
                    p3.setVisible(false);
                    p5.setVisible(false);
                    p4.setVisible(false);
                    JOptionPane.showMessageDialog(null, "CONGRATULATIONS!! YOU WON THE ARENA!!");
                    System.exit(0);
                }

                String i = JOptionPane.showInputDialog("ENTER 1. to choose small sword\n\t2.To choose long sword");
                while(Integer.parseInt(i)!=2 && Integer.parseInt(i)!=1){
                     i = JOptionPane.showInputDialog("INVALID INPUT :\nENTER 1. to choose small sword\n\t2.To choose long sword");
                }
                if (i.equals("1")) q.weaponEquipped = "SMALL SWORD";
                else q.weaponEquipped = "LONG SWORD";

                JOptionPane.showMessageDialog(null, "You are going to enter the Game Arena!!");
                p2_temp.setVisible(false);
                p3_temp.setVisible(false);
                p3.setBackground(Color.BLUE);
                p3.setVisible(false);
                p5.setVisible(true);
                p4.setVisible(true);
                createArena(q);
            }
        });
        door2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(q.ctr < lvlctr){
                    q.ctr++;
                } else {
                    p2_temp.setVisible(false);
                    p3_temp.setVisible(false);
                    p3.setVisible(false);
                    p5.setVisible(false);
                    p4.setVisible(false);
                    JOptionPane.showMessageDialog(null, "CONGRATULATIONS!! YOU WON THE ARENA!!");
                    System.exit(0);
                }

                String i = JOptionPane.showInputDialog("ENTER 1. to choose small sword\n\t2.To choose long sword");
                while(Integer.parseInt(i)!=2 && Integer.parseInt(i)!=1){
                    i = JOptionPane.showInputDialog("INVALID INPUT :\nENTER 1. to choose small sword\n\t2.To choose long sword");
                }
                if (i.equals("1")) q.weaponEquipped = "SMALL SWORD";
                else q.weaponEquipped = "LONG SWORD";

                JOptionPane.showMessageDialog(null, "You are going to enter the Game Arena!!");
                p2_temp.setVisible(false);
                p3_temp.setVisible(false);
                p3.setBackground(Color.BLUE);
                p3.setVisible(false);
                p5.setVisible(true);
                p4.setVisible(true);
                createArena(q);
            }
        });
        door3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(q.ctr < lvlctr){
                    q.ctr++;
                } else {
                    p2_temp.setVisible(false);
                    p3_temp.setVisible(false);
                    p3.setVisible(false);
                    p5.setVisible(false);
                    p4.setVisible(false);
                    JOptionPane.showMessageDialog(null, "CONGRATULATIONS!! YOU WON THE ARENA!!");
                    System.exit(0);
                }

                String i = JOptionPane.showInputDialog("ENTER 1. to choose small sword\n\t2.To choose long sword");
                while(Integer.parseInt(i)!=2 && Integer.parseInt(i)!=1){
                    i = JOptionPane.showInputDialog("INVALID INPUT :\nENTER 1. to choose small sword\n\t2.To choose long sword");
                }
                if (i.equals("1")) q.weaponEquipped = "SMALL SWORD";
                else q.weaponEquipped = "LONG SWORD";

                JOptionPane.showMessageDialog(null, "You are going to enter the Game Arena!!");
                p2_temp.setVisible(false);
                p3_temp.setVisible(false);
                p3.setBackground(Color.BLUE);
                p3.setVisible(false);
                p5.setVisible(true);
                p4.setVisible(true);
                createArena(q);
            }
        });

       load.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SaveLoad s=new SaveLoad();
                s.load(q);

              health.setText("HEALTH : "+q.health);
              gold.setText("GOLD : "+q.gold);
              weapon1.setText("SMALL SWORD : "+q.inventory[0]);
              weapon2.setText("LONG SWORD : "+q.inventory[1]);
              weapon3.setText("SMALL POTION : "+q.inventory[2]);
              weapon4.setText("LARGE POTION : "+q.inventory[3]);
            }
        });

        quickLoad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SaveLoad s=new SaveLoad();
                s.save(q);
                p2_temp.setVisible(false);
                p3_temp.setVisible(false);
                p3.setVisible(true);
                createHomePage(q);
            }
        });
        p2_temp.add(load);
        p2_temp.add(shop);
        p2_temp.add(quickLoad);

        p3_temp.add(door1);
        p3_temp.add(door2);
        p3_temp.add(door3);


        info.add(name);
        info.add(health);
        info.add(gold);
        info.add(weapon1);
        info.add(weapon2);
        info.add(weapon3);
        info.add(weapon4);


        p2_temp.setVisible(true);
        p3_temp.setVisible(true);
        info.setVisible(true);
        f.add(p3_temp,BorderLayout.CENTER);
        f.add(p2_temp,BorderLayout.SOUTH);
        f.add(info,BorderLayout.NORTH);
    }

    static void createShop(Player pshop){

        JPanel p2_temp= new JPanel();
        JPanel p3_temp=new JPanel();
        p3_temp.setLayout(new GridLayout());

        p2_temp.setBackground(Color.GRAY);
        JButton back=new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setVisible(true);
        p2_temp.add(back);
        back.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent e) {
               p2_temp.setVisible(false);
               p3_temp.setVisible(false);
               gold.setText("GOLD : "+pshop.gold);
               weapon1.setText("SMALL SWORD : "+pshop.inventory[0]);
               weapon2.setText("LONG SWORD : "+pshop.inventory[1]);
               weapon3.setText("SMALL POTION : "+pshop.inventory[2]);
               weapon4.setText("LARGE POTION : "+pshop.inventory[3]);
               Player temp = new Player();
////               temp=q;
//               temp.name=q.name;
//                   temp.ctr=q.ctr;
//                   temp.gold=q.gold;
//                   temp.inventory[0]=q.inventory[0];
//                   temp.inventory[1]=q.inventory[1];
//                   temp.inventory[2]=q.inventory[2];
//                   temp.inventory[3]=q.inventory[3];
//                   temp.health=q.health;
               createHomePage(pshop);
               }
        });

        JButton b1=new JButton();
        JButton b2=new JButton();
        JButton b3=new JButton();
        JButton b4=new JButton("LARGE POTION : 70");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pshop.gold>=10){
                    pshop.gold-=10;
                    pshop.inventory[0] += 5;
                    gold.setText("GOLD : "+pshop.gold);
                    weapon1.setText("SMALL SWORD : "+ pshop.inventory[0]);
                   }
                else
                    JOptionPane.showMessageDialog(null,"NOT ENOUGH GOLD!");

            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pshop.gold>=30){
                    pshop.gold-=30;
                    gold.setText("GOLD : "+pshop.gold);
                    pshop.inventory[1] += 5;
                    weapon2.setText("LONG SWORD : "+ pshop.inventory[1]);
                }
                else
                    JOptionPane.showMessageDialog(null,"NOT ENOUGH GOLD!");

            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pshop.gold>=30){
                    pshop.gold-=30;
                    gold.setText("GOLD : "+pshop.gold);
                    pshop.inventory[2] += 5;
                    weapon3.setText("SMALL POTION : "+ pshop.inventory[2]);
                }
                else
                    JOptionPane.showMessageDialog(null,"NOT ENOUGH GOLD!");
            }
        });
        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(pshop.gold>=50){
                    pshop.gold-=50;
                    gold.setText("GOLD : "+pshop.gold);
                    pshop.inventory[3] += 5;
                    weapon4.setText("LARGE POTION : "+ ++pshop.inventory[3]);}
                else
                    JOptionPane.showMessageDialog(null,"NOT ENOUGH GOLD!");
            }
        });

        Icon i1=new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\smallsword.jpeg");
        Icon i2=new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\longsword.jpeg");
        Icon i3=new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\Potion.jpg");
        Icon i4=new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\LargePotion.jpg");
        b1.setIcon(i1);
        b2.setIcon(i2);
        b3.setIcon(i3);
        b4.setIcon(i4);
        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);

        p3_temp.add(b1);
        p3_temp.add(b2);
        p3_temp.add(b3);
        p3_temp.add(b4);


        p2_temp.setVisible(true);
        p3_temp.setVisible(true);
        f.add(p2_temp,BorderLayout.SOUTH);
        f.add(p3_temp,BorderLayout.CENTER);

    }

    static void createArena(Player p){

        //health to be changes
        //small sword long sword label to be changed
        //after door going into shop resets (gold to be fixed)

        Enemy e1=new Enemy();
        JPanel p2_temp=new JPanel();
        p2_temp.setBackground(Color.GRAY);
        JPanel p3_temp=new JPanel(new BorderLayout());
        p3_temp.setBackground(Color.WHITE);
        JPanel p3_tempcenter=new JPanel();
        p3_tempcenter.setLayout(new GridLayout());

        p3_tempcenter.setBackground(Color.BLUE);
        p3_temp.add(p3_tempcenter,BorderLayout.CENTER);
        JPanel p3_tempnorth=new JPanel(new GridLayout());
        p3_tempnorth.setPreferredSize(new Dimension(100,100));
        p3_tempnorth.setBackground(Color.WHITE);
        p3_temp.add(p3_tempnorth,BorderLayout.NORTH);
        JPanel p3_tempsouth=new JPanel(new GridLayout());
        p3_tempsouth.setPreferredSize(new Dimension(100,100));
        p3_tempsouth.setBackground(Color.WHITE);
        p3_temp.add(p3_tempsouth,BorderLayout.SOUTH);

        JLabel playerName=new JLabel();
        JLabel playerHealth=new JLabel();
        JLabel enemyName=new JLabel();
        JLabel enemyHealth=new JLabel();
        JLabel playerWeaponEquipped=new JLabel();
        JLabel enemyWeaponEquipped=new JLabel();

        playerName.setText("PLAYER  : "+p.name);
        playerHealth.setText("PLAYER HEALTH: "+p.health);
        playerWeaponEquipped.setText("PLAYER WEAPON EQUIPPED : "+p.weaponEquipped);

        p3_tempnorth.add(playerName);
        p3_tempnorth.add(playerHealth);
        p3_tempnorth.add(playerWeaponEquipped);

        enemyName.setText("ENEMY  : "+e1.name);
        enemyHealth.setText("ENEMY HEALTH: "+e1.health);
        enemyWeaponEquipped.setText("ENEMY WEAPON EQUIPPED : "+e1.weaponEquipped);

        p3_tempsouth.add(enemyName);
        p3_tempsouth.add(enemyHealth);
        p3_tempsouth.add(enemyWeaponEquipped);

        JButton attack=new JButton();
        Icon p2=new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\attack.png");
        attack.setIcon(p2);

        attack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if ((p.weaponEquipped.equals("SMALL SWORD") && p.inventory[0]>0)||(p.weaponEquipped.equals("LONG SWORD") && p.inventory[1]>0)) {

                    if (p.health <= 0) {
                        JOptionPane.showMessageDialog(null, "YOU LOSE !");
                        System.exit(1);
                    } else if (e1.health <= 0) {
                        JOptionPane.showMessageDialog(null, "YOU WIN " + p.health + " gold.");
                        //to be changed
                        p.gold += p.health;
                        gold.setText("GOLD : "+ p.gold);
                        e1.health = 100;
                        p2_temp.setVisible(false);
                        p3_temp.setVisible(false);
                        p3.setVisible(true);
                        createHomePage(p);
                    }
                    p.attack_p(e1);
                    e1.attack_e(p);
                    health.setText("HEALTH : " + p.health);
                    playerHealth.setText("PLAYER HEALTH : " + p.health);
                    enemyHealth.setText("ENEMY HEALTH : " + e1.health);
                    weapon1.setText("SMALL SWORD : " + p.inventory[0]);
                    weapon2.setText("LONG SWORD : " + p.inventory[1]);

                } else {
                    JOptionPane.showMessageDialog(null, "WEAPON IS BROKEN!");
                    if (p.weaponEquipped.equals("SMALL SWORD")){
                        p.inventory[0] = 0;
                        weapon1.setText("SMALL SWORD : " + p.inventory[0]);
                    }else {
                        p.inventory[1] = 0;
                        weapon2.setText("LONG SWORD : " + p.inventory[1]);
                    }
                }
            }
        });

        JButton usePotion=new JButton();
        Icon p1=new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\Potion_arena.jpg");
        usePotion.setIcon(p1);
        usePotion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //do while
                String i = JOptionPane.showInputDialog("ENTER 1. to use small\n2.To choose big potion");
                while(Integer.parseInt(i)!=2 && Integer.parseInt(i)!=1){
                    i = JOptionPane.showInputDialog("INVALID INPUT :\nENTER 1. to use small\n2.To choose big potion");
                }
                if(p.inventory[Integer.parseInt(i)+1]>0) {
                    p.potion(Integer.parseInt(i));
                    e1.attack_e(p);
                    health.setText("HEALTH : " + p.health);
                    weapon3.setText("SMALL POTION : " + p.inventory[2]);
                    weapon4.setText("LARGE POTION : " + p.inventory[3]);
                    playerHealth.setText("PLAYER HEALTH : " + p.health);
                }else {
                    JOptionPane.showMessageDialog(null,"No Potion Left");
                    p.inventory[Integer.parseInt(i)+1] = 0;
                    weapon3.setText("SMALL POTION : " + p.inventory[2]);
                    weapon4.setText("LARGE POTION : " + p.inventory[3]);
                }
                //add method
            }
        });

        p3_tempcenter.add(attack);
        p3_tempcenter.add(usePotion);


        JButton run=new JButton("RUN");

        run.setVisible(true);
        run.setBackground(Color.WHITE);
        run.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                p.ctr--;
                p2_temp.setVisible(false);
                p3_temp.setVisible(false);
                p3.setVisible(true);
////               temp=q;
//               temp.name=q.name;
//                   temp.ctr=q.ctr;
//                   temp.gold=q.gold;
//                   temp.inventory[0]=q.inventory[0];
//                   temp.inventory[1]=q.inventory[1];
//                   temp.inventory[2]=q.inventory[2];
//                   temp.inventory[3]=q.inventory[3];
//                   temp.health=q.health;
                createHomePage(p);
            }
        });

        p2_temp.add(run);
        p2_temp.setVisible(true);
        f.add(p2_temp,BorderLayout.SOUTH);
        f.add(p3_temp,BorderLayout.CENTER);

    }

    public static void main(String[] args){

        Player z=new Player();

        f = new JFrame("ROLE PLAYING GAME");
        f.setLayout(new BorderLayout());
        f.setSize(500,500);
        f.setResizable(true);
        f.setVisible(true);
        Font font= new Font("Courier", Font.PLAIN, 75);

         p1=new JPanel();
         p2=new JPanel();
         p3=new JPanel();
         p4=new JPanel();
         p5=new JPanel();

        Icon i = new ImageIcon("C:\\Users\\KEYA GOHIL\\IdeaProjects\\samplejava\\play.png");
        JLabel title=new JLabel("\t\t\t\tROLE PLAYING GAME!!");
        title.setFont(font);
        title.setForeground(Color.WHITE);
        p3.setLayout(new BorderLayout());
        p3.add(title,BorderLayout.CENTER);


        //button in p2
        JButton playButton=new JButton();
//        playButton.setFont(font);
        playButton.setBackground(Color.WHITE);
        p2.add(playButton);
        playButton.setForeground(Color.GRAY);
        playButton.setIcon(i);
        playButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                z.name=JOptionPane.showInputDialog("Enter your name:");
                JOptionPane.showMessageDialog(null,"Welcome "+ z.name);
                p2.setVisible(false);
                p1.setVisible(false);
                p3.setVisible(false);
                info= new JPanel();
                info.setLayout(new GridLayout());
                info.setPreferredSize(new Dimension(200,200));
                weapon1=new JLabel();
                weapon2=new JLabel();
                weapon3=new JLabel();
                weapon4=new JLabel();
                health=new JLabel("HEALTH : "+z.health);
                gold=new JLabel("GOLD : "+z.gold);
                name=new JLabel("PLAYER : "+z.name);
                createHomePage(z);
            }
        });

        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.WHITE);
        p3.setBackground(Color.BLACK);
        p4.setBackground(Color.BLACK);
        p5.setBackground(Color.BLACK);

        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(250,250));
        p5.setPreferredSize(new Dimension(250,250));


        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.SOUTH);
        f.add(p3,BorderLayout.CENTER);
        f.add(p4,BorderLayout.EAST);
        f.add(p5,BorderLayout.WEST);

    }

}