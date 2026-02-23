package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.p000mergexbpq.S.C0005;

/* loaded from: classes.dex */
enum f1 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f260short = {2304, 2357, 2355, 2331, 2340, 2353, 2362};

    f1() {
        super(C0005.m1645(f260short, 0, 7, 2388), 7, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        h1 h1Var2;
        char cS = c0067a.s();
        if (cS == '!') {
            h1Var = h1.T;
        } else if (cS == '/') {
            h1Var = h1.k;
        } else {
            if (cS != '?') {
                if (c0067a.C()) {
                    q.g(true);
                    h1Var2 = h1.l;
                } else {
                    q.q(this);
                    q.i('<');
                    h1Var2 = h1.c;
                }
                q.u(h1Var2);
                return;
            }
            q.e();
            h1Var = h1.S;
        }
        q.a(h1Var);
    }
}