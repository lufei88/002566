package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.z.C0065;

/* loaded from: classes.dex */
public enum V0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f558short = {1591, 1552, 1538, 1555, 1540, 1586, 1561, 1557, 1538, 1551, 1542, 1555, 1573, 1551, 1541, 1538, 1555, 1563, 1597, 1555, 1551, 1537, 1561, 1540, 1554};

    public V0() {
        super(C0065.m9775(f558short, 0, 25, 1654), 60);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            g1Var = g1.j0;
        } else if (cE == '\"') {
            p.m(this);
            g1Var = g1.k0;
        } else {
            if (cE != '\'') {
                C0177b0 c0177b0 = g1.a;
                if (cE == '>') {
                    p.m(this);
                } else {
                    if (cE != 65535) {
                        p.m(this);
                        p.m.f = true;
                        p.j();
                        return;
                    }
                    p.l(this);
                }
                p.m.f = true;
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