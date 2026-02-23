package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0093n extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f278short = {1711, 1672, 1690, 1675, 1692, 1704, 1692, 1679, 1667, 1675, 1693, 1675, 1690, 829, 801, 824, 825, 2132, 2133, 2140, 2120, 2139, 2135, 2143, 2121};

    C0093n() {
        super(C0007.m1842(f278short, 0, 13, 1774), 19, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a;
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
            return false;
        }
        boolean zF = o.f();
        String strM7718 = C0046.m7718(f278short, 13, 4, 853);
        if (zF && ((M) o).c.equals(strM7718)) {
            a = A.i;
        } else {
            if (o.e() && ((L) o).c.equals(strM7718)) {
                c0069b.j0(A.x);
                return true;
            }
            if (!o.f() || !((M) o).c.equals(C0043.m7290(f278short, 17, 8, 2106))) {
                if (o.d()) {
                    return true;
                }
                c0069b.n(this);
                return false;
            }
            a = A.f;
        }
        return c0069b.X(o, a);
    }
}