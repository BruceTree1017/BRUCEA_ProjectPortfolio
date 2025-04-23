import java.util.*;

public class BattleClass {
    private int pokemonHealth;
    private String battlersPokemon;
    private Random basicMove;
    private Random mediumMove;
    private Random advancedMove;
    private Random healingMove;
    public static final String[] SQUIRTLEMOVES = {"Heal", "WaterGun", "Tackle"};
    public static final String[] CHARMANDERMOVES = {"Scratch", "FlameThrower", "Tackle"};
    public static final String[] BULBASAURMOVES = {"TailWhip", "LeafBlade", "Tackle"};
    public static final String[] WARTORTLEMOVES = {"Heal", "WaterGun", "HydroPump"};
    public static final String[] CHARMELEONMOVES = {"Scratch", "FlameThrower", "DragonPulse"};
    public static final String[] IVYSAURMOVES = {"TailWhip", "LeafBlade", "FlowerPower"};
    public static final String[] BLASTOISEMOVES = {"Surf", "RainDance", "HydroPump"};
    public static final String[] CHARIZARDMOVES = {"FireBlast", "DragonBreath", "DragonPulse"};
    public static final String[] VENUSAURMOVES = {"RazorLeaf", "GigaDrain", "FlowerPower"};
    public static final String[] DARKRAIMOVES = {"PlasmaBall", "ShadowHunter", "Nightmare"};
    public static final String[] ARCANINEMOVES = {"FireFang", "Bite", "ExtremeHeal"}; 
    public static final String[] ARCEUSMOVES = {"HyperBeam", "CosmicPower", "PerishSong"}; 


    public BattleClass(int pokeHP, String Pokemon){
        this.pokemonHealth = pokeHP;
        this.battlersPokemon = Pokemon;
        this.basicMove = new Random();
        this.mediumMove = new Random();
        this.advancedMove = new Random();
        this.healingMove = new Random();
    }

