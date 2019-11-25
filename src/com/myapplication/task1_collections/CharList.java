package com.myapplication.task1_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CharList {
    //field
    ArrayList<Character> list;
    //constructors
    public CharList() {
        list = new ArrayList<>();
    }
    private CharList(ArrayList<Character> list) {
        this.list = list;
    }
    public CharList(String input) {
        char[] chars = input.toCharArray();//transform String into char []
        list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }
    }
    //1.The toString() method returns the string representation of the object
    @Override
    public String toString() {
//        ArrayList<Character> duplicate = new ArrayList<>(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : list) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
    //2.return length of ArrayList
    int lengthOfList() {
        return list.size();
    }
    //3.return value for particular index
    char ValueOfIndex(int index) {
        return list.get(index);
    }
    //4.returns the specified char value index
    int IndexOfValue(char value) {
        return list.indexOf(value);
    }
    //5.returns substring for given begin index.
    CharList substringBetweenBeginIndexes(int first, int last) {
        return new CharList(new ArrayList<>(list.subList(first, last)));
    }
    //6.remove duplicates symbols
    CharList removeDuplicates() {
        HashSet<Character> h = new HashSet(list);
        return new CharList(new ArrayList<Character>(h));
    }
    //7.CharList remove First(Character c) - remove first occurrences of the specified char value.
    CharList removeFirstOccurrence(Character c) {
        ArrayList<Character> duplicateList = new ArrayList<>(list);
        duplicateList.remove(c);
        return new CharList(new ArrayList<Character>(duplicateList));
    }
    //8.remove all occurrences of the specified char value.
    CharList removeAllOccurences(Character c) {
        ArrayList<Character> duplicateList = new ArrayList<>(list);
        duplicateList.removeAll(Collections.singleton(c));
        return new CharList(new ArrayList<Character>(duplicateList));
    }
    //9. boolean contains(Character c) - returns true is CharList contains the specified char value.
    boolean containValue(Character c) {
        return list.contains(c);
    }
    //10.CharList sortList() - returns sorted CharList.
    CharList ascendingSortList() {
        ArrayList<Character> duplicateList = new ArrayList<>(list);
        Collections.sort(duplicateList);
        return new CharList(duplicateList);
    }
    //11.CharList reverseList() - returns reversed CharList.
    CharList arrListRevers() {
        ArrayList<Character> duplicateList = new ArrayList<>(list);
        Collections.reverse(duplicateList);
        return new CharList(new ArrayList<Character>(duplicateList));
    }
    //12.CharList mixedList() - returns CharList with mixed elements.
    CharList mixList() {
        ArrayList<Character> duplicteList = new ArrayList<>(list);
        Collections.shuffle(duplicteList);
        return new CharList(new ArrayList<Character>(duplicteList));
    }
    //13.CharList clearList() - returns cleared CharList.
    CharList clearListValue() {
        list.clear();
        return new CharList(new ArrayList<Character>(list));
    }
    //14.boolean isEmpty() - returns true is CharList empty.
    boolean isEmpty() {
        return list.isEmpty();
    }
}