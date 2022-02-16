/**
 * Compiled using VS studio 2019 compiler
 * Tyler S. Unsworth
 *
 * The abstract class Player defines the interface which is used by the Game class. It must
 * contain an abstract function getNextTurn which takes as parameter the current game (to read the
 * game state and board) and returns an integer in the range from 1 to 7 representing the column in
 * which the players put their next stone.
 */

#include <iostream>
#include <algorithm>
#include "player.h"

using namespace std;

/**
 * Represents a human player. Its function getNextTurn reads an integer from the
 * terminal and returns it.
 * @param game contains the logic for the game by containing game state and board
 * @return an integer representing the column in which the players ut their next stone
 */
int HumanPlayer::getNextTurn(Game& game) {
    int playersNextMove = 0; // represents the column number

    cin >> playersNextMove;  // captures the users requested next move in column

    return playersNextMove;
}

/**
 * Represents a non-human player. Its function getNextTurn first determines in which column
 * the player can add its next stone. Then, out of all possible columns, one is picked randomly and
 * returned. It also outputs the selected column together with a newline-character to the terminal.
 * @param game contains the logic for the game by containing game state and board
 * @return
 */
int AiPlayer::getNextTurn(Game& game) {
    return rand() % 7 + 1;
}