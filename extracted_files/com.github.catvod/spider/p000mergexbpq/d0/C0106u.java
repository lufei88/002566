package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0106u extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f292short = {1822, 1849, 1823, 1842, 1846, 1843, 1817, 1848, 1828, 1844, 1829, 1854, 1831, 1827, 1468, 1440, 1465, 1464, 3185, 3184, 3180, 3196, 3181, 3190, 3183, 3179, 2320, 2304};

    C0106u() {
        super(C0020.m4199(f292short, 0, 14, 1879), 4, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        H h;
        C0104t c0104t = A.f;
        if (o.c()) {
            c0069b.n(this);
        } else {
            if (o.f() && ((M) o).c.equals(C0058.m9106(f292short, 14, 4, 1492))) {
                return c0069b.X(o, A.i);
            }
            if (!o.e() || !((L) o).c.equals(C0012.m2973(f292short, 18, 8, 3103))) {
                if (A.a(o) || o.b() || (o.f() && b.b(((M) o).c, C0116z.f))) {
                    return c0069b.X(o, c0104t);
                }
                if (o.e() && ((L) o).c.equals(C0008.m1970(f292short, 26, 2, 2418))) {
                    c0069b.n(this);
                    h = new H();
                } else {
                    if ((o.f() && b.b(((M) o).c, C0116z.K)) || o.e()) {
                        c0069b.n(this);
                        return false;
                    }
                    c0069b.n(this);
                    h = new H();
                }
                h.i(o.toString());
                c0069b.E(h);
                return true;
            }
            c0069b.U();
            c0069b.j0(c0104t);
        }
        return true;
    }
}