package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.U0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0186g extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f585short = {2089, 2062, 2098, 2063, 2071, 1777, 1760, 1768, 1781, 1769, 1764, 1777, 1760, 860, 858, 2950, 2963, 2960, 2974, 2967};

    public C0186g() {
        super(C0014.m3332(f585short, 0, 5, 2144), 13);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        boolean zE = n.e();
        C0223z c0223z = B.i;
        String strM6188 = C0036.m6188(f585short, 5, 8, 1669);
        String strM3484 = C0015.m3484(f585short, 13, 2, 808);
        if (zE) {
            L l = (L) n;
            String str = l.c;
            if (!com.github.catvod.spider.merge.S0.b.c(str, A.v)) {
                if (!com.github.catvod.spider.merge.S0.b.c(str, A.D)) {
                    c0176b.g = n;
                    return c0223z.c(n, c0176b);
                }
                if (c0176b.F(strM3484)) {
                    return c0176b.D(n);
                }
                return false;
            }
            c0176b.d(strM3484, strM6188);
            c0176b.r(l);
            c0176b.l = B.o;
            c0176b.q.add(null);
        } else {
            if (!n.d()) {
                c0176b.g = n;
                return c0223z.c(n, c0176b);
            }
            String str2 = ((K) n).c;
            boolean zEquals = str2.equals(strM3484);
            C0184f c0184f = B.m;
            if (zEquals) {
                if (!c0176b.q(str2)) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.d(strM3484, strM6188);
            } else {
                if (str2.equals(C0026.m4951(f585short, 15, 5, 3058))) {
                    if (c0176b.F(strM3484)) {
                        return c0176b.D(n);
                    }
                    return false;
                }
                if (!com.github.catvod.spider.merge.S0.b.c(str2, A.s)) {
                    if (com.github.catvod.spider.merge.S0.b.c(str2, A.E)) {
                        c0176b.h(this);
                        return false;
                    }
                    c0176b.g = n;
                    return c0223z.c(n, c0176b);
                }
                if (!c0176b.q(str2) || !c0176b.q(strM3484)) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.d(strM3484, strM6188);
            }
            c0176b.A();
            c0176b.l = c0184f;
        }
        return true;
    }
}