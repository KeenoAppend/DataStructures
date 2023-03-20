package com.keenoappend.sparsearray.queue;

//定义队列
public class ArrayQueueDemo {
    public static void main(String[] args) {

    }
}

// 数组模拟队列
class ArrQueue{
    private int maxSize;    //表示数组的最大容量
    private int front;      // 表示队列头
    private int rear;       //表示队列尾
    private int[] arr;      // 该数据用于存放数据，模拟队列

    public ArrQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1; // 指向队列头部的，分析出，front指向队列头的前一个位置
        rear = -1;  // 指向队列尾，指向队列尾的数据，即就是队列的最后一个数据
    }

    public boolean isEmpty() {
        if ( front == rear ) {
            System.out.println("队列为空！！请添加数据");
            return false;
        }
        return true;
    }

}