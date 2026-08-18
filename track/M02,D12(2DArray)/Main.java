
class Freq {

    int count = 0;

    void count(int arr[], int key) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        System.out.println(key + ": " + count);
    }
}

class Main {

    public static void main(String[] args) {
        int arr[] = {10, 20, 10, 30, 10, 30};
        Freq fs = new Freq();
        fs.count(arr, 30);
    }
}
