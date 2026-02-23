package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.v.C0062;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0097p extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f282short = {2122, 2157, 2175, 2158, 2169, 2122, 2157, 2175, 2158, 2169, 2125, 2169, 2154, 2150, 2158, 2168, 2158, 2175, 1844, 1832, 1841, 1840, 1029, 1028, 1037, 1049, 1034, 1030, 1038, 1048};

    C0097p() {
        super(C0030.m5362(f282short, 0, 18, 2059), 21, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        if (o.b()) {
            c0069b.F((I) o);
            return true;
        }
        if (o.c() || A.a(o) || (o.f() && ((M) o).c.equals(C0055.m8814(f282short, 18, 4, 1884)))) {
            return c0069b.X(o, A.i);
        }
        if (o.d()) {
            return true;
        }
        if (o.f() && ((M) o).c.equals(C0062.m9389(f282short, 22, 8, 1131))) {
            return c0069b.X(o, A.f);
        }
        c0069b.n(this);
        return false;
    }
}