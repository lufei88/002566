package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.l.a;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0104t extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f290short = {1577, 1550, 1576, 1541, 1537, 1540, 2055, 2058, 2062, 2059, 2978, 3006, 2983, 2982, 796, 799, 781, 795, 1292, 1302, 1281, 1282, 616, 608, 625, 612, 2901, 2888, 2901, 2893, 2884, 1008, 1009, 1005, 1021, 1004, 1015, 1006, 1002, 1161, 1177, 1160, 1171, 1162, 1166};

    C0104t() {
        super(C0031.m5565(f290short, 0, 6, 1632), 3, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a;
        C0112x c0112x = A.j;
        if (A.a(o)) {
            c0069b.E((H) o);
            return true;
        }
        int iA = a.a(o.a);
        if (iA == 0) {
            c0069b.n(this);
            return false;
        }
        String strM8911 = C0056.m8911(f290short, 6, 4, 2159);
        if (iA == 1) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(C0003.m1398(f290short, 10, 4, 3018))) {
                return A.i.d(o, c0069b);
            }
            if (b.b(str, C0116z.a)) {
                l lVarG = c0069b.G(m);
                if (str.equals(C0007.m1842(f290short, 14, 4, 894)) && lVarG.o(C0032.m5708(f290short, 18, 4, 1380))) {
                    c0069b.Q(lVarG);
                }
            } else if (str.equals(C0038.m6452(f290short, 22, 4, 517))) {
                c0069b.G(m);
            } else if (str.equals(C0044.m7509(f290short, 26, 5, 2849))) {
                c0069b.c.u(h1.e);
                c0069b.P();
                c0069b.j0(c0112x);
                c0069b.D(m);
            } else if (b.b(str, C0116z.b)) {
                A.b(m, c0069b);
            } else if (str.equals(C0055.m8814(f290short, 31, 8, 926))) {
                c0069b.D(m);
                a = A.g;
                c0069b.j0(a);
            } else {
                if (!str.equals(C0007.m1842(f290short, 39, 6, 1274))) {
                    if (str.equals(strM8911)) {
                        c0069b.n(this);
                        return false;
                    }
                    c0069b.d(strM8911);
                    return c0069b.c(o);
                }
                c0069b.c.u(h1.h);
                c0069b.P();
                c0069b.j0(c0112x);
                c0069b.D(m);
            }
        } else if (iA == 2) {
            String str2 = ((L) o).c;
            if (!str2.equals(strM8911)) {
                if (b.b(str2, C0116z.c)) {
                    c0069b.d(strM8911);
                    return c0069b.c(o);
                }
                c0069b.n(this);
                return false;
            }
            c0069b.U();
            a = A.h;
            c0069b.j0(a);
        } else {
            if (iA != 3) {
                c0069b.d(strM8911);
                return c0069b.c(o);
            }
            c0069b.F((I) o);
        }
        return true;
    }
}