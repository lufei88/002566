package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.d.C0047;

/* loaded from: classes.dex */
enum a1 extends h1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f245short = {1640, 1615, 1629, 1612, 1627, 1645, 1606, 1610, 1629, 1616, 1625, 1612, 1658, 1616, 1626, 1629, 1612, 1604, 1632, 1613, 1612, 1607, 1629, 1600, 1615, 1600, 1612, 1627};

    a1() {
        super(C0047.m7833(f245short, 0, 28, 1577), 64, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.h1
    final void g(Q q, C0067a c0067a) {
        C0072c0 c0072c0 = h1.c;
        char cE = c0067a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            return;
        }
        if (cE != '>') {
            if (cE != 65535) {
                q.q(this);
                q.u(h1.p0);
                return;
            } else {
                q.p(this);
                q.m.f = true;
            }
        }
        q.n();
        q.u(c0072c0);
    }
}