package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public enum e1 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f581short = {1261, 1240, 1246, 1270, 1225, 1244, 1239};

    public e1() {
        super(C0015.m3484(f581short, 0, 7, 1209), 7);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        g1 g1Var2;
        char cL = c0174a.l();
        if (cL == '!') {
            g1Var = g1.R;
        } else {
            if (cL != '/') {
                if (cL == '?') {
                    p.n.f();
                    p.o(g1.Q);
                    return;
                }
                if (c0174a.t()) {
                    p.c(true);
                    g1Var2 = g1.j;
                } else {
                    p.m(this);
                    p.e('<');
                    g1Var2 = g1.a;
                }
                p.o(g1Var2);
                return;
            }
            g1Var = g1.i;
        }
        p.o(g1Var);
        p.a.a();
    }
}