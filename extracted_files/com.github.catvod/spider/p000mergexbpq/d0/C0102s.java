package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.b0.b;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0102s extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f288short = {1301, 1330, 1329, 1336, 1317, 1330, 1311, 1330, 1334, 1331, 1906, 1902, 1911, 1910, 854, 859, 863, 858};

    C0102s() {
        super(C0018.m3917(f288short, 0, 10, 1367), 2, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
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
        if (o.f() && ((M) o).c.equals(C0051.m8259(f288short, 10, 4, 1818))) {
            return A.i.d(o, c0069b);
        }
        boolean zF = o.f();
        String strM9106 = C0058.m9106(f288short, 14, 4, 830);
        if (zF) {
            M m = (M) o;
            if (m.c.equals(strM9106)) {
                c0069b.h0(c0069b.D(m));
                c0069b.j0(A.f);
                return true;
            }
        }
        if (o.e() && b.b(((L) o).c, C0116z.e)) {
            c0069b.f(strM9106);
            return c0069b.c(o);
        }
        if (o.e()) {
            c0069b.n(this);
            return false;
        }
        c0069b.f(strM9106);
        return c0069b.c(o);
    }
}