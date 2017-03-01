/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokerkata;


/**
 *
 * @author phili
 */
public class PokerKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        int i = 0;
        Hand sHWhite1 = new Hand("2C 3H 4S 8C AH");
        Hand sHWhite2 = new Hand("2S 8S AS QS 3S");
        Hand sHWhite3 = new Hand("2C 3H 4S 8C KH");
        Hand sHWhite4 = new Hand("2D 3H 5C 9S KH");
        
        Hand sHBlack1 = new Hand("2H 3D 5S 9C KD");
        Hand sHBlack2 = new Hand("2H 4S 4C 2D 4H");
        Hand sHBlack3 = new Hand("2H 3D 5S 9C KD");
        Hand sHBlack4 = new Hand("2H 3D 5S 9C KD");
        
        Player white1 = new Player(sHWhite1);
        Player white2 = new Player(sHWhite2);
        Player white3 = new Player(sHWhite3);
        Player white4 = new Player(sHWhite4);
        
        Player black1 = new Player(sHBlack1);
        Player black2 = new Player(sHBlack2);
        Player black3 = new Player(sHBlack3);
        Player black4 = new Player(sHBlack4);
          
        
        white1.compareHands(black1, i);
        if (white1.compareHands(black1, i) == 0)
            System.out.println("Tie.");
        else if (white1.compareHands(black1, i) == -1)
        {
            if (black1.getHand().isStraightFlush())
                System.out.println("Black wins. - with Straight Flush");
            else if (black1.getHand().isFourOfAKind())
                System.out.println("Black wins. - with Four of a Kind");
            else if (black1.getHand().isFullHouse())
                System.out.println("Black wins. - with Full House");
            else if (black1.getHand().isFlush())
                System.out.println("Black wins. - with Flush");
            else if (black1.getHand().isStraight())
                System.out.println("Black wins. - with Straight");
            else if (black1.getHand().isThreeOfAKind())
                System.out.println("Black wins. - with Three of a Kind");
            else if (black1.getHand().isTwoPair())
                System.out.println("Black wins. - with Two Pair");
            else if (black1.getHand().isPair())
                System.out.println("Black wins. - with Pair");
            else
                System.out.println("Black wins. - with High Card: ");
        }
        else
        {
            if (white1.getHand().isStraightFlush())
                System.out.println("White wins. - with Straight Flush");
            else if (white1.getHand().isFourOfAKind())
                System.out.println("White wins. - with Four of a Kind");
            else if (white1.getHand().isFullHouse())
                System.out.println("White wins. - with Full House");
            else if (white1.getHand().isFlush())
                System.out.println("White wins. - with Flush");
            else if (white1.getHand().isStraight())
                System.out.println("White wins. - with Straight");
            else if (white1.getHand().isThreeOfAKind())
                System.out.println("White wins. - with Three of a Kind");
            else if (white1.getHand().isTwoPair())
                System.out.println("White wins. - with Two Pair");
            else if (white1.getHand().isPair())
                System.out.println("White wins. - with Pair");
            else
                System.out.println("White wins. - with High Card: " );    
        }
                    
        
        if (white2.compareHands(black2, i) == 0)
            System.out.println("Tie.");
        else if (white2.compareHands(black2, i) == -1)
        {
            if (black2.getHand().isStraightFlush())
                System.out.println("Black wins. - with Straight Flush");
            else if (black2.getHand().isFourOfAKind())
                System.out.println("Black wins. - with Four of a Kind");
            else if (black2.getHand().isFullHouse())
                System.out.println("Black wins. - with Full House");
            else if (black2.getHand().isFlush())
                System.out.println("Black wins. - with Flush");
            else if (black2.getHand().isStraight())
                System.out.println("Black wins. - with Straight");
            else if (black2.getHand().isThreeOfAKind())
                System.out.println("Black wins. - with Three of a Kind");
            else if (black2.getHand().isTwoPair())
                System.out.println("Black wins. - with Two Pair");
            else if (black2.getHand().isPair())
                System.out.println("Black wins. - with Pair");
            else
                System.out.println("Black wins. - with High Card: ");
        }
        else
        {
            if (white2.getHand().isStraightFlush())
                System.out.println("White wins. - with Straight Flush");
            else if (white2.getHand().isFourOfAKind())
                System.out.println("White wins. - with Four of a Kind");
            else if (white2.getHand().isFullHouse())
                System.out.println("White wins. - with Full House");
            else if (white2.getHand().isFlush())
                System.out.println("White wins. - with Flush");
            else if (white2.getHand().isStraight())
                System.out.println("White wins. - with Straight");
            else if (white2.getHand().isThreeOfAKind())
                System.out.println("White wins. - with Three of a Kind");
            else if (white2.getHand().isTwoPair())
                System.out.println("White wins. - with Two Pair");
            else if (white2.getHand().isPair())
                System.out.println("White wins. - with Pair");
            else
                System.out.println("White wins. - with High Card: ");    
        }
        
        if (white3.compareHands(black3, i) == 0)
            System.out.println("Tie.");
        else if (white3.compareHands(black3, i) == -1)
        {
            if (black3.getHand().isStraightFlush())
                System.out.println("Black wins. - with Straight Flush");
            else if (black3.getHand().isFourOfAKind())
                System.out.println("Black wins. - with Four of a Kind");
            else if (black3.getHand().isFullHouse())
                System.out.println("Black wins. - with Full House");
            else if (black3.getHand().isFlush())
                System.out.println("Black wins. - with Flush");
            else if (black3.getHand().isStraight())
                System.out.println("Black wins. - with Straight");
            else if (black3.getHand().isThreeOfAKind())
                System.out.println("Black wins. - with Three of a Kind");
            else if (black3.getHand().isTwoPair())
                System.out.println("Black wins. - with Two Pair");
            else if (black3.getHand().isPair())
                System.out.println("Black wins. - with Pair");
            else
                System.out.println("Black wins. - with High Card: ");
        }
        else
        {
            if (white3.getHand().isStraightFlush())
                System.out.println("White wins. - with Straight Flush");
            else if (white3.getHand().isFourOfAKind())
                System.out.println("White wins. - with Four of a Kind");
            else if (white3.getHand().isFullHouse())
                System.out.println("White wins. - with Full House");
            else if (white3.getHand().isFlush())
                System.out.println("White wins. - with Flush");
            else if (white3.getHand().isStraight())
                System.out.println("White wins. - with Straight");
            else if (white3.getHand().isThreeOfAKind())
                System.out.println("White wins. - with Three of a Kind");
            else if (white3.getHand().isTwoPair())
                System.out.println("White wins. - with Two Pair");
            else if (white3.getHand().isPair())
                System.out.println("White wins. - with Pair");
            else
                System.out.println("White wins. - with High Card: ");    
        }        
        if (white4.compareHands(black4, i) == 0)
            System.out.println("Tie.");
        else if (white4.compareHands(black4, i) == -1)
        {
            if (black4.getHand().isStraightFlush())
                System.out.println("Black wins. - with Straight Flush");
            else if (black4.getHand().isFourOfAKind())
                System.out.println("Black wins. - with Four of a Kind");
            else if (black4.getHand().isFullHouse())
                System.out.println("Black wins. - with Full House");
            else if (black4.getHand().isFlush())
                System.out.println("Black wins. - with Flush");
            else if (black4.getHand().isStraight())
                System.out.println("Black wins. - with Straight");
            else if (black4.getHand().isThreeOfAKind())
                System.out.println("Black wins. - with Three of a Kind");
            else if (black4.getHand().isTwoPair())
                System.out.println("Black wins. - with Two Pair");
            else if (black4.getHand().isPair())
                System.out.println("Black wins. - with Pair");
            else
                System.out.println("Black wins. - with High Card: ");
        }
        else
        {
            if (white4.getHand().isStraightFlush())
                System.out.println("White wins. - with Straight Flush");
            else if (white4.getHand().isFourOfAKind())
                System.out.println("White wins. - with Four of a Kind");
            else if (white4.getHand().isFullHouse())
                System.out.println("White wins. - with Full House");
            else if (white4.getHand().isFlush())
                System.out.println("White wins. - with Flush");
            else if (white4.getHand().isStraight())
                System.out.println("White wins. - with Straight");
            else if (white4.getHand().isThreeOfAKind())
                System.out.println("White wins. - with Three of a Kind");
            else if (white4.getHand().isTwoPair())
                System.out.println("White wins. - with Two Pair");
            else if (white4.getHand().isPair())
                System.out.println("White wins. - with Pair");
            else
                System.out.println("White wins. - with High Card: ");    
        }  
    }
   
    
    
    
}
