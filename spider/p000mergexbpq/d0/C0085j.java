package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0085j extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f270short = {755, 724, 745, 735, 726, 735, 729, 718, 755, 724, 750, 731, 728, 726, 735, 1425, 1415, 1422, 1415, 1409, 1430};

    C0085j() {
        super(C0003.m1398(f270short, 0, 15, 698), 16, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        boolean zF = o.f();
        String strM2037 = C0009.m2037(f270short, 15, 6, 1506);
        if (zF && b.b(((M) o).c, C0116z.I)) {
            c0069b.n(this);
            c0069b.d(strM2037);
            return c0069b.c(o);
        }
        if (o.e()) {
            L l = (L) o;
            if (b.b(l.c, C0116z.I)) {
                c0069b.n(this);
                if (!c0069b.B(l.c)) {
                    return false;
                }
                c0069b.d(strM2037);
                return c0069b.c(o);
            }
        }
        return c0069b.X(o, A.r);
    }
}