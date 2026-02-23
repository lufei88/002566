package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.l.a;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0075e extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f255short = {2502, 2529, 2508, 2528, 2531, 2554, 2530, 2529, 2504, 2557, 2528, 2554, 2559, 744, 740, 743, 748, 761, 740, 766, 763, 2272, 2300, 2277, 2276, 1827, 1839, 1836, 1831, 1842, 1839, 1845, 1840, 2339, 2351, 2348};

    C0075e() {
        super(C0064.m9599(f255short, 0, 13, 2447), 11, null);
    }

    private boolean e(O o, i1 i1Var) {
        if (i1Var.d(C0031.m5565(f255short, 13, 8, 651))) {
            return i1Var.c(o);
        }
        return true;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        if (A.a(o)) {
            c0069b.E((H) o);
            return true;
        }
        int iA = a.a(o.a);
        if (iA != 0) {
            String strM2300 = C0010.m2300(f255short, 21, 4, 2184);
            if (iA == 1) {
                M m = (M) o;
                String str = m.c;
                str.getClass();
                if (!str.equals(C0002.m1305(f255short, 33, 3, 2368))) {
                    return !str.equals(strM2300) ? e(o, c0069b) : c0069b.X(o, A.i);
                }
                c0069b.G(m);
            } else if (iA != 2) {
                if (iA != 3) {
                    if (iA == 5 && c0069b.a().d0().equals(strM2300)) {
                        return true;
                    }
                    return e(o, c0069b);
                }
                c0069b.F((I) o);
            } else {
                if (!((L) o).c.equals(C0043.m7290(f255short, 25, 8, 1856))) {
                    return e(o, c0069b);
                }
                if (c0069b.a().d0().equals(strM2300)) {
                    c0069b.n(this);
                    return false;
                }
                c0069b.U();
                c0069b.j0(A.k);
            }
        } else {
            c0069b.n(this);
        }
        return true;
    }
}