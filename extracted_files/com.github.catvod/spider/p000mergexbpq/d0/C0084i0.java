package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0084i0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f268short = {1889, 1873, 1856, 1883, 1858, 1862, 1910, 1875, 1862, 1875, 1911, 1857, 1873, 1875, 1858, 1879, 1878, 1918, 1879, 1857, 1857, 1862, 1882, 1875, 1884, 1889, 1883, 1877, 1884, 1635};

    C0084i0() {
        super(C0016.m3525(f268short, 0, 29, 1842), 24, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        if (c0067a.C()) {
            q.h();
            q.h.append(c0067a.s());
            q.k(C0025.m4795(f268short, 29, 1, 1631));
            q.i(c0067a.s());
            h1Var = h1.D;
        } else if (!c0067a.y('/')) {
            q.i('<');
            q.u(h1.x);
            return;
        } else {
            q.h();
            h1Var = h1.B;
        }
        q.a(h1Var);
    }
}