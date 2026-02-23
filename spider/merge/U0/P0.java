package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0031;

/* loaded from: classes.dex */
public enum P0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f547short = {2095, 2056, 2059, 2050, 2079, 2056, 2089, 2050, 2062, 2073, 2068, 2077, 2056, 2109, 2072, 2063, 2049, 2052, 2062, 2084, 2057, 2056, 2051, 2073, 2052, 2059, 2052, 2056, 2079};

    public P0() {
        super(C0031.m5565(f547short, 0, 29, 2157), 55);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE == '\"') {
            g1Var = g1.e0;
        } else {
            if (cE != '\'') {
                C0177b0 c0177b0 = g1.a;
                if (cE == '>') {
                    p.m(this);
                } else if (cE != 65535) {
                    p.m(this);
                    p.m.f = true;
                    g1Var = g1.n0;
                } else {
                    p.l(this);
                }
                p.m.f = true;
                p.j();
                p.o(c0177b0);
                return;
            }
            g1Var = g1.f0;
        }
        p.o(g1Var);
    }
}