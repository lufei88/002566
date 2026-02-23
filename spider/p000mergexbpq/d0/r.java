package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.b0.b;

/* loaded from: classes.dex */
enum r extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f286short = {1231, 1256, 1259, 1250, 1279, 1256, 1221, 1273, 1248, 1249, 1280, 1308, 1285, 1284};

    r() {
        super(C0032.m5708(f286short, 0, 10, 1165), 1, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        C0102s c0102s = A.e;
        if (o.c()) {
            c0069b.n(this);
            return false;
        }
        if (o.b()) {
            c0069b.F((I) o);
            return true;
        }
        if (A.a(o)) {
            c0069b.E((H) o);
            return true;
        }
        boolean zF = o.f();
        String strM1189 = C0001.m1189(f286short, 10, 4, 1384);
        if (zF) {
            M m = (M) o;
            if (m.c.equals(strM1189)) {
                c0069b.D(m);
                c0069b.j0(c0102s);
                return true;
            }
        }
        if (!(o.e() && b.b(((L) o).c, C0116z.e)) && o.e()) {
            c0069b.n(this);
            return false;
        }
        c0069b.L(strM1189);
        c0069b.j0(c0102s);
        return c0069b.c(o);
    }
}