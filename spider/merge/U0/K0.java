package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.o0.C0056;

/* loaded from: classes.dex */
public enum K0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f538short = {683, 640, 652, 667, 662, 671, 650};

    public K0() {
        super(C0056.m8911(f538short, 0, 7, 751), 50);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        L0 l0 = g1.Z;
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            p.o(l0);
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                p.m(this);
                p.o(l0);
                return;
            }
            p.l(this);
        }
        p.m(this);
        p.m.f();
        p.m.f = true;
        p.j();
        p.o(g1.a);
    }
}