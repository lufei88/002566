package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z.C0039;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0096o0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f281short = {709, 757, 740, 767, 742, 738, 722, 759, 738, 759, 722, 761, 739, 756, 762, 755, 723, 741, 757, 759, 742, 755, 754, 722, 759, 741, 766};

    C0096o0() {
        super(C0039.m6551(f281short, 0, 27, 662), 29, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0092m0 c0092m0 = h1.E;
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '-') {
                q.i(cE);
                h1Var = h1.G;
            } else if (cE == '<') {
                q.i(cE);
                h1Var = h1.H;
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