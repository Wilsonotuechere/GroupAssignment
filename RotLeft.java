public class RotLeft{
    public static int[] rotateLeft(int[] a, int d){
        int n = a.length;
        d = d%n;
        int[] result = new int[n];

        System.arraycopy(a, d, result, 0, n - d);
        System.arraycopy(a, 0, result, n - d, d);

        return result;
    }
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        int d = 4;
        int[] result = rotateLeft(a, d);

        for (int i :result){
            System.out.println(i);
        }
    }
}