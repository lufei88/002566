package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.t.C0061;

/* renamed from: com.github.catvod.spider.merge.U0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0185f0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f583short = {1043, 1059, 1074, 1065, 1072, 1076, 1028, 1057, 1076, 1057, 1029, 1075, 1059, 1057, 1072, 1061, 1060, 1028, 1057, 1075, 1064};

    public C0185f0() {
        super(C0061.m9361(f583short, 0, 21, 1088), 22);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        if (c0174a.n()) {
            p.l(this);
            p.o(g1.a);
            return;
        }
        char cE = c0174a.e();
        C0183e0 c0183e0 = g1.v;
        if (cE != 0) {
            if (cE == '-') {
                p.e(cE);
                g1Var = g1.x;
            } else if (cE == '<') {
                g1Var = g1.y;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        cE = 65533;
        p.e(cE);
        p.o(c0183e0);
    }
}