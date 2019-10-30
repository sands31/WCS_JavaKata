# SQL Queries

Import the `database.sql` file into MySQL.

Create the following queries : 

1. Select all restaurant's name

2. Select all menu's title alphabetically

3. Select each dish's name and price, in decreasing price order

4. Select restaurant's name located in the city of Paris

5. Select all menu's title which contains the word "menu"

6. Select cities without duplicates

7. Select the name of the most expensive dish

8. Select all menu's title and the restaurant's name where they are sold

9. Select all dish's name (without duplicate) which are contained by at least one menu

10. Select all dish's name and price with corresponding menu's title

11. Select each dish's name and price, corresponding menu's title and restaurant's name who sells it

12. Select all the restaurants' name which don't sell any menu

13. Select all dish's name not contained in any menu

14. Select each city's name and how many restaurants located in this city

15. Select the title of the menu with the most dishes

16. Select, for each restaurant, its name and how many menus it sells Remember : some restaurants might not have any menu !

17. Select menu's title and dishes' count for each menu, in decreasing count order

18. Select all menu's title and dishes count, where menus have more than two dishes.

19. Select all restaurant's name which sells at least one menu where dishes' price combined is 30 or more

## Hints :

<details>
    <summary>Request 1</summary>

    SELECT, FROM
  
</details>
<details>
    <summary>Request 2</summary>
  
    ORDER BY
  
</details>
<details>
    <summary>Request 3</summary>
  
    ORDER BY
  
</details>
<details>
    <summary>Request 4</summary>
  
    WHERE
  
</details>
<details>
    <summary>Request 5</summary>
  
    LIKE
  
</details>
<details>
    <summary>Request 6</summary>
  
    DISTINCT
  
</details>
<details>
    <summary>Request 7</summary>
  
    ORDER BY, LIMIT
  
</details>
<details>
    <summary>Request 8</summary>
  
    INNER JOIN
  
</details>
<details>
    <summary>Request 9</summary>
  
    DISTINCT, INNER JOIN
  
</details>
<details>
    <summary>Request 10</summary>
  
    INNER JOIN (x2)
  
</details>
<details>
    <summary>Request 11</summary>
  
    INNER JOIN (x3)
  
</details>
<details>
    <summary>Request 12</summary>
  
    LEFT JOIN
  
</details>
<details>
    <summary>Request 13</summary>
  
    LEFT JOIN
  
</details>
<details>
    <summary>Request 14</summary>
  
    COUNT, GROUP BY
  
</details>
<details>
    <summary>Request 15</summary>
  
    COUNT, INNER JOIN, GROUP BY, ORDER BY, LIMIT
  
</details>
<details>
    <summary>Request 16</summary>
  
    COUNT, LEFT JOIN, GROUP BY
  
</details>
<details>
    <summary>Request 17</summary>
  
    COUNT, INNER JOIN (x2), GROUP BY
  
</details>
<details>
    <summary>Request 18</summary>
  
    COUNT, INNER JOIN, GROUP BY, HAVING
  
</details>
<details>
    <summary>Request 19</summary>
  
    DISTINCT, INNER JOIN (x3), GROUP BY, HAVING
  
</details>

## Solutions :

<details>
    <summary>Request 1</summary>

    ``` sql
    SELECT name
    FROM restaurant;
    ```
  
</details>
<details>
    <summary>Request 2</summary>

    ``` sql
    SELECT title
    FROM menu
    ORDER BY title ASC;
    ```
  
</details>
<details>
    <summary>Request 3</summary>

    ``` sql
    SELECT name, price
    FROM dish
    ORDER BY price DESC;
    ```
  
</details>
<details>
    <summary>Request 4</summary>

    ``` sql
    SELECT name
    FROM restaurant
    WHERE city = "Paris";
    ```
  
</details>
<details>
    <summary>Request 5</summary>

    ``` sql
    SELECT title
    FROM menu
    WHERE title LIKE "%menu%";
    ```
  
