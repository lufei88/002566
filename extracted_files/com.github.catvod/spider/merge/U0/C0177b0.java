package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* renamed from: com.github.catvod.spider.merge.U0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0177b0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f571short = {2230, 2195, 2182, 2195};

    public C0177b0() {
        super(C0009.m2037(f571short, 0, 4, 2290), 0);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cL = c0174a.l();
        if (cL == 0) {
            p.m(this);
            p.e(c0174a.e());
            return;
        }
        if (cL == '&') {
            g1Var = g1.b;
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
            g1Var = g1.h;
        }
        p.o(g1Var);
        p.a.a();
    }
}