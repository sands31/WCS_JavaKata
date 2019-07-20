# Chmod

## 1. How does it works

### Numerical

The numerical permissions are composed of three integers, from 0 to 7, corresponding to "user", "group" and "other" rights.

In order to understand how a permission is assigned to an integer, you need to convert to binary :

```
    r w x
0 : 0 0 0
1 : 0 0 1
2 : 0 1 0
3 : 0 1 1
4 : 1 0 0
5 : 1 0 1
6 : 1 1 0
7 : 1 1 1
```

Each binary digit is assigned to a corresponding right : read (`r`), write (`w`), execute (`x`).

If a digit value is `1`, the right is obtained.

*E.g:*
```
entry:  142
binary: 001 100 010
```

### Octal

The octal mode assign the corresponding right `r`, `w`, `x` if the digit is `1`, and a dash `-` if it's `0`.

*E.g:*
```
binary:  001 100 010
octal:   --x r-- -w-
```

## 2. Kata

Create a method with converts numeral permissions to octal mode.

*E.g:*
```
numeral : "000", result : "---------"
numeral : "352", result : "-wxr-x-w-"
numeral : "777", result : "rwxrwxrwx"
```