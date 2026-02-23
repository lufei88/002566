package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;

/* loaded from: classes.dex */
public enum f1 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f584short = {1466, 1425, 1435, 1451, 1438, 1432, 1456, 1423, 1434, 1425, 1410, 1425};

    public f1() {
        super(C0002.m1305(f584short, 0, 10, 1535), 8);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        boolean zN = c0174a.n();
        C0177b0 c0177b0 = g1.a;
        if (zN) {
            p.l(this);
            p.g(C0064.m9599(f584short, 10, 2, 1470));
            p.o(c0177b0);
        } else if (c0174a.t()) {
            p.c(false);
            p.o(g1.j);
        } else if (c0174a.r('>')) {
            p.m(this);
            p.o(c0177b0);
            p.a.a();
        } else {
            p.m(this);
            p.n.f();
            p.n.h('/');
            p.o(g1.Q);
        }
    }
}