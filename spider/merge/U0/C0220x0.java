package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* renamed from: com.github.catvod.spider.merge.U0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0220x0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f621short = {2823, 2870, 2865, 2868, 2849, 2868};

    public C0220x0() {
        super(C0010.m2300(f621short, 0, 6, 2901), 2);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cL = c0174a.l();
        if (cL == 0) {
            p.m(this);
            c0174a.a();
            p.e((char) 65533);
            return;
        }
        if (cL == '&') {
            g1Var = g1.d;
        } else {
            if (cL != '<') {
                if (cL != 65535) {
                    p.g(c0174a.g());
                    return;
                } else {
                    p.f(new J());
                    return;
                }
            }
            g1Var = g1.k;
        }
        p.o(g1Var);
        p.a.a();
    }
}