    public void userAttack(BattleClass otherPokemon, String moveChoice) {
        if(this.battlersPokemon.equals("squirtle")){
            if(Arrays.asList(SQUIRTLEMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for (String attack : SQUIRTLEMOVES) {
                if(attack.equals(moveChoice) && attack.equals("Heal")){
                    int healingResult = healingMove.nextInt(20);
                    this.pokemonHealth += healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("WaterGun")){
                    int advancedAttack = advancedMove.nextInt(30);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("Tackle")){
                    int basicAttack = basicMove.nextInt(7,15);
                    otherPokemon.pokemonHealth -= basicAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + basicAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("charmander")){
            if(Arrays.asList(CHARMANDERMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : CHARMANDERMOVES){
                if(attack.equals(moveChoice) && attack.equals("Scratch")){
                    int mediumAttack = mediumMove.nextInt(10,20);
                    otherPokemon.pokemonHealth -= mediumAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + mediumAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("FlameThrower")){
                    int advancedAttack = advancedMove.nextInt(30);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("Tackle")){
                    int basicAttack = basicMove.nextInt(7,15);
                    otherPokemon.pokemonHealth -= basicAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + basicAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("bulbasaur")) {
            if(Arrays.asList(BULBASAURMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : BULBASAURMOVES){
                if(attack.equals(moveChoice) && attack.equals("TailWhip")){
                    int mediumAttack = mediumMove.nextInt(10,20);
                    otherPokemon.pokemonHealth -= mediumAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + mediumAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("LeafBlade")){
                    int advancedAttack = advancedMove.nextInt(30);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("Tackle")){
                    int basicAttack = basicMove.nextInt(7,15);
                    otherPokemon.pokemonHealth -= basicAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + basicAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("wartortle")){
            if(Arrays.asList(WARTORTLEMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : WARTORTLEMOVES){
                if(attack.equals(moveChoice) && attack.equals("Heal")){
                    int healingResult = healingMove.nextInt(25,50);
                    this.pokemonHealth += healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("WaterGun")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("HydroPump")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("charmeleon")){
            if(Arrays.asList(CHARMELEONMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : CHARMELEONMOVES){
                if(attack.equals(moveChoice) && attack.equals("Scratch")){
                    int mediumAttack = mediumMove.nextInt(10,30);
                    otherPokemon.pokemonHealth -= mediumAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + mediumAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("FlameThrower")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("DragonPulse")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("ivysaur")){
            if(Arrays.asList(IVYSAURMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : IVYSAURMOVES){
                if(attack.equals(moveChoice) && attack.equals("TailWhip")){
                    int mediumAttack = mediumMove.nextInt(10,30);
                    otherPokemon.pokemonHealth -= mediumAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + mediumAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("LeafBlade")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("FlowerPower")){
                    int healingResult = healingMove.nextInt(25,50);
                    this.pokemonHealth += healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("blastoise")){
            if(Arrays.asList(BLASTOISEMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : BLASTOISEMOVES){
                if(attack.equals(moveChoice) && attack.equals("RainDance")){
                    int healingResult = healingMove.nextInt(30, 80);
                    this.pokemonHealth += healingResult;
                    otherPokemon.pokemonHealth -= healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                    System.out.println(this.battlersPokemon + " dealt " + healingResult + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("Surf")){
                    int advancedAttack = advancedMove.nextInt(50, 100);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("HydroPump")){
                    int advancedAttack = advancedMove.nextInt(50, 100);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("charizard")){
            if(Arrays.asList(CHARIZARDMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : CHARIZARDMOVES){
                if(attack.equals(moveChoice) && attack.equals("DragonBreath")){
                    int healingResult = healingMove.nextInt(30, 80);
                    this.pokemonHealth += healingResult;
                    otherPokemon.pokemonHealth -= healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                    System.out.println(this.battlersPokemon + " dealt " + healingResult + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("FireBlast")){
                    int advancedAttack = advancedMove.nextInt(50, 100);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("DragonPulse")){
                    int advancedAttack = advancedMove.nextInt(50, 100);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if (this.battlersPokemon.equals("venusaur")){
            if(Arrays.asList(VENUSAURMOVES).contains(moveChoice) == false){
                System.out.println("Your turn was skipped!");
                System.out.println("Enter a valid move or spell the move correctly next time! (Case Sensitive)");
            }
            for(String attack : VENUSAURMOVES){
                if(attack.equals(moveChoice) && attack.equals("GigaDrain")){
                    int healingResult = healingMove.nextInt(30, 80);
                    this.pokemonHealth += healingResult;
                    otherPokemon.pokemonHealth -= healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                    System.out.println(this.battlersPokemon + " dealt " + healingResult + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("FlowerPower")){
                    int healingResult = healingMove.nextInt(30, 80);
                    this.pokemonHealth += healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health. " +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("RazorLeaf")){
                    int advancedAttack = advancedMove.nextInt(50, 100);
                    otherPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + otherPokemon.battlersPokemon + ".");
                    System.out.println(otherPokemon.battlersPokemon + " now has " + otherPokemon.pokemonHealth + " health remaining.");
                } 
            }
        } else {
            System.out.println("Not a valid Pokemon.");
        }
    }

    public void leaderAttack(BattleClass usersPokemon, String moveChoice){
        if(this.battlersPokemon.equals("darkrai")){
            for (String attack : DARKRAIMOVES) {
                if(attack.equals(moveChoice) && attack.equals("PlasmaBall")){
                    int advancedAttack = advancedMove.nextInt(30);
                    usersPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("ShadowHunter")){
                    int advancedAttack = advancedMove.nextInt(30);
                    usersPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("Nightmare")){
                    int mediumAttack = mediumMove.nextInt(10,20);
                    usersPokemon.pokemonHealth -= mediumAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + mediumAttack + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                }
            }
        } else if(this.battlersPokemon.equals("arcanine")){
            for (String attack : ARCANINEMOVES) {
                if(attack.equals(moveChoice) && attack.equals("FireFang")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    usersPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("Bite")){
                    int advancedAttack = advancedMove.nextInt(2,60);
                    usersPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("ExtremeHeal")){
                    int healingResult = healingMove.nextInt(25,50);
                    this.pokemonHealth += healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health." +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                }
            }
        } else if(this.battlersPokemon.equals("arceus")){
            for (String attack : ARCEUSMOVES) {
                if(attack.equals(moveChoice) && attack.equals("CosmicPower")){
                    int healingResult = healingMove.nextInt(30, 80);
                    this.pokemonHealth += healingResult;
                    usersPokemon.pokemonHealth -= healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health." +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                    System.out.println(this.battlersPokemon + " dealt " + healingResult + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("PerishSong")){
                    int healingResult = healingMove.nextInt(30, 80);
                    this.pokemonHealth += healingResult;
                    usersPokemon.pokemonHealth -= healingResult;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " gained " + healingResult + " health." +  this.battlersPokemon + " now has " +  this.pokemonHealth + " health remaining.");
                    System.out.println(this.battlersPokemon + " dealt " + healingResult + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } else if(attack.equals(moveChoice) && attack.equals("HyperBeam")){
                    int advancedAttack = advancedMove.nextInt(50, 100);
                    usersPokemon.pokemonHealth -= advancedAttack;
                    System.out.println(this.battlersPokemon + " used " + moveChoice + ".");
                    System.out.println(this.battlersPokemon + " dealt " + advancedAttack + " damage to " + usersPokemon.battlersPokemon + ".");
                    System.out.println(usersPokemon.battlersPokemon + " now has " + usersPokemon.pokemonHealth + " health remaining.");
                } 
            }
        }
    }

    
    public String getPokemon(){
        return this.battlersPokemon.toLowerCase();
    }

    public int getHP(){
        return this.pokemonHealth;
    }

    public void setHP(int newHP) {
        this.pokemonHealth = newHP;
    }
}
