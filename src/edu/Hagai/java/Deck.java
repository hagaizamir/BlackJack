package edu.Hagai.java;

import java.util.ArrayList;

/**
 * Created by Android2017 on 2/21/2017.
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<>();


    String [] suits = {"♥","♦" , "♣", "♠"};
    String [] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};


    public  Deck() {
        //for each = iter

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));

            }

        }


        }
//        for (int i = 0; i <suits.length ; i++) {
//            for (int j = 2; j <ranks.length ; j++) {
//                String suit = suits [i];
//                String rank = ranks [j];
//                Card c = new card (suit, rank);
//                cards.add(c);
//
//            }
//
//        }


    void  shuffle (){
        ArrayList <Card> temp = new ArrayList<>();
        while (cards.size()>0){
//            temp.add(cards.remove(r.nextInt(cards.size())));
            temp.add(cards.remove(RandomUtils.nextRandom(cards.size())) );
        }
        cards = temp;


    }
    public ArrayList<Card> getCards() {
        return cards;
    }

    public Card draw(){
        return cards.remove(0);
    }

    public boolean isEmpty(){
        return cards.isEmpty();
    }
}

//      public  ArrayList <Card> getCards (){
//          return cards;
//      }
//      public  Card draw (){
//          return  cards.remove(0);
//      }
//      public  boolean isEmpty (){
////          return cards.size()==0;
//          return  cards.isEmpty();
//      }
//
//
//
//    }









