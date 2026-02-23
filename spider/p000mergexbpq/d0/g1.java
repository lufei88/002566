package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
enum g1 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f263short = {810, 769, 779, 827, 782, 776, 800, 799, 778, 769, 908, 927};

    g1() {
        super(C0012.m2973(f263short, 0, 10, 879), 8, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        if (c0067a.t()) {
            q.p(this);
            q.k(C0057.m8978(f263short, 10, 2, 944));
            q.u(c0072c0);
        } else {
            if (c0067a.C()) {
                q.g(false);
                q.u(h1.l);
                return;
            }
            boolean zY = c0067a.y('>');
            q.q(this);
            if (zY) {
                q.a(c0072c0);
            } else {
                q.e();
                q.a(h1.S);
            }
        }
    }
}