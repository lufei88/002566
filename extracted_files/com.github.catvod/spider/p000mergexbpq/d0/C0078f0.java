package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.b0.C0045;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0078f0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f259short = {2700, 2748, 2733, 2742, 2735, 2731, 2715, 2750, 2731, 2750, 2714, 2732, 2748, 2750, 2735, 2746, 2747};

    C0078f0() {
        super(C0045.m7657(f259short, 0, 17, 2783), 21, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        if (c0067a.t()) {
            q.p(this);
            q.u(h1.c);
            return;
        }
        char cS = c0067a.s();
        if (cS == 0) {
            q.q(this);
            c0067a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '-') {
            q.i('-');
            h1Var = h1.y;
        } else {
            if (cS != '<') {
                q.k(c0067a.p('-', '<', 0));
                return;
            }
            h1Var = h1.A;
        }
        q.a(h1Var);
    }
}