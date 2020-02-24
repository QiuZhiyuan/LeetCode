package javalearn;

import common.ListNode;

import java.util.*;

public class HashMapLearn {
    public static void main(String args[]) {
        HashMap<String, ListNode> hashMap = new HashMap<>();

        for (int i = 0; i < 20; i++) {
            hashMap.put("abc" + i, new ListNode(i));
        }

        Hashtable<String, ListNode> hashtable = new Hashtable<>();

        Map<String, ListNode> syncHashMap = Collections.synchronizedMap(new HashMap<>());

        TreeMap<String, String> treeMap = new TreeMap<>();

        Object object = new Object();
        object.hashCode();
    }
}
