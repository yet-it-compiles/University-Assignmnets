package Project3;

import java.io.*;
import java.util.*;

public class MinHeap
{
    // - - - - Private Variables - - - -

    private int[] keys = null;
    private int size = 0;


    // - - - - Constructors - - - -

    public MinHeap(int capacity)
    {
        keys = new int[capacity];
    }

    public MinHeap(int[] keys)
    {
        this.keys = keys;
        size = keys.length;

        for (int i = keys.length / 2 - 1; i >= 0; i--)
        {
            heapify(i);
        }
    }


    // - - - - Getter Functions - - - -

    public int getCapacity()
    {
        return keys.length;
    }

    public int getSize()
    {
        return size;
    }


    // - - - - Public Heap-Operations - - - -

    public void add(int key)
    {
        if (getSize() >= getCapacity())
        {
            System.out.println("* * * Error: Heap is already full! * * *");
            return;
        }

        keys[size] = key;
        size++;

        moveUp(size - 1);
    }

    public int getMin()
    {
        return keys[0];
    }

    public int removeMin()
    {
        int min = keys[0];

        size--;

        keys[0] = keys[size];
        heapify(0);

        return min;
    }


    // - - - - Private Heap-Operations - - - -

    private void heapify(int index)
    {
        while (true)
        {
            int l = left(index);
            int r = right(index);

            if (l >= getSize())
            {
                break;
            }

            int smallest = l;
            if (r < getSize() && keys[r] < keys[l])
            {
                smallest = r;
            }

            if (keys[smallest] >= keys[index])
            {
                break;
            }

            swapKeys(smallest, index);
            index = smallest;
        }
    }

    private void moveUp(int index)
    {
        while (index > 0)
        {
            int parInd = parent(index);

            if (keys[parInd] <= keys[index])
            {
                return;
            }

            swapKeys(parInd, index);
            index = parInd;
        }
    }


    // - - - - Helper Functions - - - -

    private int left(int index)
    {
        return 2 * index + 1;
    }

    private int right(int index)
    {
        return 2 * index + 2;
    }

    private int parent(int index)
    {
        return (index - 1) / 2;
    }

    private void swapKeys(int ind1, int ind2)
    {
        int tmp = keys[ind1];
        keys[ind1] = keys[ind2];
        keys[ind2] = tmp;
    }

}
