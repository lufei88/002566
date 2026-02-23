package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0095o extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f280short = {2966, 2993, 2979, 2994, 2981, 2966, 2993, 2979, 2994, 2981, 2965, 3000, 2995, 2990, 2808, 2788, 2813, 2812, 1481, 1476, 1487, 1490};

    C0095o() {
        super(C0036.m6188(f280short, 0, 14, 3031), 20, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        C0110w c0110w = A.i;
        if (o.b()) {
            c0069b.F((I) o);
            return true;
        }
        if (!o.c()) {
            boolean zF = o.f();
            String strM7151 = C0042.m7151(f280short, 14, 4, 2704);
            if (!zF || !((M) o).c.equals(strM7151)) {
                if (A.a(o)) {
                    l lVarV = c0069b.V(strM7151);
                    c0069b.E((H) o);
                    c0069b.e.add(lVarV);
                    c0069b.e.add(lVarV.k0(C0003.m1398(f280short, 18, 4, 1451)));
                    return true;
                }
                if (o.d()) {
                    return true;
                }
                c0069b.n(this);
                c0069b.j0(c0110w);
                return c0069b.c(o);
            }
        }
        return c0069b.X(o, c0110w);
    }
}