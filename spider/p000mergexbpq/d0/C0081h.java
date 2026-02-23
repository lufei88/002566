package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.b0.b;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0081h extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f264short = {2043, 2012, 2033, 2007, 2014, 2014, 803, 831, 1124, 1140};

    C0081h() {
        super(C0041.m6779(f264short, 0, 6, 1970), 14, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        C0079g c0079g = A.p;
        C0110w c0110w = A.i;
        boolean zE = o.e();
        String strM1189 = C0001.m1189(f264short, 6, 2, 855);
        String strM5062 = C0027.m5062(f264short, 8, 2, 1040);
        if (!zE) {
            if (!o.f() || !b.b(((M) o).c, C0116z.A)) {
                return c0069b.X(o, c0110w);
            }
            if (!c0069b.B(strM5062) && !c0069b.B(strM1189)) {
                c0069b.n(this);
                return false;
            }
            if (c0069b.B(strM5062)) {
                strM1189 = strM5062;
            }
            c0069b.d(strM1189);
            return c0069b.c(o);
        }
        String str = ((L) o).c;
        if (b.b(str, C0116z.x)) {
            if (!c0069b.B(str)) {
                c0069b.n(this);
                c0069b.j0(c0079g);
                return false;
            }
            if (!c0069b.a().d0().equals(str)) {
                c0069b.n(this);
            }
            c0069b.V(str);
            c0069b.i();
            c0069b.j0(c0079g);
            return true;
        }
        if (b.b(str, C0116z.y)) {
            c0069b.n(this);
            return false;
        }
        if (!b.b(str, C0116z.z)) {
            return c0069b.X(o, c0110w);
        }
        if (!c0069b.B(str)) {
            c0069b.n(this);
            return false;
        }
        if (c0069b.B(strM5062)) {
            strM1189 = strM5062;
        }
        c0069b.d(strM1189);
        return c0069b.c(o);
    }
}