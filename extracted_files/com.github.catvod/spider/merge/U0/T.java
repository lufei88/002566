package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public enum T extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f553short = {1746, 1731, 1732, 1729, 1748, 1729, 1733, 1774, 1764, 1748, 1761, 1767, 1743, 1776, 1765, 1774, 2634, 2649};

    public T() {
        super(C0007.m1842(f553short, 0, 16, 1664), 11);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        if (!c0174a.t()) {
            p.g(C0061.m9361(f553short, 16, 2, 2678));
            p.o(g1.c);
            return;
        }
        p.c(false);
        M m = p.k;
        char cL = c0174a.l();
        m.getClass();
        m.k(String.valueOf(cL));
        p.h.append(c0174a.l());
        p.o(g1.m);
        p.a.a();
    }
}