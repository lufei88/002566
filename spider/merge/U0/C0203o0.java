package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0033;

/* renamed from: com.github.catvod.spider.merge.U0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0203o0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f603short = {796, 812, 829, 806, 831, 827, 779, 814, 827, 814, 779, 800, 826, 813, 803, 810, 778, 828, 812, 814, 831, 810, 811, 779, 814, 828, 807, 779, 814, 828, 807};

    public C0203o0() {
        super(C0033.m5852(f603short, 0, 31, 847), 30);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        C0197l0 c0197l0 = g1.C;
        if (cE != 0) {
            if (cE == '-') {
                p.e(cE);
                return;
            }
            if (cE == '<') {
                p.e(cE);
                g1Var = g1.F;
            } else if (cE == '>') {
                p.e(cE);
                g1Var = g1.f;
            } else if (cE == 65535) {
                p.l(this);
                g1Var = g1.a;
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        cE = 65533;
        p.e(cE);
        p.o(c0197l0);
    }
}