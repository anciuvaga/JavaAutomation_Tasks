package com.myapplication.task1_collections;

public class Main {
    public static void main(String[] args) {

        CharList chObject = new CharList("abc123123");
        //1.toString()
        System.out.println("1.Char toString: " + chObject);
        //2.int length() - returns CharList length
        System.out.println("2.Length Of ArrayList is: " + chObject.lengthOfList());
        //3.returns char value for the particular index
        System.out.println("3.Value of index: " + chObject.ValueOfIndex(8));
        //4.returns the specified char value index
        System.out.println("4.Index of value: " + chObject.IndexOfValue('3'));
        //5.returns substring for given begin index from CharList
        System.out.println("5.Value between given two indexes: " + chObject.substringBetweenBeginIndexes(2, 5));
        //6.remove duplicates symbols
        System.out.println("6.Remove duplicates symbols: " + chObject.removeDuplicates());
        //7.remove first occurrences of the specified char value.
        System.out.println("7.Remove first occurrences of given value: " + chObject.removeFirstOccurrence('1'));
        //8.CharList removeAll(Character c) - remove all occurrences of the specified char value.
        System.out.println("8.Remove all occurrences: " + chObject.removeAllOccurences('3'));
        //9.boolean contains(Character c) - returns true is CharList contains the specified char value.
        System.out.println("9.Returns true if contains specified value: " + chObject.containValue('b'));
        //10.CharList sortList() - returns sorted CharList.
        System.out.println("10.Returns sorted CharList: " + chObject.ascendingSortList());
        //11.CharList reverseList() - returns reversed CharList.
        System.out.println("11.Returns reversed CharList: " + chObject.arrListRevers());
        //12.CharList mixedList() - returns CharList with mixed elements.
        System.out.println("12.Returns mixed CharList: " + chObject.mixList());
        //13.CharList clearList() - returns cleared CharList.
        System.out.println("13.Returns cleared CharList: " + chObject.clearListValue());
        //14.boolean isEmpty() - returns true is CharList is empty.
        System.out.println("14.Returns true is CharList is empty: " + chObject.isEmpty());
    }
}
