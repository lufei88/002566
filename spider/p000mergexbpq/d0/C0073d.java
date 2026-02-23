package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.b0.b;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0073d extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f252short = {2685, 2650, 2679, 2645, 2628, 2624, 2653, 2651, 2650, 1614, 1612, 1629, 1625, 1604, 1602, 1603, 851, 838, 837, 843, 834};

    C0073d() {
        super(C0048.m7902(f252short, 0, 9, 2612), 10, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        boolean zE = o.e();
        String strM4107 = C0019.m4107(f252short, 9, 7, 1581);
        if (zE) {
            L l = (L) o;
            if (l.c.equals(strM4107)) {
                if (!c0069b.B(l.c)) {
                    c0069b.n(this);
                    return false;
                }
                if (!c0069b.a().d0().equals(strM4107)) {
                    c0069b.n(this);
                }
                c0069b.V(strM4107);
                c0069b.i();
                c0069b.j0(A.k);
                return true;
            }
        }
        if ((o.f() && b.b(((M) o).c, C0116z.A)) || (o.e() && ((L) o).c.equals(C0026.m4951(f252short, 16, 5, 807)))) {
            c0069b.n(this);
            if (c0069b.d(strM4107)) {
                return c0069b.c(o);
            }
            return true;
        }
        if (!o.e() || !b.b(((L) o).c, C0116z.L)) {
            return c0069b.X(o, A.i);
        }
        c0069b.n(this);
        return false;
    }
}