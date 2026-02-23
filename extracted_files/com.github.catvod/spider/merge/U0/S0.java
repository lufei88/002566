package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public enum S0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f552short = {3166, 3193, 3179, 3194, 3181, 3163, 3184, 3196, 3179, 3174, 3183, 3194, 3151, 3178, 3197, 3187, 3190, 3196, 3158, 3195, 3194, 3185, 3179, 3190, 3193, 3190, 3194, 3181};

    public S0() {
        super(C0013.m3106(f552short, 0, 28, 3103), 58);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            g1Var = g1.h0;
        } else if (cE == '\"') {
            p.m(this);
            g1Var = g1.k0;
        } else {
            if (cE != '\'') {
                C0177b0 c0177b0 = g1.a;
                if (cE != '>') {
                    if (cE != 65535) {
                        p.m(this);
                        p.m.f = true;
                        g1Var = g1.n0;
                    } else {
                        p.l(this);
                        p.m.f = true;
                    }
                }
                p.j();
                p.o(c0177b0);
                return;
            }
            p.m(this);
            g1Var = g1.l0;
        }
        p.o(g1Var);
    }
}