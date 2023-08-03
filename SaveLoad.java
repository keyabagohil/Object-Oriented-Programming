
import javax.swing.*;
import java.io.*;

public class SaveLoad {
    void save(Player p){
        String s=p.name+ ".txt";
        File file=new File(s);
        try {
            if(file.createNewFile()){
                FileWriter fw=new FileWriter(file);
                StringBuilder sb=new StringBuilder();
                sb.append(p.name);
                sb.append("\r\n");
                sb.append(p.ctr);
                sb.append("\r\n");
                sb.append(p.gold);
                sb.append("\r\n");
                sb.append(p.health);
                sb.append("\r\n");
                sb.append(p.inventory[0]);
                sb.append("\r\n");
                sb.append(p.inventory[1]);
                sb.append("\r\n");
                sb.append(p.inventory[2]);
                sb.append("\r\n");
                sb.append(p.inventory[3]);
                sb.append("\r\n");
                fw.write(sb.toString());
                fw.close();

                JOptionPane.showMessageDialog(null,"FILE SAVED!");
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"UNABLE TO SAVE THE FILE!");
        }

    }
    void load(Player q){
        String s=q.name+ ".txt";
        try {
            BufferedReader bf=new BufferedReader(new FileReader(s));
            q.name=bf.readLine();
            q.ctr = Integer.parseInt(bf.readLine());
            q.gold=Integer.parseInt(bf.readLine());
            q.health=Integer.parseInt(bf.readLine());
            q.inventory[0]=Integer.parseInt(bf.readLine());
            q.inventory[1]=Integer.parseInt(bf.readLine());
            q.inventory[2]=Integer.parseInt(bf.readLine());
            q.inventory[3]=Integer.parseInt(bf.readLine());
            JOptionPane.showMessageDialog(null,"OPENING SAVED FILE!");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"UNABLE TO LOAD THE FILE!");
        }

    }
}
