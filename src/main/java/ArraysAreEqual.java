//see test cases.
public class ArraysAreEqual {
    /**
     * Check if two arrays are equal to each other. Return true if all of the values in a are
     * identical to the ones in b, and false otherwise. So, {1,2,3,4} is equal only to {1,2,3,4}.
     *
     * Note: attempting to solve this problem with an expression like array1==array2 will not work,
     * because even though the arrays may be equivalent, they can occupy different positions in memory,
     * which will cause a==b to fail. When working with Objects (arrays are special objects,) == just
     * compares locations in memory. Object1 == Object2 is only true when they are literally the same
     * object in memory.
     *
     * @param a the first array.
     * @param b the second array.
     * @return true if the values of a are equal to the values of b.
     */
    public boolean equal(int[] a, int[] b){
        // First, check if both arrays are null
        if (a == null && b == null) {
            return true;
        }
        
        // If one is null and the other isn't, they are not equal
        if (a == null || b == null) {
            return false;
        }
        
        // If lengths are different, they can't be equal
        if (a.length != b.length) {
            return false;
        }
        
        // Compare each element one by one
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        
        // If we made it here, all elements are equal
        return true;
    }
}
