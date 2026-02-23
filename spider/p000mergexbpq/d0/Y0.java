package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z.C0039;

/* loaded from: classes.dex */
enum Y0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f240short = {2834, 2873, 2869, 2850, 2863, 2854, 2867, 2821, 2863, 2853, 2850, 2867, 2875, 2847, 2866, 2867, 2872, 2850, 2879, 2864, 2879, 2867, 2852, 2825, 2866, 2873, 2851, 2868, 2874, 2867, 2823, 2851, 2873, 2850, 2867, 2866};

    Y0() {
        super(C0039.m6551(f240short, 0, 36, 2902), 62, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        StringBuilder sb;
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '\"') {
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