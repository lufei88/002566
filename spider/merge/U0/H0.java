package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.x0.C0063;

/* loaded from: classes.dex */
public enum H0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f533short = {1911, 1883, 1881, 1881, 1873, 1882, 1856, 1905, 1882, 1872, 576, 576};

    public H0() {
        super(C0063.m9585(f533short, 0, 10, 1844), 48);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        F0 f0 = g1.U;
        String strM5062 = C0027.m5062(f533short, 10, 2, 621);
        if (cE != 0) {
            if (cE == '!') {
                p.o(g1.X);
                return;
            }
            if (cE == '-') {
                p.n.h('-');
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE != '>') {
                if (cE != 65535) {
                    H h = p.n;
                    h.i(strM5062);
                    h.h(cE);
                } else {
                    p.l(this);
                }
            }
            p.i();
            p.o(c0177b0);
            return;
        }
        p.m(this);
        H h2 = p.n;
        h2.i(strM5062);
        h2.h((char) 65533);
        p.o(f0);
    }
}