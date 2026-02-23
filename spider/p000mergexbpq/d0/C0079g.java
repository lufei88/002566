package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.b0.b;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0079g extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f261short = {2131, 2164, 2120, 2165, 2157, 1689, 1695, 1666, 1683, 1691, 1670, 1690, 1687, 1666, 1683, 894, 875, 872, 870, 879};

    C0079g() {
        super(C0062.m9389(f261short, 0, 5, 2074), 13, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a = A.o;
        A a2 = A.k;
        boolean zF = o.f();
        String strM8259 = C0051.m8259(f261short, 5, 2, 1773);
        if (zF) {
            M m = (M) o;
            String str = m.c;
            if (str.equals(C0065.m9775(f261short, 7, 8, 1782))) {
                c0069b.D(m);
                return true;
            }
            if (b.b(str, C0116z.x)) {
                c0069b.m();
                c0069b.D(m);
                c0069b.j0(A.q);
                c0069b.J();
                return true;
            }
            if (!b.b(str, C0116z.F)) {
                return c0069b.X(o, a2);
            }
            if (c0069b.d(strM8259)) {
                return c0069b.c(o);
            }
            return false;
        }
        if (!o.e()) {
            return c0069b.X(o, a2);
        }
        String str2 = ((L) o).c;
        if (str2.equals(strM8259)) {
            if (!c0069b.B(str2)) {
                c0069b.n(this);
                return false;
            }
        } else {
            if (str2.equals(C0001.m1189(f261short, 15, 5, 778))) {
                if (c0069b.d(strM8259)) {
                    return c0069b.c(o);
                }
                return false;
            }
            if (!b.b(str2, C0116z.u)) {
                if (!b.b(str2, C0116z.G)) {
                    return c0069b.X(o, a2);
                }
                c0069b.n(this);
                return false;
            }
            if (!c0069b.B(str2) || !c0069b.B(strM8259)) {
                c0069b.n(this);
                return false;
            }
        }
        c0069b.m();
        c0069b.U();
        c0069b.j0(a);
        return true;
    }
}