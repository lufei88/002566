package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.p000mergexbpq.S.C0004;

/* loaded from: classes.dex */
public enum Q extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f548short = {1937, 1956, 1954, 1931, 1956, 1960, 1952};

    public Q() {
        super(C0004.m1549(f548short, 0, 7, 1989), 9);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        char c;
        c0174a.b();
        int i = c0174a.e;
        int i2 = c0174a.c;
        char[] cArr = c0174a.a;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '<' && c != '>') {
            i3++;
        }
        c0174a.e = i3;
        p.k.k(i3 > i ? C0174a.c(c0174a.a, c0174a.h, i, i3 - i) : "");
        char cE = c0174a.e();
        if (cE == 0) {
            p.k.k(g1.r0);
            return;
        }
        if (cE == ' ') {
            g1Var = g1.H;
        } else {
            if (cE != '/') {
                C0177b0 c0177b0 = g1.a;
                if (cE != '<') {
                    if (cE != '>') {
                        if (cE != 65535) {
                            if (cE != '\t' && cE != '\n' && cE != '\f' && cE != '\r') {
                                M m = p.k;
                                m.getClass();
                                m.k(String.valueOf(cE));
                                return;
                            }
                            g1Var = g1.H;
                        } else {
                            p.l(this);
                        }
                    }
                    p.o(c0177b0);
                    return;
                }
                c0174a.z();
                p.m(this);
                p.k();
                p.o(c0177b0);
                return;
            }
            g1Var = g1.P;
        }
        p.o(g1Var);
    }
}