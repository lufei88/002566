package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.p.C0057;

/* renamed from: com.github.catvod.spider.merge.U0.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0199m0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f599short = {473, 498, 507, 488, 507, 505, 494, 511, 488, 456, 511, 508, 511, 488, 511, 500, 505, 511, 467, 500, 478, 507, 494, 507};

    public C0199m0() {
        super(C0057.m8978(f599short, 0, 24, 410), 1);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        C0177b0 c0177b0 = g1.a;
        int[] iArrB = p.b(null, false);
        if (iArrB == null) {
            p.e('&');
        } else {
            p.g(new String(iArrB, 0, iArrB.length));
        }
        p.o(c0177b0);
    }
}