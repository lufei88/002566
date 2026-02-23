package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
enum I0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f212short = {2433, 2477, 2479, 2479, 2471, 2476, 2486, 2439, 2476, 2470, 1069, 1069};

    I0() {
        super(C0032.m5708(f212short, 0, 10, 2498), 48, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        G0 g0 = h1.W;
        char cE = c0067a.e();
        String strM1842 = C0007.m1842(f212short, 10, 2, 1024);
        if (cE != 0) {
            if (cE == '!') {
                q.q(this);
                q.u(h1.Z);
                return;
            }
            if (cE == '-') {
                q.q(this);
                q.n.i('-');
                return;
            }
            if (cE != '>') {
                if (cE != 65535) {
                    q.q(this);
                    I i = q.n;
                    i.j(strM1842);
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
        i2.j(strM1842);
        i2.i((char) 65533);
        q.u(g0);
    }
}