package org.example.eiscuno.model.player;

import org.example.eiscuno.model.card.Card;
import java.util.ArrayList;

/**
 * Represents a player in the Uno game.
 * Implements the IPlayer interface to interact with the player's hand of cards.
 *
 * @author Jerson Alexis Ortiz Velasco
 * @author Jhon Antony Murillo Olave
 * @author Camilo Vidales Lucumi
 * @version 1.0
 * @since 1.0
 */
public class Player implements IPlayer {

    /**
     * List of cards held by the player.
     * This list contains all the cards currently in the player's hand.
     *
     * @serial
     * @since 1.0
     */
    private ArrayList<Card> cardsPlayer;

    /**
     * Type of the player (e.g., "HUMAN_PLAYER" or "MACHINE_PLAYER").
     * This string identifies the role or type of the player in the game.
     *
     * @serial
     * @since 1.0
     */
    private String typePlayer;

    /**
     * Indicates whether the player is protected after declaring "UNO."
     * This variable is marked as volatile to ensure thread-safe access in concurrent operations.
     *
     * @serial
     * @since 1.0
     */
    private volatile boolean isProtectedByUno;


    /**
     * Constructs a new Player object with an empty hand of cards.
     *
     * @param typePlayer The type of the player (e.g., human or computer).
     */

    public Player(String typePlayer) {
        this.cardsPlayer = new ArrayList<Card>();
        this.typePlayer = typePlayer;
        this.isProtectedByUno = false;
    }

    /**
     * Adds a card to the player's hand.
     *
     * @param card The card to be added to the player's hand.
     */
    @Override
    public void addCard(Card card) {
        cardsPlayer.add(card);
    }

    /**
     * Retrieves all the cards currently held by the player.
     *
     * @return An ArrayList containing all the cards in the player's hand.
     */
    @Override
    public ArrayList<Card> getCardsPlayer() {
        return cardsPlayer;
    }

    /**
     * Removes a card from the player's hand based on its index.
     *
     * @param index The index of the card to remove.
     */
    @Override
    public void removeCard(int index) {
        cardsPlayer.remove(index);
    }

    /**
     * Retrieves a card from the player's hand based on its index.
     *
     * @param index The index of the card to retrieve.
     * @return The card at the specified index in the player's hand.
     */
    @Override
    public Card getCard(int index) {
        return cardsPlayer.get(index);
    }

    /**
     * Sets the protection status of the player (whether they are protected by UNO).
     *
     * @param protectedByUno true if the player is protected by UNO, false otherwise.
     */
    @Override
    public void setProtectedByUno(boolean protectedByUno) {
        isProtectedByUno = protectedByUno;
    }

    /**
     * Checks if the player is protected by UNO.
     *
     * @return true if the player is protected by UNO, false otherwise.
     */
    @Override
    public boolean isProtectedByUno() {
        return isProtectedByUno;
    }
}
