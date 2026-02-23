package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.F0.C0018;

/* loaded from: classes.dex */
public enum D0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f526short = {3097, 3125, 3127, 3127, 3135, 3124, 3118, 3081, 3118, 3131, 3112, 3118};

    public D0() {
        super(C0018.m3917(f526short, 0, 12, 3162), 44);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        F0 f0 = g1.U;
        if (cE != 0) {
            if (cE == '-') {
                p.o(g1.T);
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE == '>') {
                p.m(this);
            } else if (cE != 65535) {
                c0174a.z();
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