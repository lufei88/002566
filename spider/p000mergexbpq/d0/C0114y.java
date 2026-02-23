package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0114y extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f300short = {1731, 1764, 1758, 1771, 1768, 1766, 1775, 2175, 2154, 2153, 2151, 2158, 720, 722, 707, 711, 730, 732, 733, 557, 545, 546, 553, 572, 545, 571, 574, 1045, 1049, 1050, 1624, 1614, 1603, 1608, 1621, 478, 473, 455, 450, 451, 787, 798, 791, 770, 692, 693, 696, 696, 697, 690, 727, 734, 707, 732, 1712, 1708, 1717, 1716};

    C0114y() {
        super(C0058.m9106(f300short, 0, 7, 1674), 8, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a;
        if (o.a()) {
            c0069b.R();
            c0069b.P();
            c0069b.j0(A.l);
            return c0069b.c(o);
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
        String strM9106 = C0058.m9106(f300short, 7, 5, 2059);
        if (!zF) {
            if (!o.e()) {
                if (!o.d()) {
                    return e(o, c0069b);
                }
                if (c0069b.a().d0().equals(C0033.m5852(f300short, 54, 4, 1752))) {
                    c0069b.n(this);
                }
                return true;
            }
            String str = ((L) o).c;
            if (!str.equals(strM9106)) {
                if (!b.b(str, C0116z.B)) {
                    return e(o, c0069b);
                }
                c0069b.n(this);
                return false;
            }
            if (!c0069b.B(str)) {
                c0069b.n(this);
                return false;
            }
            c0069b.V(strM9106);
            c0069b.e0();
            return true;
        }
        M m = (M) o;
        String str2 = m.c;
        if (str2.equals(C0041.m6779(f300short, 12, 7, 691))) {
            c0069b.l();
            c0069b.J();
            c0069b.D(m);
            a = A.m;
        } else {
            String strM6001 = C0034.m6001(f300short, 19, 8, 590);
            if (str2.equals(strM6001)) {
                c0069b.l();
                c0069b.D(m);
                a = A.n;
            } else {
                if (str2.equals(C0009.m2037(f300short, 27, 3, 1142))) {
                    c0069b.f(strM6001);
                    return c0069b.c(o);
                }
                if (!b.b(str2, C0116z.u)) {
                    if (b.b(str2, C0116z.v)) {
                        c0069b.f(C0032.m5708(f300short, 30, 5, 1580));
                        return c0069b.c(o);
                    }
                    if (str2.equals(strM9106)) {
                        c0069b.n(this);
                        if (c0069b.d(strM9106)) {
                            return c0069b.c(o);
                        }
                    } else {
                        if (b.b(str2, C0116z.w)) {
                            return c0069b.X(o, A.f);
                        }
                        if (str2.equals(C0031.m5565(f300short, 35, 5, 439))) {
                            if (!m.r() || !m.j.j(C0044.m7509(f300short, 40, 4, 871)).equalsIgnoreCase(C0010.m2300(f300short, 44, 6, 732))) {
                                return e(o, c0069b);
                            }
                            c0069b.G(m);
                        } else {
                            if (!str2.equals(C0033.m5852(f300short, 50, 4, 689))) {
                                return e(o, c0069b);
                            }
                            c0069b.n(this);
                            if (c0069b.s() != null) {
                                return false;
                            }
                            c0069b.H(m, false);
                        }
                    }
                    return true;
                }
                c0069b.l();
                c0069b.D(m);
                a = A.o;
            }
        }
        c0069b.j0(a);
        return true;
    }

    final boolean e(O o, C0069b c0069b) {
        C0110w c0110w = A.i;
        c0069b.n(this);
        if (!b.b(c0069b.a().d0(), C0116z.C)) {
            return c0069b.X(o, c0110w);
        }
        c0069b.g0(true);
        boolean zX = c0069b.X(o, c0110w);
        c0069b.g0(false);
        return zX;
    }
}