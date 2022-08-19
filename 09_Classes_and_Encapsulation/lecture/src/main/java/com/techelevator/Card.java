package com.techelevator;

public class Card <main> {



    public class Card {
    private int suit = 0;
    private int rank = 0;
    private boolean faceDown = true;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(Card this, int rank) {
       this.rank = rank;
    }
}
