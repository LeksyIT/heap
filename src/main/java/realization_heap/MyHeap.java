package realization_heap;

import java.util.ArrayList;

public class MyHeap {
    private ArrayList<Node> heapArray;
    private int currentSize;

    public MyHeap() {
        this.heapArray = new ArrayList<>();
        this.currentSize = 0;
    }

    public boolean addNode(int value) {
        Node newNode = new Node(value);
        heapArray.add(currentSize,newNode);
        nodeSorter(currentSize++);
        return true;
    }

    private void nodeSorter(int index) {
        int parentIndex = (index - 1) / 2;
        Node bottom = heapArray.get(index);
        while (index > 0 && heapArray.get(parentIndex).getValue() > bottom.getValue()) {
            heapArray.add(index,heapArray.get(parentIndex));
            index = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        heapArray.add(index,bottom);
    }

    public void printHeap() {
        String line = "---------------------------------------------------------";
        int countOfGaps = 32;
        int itemsPerRow = 1;
        int columnNumber = 0;

        System.out.println(line);
        System.out.println();
        for (int i = 0; i < currentSize; i++) {
            if (columnNumber == 0) {
                for (int k = 0; k < countOfGaps; k++) {
                    System.out.print(' ');
                }
            }
            System.out.print(heapArray.get(i).getValue());

            if (++columnNumber == itemsPerRow) {
                countOfGaps /= 2;
                itemsPerRow *= 2;
                columnNumber = 0;
                System.out.println();
            }
            else {
                for (int k = 0; k < countOfGaps * 2 - 2; k++) {
                    System.out.print(' ');
                }
            }
        }
        System.out.println("\n" + line);
    }
}
