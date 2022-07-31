package com.tutor.lesson.inheritance;

public class CarMassive {


    public static Car[] selectionSort(Car[] cars){
        for (int left = 0; left < cars.length; left++) {
            int minInd = left;
            for (int i = left; i < cars.length; i++) {
                if (cars[i].age < cars[minInd].age) {
                    minInd = i;
                }
            }
            int emptyVariable = left;
            left = minInd;
            minInd = emptyVariable;
        }
        return cars;
    }

    public static void quickSort(Car[] cars, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Car pivot = cars[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (cars[leftMarker].age < pivot.age) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (cars[rightMarker].age > pivot.age) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Car tmp = cars[leftMarker];
                    cars[leftMarker] = cars[rightMarker];
                    cars[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(cars, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(cars, leftBorder, rightMarker);
        }
    }

    private static Car[] get(int count){
        Car [] cars = new Car [count];
        return cars;
    }

}
