package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.I0.C0020;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0080g0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f262short = {1168, 1184, 1201, 1194, 1203, 1207, 1159, 1186, 1207, 1186, 1158, 1200, 1184, 1186, 1203, 1190, 1191, 1159, 1186, 1200, 1195};

    C0080g0() {
        super(C0020.m4199(f262short, 0, 21, 1219), 22, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0078f0 c0078f0 = h1.x;
        if (c0067a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                h1Var = h1.z;
            } else if (cE == '<') {
                h1Var = h1.A;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        cE = 65533;
        q.i(cE);
        q.u(c0078f0);
    }
}