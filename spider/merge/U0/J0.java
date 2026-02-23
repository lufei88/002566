package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.h.C0054;

/* loaded from: classes.dex */
public enum J0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f536short = {2763, 2791, 2789, 2789, 2797, 2790, 2812, 2765, 2790, 2796, 2762, 2793, 2790, 2799, 2234, 2234, 2230};

    public J0() {
        super(C0033.m5852(f536short, 0, 14, 2696), 49);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        F0 f0 = g1.U;
        String strM8574 = C0054.m8574(f536short, 14, 3, 2199);
        if (cE != 0) {
            if (cE == '-') {
                p.n.i(strM8574);
                p.o(g1.V);
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE != '>') {
                if (cE != 65535) {
                    H h = p.n;
                    h.i(strM8574);
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
        h2.i(strM8574);
        h2.h((char) 65533);
        p.o(f0);
    }
}