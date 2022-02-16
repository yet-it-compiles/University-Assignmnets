#ifndef GAME_H
#define GAME_H
#include "player.h"

enum theGameBoard { Empty, Player1, Player2 };
enum GameState { TurnP1, TurnP2, P1Won, P2Won, Draw };

class Player;

class Game {
public:
    /**
     * Declaration of two constants which make up the height x width of the game board
     */
    const int BoardHeight = 6;
    const int BoardWidth = 7;

    /**
     * Parameterized constructor
     * @param p1 represents a player
     * @param p2 represents a player
     */
    Game(Player &p1, Player &p2);

    /**
    * Public function which returns the current state of the game
    * @return the state of the game
    */
    GameState getState() const;

    /**
    * A public function which returns true if the game is still running, or false if
    * the game concluded with either a draw or a player winning
    * @return a boolean value
    */
    bool isRunning() const;

    /**
    * Publicly overrides the ()-operator. Returns the state at the
    * board at the given coordinate. The top left element has coordinate (0,0).
    * @param widthOfBoard is the passed in value for widthOfBoard
    * @param heightOfBoard is the passed in value for heightOfBoard
    * @return the state at the board at the given coordinate or empty if the coordinate is out of range
    */
    theGameBoard operator() (int widthOfBoard, int heightOfBoard) const;

    /**
    * performs the next turn by the Game class calling the getNextTurn of the current player.
    * public function which performs the next turn. To do so, the Game class calls the
    * function getNextTurn of the current player.
    */
    void nextTurn();

    /**
    * Public method which creates a board 7 width by 6 length (height)
    */
    void createGameBoard();

    /**
    * Public method which checks to see if there has been a winner
    */
    void isWinner();

// Declaration of private variables
private:
    // Declaration of variable which reserves the memory location
    theGameBoard** gameBoard = nullptr;
    GameState state; // captures the state of the game

    // Declaration of storage variable which holds game state
    Player &player1;
    Player &player2;
};
#endif
