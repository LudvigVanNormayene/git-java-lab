package lab_Oleinik.lab_2;

import java.util.Random;

public class Ex_1 {
    private static byte a;
    private static short b;
    private static char c;
    private static int d;
    private static long e;
    private static float f;
    private static double g;

    public static void main(String[] args) {


        byte a_ = 96;
        short b_ = 1268;
        char c_ = 34028;
        int d_ = 4859845;
        long e_ = 653897563;
        float f_ = (float) 46321.5634;
        double g_ = 453122579841813.1562411487;

        byte aa = (byte) (a_ + b_);
        short bb = (short) (aa + b_);
        char cc = (char) (bb + aa);
        int dd = aa + bb + cc;
        long ee = dd * aa * bb * cc;
        float ff = ee * dd + bb;
        double gg = ff * ee + cc * cc;

        System.out.printf("%d, %x\n", a, a);
        System.out.printf("%d, %x\n", b, b);
        System.out.printf("%d, %x\n", (short)c, (short)c);
        System.out.printf("%d, %x\n", d, d);
        System.out.printf("%d, %x\n", e, e);
        System.out.printf("%d, %f, %a\n", (long)f, f, f);
        System.out.printf("%d, %f, %a\n", (long)g, g, g);
        System.out.println();
        System.out.printf("%d, %x\n", a_, a_);
        System.out.printf("%d, %x\n", b_, b_);
        System.out.printf("%d, %x\n", (short)c_, (short)c_);
        System.out.printf("%d, %x\n", d_, d_);
        System.out.printf("%d, %x\n", e_, e_);
        System.out.printf("%d, %f, %a\n", (long)f_, f_, f_);
        System.out.printf("%d, %f, %a\n", (long)g_, g_, g_);
        System.out.println();
        System.out.printf("%d, %x\n", aa, aa);
        System.out.printf("%d, %x\n", bb, bb);
        System.out.printf("%d, %x\n", (short)cc, (short)cc);
        System.out.printf("%d, %x\n", dd, dd);
        System.out.printf("%d, %x\n", ee, ee);
        System.out.printf("%d, %f, %a\n", (long)ff, ff, ff);
        System.out.printf("%d, %f, %a\n", (long)gg, gg, gg);

    }

}
