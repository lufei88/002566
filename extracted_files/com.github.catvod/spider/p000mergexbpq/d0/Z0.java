package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.Q.C0002;

/* loaded from: classes.dex */
enum Z0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f242short = {2916, 2895, 2883, 2900, 2905, 2896, 2885, 2931, 2905, 2899, 2900, 2885, 2893, 2921, 2884, 2885, 2894, 2900, 2889, 2886, 2889, 2885, 2898, 2943, 2899, 2889, 2894, 2887, 2892, 2885, 2929, 2901, 2895, 2900, 2885, 2884};

    Z0() {
        super(C0002.m1305(f242short, 0, 36, 2848), 63, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        StringBuilder sb;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '\'') {
                q.u(h1.o0);
                return;
            }
            if (cE == '>') {
                q.q(this);
            } else if (cE != 65535) {
                sb = q.m.e;
            } else {
                q.p(this);
            }
            q.m.f = true;
            q.n();
            q.u(c0072c0);
            return;
        }
        q.q(this);
        sb = q.m.e;
        cE = 65533;
        sb.append(cE);
    }
}