</details>
<details>
    <summary>Request 6</summary>

    ``` sql
    SELECT DISTINCT city
    FROM restaurant;
    ```
  
</details>
<details>
    <summary>Request 7</summary>

    ``` sql
    SELECT dish.name
    FROM dish
    ORDER BY dish.price DESC
    LIMIT 1;
    ```
  
</details>
<details>
    <summary>Request 8</summary>

    ``` sql
    SELECT menu.title, restaurant.name
    FROM menu
    INNER JOIN restaurant ON restaurant.id = menu.id_restaurant;
    ```
  
</details>
<details>
    <summary>Request 9</summary>

    ``` sql
    SELECT DISTINCT dish.name
    FROM dish
    INNER JOIN menu_dish ON menu_dish.id_dish = dish.id;
    ```
  
</details>
<details>
    <summary>Request 10</summary>

    ``` sql
    SELECT dish.name, dish.price, menu.title
    FROM dish
    INNER JOIN menu_dish ON menu_dish.id_dish = dish.id
    INNER JOIN menu ON menu_dish.id_menu = menu.id;
    ```
  
</details>
<details>
    <summary>Request 11</summary>

    ``` sql
    SELECT dish.name, dish.price, menu.title, restaurant.name
    FROM dish
    INNER JOIN menu_dish ON menu_dish.id_dish = dish.id
    INNER JOIN menu ON menu.id = menu_dish.id_menu
    INNER JOIN restaurant ON restaurant.id = menu.id_restaurant;
    ```
  
</details>
<details>
    <summary>Request 12</summary>

    ``` sql
    SELECT restaurant.name
    FROM restaurant
    LEFT JOIN menu ON restaurant.id = menu.id_restaurant
    WHERE menu.id_restaurant IS NULL;
    ```
  
</details>
<details>
    <summary>Request 13</summary>

    ``` sql
    SELECT dish.name
    FROM dish
    LEFT JOIN menu_dish ON dish.id = menu_dish.id_dish
    WHERE menu_dish.id_dish IS NULL;
    ```
  
</details>
<details>
    <summary>Request 14</summary>

    ``` sql
    SELECT city, COUNT(id)
    FROM restaurant
    GROUP BY city;
    ```
  
</details>
<details>
    <summary>Request 15</summary>

    ``` sql
    SELECT menu.title, COUNT(menu.id) as nb
    FROM menu
    INNER JOIN menu_dish ON menu.id = menu_dish.id_menu
    GROUP BY menu.title
    ORDER BY nb DESC
    LIMIT 1;
    ```
  
</details>
<details>
    <summary>Request 16</summary>

    ``` sql
    SELECT restaurant.name, COUNT(menu.id)
    FROM restaurant
    LEFT JOIN menu ON restaurant.id = menu.id_restaurant
    GROUP BY restaurant.name;
    ```
  
</details>
<details>
    <summary>Request 17</summary>

    ``` sql
    SELECT menu.title, COUNT(dish.id) as nb
    FROM dish
    INNER JOIN menu_dish ON menu_dish.id_dish = dish.id
    INNER JOIN menu ON menu.id = menu_dish.id_menu
    GROUP BY menu.id
    ORDER BY nb DESC;
    ```
  
</details>
<details>
    <summary>Request 18</summary>

    ``` sql
    SELECT menu.title, COUNT(menu_dish.id_dish) as nb
    FROM menu
    INNER JOIN menu_dish ON menu.id = menu_dish.id_menu
    GROUP BY menu.id
    HAVING nb > 2;
    ```
  
</details>
<details>
    <summary>Request 19</summary>

    ``` sql
    SELECT DISTINCT restaurant.name
    FROM dish
    INNER JOIN menu_dish ON menu_dish.id_dish = dish.id
    INNER JOIN menu ON menu.id = menu_dish.id_menu
    INNER JOIN restaurant ON restaurant.id = menu.id_restaurant
    GROUP BY menu.id
    HAVING SUM(dish.price) >= 30
    ```
  
</details>