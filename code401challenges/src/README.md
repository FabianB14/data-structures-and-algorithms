# Insertion Sort

I will go through the basics of insertsion sort.

> - You want to keep the sorted seperate from the unsorted.
> - You will need to use a variablie "pivot" to keep the sorted and the unsorted seperate.
> - Using recursion could possible decrease the difficulty.

![Insertion Sort!]( https://cdncontribute.geeksforgeeks.org/wp-content/uploads/insertionsort.png "Insertion Sort")
image from GeekofGeeks.com

# Merge Sort

I will explain the way I desided to complete the merge sort.

>- The main thing you should remember for the merge sort is to keep seperating the array until you have one element still in the array.
>- While putting the array back together you should sort the array as elements are put back in the array (if needed).
>- Don't forget while seperation is happening you should constantly check left and right for sorting

![Merge Sort!]( https://www.baeldung.com/wp-content/uploads/2018/09/mergesort1.png "Merge Sort")
image from baeldung.com
# Quick Sort

Now we will talk about the quick sort.

>- **Piviot Selection** pick element as a pivot usually you would pick the leftmost or rightmost element or the array.
>- **Partitioning** reorder the array so that all the elements greater than the element are on the right of the element and all the elements less than the element are on the left, elements that are the same value can go either way.
>- **Recur** recursively apply the above steps to the sub array with smaller values than the pivot and seperately to the sub array with greater values than the pivot.

![Quick Sort!](https://codesjava.com/wp-content/uploads/2018/04/Quicksort-codesjava.png "Quick Sort")
image from codesjave.com
