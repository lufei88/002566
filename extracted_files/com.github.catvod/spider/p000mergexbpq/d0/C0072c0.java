package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.b.C0044;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0072c0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f250short = {651, 686, 699, 686};

    C0072c0() {
        super(C0044.m7509(f250short, 0, 4, 719), 0, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        char cS = c0067a.s();
        if (cS == 0) {
            q.q(this);
            q.i(c0067a.e());
            return;
        }
        if (cS == '&') {
            h1Var = h1.d;
        } else {
            if (cS != '<') {
                if (cS != 65535) {
                    q.k(c0067a.g());
                    return;
                } else {
                    q.j(new K());
                    return;
                }
            }
            h1Var = h1.j;
        }
        q.a(h1Var);
    }
}