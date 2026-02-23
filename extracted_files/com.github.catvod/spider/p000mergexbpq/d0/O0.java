package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
enum O0 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f221short = {1789, 1754, 1736, 1753, 1742, 1784, 1747, 1759, 1736, 1733, 1740, 1753, 1778, 1757, 1745, 1753, 472, 477, 458, 452, 449, 459, 3293, 3287, 3293, 3290, 3275, 3267};

    O0() {
        super(C0011.m2805(f221short, 0, 16, 1724), 53, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        C0072c0 c0072c0 = h1.c;
        if (c0067a.t()) {
            q.p(this);
            q.m.f = true;
            q.n();
            q.u(c0072c0);
            return;
        }
        if (c0067a.z('\t', '\n', '\r', '\f', ' ')) {
            c0067a.a();
            return;
        }
        if (c0067a.y('>')) {
            q.n();
            q.a(c0072c0);
            return;
        }
        String strM9106 = C0058.m9106(f221short, 16, 6, 392);
        if (c0067a.x(strM9106)) {
            q.m.c = strM9106;
            h1Var = h1.e0;
        } else {
            String strM5362 = C0030.m5362(f221short, 22, 6, 3214);
            if (!c0067a.x(strM5362)) {
                q.q(this);
                q.m.f = true;
                q.a(h1.p0);
                return;
            }
            q.m.c = strM5362;
            h1Var = h1.k0;
        }
        q.u(h1Var);
    }
}