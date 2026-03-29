package Bit_ManiPulation;

public class SingleNumber {
    int getSingle(int arr[]) {
        int Xor = 0;
        for(int ele : arr){
            Xor = Xor^ele;
        }
        return Xor;
    }
}
