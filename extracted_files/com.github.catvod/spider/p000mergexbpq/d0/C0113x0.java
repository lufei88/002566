package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.Q.C0001;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0113x0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f299short = {3102, 3115, 3115, 3117, 3126, 3133, 3114, 3115, 3130, 3081, 3134, 3123, 3114, 3130, 3072, 3116, 3126, 3121, 3128, 3123, 3130, 3086, 3114, 3120, 3115, 3130, 3131};

    C0113x0() {
        super(C0001.m1189(f299short, 0, 27, 3167), 38, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        N n;
        h1 h1Var;
        String strF = c0067a.f(true);
        if (strF.length() > 0) {
            q.i.l(strF);
        } else {
            q.i.w();
        }
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == 65535) {
                q.p(this);
                h1Var = h1.c;
            } else {
                if (cE == '&') {
                    int[] iArrD = q.d('\'', true);
                    N n2 = q.i;
                    if (iArrD != null) {
                        n2.m(iArrD);
                        return;
                    } else {
                        n2.k('&');
                        return;
                    }
                }
                if (cE != '\'') {
                    n = q.i;
                } else {
                    h1Var = h1.Q;
                }
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        n = q.i;
        cE = 65533;
        n.k(cE);
    }
}