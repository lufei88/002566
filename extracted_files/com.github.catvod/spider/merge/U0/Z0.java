package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.S.C0027;

/* loaded from: classes.dex */
public enum Z0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f566short = {1612, 1643, 1657, 1640, 1663, 1609, 1634, 1646, 1657, 1652, 1661, 1640, 1630, 1652, 1662, 1657, 1640, 1632, 1604, 1641, 1640, 1635, 1657, 1636, 1643, 1636, 1640, 1663};

    public Z0() {
        super(C0027.m5062(f566short, 0, 28, 1549), 64);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        C0177b0 c0177b0 = g1.a;
        if (cE != '>') {
            if (cE != 65535) {
                p.m(this);
                p.o(g1.n0);
                return;
            } else {
                p.l(this);
                p.m.f = true;
            }
        }
        p.j();
        p.o(c0177b0);
    }
}