
package pokemongui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import static pokemongui.Command.printPokemons;

/**
 *
 * @author rebor
 */
public class Command extends JFrame {
    JButton new1,new2,new3,eat1,eat2,eat3,move1,move2,move3,attack1,attack2,attack3,reset1,reset2,reset3;
    JPanel pTop,p1,pIM,p2,p3;
    JLabel image;
    Icon zero,pik1,pEat,pRun,pATK,koi1,kEat,kSwim,kATK,pd1,pdEat,pdSwim,pdATK;
    JTextArea area;
    int member;
    
     public static String printPokemons(ArrayList<Pokemon> pokemons, int member){
        return "===== Pokemon List =====\n"+"Pokemon "+
                pokemons.get(member).getName()+"\n"+"Health : "+pokemons.get(member).getHealth()
                +"/"+pokemons.get(member).maxHealth+"\n"+"Weight : "+
                pokemons.get(member).getWeight();
    }
    public Command(){
         super("PokemonGame");
         ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

    
        new1 = new JButton("Pikachu");
        new2 = new JButton("Koiking");
        new3 = new JButton("Psyduck");
        eat1 = new JButton("Eat");
        eat2 = new JButton("Eat");
        eat3 = new JButton("Eat");
        move1 = new JButton("Exercise");
        move2 = new JButton("Exercise");
        move3 = new JButton("Exercise");
        attack1 = new JButton("Attack");
        attack2 = new JButton("Attack");
        attack3 = new JButton("Attack");
        reset1 = new JButton("Reset");
        reset2 = new JButton("Reset");
        reset3 = new JButton("Reset");
        area = new JTextArea("");
        zero = new ImageIcon(getClass().getResource("00.gif"));
        pik1 =  new ImageIcon(getClass().getResource("01.gif"));
        koi1 = new ImageIcon(getClass().getResource("02.gif"));
        pd1 =  new ImageIcon(getClass().getResource("03.gif"));
        pEat =  new ImageIcon(getClass().getResource("eat1.gif"));
        kEat =  new ImageIcon(getClass().getResource("eat2.gif"));
        pdEat =  new ImageIcon(getClass().getResource("eat3.gif"));
        pRun =  new ImageIcon(getClass().getResource("run1.gif"));
        kSwim =  new ImageIcon(getClass().getResource("run2.gif"));
        pdSwim =  new ImageIcon(getClass().getResource("run3.gif"));
        pATK =  new ImageIcon(getClass().getResource("atk1.gif"));
        kATK =  new ImageIcon(getClass().getResource("atk2.gif"));
        pdATK =  new ImageIcon(getClass().getResource("atk3.gif"));
        image = new JLabel("");
        image.setIcon(zero);
        pTop = new JPanel();
        pTop.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        pIM = new JPanel();
        pIM.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
   
        pokemons.add(new Pikachu());
        pokemons.add(new Koiking());
        pokemons.add(new Psyduck());
        
        //event
        reset1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 pokemons.get(0).recoveryALL();
                 area.setText(printPokemons(pokemons,0));
                 image.setIcon(pik1);
                 
               }
            
        });
        
        reset2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 pokemons.get(1).recoveryALL();
                 area.setText(printPokemons(pokemons,1));
                 image.setIcon(koi1);
                 
               }
            
        });
        
        reset3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 pokemons.get(2).recoveryALL();
                 area.setText(printPokemons(pokemons,2));
                 image.setIcon(pd1);
                 
               }
            
        });
        
        eat1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
			pokemons.get(0).eat(berry);
               area.setText(printPokemons(pokemons,0));
                    image.setIcon(pEat);
               }
            
        });
        
        eat2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
			pokemons.get(1).eat(berry);
               area.setText(printPokemons(pokemons,1));
              image.setIcon(kEat);
               
               }
            
        });
        
        eat3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
			pokemons.get(2).eat(berry);
               area.setText(printPokemons(pokemons,2));
               image.setIcon(pdEat);
               
               }
            
        });
        
        move1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(0).move();
               area.setText(printPokemons(pokemons,0));
              image.setIcon(pRun);
               }
            
        });
        
        move2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(1).move();
               area.setText(printPokemons(pokemons,1));
              image.setIcon(kSwim);
               }
            
        });
        
        move3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(2).move();
               area.setText(printPokemons(pokemons,2));
              image.setIcon(pdSwim);
               }
            
        });
              
        new1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(pik1);  
              area.setText(printPokemons(pokemons,0));
                p2.removeAll();  
                p3.removeAll();
                c.remove(p2);
                c.remove(p3);
                p1.add(eat1);
                p1.add(move1);
                p1.add(attack1);
                p1.add(reset1);
                c.add(p1, BorderLayout.PAGE_END);
            }
        });
        
        new2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(koi1);  
              area.setText(printPokemons(pokemons,1));
                p1.removeAll();
                p3.removeAll();
                c.remove(p1);
                c.remove(p3);
                p2.add(eat2);
                p2.add(move2);
                p2.add(attack2);
                p2.add(reset2);
                c.add(p2, BorderLayout.PAGE_END);
            }
        });
        
        new3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(pd1);  
              area.setText(printPokemons(pokemons,2));
                p1.removeAll();
                p2.removeAll();
                c.remove(p1);
                c.remove(p2);
                p3.add(eat3);
                p3.add(move3);
                p3.add(attack3);
                p3.add(reset3);
                c.add(p3, BorderLayout.PAGE_END);
            }
        });
        
        attack1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(0).reducedHealth(5);
               area.setText(printPokemons(pokemons,0));
              image.setIcon(pATK);
               }
            
        });
        
        attack2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
			pokemons.get(1).reducedHealth(5);
               area.setText(printPokemons(pokemons,1));
              image.setIcon(kATK);
               }
            
        });
        
        attack3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
		pokemons.get(2).reducedHealth(5);
               area.setText(printPokemons(pokemons,2));
              image.setIcon(pdATK);
               }
            
        });
        
        
        pTop.add(new1);
        p1.add(eat1);
        p1.add(move1);
        p1.add(attack1);
        
        pTop.add(new2);
        p2.add(eat2);
        p2.add(move2);
        p2.add(attack2);
        
        pTop.add(new3);
        p3.add(eat3);
        p3.add(move3);
        p3.add(attack3);
        
        pIM.add(image);
        pTop.add(area);
        
        c.add(pTop, BorderLayout.PAGE_START);
        c.add(pIM, BorderLayout.CENTER);
        
        //set others
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        c.setSize(700,900);
        setVisible(true);
        
    }
}
