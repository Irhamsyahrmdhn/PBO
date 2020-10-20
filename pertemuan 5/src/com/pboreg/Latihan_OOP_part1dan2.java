package com.pboreg;

//Player
class Player{
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name= name;
        this.health= health;
    }
    void attack(Player opponent){
        double attackPower= this.weapon.attackPower;
        System.out.println(this.name + " Attacking " + opponent.name + " With Power " + attackPower);
        opponent.defense(attackPower);
    }
    void defense(double attackPower){
        double damage;
        if (this.armor.defensePower<attackPower){
            damage=attackPower -  this.armor.defensePower;
        }else{
            damage=0;
        }
        this.health -= damage;
        System.out.println(this.name + " Got Damage " + damage + "\n");
    }
    void equipWeapon(Weapon weapon){
        this.weapon= weapon;
    }
    void equipArmor(Armor armor){
        this.armor= armor;
    }
    void display(){
        System.out.println("Name= " + this.name);
        System.out.println("Health= " + this.health + " HP");
        this.weapon.display();
        this.armor.display();
    }
}
//Weapon
class Weapon{
    double attackPower;
    String name;
    Weapon(String name, double attackPower){
        this.name= name;
        this.attackPower= attackPower;
    }
    void display(){
        System.out.println("Weapon= " + this.name + " , Attack= " + this.attackPower);
    }
}
//Armour
class Armor{
    double defensePower;
    String name;
    Armor(String name, double defensePower){
        this.name= name;
        this.defensePower= defensePower;
    }
    void display(){
        System.out.println("Armorr= " + this.name + " , Defense= " + this.defensePower + "\n");
    }
}
public class Latihan_OOP_part1dan2 {
    public static void main(String[] args) {
        Player player1= new Player("Naruto", 100);
        Player player2= new Player("Sasuke", 90);
        Weapon Golok= new Weapon("Golok", 80);
        Weapon Katana= new Weapon("Katana", 82);
        Armor TitaniumArmor= new Armor("Titanium Armor", 50);
        Armor StainlesssteelArmor= new Armor("Stainless steel Armor", 45);

        player1.equipWeapon(Golok);
        player2.equipWeapon(Katana);
        player1.equipArmor(TitaniumArmor);
        player2.equipArmor(StainlesssteelArmor);
        player1.display();
        player2.display();

        System.out.println("\n==== BATTLEFIELD ====");
        System.out.println("\nSerangan-1");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nSerangan-2");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}