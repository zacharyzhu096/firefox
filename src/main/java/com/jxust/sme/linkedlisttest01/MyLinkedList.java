package com.jxust.sme.linkedlisttest01;

/**
 * Created by Zachary Zhu on 2018/9/18 15:58
 */
public class MyLinkedList<E> {
    private int size;
    private Node<E> head;

    private static class Node<E>{
        private E element;
        private Node<E> next;
        private Node(E element,Node<E> next){
            this.element=element;
            this.next=next;
        }
    }

    public int getSize() {
        return size;
    }

    public MyLinkedList(){
        this.size=0;
        this.head=null;
    }

    public MyLinkedList(Node<E> head){
        this.head=head;
    }

    //链表添加元素
    public void add(E e) {
        if (this.head==null){
            this.head=new Node<E>(e,null);
            size++;
            return;
        }

        Node<E> p=this.head;
        while (p.next!=null){
            p=p.next;
        }
        p.next=new Node<E>(e,null);
        size++;
    }

    //取链表的元素
    public E get(int index){
        if (index<0 || index>size-1){
            throw new IllegalArgumentException();
        }
        Node<E> p=head;
        for (int i=0;i<index;i++){
            p=p.next;
        }
        return p.element;

    }

    //链表反转
    public void reverse(){
        if (this.head==null){
            return;
        }
        Node<E> p=null;
        Node<E> q=this.head;
        this.head=this.head.next;
        if (this.head==null){
            return;
        }
        while (this.head.next!=null){
            q.next=p;
            p=q;
            q=head;
            head=head.next;
        }
        q.next=p;
        head.next=q;
    }
}
