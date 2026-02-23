package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z.C0040;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0115y0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f301short = {2997, 2948, 2947, 2950, 2963, 2950};

    C0115y0() {
        super(C0040.m6584(f301short, 0, 6, 3047), 2, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        char cS = c0067a.s();
        if (cS == 0) {
            q.q(this);
            c0067a.a();
            q.i((char) 65533);
            return;
        }
        if (cS == '&') {
            h1Var = h1.f;
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
            h1Var = h1.m;
        }
        q.a(h1Var);
    }
}