package com.algorithms.datastructures.array;

public class SingleDimensionArray {
    int arr[] = null;
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i=0; i<arr.length;i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted)
    {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToBeInserted;
                System.out.println("Successfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Invalid index to access array!");
        }
    }

    public void traverseArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        } catch (Exception ex) {
            System.out.println("Array no longer exists!");
        }
    }

    public void searchInArray(int valueToSearch) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == valueToSearch) {
                System.out.println("Value is found at the index:" + i);
                return;
            }
        }
        System.out.println(valueToSearch + "is not found!");
    }

    public void deleteValue(int valueToDeleteIndex) {
        try {
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The value that is provided is not in the range of array");
        }
    }
    public static void main(String args[]){
        SingleDimensionArray sdArr = new SingleDimensionArray(5);
        sdArr = new SingleDimensionArray(5);
        sdArr.insert(0 ,10);
        sdArr.insert(1 ,20);
        sdArr.insert(2 ,30);
        sdArr.insert(3 ,40);
        sdArr.insert(4 ,50);

        System.out.println("Array Traversal");
        sdArr.traverseArray();

        System.out.println("Delete value");
        sdArr.deleteValue(0);
    }
}
