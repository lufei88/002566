package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.x0.C0063;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0111w0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f297short = {2719, 2730, 2730, 2732, 2743, 2748, 2731, 2730, 2747, 2696, 2751, 2738, 2731, 2747, 2689, 2746, 2737, 2731, 2748, 2738, 2747, 2703, 2731, 2737, 2730, 2747, 2746};

    C0111w0() {
        super(C0063.m9585(f297short, 0, 27, 2782), 37, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        N n;
        h1 h1Var;
        String strF = c0067a.f(false);
        if (strF.length() > 0) {
            q.i.l(strF);
        } else {
            q.i.w();
        }
        char cE = c0067a.e();
        if (cE != 0) {
            if (cE == '\"') {
                h1Var = h1.Q;
            } else {
                if (cE == '&') {
                    int[] iArrD = q.d('\"', true);
                    N n2 = q.i;
                    if (iArrD != null) {
                        n2.m(iArrD);
                        return;
                    } else {
                        n2.k('&');
                        return;
                    }
                }
                if (cE != 65535) {
                    n = q.i;
                } else {
                    q.p(this);
                    h1Var = h1.c;
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