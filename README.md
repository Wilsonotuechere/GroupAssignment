# GroupAssignment

The rotLeft function takes an array a and an integer d as input, and returns the updated array after performing d left rotations.

Calculate the effective number of rotations d by taking the modulus of d with the length of the array n. This handles cases where d is greater than n.

Create a new array result of the same length as the original array.

Perform the left rotation by copying the elements from the original array to the result array. The first n - d elements are copied from the d-th index to the end of the original array, and the remaining d elements are copied from the beginning of the original array.

Return the updated result array.
