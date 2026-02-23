package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Z0.C0041;

/* renamed from: com.github.catvod.spider.merge.U0.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0201n0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f601short = {705, 753, 736, 763, 738, 742, 726, 755, 742, 755, 726, 765, 743, 752, 766, 759, 727, 737, 753, 755, 738, 759, 758, 726, 755, 737, 762};

    public C0201n0() {
        super(C0041.m6779(f601short, 0, 27, 658), 29);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        C0197l0 c0197l0 = g1.C;
        if (cE != 0) {
            if (cE == '-') {
                p.e(cE);
                g1Var = g1.E;
            } else if (cE == '<') {
                p.e(cE);
                g1Var = g1.F;
            } else if (cE == 65535) {
                p.l(this);
                g1Var = g1.a;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        cE = 65533;
        p.e(cE);
        p.o(c0197l0);
    }
}