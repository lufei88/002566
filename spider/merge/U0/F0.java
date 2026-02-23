package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.W.C0034;

/* loaded from: classes.dex */
public enum F0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f530short = {3144, 3172, 3174, 3174, 3182, 3173, 3199};

    public F0() {
        super(C0034.m6001(f530short, 0, 7, 3083), 46);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cL = c0174a.l();
        if (cL == 0) {
            p.m(this);
            c0174a.a();
            p.n.h((char) 65533);
        } else if (cL == '-') {
            p.o(g1.V);
            p.a.a();
        } else {
            if (cL != 65535) {
                p.n.i(c0174a.j('-', 0));
                return;
            }
            p.l(this);
            p.i();
            p.o(g1.a);
        }
    }
}