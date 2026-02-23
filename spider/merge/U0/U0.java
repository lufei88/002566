package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.f0.C0052;

/* loaded from: classes.dex */
public enum U0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f556short = {1505, 1478, 1495, 1492, 1478, 1478, 1485, 1511, 1484, 1472, 1495, 1498, 1491, 1478, 1523, 1494, 1473, 1487, 1482, 1472, 1506, 1485, 1479, 1520, 1498, 1488, 1495, 1478, 1486, 1514, 1479, 1478, 1485, 1495, 1482, 1477, 1482, 1478, 1489, 1488};

    public U0() {
        super(C0052.m8337(f556short, 0, 40, 1443), 59);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
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