package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0031;

/* loaded from: classes.dex */
enum H0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f210short = {399, 419, 417, 417, 425, 418, 440, 393, 418, 424, 392, 429, 447, 420};

    H0() {
        super(C0031.m5565(f210short, 0, 14, 460), 47, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        G0 g0 = h1.W;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '-') {
                h1Var = h1.Y;
            } else if (cE != 65535) {
                I i = q.n;
                i.i('-');
                i.i(cE);
            } else {
                q.p(this);
                q.m();
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.i('-');
        i2.i((char) 65533);
        q.u(g0);
    }
}