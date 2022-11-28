package com.keenoappend.sparsearray;

public class SparseArray {
    static int row = 0;
    static int column = 0;

    //二维数组打印
    public static void printArr(int[][] chessArr) {
        for (int[] row : chessArr) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
    //稀疏数组转为二维数组
    public static int[][] transformArray(int[][] sparseArr) {
        row = sparseArr[0][0];
        column = sparseArr[0][1];
        int[][] chessArr = new int[row][column];
        return chessArr;
    }

    public static void main(String[] args) {

        //创建二维数组
        int[][] chessArray = new int[11][11];
        chessArray[1][2] = 1;
        chessArray[2][3] = 2;
        chessArray[4][5] = 2;



        //二维数组转为 稀疏数组
        int sum=0;
        for (int i = 0; i < 11; i++) {
            for (int j =0;j<11;j++){
                if (chessArray[i][j]!=0) {
                    sum++;
                }
            }
        }
        System.out.println("非0元素个数:" + sum);

        //创建稀疏数组
        int[][] sparseArr = new int[sum+1][3];

        //稀疏数组填入数据
        //
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        int count=0;
        for (int i = 0; i < 11; i++) {
            for (int j =0;j<11;j++){
                if (chessArray[i][j]!=0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArray[i][j];
                }
            }
        }

        //便利稀疏数组
        System.out.println("转换为稀疏数组 :");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }

        int[][] newArray = transformArray(sparseArr);
        System.out.println("恢复后的二维数组:");
        printArr(newArray);
        System.out.println("-----------------------------------------------");

        for (int i = 1; i < sparseArr.length; i++) {
            newArray[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }

        printArr(newArray);

        row = sparseArr[0][0];
        column = sparseArr[0][1];
        String[][] strings = new String[row][column];


    }
}
