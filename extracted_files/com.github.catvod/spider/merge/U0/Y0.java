package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Q0.C0025;

/* loaded from: classes.dex */
public enum Y0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f564short = {3025, 3066, 3062, 3041, 3052, 3045, 3056, 3014, 3052, 3046, 3041, 3056, 3064, 3036, 3057, 3056, 3067, 3041, 3068, 3059, 3068, 3056, 3047, 3018, 3046, 3068, 3067, 3058, 3065, 3056, 3012, 3040, 3066, 3041, 3056, 3057};

    public Y0() {
        super(C0025.m4795(f564short, 0, 36, 2965), 63);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        StringBuilder sb;
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE == '\'') {
                p.o(g1.m0);
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE == '>') {
                p.m(this);
            } else if (cE != 65535) {
                sb = p.m.e;
            } else {
                p.l(this);
            }
            p.m.f = true;
            p.j();
            p.o(c0177b0);
            return;
        }
        p.m(this);
        sb = p.m.e;
        cE = 65533;
        sb.append(cE);
    }
}