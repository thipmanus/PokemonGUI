
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
    JButton new1,new2,eat1,eat2,move1,move2,attack1,attack2;
    JPanel p0,p1,p2,p3;
    JLabel image;
    Icon zero,pik1,pEat,pRun,pATK,koi1,kEat,kSwim,kATK;
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
        eat1 = new JButton("Pikachu eat");
        eat2 = new JButton("Koiking eat");
        move1 = new JButton("Pikachu run");
        move2 = new JButton("Koiking swim");
        attack1 = new JButton("Pikachu attack");
        attack2 = new JButton("Koiking attack");
        area = new JTextArea("");
        zero = new ImageIcon(getClass().getResource("00.png"));
        pik1 =  new ImageIcon(getClass().getResource("01.gif"));
        koi1 = new ImageIcon(getClass().getResource("02.gif"));
        pEat =  new ImageIcon(getClass().getResource("eat1.gif"));
        pRun =  new ImageIcon(getClass().getResource("run1.gif"));
        pATK =  new ImageIcon(getClass().getResource("atk1.gif"));
        kATK =  new ImageIcon(getClass().getResource("atk2.gif"));
        image = new JLabel("");
        image.setIcon(zero);
        p0 = new JPanel();
        p0.setLayout(new FlowLayout());
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        pokemons.add(new Pikachu());
        pokemons.add(new Koiking());
        
        //event
        
        eat1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
               for(Pokemon pokemon: pokemons)
			pokemon.eat(berry);
               area.setText(printPokemons(pokemons,0));
              image.setIcon(pEat);
               }
            
        });
        
        eat2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Berry berry = new Berry(0);
               for(Pokemon pokemon: pokemons)
			pokemon.eat(berry);
               area.setText(printPokemons(pokemons,1));
              image.setIcon(koi1);
               }
            
        });
        
        move1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               for(Pokemon pokemon: pokemons)
			pokemons.get(0).move();
               area.setText(printPokemons(pokemons,0));
              image.setIcon(pRun);
               }
            
        });
        
        move2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               for(Pokemon pokemon: pokemons)
			pokemons.get(1).move();
               area.setText(printPokemons(pokemons,1));
              image.setIcon(koi1);
               }
            
        });
              
        new1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(pik1);  
              area.setText(printPokemons(pokemons,0));
            }
        });
        new2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              image.setIcon(koi1);  
              area.setText(printPokemons(pokemons,1));
            }
        });
        
        attack1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               for(Pokemon pokemon: pokemons)
			pokemons.get(0).reducedHealth(5);
               area.setText(printPokemons(pokemons,0));
              image.setIcon(pATK);
               }
            
        });
        
        attack2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               for(Pokemon pokemon: pokemons)
			pokemons.get(1).reducedHealth(5);
               area.setText(printPokemons(pokemons,1));
              image.setIcon(kATK);
               }
            
        });
        
        p0.add(new1);
        p0.add(eat1);
        p0.add(move1);
        p0.add(attack1);
        
        p1.add(new2);
        p1.add(eat2);
        p1.add(move2);
        p1.add(attack2);
        
        p2.add(image);
        p3.add(area);
        
        c.add(p0, BorderLayout.PAGE_START);
        c.add(p1, BorderLayout.PAGE_END);
        c.add(p2, BorderLayout.CENTER);
        c.add(p3, BorderLayout.LINE_END);

        //set others
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        c.setSize(700,900);
        setVisible(true);
        
    }
}
