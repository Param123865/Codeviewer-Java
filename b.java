/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package a.e.s;

import a.e.s.k;
import a.e.s.m;

public class b {
    protected m a;
    protected int b;
    protected int c;
    protected int d;

    public b(m m2) {
        this.a = m2;
        this.b = 0;
    }

    public int a(byte by) {
        m m2 = this.a;
        int n2 = by & 255;
        int n3 = m2.a.a(n2);
        if (this.b == 0) {
            this.d = 0;
            this.c = this.a.d[n3];
        }
        m m3 = this.a;
        int n4 = this.b;
        this.b = m3.c.a(n3 + n4 * m3.b);
        this.d = 1 + this.d;
        return this.b;
    }

    public String a() {
        return this.a.e;
    }

    public int b() {
        return this.c;
    }

    public void c() {
        this.b = 0;
    }
}

