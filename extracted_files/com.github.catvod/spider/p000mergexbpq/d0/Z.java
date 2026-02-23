package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
enum Z extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f241short = {2994, 2946, 2963, 2952, 2961, 2965, 2981, 2944, 2965, 2944, 2989, 2948, 2962, 2962, 2965, 2953, 2944, 2959, 2994, 2952, 2950, 2959, 460, 1080, 1061};

    Z() {
        super(C0033.m5852(f241short, 0, 22, 3041), 16, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        char cE = c0067a.e();
        if (cE == '!') {
            q.k(C0016.m3525(f241short, 23, 2, 1028));
            h1Var = h1.v;
        } else if (cE != '/') {
            q.k(C0054.m8574(f241short, 22, 1, 496));
            if (cE != 65535) {
                c0067a.G();
                h1Var = h1.h;
            } else {
                q.p(this);
                h1Var = h1.c;
            }
        } else {
            q.h();
            h1Var = h1.t;
        }
        q.u(h1Var);
    }
}