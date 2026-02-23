package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.I0.C0020;

/* loaded from: classes.dex */
public enum W0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f560short = {1423, 1448, 1451, 1442, 1471, 1448, 1417, 1442, 1454, 1465, 1460, 1469, 1448, 1438, 1460, 1470, 1465, 1448, 1440, 1412, 1449, 1448, 1443, 1465, 1444, 1451, 1444, 1448, 1471};

    public W0() {
        super(C0020.m4199(f560short, 0, 29, 1485), 61);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            g1Var = g1.k0;
        } else {
            if (cE != '\'') {
                C0177b0 c0177b0 = g1.a;
                if (cE == '>') {
                    p.m(this);
                } else if (cE != 65535) {
                    p.m(this);
                    p.m.f = true;
                    g1Var = g1.n0;
                } else {
                    p.l(this);
                }
                p.m.f = true;
                p.j();
                p.o(c0177b0);
                return;
            }
            g1Var = g1.l0;
        }
        p.o(g1Var);
    }
}