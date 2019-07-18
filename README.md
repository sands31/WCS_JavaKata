# Tic-tac-toe

Create a method which analyses a 3x3 tic-tac-toe grid and returns the winner, e.g:

* 'X' when X wins
* 'O' when O wins
* 'C' if it's a draw (aka. "cat's game") or if nobody wins

The grid should contains 'X', 'O' and ' ' (if empty) characters.

Throw an `IllegalArgumentException` if the grid is *null*, has not the size expected, contains illegal characters.
Throw an `IllegalStateException` if one player cheated.