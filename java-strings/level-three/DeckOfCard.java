// Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class DeckOfCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the number of players
        System.out.println("Enter the number of players");
        int players = sc.nextInt();

        // Ask user for the number of cards per player
        System.out.println("Enter the number of cards");
        int cards = sc.nextInt();

        // Initialize the deck of 52 cards
        String[] deck = initializeDeck();

        // Shuffle the deck randomly
        String[] shuffledDeck = shuffleDeck(deck);

        // Distribute the shuffled deck among players
        String[][] playersDeck = distributeDeck(shuffledDeck, players, cards);

        // Display each player's cards
        printPlayersDeck(playersDeck);
    }

    // Initializes a standard deck of 52 playing cards
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Four suits
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"}; // Card ranks

        int numOfCards = suits.length * ranks.length; // 4 * 13 = 52 cards
        String[] deck = new String[numOfCards];

        // Generate the full deck by combining suits and ranks
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[ranks.length * i + j] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }

    // Shuffles the deck using the Fisher-Yates shuffle algorithm
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);

            // Swap the current card with a randomly chosen card
            String temp = deck[randomCardNumber];
            deck[randomCardNumber] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }

    // Distributes the shuffled deck among the players
    public static String[][] distributeDeck(String[] deck, int players, int cards) {
        // Validate that the requested number of cards can be distributed
        if (players * cards > deck.length) {
            System.out.println("Invalid input. Cannot distribute " + (players * cards) + " cards from a deck of " + deck.length + " cards.");
            System.exit(0); // Exit the program if the input is invalid
        }

        String[][] playersDeck = new String[players][cards];
        int cardNumber = 0;

        // Assign cards to each player in a round-robin manner
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cards; j++) {
                playersDeck[i][j] = deck[cardNumber++];
            }
        }
        return playersDeck;
    }

    // Prints the cards assigned to each player
    public static void printPlayersDeck(String[][] playersDeck) {
        for (int i = 0; i < playersDeck.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < playersDeck[i].length; j++) {
                System.out.println(playersDeck[i][j]); // Print each player's card
            }
            System.out.println(); // Print a blank line between players
        }
    }
}







// Hint => 
// Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and "Ace"
// Calculate the number of cards in the deck and initialize the deck
// int numOfCards = suits.length * ranks.length;
// Write a Method to Initialize the deck of cards with suits and ranks and return the deck. The deck is an array of strings where each string represents a card in the deck represented as "rank of suit" e.g., "2 of Hearts"
// Write a Method to Shuffle the deck of cards and return the shuffled deck. To shuffle the card iterate over the deck and swap each card with a random card from the remaining deck to shuffle the deck. Please find the steps below
// Step1: Use for Loop Iterate over the deck and swap each card with a random card from the remaining deck
// Step 2: Inside the Loop Generate a random card number between i and n using the following code 
// int randomCardNumber = i + (int) (Math.random() * (n - i));
// Step 3: Swap the current card with the random card
// Write a Method to distribute the deck of n cards to x number of players and return the players. For this Check the n cards can be distributed to x players. If possible then Create a 2D array to store the players and their cards
// Write a Method to Print the players and their cards
