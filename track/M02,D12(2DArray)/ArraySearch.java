
class ArraySearch {

    void search(int ref[], int key) {
        boolean found = false;
        for (int i = 0; i <= ref.length - 1; i++) {
            if (ref[i] == key) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Elements not found..");
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        ArraySearch as = new ArraySearch();
        as.search(arr, 30);
    }
}
