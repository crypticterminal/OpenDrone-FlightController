/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.opendrone.opendrone;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author 20150032
 */
public class List<T> implements java.util.List<Node<T>> {
    Node head, tail;
    int size;

    public List() {
        head=null;
        tail=null;
    }
    
    public void append(T val){
        Node p = new Node<T>(val);
        if(head==null){
            head = p;
        }else{
            p.prev=tail;
            tail.next=p;
        }
        tail=p;
        size++;
    }
    
    public Node<T> getNode(int i){
        int cnt = 0;
        Node cur = head;
        if(i==0){
            return cur;
        }
        while(cur!=null && cnt!=i){
            if(cnt==i){
                return cur;
            }cnt++;
            cur=cur.next;
        }
        return null;
    }

    public void prepend(T val){
        Node p = new Node<T>(val);
        
        if(head==null){
            head=p;
        }else{
            head.prev=head;
            p.next=head;
        }
        head=p;
        size++;
    }
    
    public boolean delete(int val){
        Node cur  = head;
        Node prev = null;
        while(cur!=null&&!cur.val.equals(val)){
            prev=cur;
            cur=cur.next;
        }
        if(cur==null){
            return false;
        }else{
            if(cur==head){
                head=cur.next;
            }else if(cur==tail){
                tail=cur.prev;
                tail.next=null;
            }else{
                prev.next=cur.next;
            }
        }
        size--;
        return true;
    }
    
    public boolean removeNode(int i){
        Node cur = head;
        Node prev = null;
        int cnt = 0;
        while(cur!=null && cnt != i){
            cur = cur.next;
        }
        if(cur==null){
            return false;
        }else{
            if(cur==head){
                head=cur.next;
            }else if(cur==tail){
                tail=cur.prev;
                tail.next=null;
            }else{
                prev.next=cur.next;
            }
        }
        size--;
        return true;
    }

    public void appendList (List l){
        tail.next=l.head;
        tail=l.tail;
        size+=l.size();
    }
    
    public void prependList (List l){
        l.tail.next=head;
        head=l.head;
        size+=l.size();
    }
    
    public void print(){
        Node cur = head;
        while(cur != null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<Node<T>> iterator() {
        return null;
    }

    @Nullable
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(@Nullable T[] a) {
        return null;
    }

    @Override
    public boolean add(Node<T> tNode) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@Nullable Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@Nullable Collection<? extends Node<T>> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends Node<T>> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Node<T> get(int index) {
        return null;
    }

    @Override
    public Node<T> set(int index, Node<T> element) {
        return null;
    }

    @Override
    public void add(int index, Node<T> element) {

    }

    @Override
    public Node<T> remove(int index) {
        return null;
    }

    @Override
    public int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<Node<T>> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<Node<T>> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public java.util.List<Node<T>> subList(int fromIndex, int toIndex) {
        return null;
    }
}