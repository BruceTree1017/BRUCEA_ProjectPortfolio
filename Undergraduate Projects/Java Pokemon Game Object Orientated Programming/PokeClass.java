public class PokeClass {
    private String Pokemon;
    public static final String[] SQUIRTLEMOVES = {"Heal (H)", "WaterGun (A)", "Tackle (B)"};
    public static final String[] CHARMANDERMOVES = {"Scratch (M)", "FlameThrower (A)", "Tackle (B)"};
    public static final String[] BULBASAURMOVES = {"TailWhip (M)", "LeafBlade (A)", "Tackle (B)"};
    public static final String[] WARTORTLEMOVES = {"Heal (H)", "WaterGun (A)", "HydroPump (A)"};
    public static final String[] CHARMELEONMOVES = {"Scratch (M)", "FlameThrower (A)", "DragonPulse (A)"};
    public static final String[] IVYSAURMOVES = {"TailWhip (M)", "LeafBlade (A)", "FlowerPower (H)"};
    public static final String[] BLASTOISEMOVES = {"Surf (A)", "RainDance (H/A)", "HydroPump (A)"};
    public static final String[] CHARIZARDMOVES = {"FireBlast (A)", "DragonBreath (H/A)", "DragonPulse (A)"};
    public static final String[] VENUSAURMOVES = {"RazorLeaf (A)", "GigaDrain (H/A)", "FlowerPower (H)"};
    public static final String[] DARKRAIMOVES = {"PlasmaBall (A)", "ShadowHunter (A)", "Nightmare (M)"};
    public static final String[] ARCANINEMOVES = {"FireFang (A)", "Bite (A)", "ExtremeHeal (H)"}; 
    public static final String[] ARCEUSMOVES = {"HyperBeam (A)", "CosmicPower (H/A)", "PerishSong (H/A)"}; 


    public PokeClass(String givenPokemon){
        this.Pokemon = givenPokemon;
    }

    public String starterSelected(){
        String lowerPokemon = this.Pokemon.toLowerCase();
        if(lowerPokemon.equals("bulbasaur") || lowerPokemon.equals("charmander") || lowerPokemon.equals("squirtle")){
            System.out.println("Congratulations! You chose " + lowerPokemon + " Good luck, and battle with heart!");
            System.out.println(" ");
            return lowerPokemon;
        } else {
            return "Please enter a valid pokemon or spell the Pokemons name correctly to play.";
        }
    }

    public void currentPokeMoves(){
        String lowerPokemon = this.Pokemon.toLowerCase();
        if(lowerPokemon.equals("squirtle")){
            for(String squirMove : SQUIRTLEMOVES){
                System.out.println(squirMove);
            }
        } else if (lowerPokemon.equals("charmander")){
            for(String charMove : CHARMANDERMOVES){
                System.out.println(charMove);
            }
        } else if (lowerPokemon.equals("bulbasaur")) {
            for(String bulbMove : BULBASAURMOVES){
                System.out.println(bulbMove);
            }
        } else if (lowerPokemon.equals("wartortle")){
            for(String warMove : WARTORTLEMOVES){
                System.out.println(warMove);
            }
        } else if (lowerPokemon.equals("charmeleon")){
            for(String meleonMove : CHARMELEONMOVES){
                System.out.println(meleonMove);
            }
        } else if (lowerPokemon.equals("ivysaur")){
            for(String ivyMove : IVYSAURMOVES){
                System.out.println(ivyMove);
            }
        } else if (lowerPokemon.equals("blastoise")){
            for(String blasMove : BLASTOISEMOVES){
                System.out.println(blasMove);
            }
        } else if (lowerPokemon.equals("charizard")){
            for(String zardMove : CHARIZARDMOVES){
                System.out.println(zardMove);
            }
        } else if (lowerPokemon.equals("venusaur")){
            for(String venMove : VENUSAURMOVES){
                System.out.println(venMove);
            }
        } else if (lowerPokemon.equals("darkrai")){
            for(String darkMove : DARKRAIMOVES){
                System.out.println(darkMove);
            }
        } else if (lowerPokemon.equals("arcanine")){
            for(String arcaneMove : ARCANINEMOVES){
                System.out.println(arcaneMove);
            }
        } else if (lowerPokemon.equals("arceus")){
            for(String arceusMove : ARCEUSMOVES){
                System.out.println(arceusMove);
            }
        } else {
            System.out.println("Not a valid Pokemon");
        }
        System.out.println(" ");
    }

    public String getPokemon(){
        return this.Pokemon.toLowerCase();
    }

    public String setPokemon(String newPokemon){
        this.Pokemon = newPokemon.toLowerCase();
        return this.Pokemon;
    }



}
