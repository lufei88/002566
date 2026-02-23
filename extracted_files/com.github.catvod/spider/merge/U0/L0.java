package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.I0.C0020;

/* loaded from: classes.dex */
public enum L0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f540short = {667, 700, 703, 694, 683, 700, 669, 694, 698, 685, 672, 681, 700, 663, 696, 692, 700};

    public L0() {
        super(C0020.m4199(f540short, 0, 17, 729), 51);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        boolean zT = c0174a.t();
        M0 m0 = g1.a0;
        if (zT) {
            p.m.f();
            p.o(m0);
            return;
        }
        char cE = c0174a.e();
        if (cE == 0) {
            p.m(this);
            p.m.f();
            p.m.b.append((char) 65533);
        } else {
            if (cE == ' ') {
                return;
            }
            if (cE == 65535) {
                p.l(this);
                p.m.f();
                p.m.f = true;
                p.j();
                p.o(g1.a);
                return;
            }
            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                return;
            }
            p.m.f();
            p.m.b.append(cE);
        }
        p.o(m0);
    }
}