package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.J0.C0021;

/* loaded from: classes.dex */
public enum E0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f528short = {539, 567, 565, 565, 573, 566, 556, 523, 556, 569, 554, 556, 540, 569, 555, 560};

    public E0() {
        super(C0021.m4340(f528short, 0, 16, 600), 45);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        F0 f0 = g1.U;
        if (cE != 0) {
            if (cE == '-') {
                p.o(g1.W);
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE == '>') {
                p.m(this);
            } else if (cE != 65535) {
                p.n.h(cE);
            } else {
                p.l(this);
            }
            p.i();
            p.o(c0177b0);
            return;
        }
        p.m(this);
        p.n.h((char) 65533);
        p.o(f0);
    }
}