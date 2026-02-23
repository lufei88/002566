package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Z.C0039;

/* renamed from: com.github.catvod.spider.merge.U0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0187g0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f586short = {996, 980, 965, 990, 967, 963, 1011, 982, 963, 982, 1010, 964, 980, 982, 967, 978, 979, 1011, 982, 964, 991, 1011, 982, 964, 991};

    public C0187g0() {
        super(C0039.m6551(f586short, 0, 25, 951), 23);
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
                return;
            }
            if (cE != '<') {
                p.e(cE);
                if (cE == '>') {
                    g1Var = g1.f;
                }
            } else {
                g1Var = g1.y;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        p.e((char) 65533);
        p.o(c0183e0);
    }
}