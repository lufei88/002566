package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.p000mergexbpq.R.C0003;

/* loaded from: classes.dex */
enum c1 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f251short = {786, 821, 816, 805, 816, 770, 820, 818, 805, 824, 830, 831, 2116, 2116, 2087};

    c1() {
        super(C0003.m1398(f251short, 0, 12, 849), 66, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        q.h.append(c0067a.n());
        if (c0067a.w(C0039.m6551(f251short, 12, 3, 2073)) || c0067a.t()) {
            q.j(new G(q.h.toString()));
            q.u(h1.c);
        }
    }
}