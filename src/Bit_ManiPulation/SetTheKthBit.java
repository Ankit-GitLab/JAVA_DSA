package Bit_ManiPulation;

public class SetTheKthBit {
    static int setKthBit(int n, int k) {
        return (n|(1<<k));
    }
}
