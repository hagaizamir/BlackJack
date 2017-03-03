package edu.Hagai.java;

import java.util.ArrayList;

/**
 * Created by Android2017 on 2/21/2017.
 */
public class Hand {
    //properties:
    //Arraylist<Card> cards

    //Methods:
    //1)
    //void addCard(Card c)...

    //2)
    //int getValue() -> returns the value of the hand...
    //while (we have aces ( and aceCount....)
    //subtract 10 for aces ( and aceCoune--)

    //3)
    //ArrayList <Card? getCards()



    ArrayList <Card> cards  = new ArrayList<>();

    public void addCard (Card c){
        cards.add(c);

    }
   public int getValue (){
       int value = 0;
       int aceCount = 0;
       for (Card card : cards) {
           value += card.getValue();
           if ( card.getValue()== 11)
               aceCount++;

           }
           while ( value > 21 && aceCount > 0){
               value -= 10;
               aceCount--;

           }
           return  value;
           
       }

    //3)
    //ArrayList<Card> getCards()

    public ArrayList<Card> getCards() {
        return cards;
    }
    public int getCardsNum()
    {
        return cards.size();
    }
}
