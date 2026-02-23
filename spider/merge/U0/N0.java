package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;

/* loaded from: classes.dex */
public enum N0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f543short = {560, 535, 517, 532, 515, 565, 542, 530, 517, 520, 513, 532, 575, 528, 540, 532, 2664, 2669, 2682, 2676, 2673, 2683, 1112, 1106, 1112, 1119, 1102, 1094};

    public N0() {
        super(C0029.m5256(f543short, 0, 16, 625), 53);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        boolean zN = c0174a.n();
        C0177b0 c0177b0 = g1.a;
        if (zN) {
            p.l(this);
            p.m.f = true;
            p.j();
            p.o(c0177b0);
            return;
        }
        if (c0174a.s('\t', '\n', '\r', '\f', ' ')) {
            c0174a.a();
            return;
        }
        if (!c0174a.r('>')) {
            String strM5565 = C0031.m5565(f543short, 16, 6, 2616);
            if (c0174a.q(strM5565)) {
                p.m.c = strM5565;
                g1Var = g1.c0;
            } else {
                String strM4199 = C0020.m4199(f543short, 22, 6, 1035);
                if (c0174a.q(strM4199)) {
                    p.m.c = strM4199;
                    g1Var = g1.i0;
                } else {
                    p.m(this);
                    p.m.f = true;
                    p.o(g1.n0);
                }
            }
            p.o(g1Var);
            return;
        }
        p.j();
        p.o(c0177b0);
        p.a.a();
    }
}