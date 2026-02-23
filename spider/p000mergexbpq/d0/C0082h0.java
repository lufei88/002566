package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z.C0038;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0082h0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f265short = {276, 292, 309, 302, 311, 307, 259, 294, 307, 294, 258, 308, 292, 294, 311, 290, 291, 259, 294, 308, 303, 259, 294, 308, 303};

    C0082h0() {
        super(C0038.m6452(f265short, 0, 25, 327), 23, null);
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
                return;
            }
            if (cE != '<') {
                q.i(cE);
                if (cE == '>') {
                    h1Var = h1.h;
                }
            } else {
                h1Var = h1.A;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        q.i((char) 65533);
        q.u(c0078f0);
    }
}