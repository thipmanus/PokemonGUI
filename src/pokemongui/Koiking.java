/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongui;

/**
 *
 * @author rebor
 */
public class Koiking extends Pokemon implements Swimmable {
    private static final int maxGroupHealth = 300;
    public Koiking() {
		super("Koyking",
		      (int) Math.floor(Math.random() * 301)+100,(int) Math.floor(Math.random() * 21)+ 40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Tail Whip");
                this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pulse");
	}

    public void swim() {
        this.reducedWeight(1);
    }

    public void move() {
       this.swim();
    }
 
}