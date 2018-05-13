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
abstract class Pokemon{
	public final double maxHealth,startWeight;
	protected double health,weight;
	protected String name;
	protected PokemonSkill attackSkill;
	protected PokemonSkill untimatedSkill;

	public Pokemon(String name, double maxHealth,double startWeight){
		this.name = name;
		this.health = maxHealth;
		this.maxHealth = maxHealth;
                this.weight    = startWeight;
                this.startWeight = startWeight;
	}

        public double getWeight(){
            return this.weight;
        }
        
	public double getHealth(){
		return this.health;
	}

	public String getName(){
		return this.name;
	}
	
	public void eat(Berry berry){
		this.health += berry.getRestoreValue();
		if(this.health > this.maxHealth)
			this.health = this.maxHealth;
                this.weight += 1;
                if(this.weight > 80)
			this.health = 0.1;
	}

	public void attack(Pokemon rival){
		rival.injure(this.attackSkill);
	}

	public void untimate(Pokemon rival){
		rival.injure(this.untimatedSkill);
	}

	public void injure(PokemonSkill skill){
		this.reducedHealth(skill.getDamage());
	}

	public void reducedHealth(double value){
		this.health -= value;
		if(this.health <= 0)
			this.health = 0.1;
	}
        
        public void reducedWeight(double value){
		this.weight -= value;
		if(this.weight < 20)
			this.weight = 20;
	}
        
        public void recoveryALL(){
		this.health = this.maxHealth;
                this.weight = this.startWeight;
	}
        

	abstract public void move();


}
