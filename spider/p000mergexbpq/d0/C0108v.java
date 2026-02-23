package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0108v extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f294short = {2890, 2925, 2943, 2926, 2937, 2883, 2926, 2922, 2927, 2590, 2579, 2584, 2565, 2787, 2815, 2790, 2791, 1631, 1618, 1625, 1604, 2830, 2842, 2825, 2821, 2829, 2843, 2829, 2844, 1515, 1510, 1506, 1511};

    C0108v() {
        super(C0061.m9361(f294short, 0, 9, 2827), 5, null);
    }

    private boolean e(O o, C0069b c0069b) {
        c0069b.f(C0028.m5109(f294short, 9, 4, 2684));
        c0069b.o(true);
        return c0069b.c(o);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        C0110w c0110w = A.i;
        if (A.a(o)) {
            c0069b.E((H) o);
            return true;
        }
        if (o.b()) {
            c0069b.F((I) o);
            return true;
        }
        if (o.c()) {
            c0069b.n(this);
            return true;
        }
        if (o.f()) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(C0008.m1970(f294short, 13, 4, 2699))) {
                return c0069b.X(o, c0110w);
            }
            if (str.equals(C0010.m2300(f294short, 17, 4, 1597))) {
                c0069b.D(m);
                c0069b.o(false);
                c0069b.j0(c0110w);
                return true;
            }
            if (str.equals(C0060.m9352(f294short, 21, 8, 2920))) {
                c0069b.D(m);
                c0069b.j0(A.u);
                return true;
            }
            if (b.b(str, C0116z.g)) {
                c0069b.n(this);
                l lVarU = c0069b.u();
                c0069b.e.add(lVarU);
                c0069b.X(o, A.f);
                c0069b.c0(lVarU);
                return true;
            }
            if (str.equals(C0026.m4951(f294short, 29, 4, 1411))) {
                c0069b.n(this);
                return false;
            }
        } else if (o.e() && !b.b(((L) o).c, C0116z.d)) {
            c0069b.n(this);
            return false;
        }
        e(o, c0069b);
        return true;
    }
}