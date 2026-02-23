package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.y0.C0064;

/* loaded from: classes.dex */
public enum M0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f542short = {1684, 1727, 1715, 1700, 1705, 1696, 1717, 1694, 1713, 1725, 1717};

    public M0() {
        super(C0064.m9599(f542short, 0, 11, 1744), 52);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        StringBuilder sb;
        if (c0174a.u()) {
            p.m.b.append(c0174a.h());
            return;
        }
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE != ' ') {
                C0177b0 c0177b0 = g1.a;
                if (cE != '>') {
                    if (cE == 65535) {
                        p.l(this);
                        p.m.f = true;
                    } else if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                        sb = p.m.b;
                    }
                }
                p.j();
                p.o(c0177b0);
                return;
            }
            p.o(g1.b0);
            return;
        }
        p.m(this);
        sb = p.m.b;
        cE = 65533;
        sb.append(cE);
    }
}