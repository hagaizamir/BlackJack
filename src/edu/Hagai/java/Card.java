package edu.Hagai.java;

/**
 * Created by Android2017 on 2/21/2017.
 */
public class Card {
    String suit;
    String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

     int getValue() {
         int value = 0;
         //another way is using switch instead of if...
         // it's also possible to alt enter on if and it will revise to switch
//         switch (rank){
//             case "King":
//             case "Queen":
//             case "King":
//                 return 10;
//             case "Ace":
//                 return 11;
//             default:
//                 return Integer.valueOf(rank);
//
//         }


         if (rank.equals("Jack")|| rank.equals("Queen")|| rank.equals("King")) {
             return  10;


         }
         else if (rank.equals("Ace")){
             return  11;
         }
         else {
             return Integer.valueOf(rank);
         }


         }
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getDetails(){
        return rank + " of " + suit;
    }
}