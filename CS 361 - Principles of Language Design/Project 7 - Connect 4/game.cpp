/**
 * Compiled using VS Studio 2019 - Community
 * Tyler S. Unsworth
 *
 * Connect Four Project
 */
#include "game.h"
#include "player.h"

/**
 * Parameterized constructor to initialize player 1 and player 2 and record the state
 * @param p1 represents a player
 * @param p2 represents a player
 */
Game::Game(Player &p1, Player &p2) : player1(p1), player2(p2)
{
    // Record of the players turn
    state = TurnP1;

    // Initializes the game board
    createGameBoard();
}

/**
 * Public method which creates the desired game board length of 6x7
 */
void Game::createGameBoard()
{
    // Declaration of theGameBoard container to represent the board
    gameBoard = new theGameBoard * [BoardHeight];

    // Declaration of logic to set each to 0
    for (int height = 0; height < BoardHeight; height++)
    {
        gameBoard[height] = new theGameBoard[BoardWidth];
        for (int width = 0; width < BoardWidth; width++)
        {
            gameBoard[height][width] = theGameBoard::Empty;
        }
    }
}

/**
 * Accessor method which gets the game state
 * @return the current state of the game
 */
GameState Game::getState() const
{
    return state;
}

/**
 * A public function which returns true if the game is still running, or false if
 * the game concluded with either a draw or a player winning.
 * @return a boolean value
 */
bool Game::isRunning() const
{
    // Declaration of logic to see if the game is still running
    if (getState() == GameState::Draw)
    {
        return false;
    }
    if (getState() == GameState::P1Won)
    {
        return false;
    }
    if (getState() == GameState::P2Won)
    {
        return false;
    }
        return true; // else the game is still running, and players are taking their turns
}

/**
 * Override the () - operator
 * @param x represents the rows / width
 * @param y represents the columns / height
 * @return the state at the board at the given coordinate or Empty if the coordinate is out of range of the board
 */
theGameBoard Game::operator() (int x, int y) const
{
    // Declares the width and height of the board from the parameters
    int widthOfBoard = x;
    int heightOfBoard = y;

    // Checks to see if widthOfBoard and heightOfBoard is greater than the game board
    if (widthOfBoard > BoardWidth - 1)
        return theGameBoard::Empty;

    if (heightOfBoard > BoardHeight - 1)
        return theGameBoard::Empty;
    else
    {
        return gameBoard[heightOfBoard][widthOfBoard];
    }
}

/**
 * Public function which performs the next turn. To do so, the Game class calls the
 * function getNextTurn of the current player. If the return value is invalid, nothing happens. In
 * case of a valid return value, the function processes the move of the player. That is, it updates the
 * board, determines if the current player won or if a draw was reached, and updates the game state
 * accordingly.
 */
void Game::nextTurn()
{
    // Initializes column number positions to the players
    int player1Position = 0;
    int player2Position = 0;

    // Declaration of method logic
    if (state == TurnP2) // calls method if its player 2s turn
    {
        player2Position = player2.getNextTurn(*this);
    }

    if (state == TurnP1) // calls method if its player 1s turn
    {
        player1Position = player1.getNextTurn(*this);
    }


    // Logic which iterates through the board to check for an empty space
    for (int heightOfBoard = BoardHeight - 1; heightOfBoard >= 0; heightOfBoard--)
    {
        if (state == TurnP1)
        {
            if (gameBoard[heightOfBoard][player1Position - 1] == Empty)
            {
                gameBoard[heightOfBoard][player1Position - 1] = Player1;
                break;
            }
        }
        if (state == TurnP2)
        {
            if (gameBoard[heightOfBoard][player2Position - 1] == Empty)
            {
                gameBoard[heightOfBoard][player2Position - 1] = Player2;
                break;
            }
        }
    }

    // Assigns the state to the turn of the player
    if (state == TurnP1)
    {
        state = TurnP2;
    } else {
        state = TurnP1;
    }

    isWinner(); // Tries to see if there is a winner
}

/**
 * Scans the horizontal, vertical, quadrant diagonal to see if there has been a winner
 */
