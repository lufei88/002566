package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a0.C0042;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0087k extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f272short = {3165, 3194, 3176, 3193, 3182, 3166, 3187, 3192, 3173, 594, 590, 599, 598};

    C0087k() {
        super(C0034.m6001(f272short, 0, 9, 3100), 17, null);
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
            return false;
        }
        boolean zF = o.f();
        String strM7151 = C0042.m7151(f272short, 9, 4, 570);
        if (zF && ((M) o).c.equals(strM7151)) {
            return c0069b.X(o, c0110w);
        }
        if (o.e() && ((L) o).c.equals(strM7151)) {
            c0069b.getClass();
            c0069b.j0(A.w);
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