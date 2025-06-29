public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        String bin = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        bin = new StringBuilder(bin).reverse().toString();
        return Integer.parseUnsignedInt(bin, 2);
    }
}
