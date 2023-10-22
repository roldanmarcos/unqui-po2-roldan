package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> counter;
    
    public Counter() {
        counter = new ArrayList<Integer>();
    }

    public void addNumber(int numero) {
        counter.add(numero);
    }

    public ArrayList<Integer> getEvenOcurrences() {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int number: counter) {
            ifIsEvenAddToList(number, evenNumbers);
            }            
        return evenNumbers;
    }

    public void ifIsEvenAddToList(int number, ArrayList<Integer> list) {        
        if (isEven(number)) {
            list.add(number);
        }
    }

    public boolean isEven(int number) {
        return (number % 2) == 0;
    }

    public ArrayList<Integer> getOddOcurrences() {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for (int number: counter) {
            ifIsOddAddToList(number, oddNumbers);
            }            
        return oddNumbers;
    }

    public void ifIsOddAddToList(int number, ArrayList<Integer> list) {        
        if (isOdd(number)) {
            list.add(number);
        }
    }

    public boolean isOdd(int number) {
        return !isEven(number);
    }

    public ArrayList<Integer> getMultiplesOf(int number) {
        ArrayList<Integer> multiplesNumbers = new ArrayList<Integer>();
        for (int numberOfCounter: counter) {
            ifIsMultiplesOf_AddToList(numberOfCounter, number, multiplesNumbers);
            }            
        return multiplesNumbers;
    }

    public void ifIsMultiplesOf_AddToList(int numberToEvaluate, int number, ArrayList<Integer> list) {        
        if (isMultiplesOf(numberToEvaluate, number)) {
            list.add(number);
        }
    }

    public boolean isMultiplesOf(int numberToEvaluate, int number) {
        return (numberToEvaluate % number) == 0;
    }
}
