package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.S.C0027;

/* loaded from: classes.dex */
enum e1 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f257short = {832, 860, 849, 857, 862, 836, 853, 840, 836};

    e1() {
        super(C0027.m5062(f257short, 0, 9, 784), 6, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        char cS = c0067a.s();
        if (cS == 0) {
            q.q(this);
            c0067a.a();
            q.i((char) 65533);
        } else if (cS != 65535) {
            q.k(c0067a.o((char) 0));
        } else {
            q.j(new K());
        }
    }
}