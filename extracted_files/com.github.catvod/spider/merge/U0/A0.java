package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.d1.C0050;

/* loaded from: classes.dex */
public enum A0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f523short = {513, 567, 574, 564, 529, 574, 573, 545, 571, 572, 565, 513, 550, 563, 544, 550, 518, 563, 565};

    public A0() {
        super(C0050.m8131(f523short, 0, 19, 594), 41);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        C0177b0 c0177b0 = g1.a;
        if (cE == '>') {
            p.k.k = true;
            p.k();
        } else {
            if (cE != 65535) {
                c0174a.z();
                p.m(this);
                p.o(g1.H);
                return;
            }
            p.l(this);
        }
        p.o(c0177b0);
    }
}