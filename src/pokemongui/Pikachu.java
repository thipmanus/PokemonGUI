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
public class Pikachu extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 500;
	public Pikachu(){
		super("Pikachu",
		      (int) Math.floor(Math.random() * 501)+ 100,(int) Math.floor(Math.random() * 21) + 40);

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
	}

	public void move(){
		this.run();
	}

	public void run(){
		this.reducedWeight(1);
	}

	public void walk(){
		this.reducedHealth(1);
	}

}
