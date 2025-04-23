import java.util.*;

public class PokeGame {
    public static void gameOn(){
        Scanner userInput = new Scanner(System.in);
        while(true){
        System.out.println(" ");
        System.out.println("Welcome to Pokemon Lawrentian! Would you like an introduction to how battling works (Yes or No)? This is Recommended for first time players.");
        String tutorial = userInput.nextLine();
        String lowerTutorial = tutorial.toLowerCase();
        if(lowerTutorial.equals("yes")){
            String userTutorial = gameMaterials.tutorial();
            System.out.println(userTutorial);
            System.out.println(" ");
        } else if (lowerTutorial.equals("no")) {
            gameMaterials.introduction();
            gameMaterials.chooseStarterPokemon();
            String pokemonChoice = userInput.nextLine();
            PokeClass userPokemon = new PokeClass(pokemonChoice);
            String pokemonResult = userPokemon.starterSelected();
            if(pokemonResult.equals(userPokemon.getPokemon())){
                String darkGymOutcome = darkGym(userPokemon);
                if(darkGymOutcome.equals("Okay, play again when you are ready to battle!") || darkGymOutcome.equals("Please enter Yes or No to continue next time.")){
                    System.out.println(darkGymOutcome);
                    break;
                } else if (darkGymOutcome.equals("Congrats, you won! You recieved the Darkness Badge from Cristian!")){
                    System.out.println(darkGymOutcome);
                    System.out.println(" ");
                    if(userPokemon.getPokemon().equals("squirtle")){
                        System.out.println(" ");
                        System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String squirtleEvolution = "wartortle";
                        userPokemon.setPokemon(squirtleEvolution);
                        System.out.println("Congratulations! your squirtle evolved into " + userPokemon.getPokemon() + "!" );
                        System.out.println(userPokemon.getPokemon() + " forgot how to use tackle and learned HydroPump!");
                        System.out.println(" ");
                        System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                        userPokemon.currentPokeMoves();
                        System.out.println(" ");
                        String fireGymOutcome = fireGym(userPokemon);
                        if(fireGymOutcome.equals("Okay, play again when you are ready to battle!") || fireGymOutcome.equals("Please enter Yes or No to continue next time.")){
                            System.out.println(fireGymOutcome);
                            break;
                        } else if(fireGymOutcome.equals("You were no match for the gym leader. Better luck next time.")){
                            System.out.println(fireGymOutcome);
                            break;
                        } else if(fireGymOutcome.equals("Congrats, you won! You recieved the Fire Badge from JP!")){
                            System.out.println(fireGymOutcome);
                            System.out.println(" ");
                            if(userPokemon.getPokemon().equals("wartortle")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*STTTOOOOOOOOIIIISSSSEEEEE!!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String wartortleEvolution = "blastoise";
                                userPokemon.setPokemon(wartortleEvolution);
                                System.out.println("Congratulations! your wartortle evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use Heal and learned Surf!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use WaterGun and learned RainDance!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else if (userPokemon.getPokemon().equals("charmeleon")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*ZAAAAARRRRDDDD!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String charmeleonEvolution = "charizard";
                                userPokemon.setPokemon(charmeleonEvolution);
                                System.out.println("Congratulations! your charmeleon evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use Scratch and learned FireBlast!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use FlameThrower and learned DragonBreath!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else if (userPokemon.getPokemon().equals("ivysaur")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*SAAAAAAAAAUUUUUURRRRRRR!!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String ivysaurEvolution = "venusaur";
                                userPokemon.setPokemon(ivysaurEvolution);
                                System.out.println("Congratulations! your ivysaur evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use TailWhip and learned RazorLeaf!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use LeafBlade and learned GigaDrain!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else {
                                System.out.println("Something went wrong, this should never print!");
                            }
                        } else {
                            System.out.println("This should never print");
                            break;
                        }
                    } else if(userPokemon.getPokemon().equals("charmander")){
                        System.out.println(" ");
                        System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String charmanderEvolution = "charmeleon";
                        userPokemon.setPokemon(charmanderEvolution);
                        System.out.println("Congratulations! your charmander evolved into " + userPokemon.getPokemon() + "!" );
                        System.out.println(userPokemon.getPokemon() + " forgot how to use tackle and learned DragonPulse!");
                        System.out.println(" ");
                        System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                        userPokemon.currentPokeMoves();
                        System.out.println(" ");
                        String fireGymOutcome = fireGym(userPokemon);
                        if(fireGymOutcome.equals("Okay, play again when you are ready to battle!") || fireGymOutcome.equals("Please enter Yes or No to continue next time.")){
                            System.out.println(fireGymOutcome);
                            break;
                        } else if(fireGymOutcome.equals("You were no match for the gym leader. Better luck next time.")){
                            System.out.println(fireGymOutcome);
                            break;
                        } else if(fireGymOutcome.equals("Congrats, you won! You recieved the Fire Badge from JP!")){
                            System.out.println(fireGymOutcome);
                            System.out.println(" ");
                            if(userPokemon.getPokemon().equals("wartortle")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*STTTOOOOOOOOIIIISSSSEEEEE!!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String wartortleEvolution = "blastoise";
                                userPokemon.setPokemon(wartortleEvolution);
                                System.out.println("Congratulations! your wartortle evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use Heal and learned Surf!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use WaterGun and learned RainDance!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else if (userPokemon.getPokemon().equals("charmeleon")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*ZAAAAARRRRDDDD!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String charmeleonEvolution = "charizard";
                                userPokemon.setPokemon(charmeleonEvolution);
                                System.out.println("Congratulations! your charmeleon evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use Scratch and learned FireBlast!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use FlameThrower and learned DragonBreath!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else if (userPokemon.getPokemon().equals("ivysaur")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*SAAAAAAAAAUUUUUURRRRRRR!!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String ivysaurEvolution = "venusaur";
                                userPokemon.setPokemon(ivysaurEvolution);
                                System.out.println("Congratulations! your ivysaur evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use TailWhip and learned RazorLeaf!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use LeafBlade and learned GigaDrain!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else {
                                System.out.println("Something went wrong, this should never print!");
                            }
                        } else {
                            System.out.println("Something went wrong, this should never print!");
                            break;
                        }
                    } else if (userPokemon.getPokemon().equals("bulbasaur")){
                        System.out.println(" ");
                        System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                        System.out.println("....");
                        System.out.println("....");
                        System.out.println("*Muffled Yelps*");
                        System.out.println("....");
                        System.out.println("....");
                        String bulbasaurEvolution = "ivysaur";
                        userPokemon.setPokemon(bulbasaurEvolution);
                        System.out.println("Congratulations! your bulbasaur evolved into " + userPokemon.getPokemon() + "!" );
                        System.out.println(userPokemon.getPokemon() + " forgot how to use tackle and learned FlowerPower!");
                        System.out.println(" ");
                        System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                        userPokemon.currentPokeMoves();
                        System.out.println(" ");
                        String fireGymOutcome = fireGym(userPokemon);
                        if(fireGymOutcome.equals("Okay, play again when you are ready to battle!") || fireGymOutcome.equals("Please enter Yes or No to continue next time.")){
                            System.out.println(fireGymOutcome);
                            break;
                        } else if(fireGymOutcome.equals("You were no match for the gym leader. Better luck next time.")){
                            System.out.println(fireGymOutcome);
                            break;
                        } else if(fireGymOutcome.equals("Congrats, you won! You recieved the Fire Badge from JP!")){
                            System.out.println(fireGymOutcome);
                            System.out.println(" ");
                            if(userPokemon.getPokemon().equals("wartortle")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*STTTOOOOOOOOIIIISSSSEEEEE!!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String wartortleEvolution = "blastoise";
                                userPokemon.setPokemon(wartortleEvolution);
                                System.out.println("Congratulations! your wartortle evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use Heal and learned Surf!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use WaterGun and learned RainDance!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else if (userPokemon.getPokemon().equals("charmeleon")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*ZAAAAARRRRDDDD!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String charmeleonEvolution = "charizard";
                                userPokemon.setPokemon(charmeleonEvolution);
                                System.out.println("Congratulations! your charmeleon evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use Scratch and learned FireBlast!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use FlameThrower and learned DragonBreath!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else if (userPokemon.getPokemon().equals("ivysaur")){
                                System.out.println(" ");
                                System.out.println("What's this? " + userPokemon.getPokemon() + " is evolving!");
                                System.out.println("....");
                                System.out.println("....");
                                System.out.println("*SAAAAAAAAAUUUUUURRRRRRR!!!!*");
                                System.out.println("....");
                                System.out.println("....");
                                String ivysaurEvolution = "venusaur";
                                userPokemon.setPokemon(ivysaurEvolution);
                                System.out.println("Congratulations! your ivysaur evolved into " + userPokemon.getPokemon() + "!" );
                                System.out.println(userPokemon.getPokemon() + " forgot how to use TailWhip and learned RazorLeaf!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + " forgot how to use LeafBlade and learned GigaDrain!");
                                System.out.println(" ");
                                System.out.println(userPokemon.getPokemon() + "'s current moves are: ");
                                userPokemon.currentPokeMoves();
                                System.out.println(" ");
                                String grandMasterOutcome = grandMaster(userPokemon);
                                if(grandMasterOutcome.equals("Okay, play again when you are ready to battle!") || grandMasterOutcome.equals("Please enter Yes or No to continue next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("You were no match for the Grand Master. Better luck next time.")){
                                    System.out.println(grandMasterOutcome);
                                    break;
                                } else if (grandMasterOutcome.equals("Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!")){
                                    System.out.println(grandMasterOutcome);
                                    gameMaterials.outro();
                                    break;
                                } else {
                                    System.out.println("Something went wrong, this should never print!");
                                    break;
                                }
                            } else {
                                System.out.println("Something went wrong, this should never print!");
                            }
                        } else {
                            System.out.println("This should never print");
                            break;
                        }
                    } else {
                        System.out.println("Something went wrong, this should never print!");
                        break;
                    }
                } else if (darkGymOutcome.equals("You were no match for the gym leader. Better luck next time.")){
                    System.out.println(darkGymOutcome);
                    break;
                }
            } else{
                System.out.println(pokemonResult);
                break;
            }
        } else {
            System.out.println("Please enter a valid form of Yes or No.");
        }
        }
    }

    public static String darkGym(PokeClass userPokemon){
        String[] darkraiPossibleMoves = {"PlasmaBall", "ShadowHunter", "Nightmare"};
        Scanner userInput = new Scanner(System.in);
        Random pokeHP = new Random();
        System.out.println("Welcome to your first battle with the elite three!");
        System.out.println("Before you begin, let me introduce you to " + userPokemon.getPokemon() + "'s current battle moves:");
        System.out.println(" ");
        userPokemon.currentPokeMoves();
        System.out.println("Would you like to start the battle (Yes or No)?");
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        } else if (lowerBattleTime.equals("yes")){
            System.out.println(" ");
            int darkraiHealth = pokeHP.nextInt(50,100);
            int usersPokemonHealth = pokeHP.nextInt(65,150);
            String gymLeader = "Cristian";
            String leadersPokemon = "Darkrai";
            PokeClass darkPokemon = new PokeClass(leadersPokemon);
            BattleClass userBattler = new BattleClass(usersPokemonHealth, userPokemon.getPokemon());
            BattleClass darkraiBattler = new BattleClass(darkraiHealth, leadersPokemon.toLowerCase());
            System.out.println("Hello, my name is " + gymLeader + ", I am the leader of the dark type gym for the Elite Three!");
            System.out.println("My Pokemon is " + leadersPokemon + ". Good luck in battle, you will certainly need it!");
            System.out.println(" ");
            System.out.println("Beware, " + leadersPokemon + " is powerful, he has these moves: ");
            darkPokemon.currentPokeMoves();
            while(userBattler.getHP() >= 0 && darkraiBattler.getHP() >= 0){
                System.out.println("Your Moves: ");
                userPokemon.currentPokeMoves();
                System.out.println(userBattler.getPokemon() + "'s current Health is: " + userBattler.getHP());
                System.out.println(darkraiBattler.getPokemon() + "'s current health is: " + darkraiBattler.getHP());
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        System.out.println("What battle move would you like to use?");
                        String pickAttack = userInput.nextLine();
                        System.out.println(" ");
                        userBattler.userAttack(darkraiBattler, pickAttack);
                    }
                    if(i == 1){
                        String moveChoice = darkraiPossibleMoves[(int) (Math.random() * darkraiPossibleMoves.length)];
                        System.out.println(" ");
                        darkraiBattler.leaderAttack(userBattler, moveChoice);
                        System.out.println(" ");
                    }
                }
                if(userBattler.getHP() <= 0) {
                    return "You were no match for the gym leader. Better luck next time.";
                } 
                if (darkraiBattler.getHP() <= 0){
                    return "Congrats, you won! You recieved the Darkness Badge from Cristian!";
                }
                System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
                System.out.println(" ");
            } 
        } else {
            return "Please enter Yes or No to continue next time.";
        }
    return "This is for Java to be satisfied. It will never return";
    }

    public static String fireGym(PokeClass userPokemon){
        String [] arcaninePossibleMoves = {"FireFang", "Bite", "ExtremeHeal"};
        Scanner userInput = new Scanner(System.in);
        Random pokeHP = new Random();
        System.out.println("Welcome to your second battle with the elite three!");
        System.out.println("Before battle comenses, would you like a refresher of " + userPokemon.getPokemon() + "s current battle moves?");
        while(true){
            String moveRefresher = userInput.nextLine();
            String lowerMoveRefresher = moveRefresher.toLowerCase();
            System.out.println(" ");
            if(lowerMoveRefresher.equals("yes")){
                userPokemon.currentPokeMoves();
                break;
            } else if (lowerMoveRefresher.equals("no")) {
                System.out.print("Okay, get ready for battle then!");
                System.out.println(" ");
                break;
            } else {
                System.out.println("Please enter a valid form of yes or no.");
                System.out.println(" ");
                System.out.println("Would you like a refresher of " + userPokemon.getPokemon() + "s current battle moves?");
            }
        }
        System.out.println(" ");
        System.out.println("Would you like to start the battle (Yes or No)?");
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        } else if (lowerBattleTime.equals("yes")){
            System.out.println(" ");
            int arcanineHealth = pokeHP.nextInt(80,150);
            int usersPokemonHealth = pokeHP.nextInt(85,160);
            String gymLeader = "JP";
            String leadersPokemon = "Arcanine";
            PokeClass firePokemon = new PokeClass(leadersPokemon);
            BattleClass userBattler = new BattleClass(usersPokemonHealth, userPokemon.getPokemon());
            BattleClass arcanineBattler = new BattleClass(arcanineHealth, leadersPokemon.toLowerCase());
            System.out.println("Hello, my Name is " + gymLeader + " the fire gym leader!");
            System.out.println("Well, you made it past Cristian, but you will be no match for my Pokemon " + firePokemon.getPokemon() + ".");
            System.out.println("I've spent my entire life training for these battles, and I do not intend to lose to you!");
            System.out.println(" ");
            System.out.println("Beware, " + firePokemon.getPokemon() + " is powerful, " + firePokemon.getPokemon() + " has these moves: ");
            firePokemon.currentPokeMoves();
            while(userBattler.getHP() >= 0 && arcanineBattler.getHP() >= 0){
                System.out.println("Your Moves: ");
                userPokemon.currentPokeMoves();
                System.out.println(userBattler.getPokemon() + "'s current Health is: " + userBattler.getHP());
                System.out.println(arcanineBattler.getPokemon() + "'s current health is: " + arcanineBattler.getHP());
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        System.out.println("What battle move would you like to use?");
                        String pickAttack = userInput.nextLine();
                        System.out.println(" ");
                        userBattler.userAttack(arcanineBattler, pickAttack);
                    }
                    if(i == 1){
                        String moveChoice = arcaninePossibleMoves[(int) (Math.random() * arcaninePossibleMoves.length)];
                        System.out.println(" ");
                        arcanineBattler.leaderAttack(userBattler, moveChoice);
                        System.out.println(" ");
                    }
                }
                if(userBattler.getHP() <= 0) {
                    return "You were no match for the gym leader. Better luck next time.";
                } 
                if (arcanineBattler.getHP() <= 0){
                    return "Congrats, you won! You recieved the Fire Badge from JP!";
                }
                System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
                System.out.println(" ");
            } 
        } else {
            return "Please enter Yes or No to continue next time.";
        }
    return "This is for Java to be satisfied. It will never return";
    }

    public static String grandMaster(PokeClass userPokemon){
        String [] arceusPossibleMoves = {"HyperBeam", "CosmicPower", "PerishSong"};
        Random pokeHP = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Grand Master battle!!");
        System.out.println("Before battle comenses, would you like a refresher of " + userPokemon.getPokemon() + "s current battle moves?");
        while(true){
            String moveRefresher = userInput.nextLine();
            String lowerMoveRefresher = moveRefresher.toLowerCase();
            System.out.println(" ");
            if(lowerMoveRefresher.equals("yes")){
                userPokemon.currentPokeMoves();
                break;
            } else if (lowerMoveRefresher.equals("no")) {
                System.out.print("Okay, get ready for battle then!");
                System.out.println(" ");
                break;
            } else {
                System.out.println("Please enter a valid form of yes or no.");
                System.out.println(" ");
                System.out.println("Would you like a refresher of " + userPokemon.getPokemon() + "s current battle moves?");
            }
        }
        gameMaterials.acklesIntro();
        String battleTime = userInput.nextLine();
        String lowerBattleTime = battleTime.toLowerCase();
        if(lowerBattleTime.equals("no")){
            return "Okay, play again when you are ready to battle!";
        } else if (lowerBattleTime.equals("yes")){
            System.out.println(" ");
            String gymLeader = "Professor Ackles";
            String leadersPokemon = "Arceus";
            int arceusHealth = pokeHP.nextInt(200,410);
            int usersPokemonHealth = pokeHP.nextInt(220,400);
            PokeClass grandMasterPokemon = new PokeClass(leadersPokemon);
            BattleClass userBattler = new BattleClass(usersPokemonHealth, userPokemon.getPokemon());
            BattleClass arceusBattler = new BattleClass(arceusHealth, leadersPokemon.toLowerCase());
            System.out.println("Welcome trainer, my name is " + gymLeader + " the Grand Master of the Elite Three.");
            System.out.println("Professor Bruce told me you had the pois to come this far, and here you are.");
            System.out.println("Well, my " + leadersPokemon + " has been waiting for a noble challenger like you.");
            System.out.println("In learning you will teach, and in teaching I shall learn.");
            System.out.println(" ");
            System.out.println("Beware, " + grandMasterPokemon.getPokemon() + " is powerful, " + grandMasterPokemon.getPokemon() + " has these moves: ");
            grandMasterPokemon.currentPokeMoves();
            while(userBattler.getHP() >= 0 && arceusBattler.getHP() >= 0){
                System.out.println("Your Moves: ");
                userPokemon.currentPokeMoves();
                System.out.println(userBattler.getPokemon() + "'s current Health is: " + userBattler.getHP());
                System.out.println(arceusBattler.getPokemon() + "'s current health is: " + arceusBattler.getHP());
                System.out.println(" ");
                for(int i = 0; i < 2; i++){
                    if(i == 0){
                        System.out.println("What battle move would you like to use?");
                        String pickAttack = userInput.nextLine();
                        System.out.println(" ");
                        userBattler.userAttack(arceusBattler, pickAttack);
                    }
                    if(i == 1){
                        String moveChoice = arceusPossibleMoves[(int) (Math.random() * arceusPossibleMoves.length)];
                        System.out.println(" ");
                        arceusBattler.leaderAttack(userBattler, moveChoice);
                        System.out.println(" ");
                    }
                }
                if(userBattler.getHP() <= 0) {
                    return "You were no match for the Grand Master. Better luck next time.";
                } 
                if (arceusBattler.getHP() <= 0){
                    return "Congrats, you won! You recieved the PokeMaster Badge and were crowned Grand Master by Professor Ackles!";
                }
                System.out.println("This turn has ended, both Pokemon still have health remaining. The next turn begins now!");
                System.out.println(" ");
            } 
        } else {
            return "Please enter Yes or No to continue next time.";
        }
    return "This is for Java to be satisfied. It will never return";
    }



    public static void main(String [] args){
    gameOn();
    }
}
