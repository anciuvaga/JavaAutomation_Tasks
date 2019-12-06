Implement CharList class (like String using ArrayList as value).
Don`t use String objects in CharList class.
All methods excluding constructors and toString should be implemented without "for" expression.
Look at Collections, Lists methods and use them at maximum.
Implement:
CharList()
CharList(String s)
private CharList(ArrayList<Character> list) - it will help you to implement other methods
methods:
String toString()
int length() - returns CharList length
char charAt(int index) - returns char value for the particular index
int indexOf(char c) - returns the specified char value index.
CharList subString(int start, int end) - returns substring for given begin index.
CharList removeDuplicates() - remove duplicates symbols using collections.
CharList replaceFirst(Character c) - remove first occurrences of the specified char value.
CharList removeAll(Character c) - remove all occurrences of the specified char value.
boolean isEmpty() - returns true is CharList is empty
boolean contains(Character c) - returns true is CharList contains the specified char value
CharList clearList() - returns cleared CharList
CharList sortList() - returns sorted CharList
CharList reverseList() - returns reversed CharList
CharList mixedList() - returns CharList with mixed elements
 