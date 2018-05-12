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
public class PokemonSkill{
	private String name;
	private int damage;

	public PokemonSkill(String name, int damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "thunder shock":
				skill = new PokemonSkill("Thunder Shock", 40);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt", 90);
				break;
			case "tail whip":
				skill = new PokemonSkill("Tail Whip", 10);
				break;
			case "Water Pulse":
				skill = new PokemonSkill("Water Pulse", 100);
				break;
                        case "Damp":
				skill = new PokemonSkill("Damp", 10);
				break;
			case "Cloud Nine":
				skill = new PokemonSkill("Cloud Nine", 100);
				break;        
		}
		return skill;
	}
}
