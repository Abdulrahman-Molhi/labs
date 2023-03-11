public class HW5 {
    public static void main(String[] args) {
        int [] numbers={0,1,2,3,4,5,6,7,8,9,10};
        print(numbers);
    }

    static void print(int [] array)
    {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
}
