package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.z.C0065;

/* loaded from: classes.dex */
public enum X0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f562short = {3138, 3177, 3173, 3186, 3199, 3190, 3171, 3157, 3199, 3189, 3186, 3171, 3179, 3151, 3170, 3171, 3176, 3186, 3183, 3168, 3183, 3171, 3188, 3161, 3170, 3177, 3187, 3172, 3178, 3171, 3159, 3187, 3177, 3186, 3171, 3170};

    public X0() {
        super(C0065.m9775(f562short, 0, 36, 3078), 62);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        StringBuilder sb;
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE == '\"') {
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