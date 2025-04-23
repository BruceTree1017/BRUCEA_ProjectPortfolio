# Final Project CMSC 140
# Lilia Bodnar & Adam Bruce
# WHRTLUHC

import random as rand
import re as regex

def wordleGame():
    print("Welcome to our Wordle game! Try and find the five letter word before running out of guesses.")
    print("")
    print("Levels: ")
    print("1: Easy (8 guesses)")
    print("2: Medium (6 guesses)")
    print("3: Hard (4 guesses)")
    print("")
    guessLevel = input("Enter the number corresponding with the number of guesses you would like: ")
    guessedWords = []

    # run the following while IF guessLevel has a letter and is not 1, 2, or 3
    while(regex.search('[a-zA-Z]', guessLevel) != None or (int(guessLevel) != 1 and int(guessLevel) != 2 and int(guessLevel) != 3)):
        guessLevel = input("That was not a valid level. Please try again: ")
    if(int(guessLevel) == 1):
        numGuesses = 8
        guessesLeft = 8
    elif(int(guessLevel) == 2):
        numGuesses = 6
        guessesLeft = 6
    else:
        numGuesses = 4
        guessesLeft = 4

# import doc from Prof G and generate a random word from there
    # learned how to import a file from https://datagy.io/python-read-text-file/ and https://www.geeksforgeeks.org/reading-writing-text-files-python/ and https://www.geeksforgeeks.org/pulling-a-random-word-or-string-from-a-line-in-a-text-file-in-python/
    # Permission was acquired from Professor Gregg on 10092022 via email
    
    # open the file as file, split by whitespace, and select a random word with rand
    with open("wordle.txt", "r") as file:
        words = file.read()
        seperatedWords = list(map(str, words.split()))
        randomWord = rand.choice(seperatedWords)

    # 1. write a loop here that runs for the number of guesses the user had to guess the random word
        # 1.2 write an if/else to tell them if they got it right or wrong or to guess again or to say they lost and print out the word
    for _ in range(numGuesses):
        userGuess = input("Please guess the five letter word: ")
        while(len(userGuess) != 5):
            print("")
            print("You still have", guessesLeft, "guesses remaining")
            userGuess = input("Please guess a 5 letter word: ")
        while(userGuess not in seperatedWords):
            print("")
            print("Your word is not in the list of possible words. Please try again")
            print("You still have", guessesLeft, "guesses remaining")
            userGuess = input()
        userGuess = str(userGuess).lower()
        guessedWords += [userGuess]
        guessesLeft -= 1
        correctLetters = ""

        if userGuess == randomWord:
            print("")
            print("You won! Thanks for playing :^)")
            break
        else: 
            for letter in range(len(userGuess)):
                if userGuess[letter] == randomWord[letter]:
                    correctLetters += userGuess[letter]
                else:
                    correctLetters += "-"
            print("")
            print("You have", guessesLeft, "guesses remaining")
        print("Your correct placements are:", correctLetters)
        print("You have guessed the following words:", *guessedWords)
        print("")
    if(guessesLeft == 0 and userGuess != randomWord):
        print("")
        print("You didn't guess the word, but you can try again with a different word. The random word was",randomWord)

def playWordle():
    playAgain = str(input("Do you want to play wordle? "))
    yes_regex = regex.compile(r'(Y|y)(es)?$') # a regex for valid forms of yes
    no_regex = regex.compile(r'(N|n)(o)?$') # a regex for valid forms of no
    # while loop checks to see if they entered a valid yes/no and runs until they do; not working right but the program still runs
    while not regex.match(yes_regex, playAgain) and not regex.match(no_regex, playAgain):
        playAgain = input("Please enter a valid form of yes or no. Valid Forms: Yes, Y, yes, y, No, N, no, n: ")

    # this while loop runs while playAgain is yes and terminates when it is not and also check to see if playAgain is a valid form of yes/no
    while(regex.match(yes_regex, playAgain)):
        while not regex.match(yes_regex, playAgain) and not regex.match(no_regex, playAgain):
            playAgain = str(input("Please enter a valid form of yes or no. Valid Forms: Yes, Y, yes, y, No, N, no, n: "))

        if regex.match(yes_regex, playAgain):
            print("")
            print("---------------------------")
            print("")
            wordleGame()
            print("")
            playAgain = str(input("Do you want to play again? (yes/no) "))
            while not regex.match(yes_regex, playAgain) and not regex.match(no_regex, playAgain):
                playAgain = str(input("Please enter a valid form of yes or no. Valid Forms: Yes, Y, yes, y, No, N, no, n: "))
    # this will run once they say no
    print("Okay! Have a nice day!")

playWordle()