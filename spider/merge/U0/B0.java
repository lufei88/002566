package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.t.C0061;

/* loaded from: classes.dex */
public enum B0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f524short = {739, 718, 710, 724, 722, 738, 718, 716, 716, 708, 719, 725};

    public B0() {
        super(C0061.m9361(f524short, 0, 12, 673), 42);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        p.n.i(c0174a.i('>'));
        char cL = c0174a.l();
        if (cL == '>' || cL == 65535) {
            c0174a.e();
            p.i();
            p.o(g1.a);
        }
    }
}