package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.b0.C0008;

/* loaded from: classes.dex */
public enum Q0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f549short = {1917, 1878, 1882, 1869, 1856, 1865, 1884, 1897, 1868, 1883, 1877, 1872, 1882, 1904, 1885, 1884, 1879, 1869, 1872, 1887, 1872, 1884, 1867, 1894, 1885, 1878, 1868, 1883, 1877, 1884, 1896, 1868, 1878, 1869, 1884, 1885};

    public Q0() {
        super(C0008.m1970(f549short, 0, 36, 1849), 56);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        StringBuilder sb;
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE == '\"') {
                p.o(g1.g0);
                return;
            }
            C0177b0 c0177b0 = g1.a;
            if (cE == '>') {
                p.m(this);
            } else if (cE != 65535) {
                sb = p.m.d;
            } else {
                p.l(this);
            }
            p.m.f = true;
            p.j();
            p.o(c0177b0);
            return;
        }
        p.m(this);
        sb = p.m.d;
        cE = 65533;
        sb.append(cE);
    }
}