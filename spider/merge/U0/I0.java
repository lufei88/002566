package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.Q0.C0025;

/* loaded from: classes.dex */
public enum I0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f535short = {313, 274, 283, 264, 283, 281, 270, 287, 264, 296, 287, 284, 287, 264, 287, 276, 281, 287, 307, 276, 296, 281, 286, 283, 270, 283};

    public I0() {
        super(C0025.m4795(f535short, 0, 26, 378), 3);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        C0220x0 c0220x0 = g1.c;
        int[] iArrB = p.b(null, false);
        if (iArrB == null) {
            p.e('&');
        } else {
            p.g(new String(iArrB, 0, iArrB.length));
        }
        p.o(c0220x0);
    }
}