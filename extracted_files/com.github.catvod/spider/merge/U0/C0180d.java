package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* renamed from: com.github.catvod.spider.merge.U0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0180d extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f576short = {2770, 2805, 2776, 2810, 2795, 2799, 2802, 2804, 2805, 1659, 1657, 1640, 1644, 1649, 1655, 1654, 1523, 1510, 1509, 1515, 1506};

    public C0180d() {
        super(C0024.m4740(f576short, 0, 9, 2715), 10);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        boolean zD = n.d();
        String strM4536 = C0023.m4536(f576short, 9, 7, 1560);
        if (zD) {
            K k = (K) n;
            if (k.c.equals(strM4536)) {
                if (!c0176b.q(k.c)) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.j(false);
                if (!c0176b.g(strM4536)) {
                    c0176b.h(this);
                }
                c0176b.B(strM4536);
                c0176b.c();
                c0176b.l = B.i;
                return true;
            }
        }
        if ((n.e() && com.github.catvod.spider.merge.S0.b.c(((L) n).c, A.y)) || (n.d() && ((K) n).c.equals(C0007.m1842(f576short, 16, 5, 1415)))) {
            c0176b.h(this);
            if (c0176b.F(strM4536)) {
                return c0176b.D(n);
            }
            return true;
        }
        if (n.d() && com.github.catvod.spider.merge.S0.b.c(((K) n).c, A.J)) {
            c0176b.h(this);
            return false;
        }
        C0219x c0219x = B.g;
        c0176b.g = n;
        return c0219x.c(n, c0176b);
    }
}