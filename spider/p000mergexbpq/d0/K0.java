package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;

/* loaded from: classes.dex */
enum K0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f214short = {2891, 2919, 2917, 2917, 2925, 2918, 2940, 2893, 2918, 2924, 2890, 2921, 2918, 2927, 345, 345, 341};

    K0() {
        super(C0026.m4951(f214short, 0, 14, 2824), 49, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0067a.e();
        String strM2300 = C0010.m2300(f214short, 14, 3, 372);
        if (cE != 0) {
            if (cE == '-') {
                q.n.j(strM2300);
                q.u(h1.X);
                return;
            }
            if (cE != '>') {
                if (cE != 65535) {
                    I i = q.n;
                    i.j(strM2300);
                    i.i(cE);
                } else {
                    q.p(this);
                }
            }
            q.m();
            q.u(c0072c0);
            return;
        }
        q.q(this);
        I i2 = q.n;
        i2.j(strM2300);
        i2.i((char) 65533);
        q.u(g0);
    }
}