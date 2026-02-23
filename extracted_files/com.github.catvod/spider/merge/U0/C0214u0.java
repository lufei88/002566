package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.o0.C0056;

/* renamed from: com.github.catvod.spider.merge.U0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0214u0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f615short = {1181, 1210, 1209, 1200, 1197, 1210, 1182, 1195, 1195, 1197, 1206, 1213, 1194, 1195, 1210, 1161, 1214, 1203, 1194, 1210};

    public C0214u0() {
        super(C0056.m8911(f615short, 0, 20, 1247), 36);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        M m;
        g1 g1Var;
        char cE = c0174a.e();
        C0222y0 c0222y0 = g1.N;
        if (cE != 0) {
            if (cE != ' ') {
                if (cE != '\"') {
                    if (cE != '`') {
                        C0177b0 c0177b0 = g1.a;
                        if (cE != 65535) {
                            if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r') {
                                return;
                            }
                            if (cE != '&') {
                                if (cE != '\'') {
                                    switch (cE) {
                                        case '>':
                                            p.m(this);
                                            break;
                                    }
                                    return;
                                }
                                g1Var = g1.M;
                            }
                            c0174a.z();
                            p.o(c0222y0);
                        }
                        p.l(this);
                        p.k();
                        p.o(c0177b0);
                        return;
                    }
                    p.m(this);
                    m = p.k;
                } else {
                    g1Var = g1.L;
                }
                p.o(g1Var);
                return;
            }
            return;
        }
        p.m(this);
        m = p.k;
        cE = 65533;
        m.h(cE);
        p.o(c0222y0);
    }
}