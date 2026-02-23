package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.I0.C0020;

/* renamed from: com.github.catvod.spider.merge.U0.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0224z0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f625short = {2708, 2739, 2721, 2736, 2727, 2708, 2721, 2721, 2727, 2748, 2743, 2720, 2721, 2736, 2691, 2740, 2745, 2720, 2736, 2698, 2724, 2720, 2746, 2721, 2736, 2737};

    public C0224z0() {
        super(C0020.m4199(f625short, 0, 26, 2773), 40);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        char cE = c0174a.e();
        C0208r0 c0208r0 = g1.H;
        if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r' && cE != ' ') {
            if (cE == '/') {
                p.o(g1.P);
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE == '>') {
                p.k();
            } else if (cE != 65535) {
                c0174a.z();
                p.m(this);
            } else {
                p.l(this);
            }
            p.o(c0177b0);
            return;
        }
        p.o(c0208r0);
    }
}