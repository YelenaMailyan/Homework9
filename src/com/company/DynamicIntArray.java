package com.company;

public class DynamicIntArray {
    Integer[] numbers = new Integer[0];

    public DynamicIntArray() {
    }

    public DynamicIntArray(Integer[] array) {
        setNumbers(array);
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] inputArray) {
        this.numbers = inputArray;
    }

    public void addToArray(int newInt) {
        int l;
        if (this.numbers.length == 0) {
            l = 1;
        } else {
            l = this.numbers.length + 1;
        }
        Integer[] newArray = new Integer[l];

        for (int i = 0; i < l - 1; i++) {
            newArray[i] = this.numbers[i];
        }
        newArray[l - 1] = newInt;
        setNumbers(newArray);
    }

    public void removeFromArray(int index) {
        int l = this.numbers.length - 1;
        Integer[] newArray = new Integer[l];

        for (int i = 0; i < index; i++) {
            newArray[i] = this.numbers[i];
        }

        for (int i = index; i < l; i++) {
            newArray[i] = this.numbers[i + 1];
        }
        setNumbers(newArray);
    }

    public void swap(int index, int inputNumber) {
        int l = this.numbers.length + 1;
        Integer[] newArray = new Integer[l];
        for (int i = 0; i < index; i++) {
            newArray[i] = this.numbers[i];
        }
        for (int i = index + 1; i < l; i++) {
            newArray[i] = this.numbers[i - 1];
        }
        newArray[index] = inputNumber;
        setNumbers(newArray);
    }

    public void update(int number, int inputNumber) {
        int l = this.numbers.length;
        Integer[] newArray = new Integer[l];
        for (int i = 0; i < l; i++) {
            if (this.numbers[i] == number) {
                newArray[i] = inputNumber;
            } else newArray[i] = this.numbers[i];
        }
        setNumbers(newArray);
    }

    public void printNumbers() {
        for (int i = 0; i < this.numbers.length; i++) {
            System.out.print(this.numbers[i] + " ");
        }
        System.out.println();
    }
}



