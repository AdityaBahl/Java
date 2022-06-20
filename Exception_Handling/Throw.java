public class Throw {
    public static void main(String[] args) {
        int i;
        try {
            int arr[] = new int[10];
            i = 12;
            if (i > 9 || i < 0)
                throw new ArrayIndexOutOfBoundsException();
            else
                System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Beyond Capacity" + i);
        }
    }
}
