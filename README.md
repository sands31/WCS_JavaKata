# SQL Queries

Import the `database.sql` file into MySQL.

Create the following queries : 

1. Select all restaurant's name alphabetically 
2. Select each dish's name and price, in decreasing price order
3. Select restaurant's name located in the city of Paris
4. Select each city's name and how many restaurants located in this city
5. Select all menu's title and the restaurant's name where they are sold
6. Select all dish's name (without duplicate) whose are contained by at least one menu
7. Select all dish's name and price with corresponding menu's title
8. Select the restaurant's name who doesn't sell any menu.
9. Select, for each restaurant, its name and how many menus it sells. Remember : one restaurant doesn't have any menu !
10. Select restaurant's name whose sells at least one menu where dishes' price combined is 30 or more
11. Select menu's name and dishes' count for each menu, in decreasing count order
12. Select the restaurant where the average of all dishes (without duplicates) is the higher











*Hints:*

1. https://gist.github.com/bastienwcs/244ff3482d65f8f0a05c307cb194ce19

2. https://gist.github.com/bastienwcs/e2b0b10a683171e38c5a2f544ee6aa09

3. WHERE

4. COUNT(id), GROUP BY

5. INNER JOIN

6. INNER JOIN (x2), DISTINCT

7. INNER JOIN (x3)

8. LEFT JOIN

9. LEFT JOIN, COUNT(id)

10. INNER JOIN (x4), SUM, GROUP BY, HAVING