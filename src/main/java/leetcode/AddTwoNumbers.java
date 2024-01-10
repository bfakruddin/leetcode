package leetcode;

/*You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.*/

import datastructures.ListNode;

import java.math.BigInteger;
import java.util.Collections;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode l2 = new ListNode(1, new ListNode(2, new ListNode(3)));

        AddTwoNumbers addTwoNumbers= new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l1, l2);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode la = new ListNode(0);
        ListNode tail = la;
        Integer val1 = reverseAndReturn(l1);
        Integer val2 = reverseAndReturn(l2);
        Integer valop = Integer.valueOf((val1 + val2));
        int val =-1;
        while (valop!=0){
            val = valop%10;
            valop = valop/10;
            ListNode newNode = new ListNode(val);
            tail.setNext(newNode);
            tail=tail.getNext();
        }

        ListNode result = la.getNext();
        la.setNext(null);
        return result;
    }

    private int reverseAndReturn(ListNode l){
        StringBuffer firstNumber = new StringBuffer();
        if (l!=null) {
            do {
                if (l.getVal()/10<=0){
                    firstNumber.append(l.getVal());
                    l = l.getNext();
                }else{
                    new Exception("Number sent in the node list is not a single digit");
                }
            } while (l != null);
            firstNumber.reverse();
            System.out.println(firstNumber);
        }
        return Integer.valueOf(String.valueOf(firstNumber));
    }
}