void Game::isWinner()
{
    { // Declaration of logic to iterate through horizontally
        for (int heightOfBoard = BoardHeight - 1; heightOfBoard >= 0; --heightOfBoard)
        {
            for (int widthOfBoard = 0; widthOfBoard < BoardWidth - 3; ++widthOfBoard)
            {
                // Logic which changes the state to player 1 winning
                if (gameBoard[heightOfBoard][widthOfBoard] == Player1 &&
                    gameBoard[heightOfBoard][widthOfBoard + 1] == Player1 &&
                    gameBoard[heightOfBoard][widthOfBoard + 2] == Player1 &&
                    gameBoard[heightOfBoard][widthOfBoard + 3] == Player1)
                {
                    state = P1Won;
                }
                // Logic which changes the state to player 2 winning
                if (gameBoard[heightOfBoard][widthOfBoard] == Player2 &&
                    gameBoard[heightOfBoard][widthOfBoard + 1] == Player2 &&
                    gameBoard[heightOfBoard][widthOfBoard + 2] == Player2 &&
                    gameBoard[heightOfBoard][widthOfBoard + 3] == Player2)
                {
                    state = P2Won;
                }
            }
        }

    }

    { // Declaration of logic to iterate through vertically
        // Ensures that we are in desired area in index 2
        for (int heightOfBoard = BoardHeight - 1; heightOfBoard >= 3; heightOfBoard--)
        {
            for (int widthOfBoard = 0; widthOfBoard < BoardWidth; widthOfBoard++)
            {
                // Logic which changes the state to player 1 winning
                if (gameBoard[heightOfBoard][widthOfBoard] == Player1 &&
                    gameBoard[heightOfBoard - 1][widthOfBoard] == Player1 &&
                    gameBoard[heightOfBoard - 2][widthOfBoard] == Player1 &&
                    gameBoard[heightOfBoard - 3][widthOfBoard] == Player1 )
                {
                    this->state = P1Won;
                }
                // Logic which changes the state to player 2 winning
                if (gameBoard[heightOfBoard][widthOfBoard] == Player2 &&
                    gameBoard[heightOfBoard - 1][widthOfBoard] == Player2 &&
                    gameBoard[heightOfBoard - 2][widthOfBoard] == Player2 &&
                    gameBoard[heightOfBoard - 3][widthOfBoard] == Player2 )
                {
                    this->state = P2Won;
                }
            }
        }
    }

    // Declaration of logic to iterate through diagonally
    {
        for (int heightOfBoard = BoardHeight - 1; heightOfBoard >= 3; heightOfBoard--)
        {
            for (int widthOfBoard = 0; widthOfBoard < BoardWidth - 3; widthOfBoard++)
            {
                // logic to iterate through up Accenting and changes the state to player 1 winning
                if ((gameBoard[heightOfBoard][widthOfBoard] == Player1 &&
                     gameBoard[heightOfBoard - 1][widthOfBoard + 1] == Player1 &&
                     gameBoard[heightOfBoard - 2][widthOfBoard + 2] == Player1 &&
                     gameBoard[heightOfBoard - 3][widthOfBoard + 3] == Player1)
                    ||
                    // logic to iterate through down descending
                    (gameBoard[heightOfBoard][widthOfBoard + 3] == Player1 &&
                     gameBoard[heightOfBoard - 1][widthOfBoard + 2] == Player1 &&
                     gameBoard[heightOfBoard - 2][widthOfBoard + 1] == Player1 &&
                     gameBoard[heightOfBoard - 3][widthOfBoard] == Player1))
                {
                    this->state = P1Won;
                }
                // logic to iterate through other up diagonal and changes the state to player 1 winning
                if ((gameBoard[heightOfBoard][widthOfBoard] == Player2 &&
                     gameBoard[heightOfBoard - 1][widthOfBoard + 1] == Player2 &&
                     gameBoard[heightOfBoard - 2][widthOfBoard + 2] == Player2 &&
                     gameBoard[heightOfBoard - 3][widthOfBoard + 3] == Player2)
                    ||
                    // logic to iterate through other negative diagonal
                    (gameBoard[heightOfBoard][widthOfBoard + 3] == Player2 &&
                     gameBoard[heightOfBoard - 1][widthOfBoard + 2] == Player2 &&
                     gameBoard[heightOfBoard - 2][widthOfBoard + 1] == Player2 &&
                     gameBoard[heightOfBoard - 3][widthOfBoard] == Player2))
                {
                    this->state = P2Won;
                }
            }
        }
    }
}