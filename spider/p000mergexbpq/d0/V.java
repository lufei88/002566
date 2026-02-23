package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;

/* loaded from: classes.dex */
enum V extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f233short = {1774, 1791, 1784, 1789, 1768, 1789, 1785, 1746, 1752, 1768, 1757, 1755, 1778, 1757, 1745, 1753, 1640, 1659};

    V() {
        super(C0058.m9106(f233short, 0, 16, 1724), 12, null);
    }

    private void h(Q q, C0067a c0067a) {
        q.k(C0051.m8259(f233short, 16, 2, 1620));
        q.l(q.h);
        c0067a.G();
        q.u(h1.e);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        h1 h1Var;
        if (c0067a.C()) {
            String strJ = c0067a.j();
            q.i.o(strJ);
            q.h.append(strJ);
            return;
        }
        char cE = c0067a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (q.s()) {
                h1Var = h1.J;
                q.u(h1Var);
                return;
            }
            h(q, c0067a);
        }
        if (cE == '/') {
            if (q.s()) {
                h1Var = h1.R;
                q.u(h1Var);
                return;
            }
            h(q, c0067a);
        }
        if (cE == '>' && q.s()) {
            q.o();
            h1Var = h1.c;
            q.u(h1Var);
            return;
        }
        h(q, c0067a);
    }
}