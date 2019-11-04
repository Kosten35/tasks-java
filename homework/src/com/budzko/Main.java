package com.budzko;

public  class Main {

    public static void main(String[] args) {
        RandomNumbers numb = new RandomNumbers();
        numb.setN();
        numb.getN();
        numb.setArrayN(numb.getN());
        numb.showArray();
        numb.showArrayLn();

    }
}