# Caesar cipher

In cryptography, a Caesar cipher is a simple encryption technique, in which each letter in text is replaced by a letter some fixed number of positions down the alphabet.

For example, with a right shift of 3, `A` becomes `D`, `B` becomes `E`, and so on until `W` which become `Z`. Then `X`, `Y` and `Z` become `A`, `B` and `C`. 

Create a methods which encrypts a word using Caesar cipher (right shift), where the shift value is a parameter.

```
word:      shift:   result:
"abcd"     1        "bcde"
"tacos"    3        "wdfrv"
"zebra"    2        "bgdtc"
```