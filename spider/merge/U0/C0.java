package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.z.C0065;

/* loaded from: classes.dex */
public enum C0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f525short = {2170, 2134, 2117, 2140, 2114, 2119, 2163, 2130, 2132, 2139, 2134, 2117, 2134, 2115, 2142, 2136, 2137, 2168, 2119, 2130, 2137, 3081, 3081, 682, 673, 685, 698, 695, 702, 683, 1879, 1871, 1864, 1869, 1880, 1869, 1879};

    public C0() {
        super(C0031.m5565(f525short, 0, 21, 2103), 43);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        if (c0174a.p(C0065.m9775(f525short, 21, 2, 3108))) {
            p.n.f();
            g1Var = g1.S;
        } else if (c0174a.q(C0057.m8978(f525short, 23, 7, 750))) {
            g1Var = g1.Y;
        } else if (c0174a.p(C0061.m9361(f525short, 30, 7, 1804))) {
            p.d();
            g1Var = g1.o0;
        } else {
            p.m(this);
            p.n.f();
            g1Var = g1.Q;
        }
        p.o(g1Var);
    }
}