class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        int n = arr.size();
        int operations = n / 2;

        for (int k = 1; k <= operations; k++) {
            // Rotate array by 1 position to the right
            int lastElement = arr.remove(arr.size() - 1);
            arr.add(0, lastElement);

            // Delete the (n - k + 1)th element (1-based index)
            int indexToDelete = arr.size() - k;
            arr.remove(indexToDelete);
        }

        // Return the first element after all operations
        return arr.get(0);
    }
}

=====================================================================

Given an array arr integers. Assume sz to be the initial size of the array. Do the following operations exactly sz/2 times. In every kth (1<= k <= sz/2 ) operation:

Right-rotate the array clockwise by 1.
Delete the (n– k + 1)th element from begin.
Now, Return the first element of the array.
Note: Here n keeps on decreasing with every operation.

Examples:

Input: arr = [1, 2, 3, 4, 5, 6]
Output: 3
Explanation: Rotate the array clockwise i.e. after rotation the array A = {6, 1, 2, 3, 4, 5} and delete the last element that is {5} that will be A = {6, 1, 2, 3, 4}.
  Again rotate the array for the second time and deletes the second last element that is {2} that will be A = {4, 6, 1, 3}, doing similar operation
  when we perform 4th operation, 4th last element does not exist. Then we deletes 1st element ie {1} that will be A = {3, 6}.
  So, continuing this procedure the last element in A is {3}. So, the output will be 3.
