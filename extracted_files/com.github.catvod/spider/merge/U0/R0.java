package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.S.C0027;

/* loaded from: classes.dex */
public enum R0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f550short = {1932, 1959, 1963, 1980, 1969, 1976, 1965, 1944, 1981, 1962, 1956, 1953, 1963, 1921, 1964, 1965, 1958, 1980, 1953, 1966, 1953, 1965, 1978, 1943, 1979, 1953, 1958, 1967, 1956, 1965, 1945, 1981, 1959, 1980, 1965, 1964};

    public R0() {
        super(C0027.m5062(f550short, 0, 36, 1992), 57);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        StringBuilder sb;
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE == '\'') {
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