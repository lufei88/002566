package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.h.C0054;

/* renamed from: com.github.catvod.spider.merge.U0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0209s extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f610short = {2770, 2805, 2806, 2815, 2786, 2805, 2776, 2788, 2813, 2812, 2708, 2696, 2705, 2704};

    public C0209s() {
        super(C0054.m8574(f610short, 0, 10, 2704), 1);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (n.b()) {
            c0176b.h(this);
            return false;
        }
        if (n.a()) {
            c0176b.t((H) n);
            return true;
        }
        if (B.a(n)) {
            c0176b.s((G) n);
            return true;
        }
        boolean zE = n.e();
        C0211t c0211t = B.c;
        String strM3917 = C0018.m3917(f610short, 10, 4, 2812);
        if (zE) {
            L l = (L) n;
            if (l.c.equals(strM3917)) {
                c0176b.r(l);
                c0176b.l = c0211t;
                return true;
            }
        }
        if (n.d() && com.github.catvod.spider.merge.S0.b.c(((K) n).c, A.e)) {
            c0176b.getClass();
            com.github.catvod.spider.merge.T0.m mVar = new com.github.catvod.spider.merge.T0.m(c0176b.N(strM3917, c0176b.h), null, null);
            c0176b.x(mVar);
            c0176b.e.add(mVar);
            c0176b.l = c0211t;
            return c0176b.D(n);
        }
        if (n.d()) {
            c0176b.h(this);
            return false;
        }
        c0176b.getClass();
        com.github.catvod.spider.merge.T0.m mVar2 = new com.github.catvod.spider.merge.T0.m(c0176b.N(strM3917, c0176b.h), null, null);
        c0176b.x(mVar2);
        c0176b.e.add(mVar2);
        c0176b.l = c0211t;
        return c0176b.D(n);
    }
}