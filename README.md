# Run-length encoding

Run-length encoding (RLE) is a very simple form of lossless data compression, in which same consecutive elements are stored as a single data value and count.

Create a method that implements a RLE of a string. If a character is present only once or twice consecutively, you must not compress it.

If the data string is *null*, return an empty string.

E.g: 

* "a" -> "a"
* "aa" -> "aa"
* "aaa" -> "a3"
* "aaaabbccca" -> "a4bbc3a"