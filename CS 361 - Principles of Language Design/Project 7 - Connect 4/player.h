/**
 * Compiled using VisualStudios 2019 - Community
 * Tyler S. Unsworth
 *
 * The abstract class Player defines the interface which is used by the Game class. It must
 * contain an abstract function getNextTurn which takes as parameter the current game (to read the
 * game state and board) and returns an integer in the range from 1 to 7 representing the column in
 * which the players put their next stone.
 */

#ifndef __Player_H__
#define __Player_H__
#include "game.h"

class Game;

class Player
{

public:
    virtual int getNextTurn(Game&) = 0; // makes the functional virtual
};

class HumanPlayer : public Player
{

public:
    int getNextTurn(Game&) override;
};

class AiPlayer : public Player
{

public:
    int getNextTurn(Game&) override;

};
#endif