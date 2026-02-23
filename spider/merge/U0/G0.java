package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* loaded from: classes.dex */
public enum G0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f531short = {3018, 3046, 3044, 3044, 3052, 3047, 3069, 3020, 3047, 3053, 3021, 3048, 3066, 3041};

    public G0() {
        super(C0006.m1774(f531short, 0, 14, 2953), 47);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        F0 f0 = g1.U;
        if (cE != 0) {
            if (cE == '-') {
                g1Var = g1.W;
            } else if (cE != 65535) {
                H h = p.n;
                h.h('-');
                h.h(cE);
            } else {
                p.l(this);
                p.i();
                g1Var = g1.a;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        H h2 = p.n;
        h2.h('-');
        h2.h((char) 65533);
        p.o(f0);
    }
}