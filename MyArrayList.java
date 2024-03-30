package ru.relex;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> {
    public T[] list;
    public int size;
    public final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("capacity меньше 0");
        }
        else {
            list = (T[]) new Object[capacity];
        }
    }
    public MyArrayList(){
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T data){//добавление элемента
        list[size++] = data;
    }
    public void add(int index,T data){//добавление элемента по индексу
        for (int i = size; i > index ; i--) {
            list[index] = list[i-1];
        }
        list[index] = data;
        size++;
    }
    public void remove(int index){//метод для удаления по индексу
        for (int i = index; i < size; i++) {
            list[i] = list[i+1];
        }
    }
    public void removeData(T data){//Метод удаления элемента по значению
        int pos = indexForRemove(data);

        if(pos<0){
            return;
        }

        remove(pos);
    }
    public void print(){
        for(T elem:list){
            System.out.println(elem + " ");
        }
    }
    private int indexForRemove(T data){//Индекс для удаления элемента,последующе юзается в методе для удаления выше
        if(data == null){
            return -1;//для оповещения юзера о том что такого значения в списке не имеется
        }
        for (int i = 0; i < size; i++) {
            if(data.equals(list[i])){
                return i;
            }
        }
        return -1;
    }
    public T get(int index){
        return list[index];
    }
    public void set(int index, T data){
        list[index] = data;
    }
    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(list,size));
    }
}
