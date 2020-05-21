/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package a.e.s;

public class k {
    private int a;
    private int b;
    private int c;
    private int d;
    private int[] e;

    public k(int n2, int n3, int n4, int n5, int[] arrn) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = arrn;
    }

    public static int a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = n2 | n3 << 4;
        int n11 = n4 | n5 << 4;
        int n12 = n6 | n7 << 4;
        int n13 = n8 | n9 << 4;
        return n10 | n11 << 8 | (n12 | n13 << 8) << 16;
    }

    public int a(int n2) {
        return this.e[n2 >> this.a] >> ((n2 & this.b) << this.c) & this.d;
    }
}

