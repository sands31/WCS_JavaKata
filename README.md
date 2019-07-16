# Minesweeper

Create a method that takes a integer matrix `grid` and two integers `row` and `column` as parameters :

* `grid` : a minesweeper matrix where `0` are empty cells and `1` are bombs. The width and height of the `grid` can vary.
* `row` : the vertical coordinate where you'll check the cell
* `column` : the horizontal coordinate where you'll check the cell

The method will check the cell using the coordinates and returns :

* "kaboom", if it contains a boom
* the number of adjacent bombs, if it's empty

The method will throw an `IllegalArgumentException` with the message "Illegal grid", if the grid is `null` or has a width or height of `0`.

The method will throw a `IndexOutOfBoundsException` with the message "Illegal coordinates", if `row` or `column` is out of bounds.

*E.g :*

```
grid : {
    {0, 0, 0, 1},
    {0, 1, 0, 1},
    {1, 0, 0, 0}
}
row : 1
column : 2

result : "3"
```