// package LeetCode.Bit_ops;
// package LeetCode;
public class SetBITCrt {
    public int hammingWeight(int n) {
        int crt = 0;

        while(n > 0){
            bin(n);
            if((n & 1) == 1) crt++;

            n >>= 1;
            bin(n);
        }
        System.out.println("COUNT="+crt);
        return crt;
    }

    void bin(int n){
        System.out.println("val="+n+" bin="+Integer.toBinaryString(n));
    }


    public static void main(String[] args) {
        SetBITCrt o = new SetBITCrt();
        System.out.println("Started=======");
        o.hammingWeight(11);
        System.out.println("-----------------------------------");
        // o.hammingWeight(2);
    }
}

