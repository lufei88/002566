package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.P0.C0024;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0098p0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f283short = {2467, 2451, 2434, 2457, 2432, 2436, 2484, 2449, 2436, 2449, 2484, 2463, 2437, 2450, 2460, 2453, 2485, 2435, 2451, 2449, 2432, 2453, 2452, 2484, 2449, 2435, 2456, 2484, 2449, 2435, 2456};

    C0098p0() {
        super(C0024.m4740(f283short, 0, 31, 2544), 30, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0092m0 c0092m0 = h1.E;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                return;
            }
            if (cE == '<') {
                q.i(cE);
                h1Var = h1.H;
            } else if (cE == '>') {
                q.i(cE);
                h1Var = h1.h;
            } else if (cE == 65535) {
                q.p(this);
                h1Var = h1.c;
            }
            q.u(h1Var);
            return;
        }
        q.q(this);
        cE = 65533;
        q.i(cE);
        q.u(c0092m0);
    }
}