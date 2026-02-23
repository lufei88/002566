package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.d1.C0050;

/* loaded from: classes.dex */
public enum d1 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f578short = {2997, 2985, 2980, 2988, 2987, 2993, 2976, 3005, 2993};

    public d1() {
        super(C0050.m8131(f578short, 0, 9, 3045), 6);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cL = c0174a.l();
        if (cL == 0) {
            p.m(this);
            c0174a.a();
            p.e((char) 65533);
        } else if (cL != 65535) {
            p.g(c0174a.i((char) 0));
        } else {
            p.f(new J());
        }
    }
}