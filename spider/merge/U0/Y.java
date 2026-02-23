package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;

/* loaded from: classes.dex */
public enum Y extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f563short = {1478, 1526, 1511, 1532, 1509, 1505, 1489, 1524, 1505, 1524, 1497, 1520, 1510, 1510, 1505, 1533, 1524, 1531, 1478, 1532, 1522, 1531, 1488, 1977, 1956};

    public Y() {
        super(C0039.m6551(f563short, 0, 22, 1429), 16);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '!') {
            p.g(C0000.m1077(f563short, 23, 2, 1925));
            g1Var = g1.t;
        } else if (cE != '/') {
            p.g(C0062.m9389(f563short, 22, 1, 1516));
            if (cE != 65535) {
                c0174a.z();
                g1Var = g1.f;
            } else {
                p.l(this);
                g1Var = g1.a;
            }
        } else {
            p.d();
            g1Var = g1.r;
        }
        p.o(g1Var);
    }
}