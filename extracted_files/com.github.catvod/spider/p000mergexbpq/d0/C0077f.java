package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.l.a;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0077f extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f258short = {2646, 2673, 2635, 2686, 2685, 2675, 2682, 2653, 2672, 2683, 2662, 1219, 1237, 1240, 1235, 1230, 1285, 1305, 1300, 1296, 1301, 1734, 1748, 1757, 1757, 1734, 3276, 3289, 3290, 3284, 3293, 483, 498, 506, 487, 507, 502, 483, 498, 1452, 1450};

    C0077f() {
        super(C0051.m8259(f258short, 0, 11, 2591), 12, null);
    }

    private boolean e(O o, C0069b c0069b) {
        if (!c0069b.B(C0020.m4199(f258short, 11, 5, 1207)) && !c0069b.B(C0056.m8911(f258short, 16, 5, 1393)) && !c0069b.x(C0011.m2805(f258short, 21, 5, 1714), null)) {
            c0069b.n(this);
            return false;
        }
        c0069b.k();
        c0069b.d(c0069b.a().d0());
        return c0069b.c(o);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a = A.k;
        int iA = a.a(o.a);
        if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(C0056.m8911(f258short, 31, 8, 407))) {
                c0069b.D(m);
            } else {
                String strM4403 = C0022.m4403(f258short, 39, 2, 1496);
                if (!str.equals(strM4403)) {
                    if (!b.b(str, C0116z.x)) {
                        return b.b(str, C0116z.D) ? e(o, c0069b) : c0069b.X(o, a);
                    }
                    c0069b.n(this);
                    c0069b.f(strM4403);
                    return c0069b.c(m);
                }
                c0069b.k();
                c0069b.D(m);
                c0069b.j0(A.p);
            }
        } else {
            if (iA != 2) {
                return c0069b.X(o, a);
            }
            String str2 = ((L) o).c;
            if (!b.b(str2, C0116z.J)) {
                if (str2.equals(C0038.m6452(f258short, 26, 5, 3256))) {
                    return e(o, c0069b);
                }
                if (!b.b(str2, C0116z.E)) {
                    return c0069b.X(o, a);
                }
                c0069b.n(this);
                return false;
            }
            if (!c0069b.B(str2)) {
                c0069b.n(this);
                return false;
            }
            c0069b.k();
            c0069b.U();
            c0069b.j0(a);
        }
        return true;
    }
}