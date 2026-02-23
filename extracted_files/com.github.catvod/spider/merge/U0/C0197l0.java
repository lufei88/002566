package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.r0.C0060;

/* renamed from: com.github.catvod.spider.merge.U0.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0197l0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f597short = {1158, 1206, 1191, 1212, 1189, 1185, 1169, 1204, 1185, 1204, 1169, 1210, 1184, 1207, 1209, 1200, 1168, 1190, 1206, 1204, 1189, 1200, 1201};

    public C0197l0() {
        super(C0060.m9352(f597short, 0, 23, 1237), 28);
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
        if (cL == '-') {
            p.e(cL);
            g1Var = g1.D;
        } else {
            if (cL != '<') {
                if (cL != 65535) {
                    p.g(c0174a.j('-', '<', 0));
                    return;
                } else {
                    p.l(this);
                    p.o(g1.a);
                    return;
                }
            }
            p.e(cL);
            g1Var = g1.F;
        }
        p.o(g1Var);
        p.a.a();
    }
}