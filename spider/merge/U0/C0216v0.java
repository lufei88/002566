package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge.U0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0216v0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f617short = {1984, 2037, 2037, 2035, 2024, 2019, 2036, 2037, 2020, 2007, 2016, 2029, 2036, 2020, 2014, 2021, 2030, 2036, 2019, 2029, 2020, 2000, 2036, 2030, 2037, 2020, 2021};

    public C0216v0() {
        super(C0012.m2973(f617short, 0, 27, 1921), 37);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        M m;
        g1 g1Var;
        String strF = c0174a.f(false);
        if (strF.length() > 0) {
            p.k.i(strF);
        } else {
            p.k.j = true;
        }
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE == '\"') {
                g1Var = g1.O;
            } else {
                if (cE == '&') {
                    int[] iArrB = p.b('\"', true);
                    M m2 = p.k;
                    if (iArrB != null) {
                        m2.j(iArrB);
                        return;
                    } else {
                        m2.h('&');
                        return;
                    }
                }
                if (cE != 65535) {
                    m = p.k;
                } else {
                    p.l(this);
                    g1Var = g1.a;
                }
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        m = p.k;
        cE = 65533;
        m.h(cE);
    }
}