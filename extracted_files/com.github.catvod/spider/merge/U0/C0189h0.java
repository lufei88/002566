package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge.U0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0189h0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f589short = {2691, 2739, 2722, 2745, 2720, 2724, 2708, 2737, 2724, 2737, 2709, 2723, 2739, 2737, 2720, 2741, 2740, 2716, 2741, 2723, 2723, 2724, 2744, 2737, 2750, 2691, 2745, 2743, 2750, 2298};

    public C0189h0() {
        super(C0012.m2973(f589short, 0, 29, 2768), 24);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        if (c0174a.t()) {
            p.d();
            p.h.append(c0174a.l());
            p.g(C0032.m5708(f589short, 29, 1, 2246));
            p.e(c0174a.l());
            g1Var = g1.B;
        } else if (!c0174a.r('/')) {
            p.e('<');
            p.o(g1.v);
            return;
        } else {
            p.d();
            g1Var = g1.z;
        }
        p.o(g1Var);
        p.a.a();
    }
}