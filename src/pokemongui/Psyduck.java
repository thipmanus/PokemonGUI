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
public class Psyduck extends Pokemon implements Swimmable {
    private static final int maxGroupHealth = 300;
    public Psyduck() {
		super("Psyduck",
		      (int) Math.floor(Math.random() * 301)+100,(int) Math.floor(Math.random() * 21)+ 40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Damp");
                this.untimatedSkill = PokemonSkill.getPokemonSkill("Cloud Nine");
	}

    public void swim() {
        this.reducedWeight(0.5);
    }

    public void move() {
       this.swim();
    }
 
}