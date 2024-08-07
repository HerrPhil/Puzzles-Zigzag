# Puzzles-Zigzag

Rearrange the characters of a string into a zigzag pattern, and return the newly formed string.

## Description of the Lesson Task

Intuitively, what the lesson task is requesting is to take a string, for example:
```
learnbydoing
```
and for the case when 3 rows of space are to be used,
so to transform it into:
```
l   n   o
e r b d i g
a   y   n
```
and finally concatenate the rows' values by traversing them horizontally:
```
row 1: lno
row 2: erbdig
row 3: ayn
```
so that the final result is:
```
lnoerbdigayn
```
