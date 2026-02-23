package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.R.C0003;

/* loaded from: classes.dex */
public enum U extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f555short = {1265, 1248, 1255, 1250, 1271, 1250, 1254, 1229, 1223, 1271, 1218, 1220, 1261, 1218, 1230, 1222, 633, 618};

    public U() {
        super(C0003.m1398(f555short, 0, 16, 1187), 12);
    }

    public static void e(P p, C0174a c0174a) {
        p.g(C0048.m7902(f555short, 16, 2, 581));
        p.h(p.h);
        c0174a.z();
        p.o(g1.c);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        g1 g1Var;
        if (c0174a.t()) {
            String strH = c0174a.h();
            p.k.k(strH);
            p.h.append(strH);
            return;
        }
        char cE = c0174a.e();
        if (cE == '\t' || cE == '\n' || cE == '\f' || cE == '\r' || cE == ' ') {
            if (p.n()) {
                g1Var = g1.H;
                p.o(g1Var);
                return;
            }
            e(p, c0174a);
        }
        if (cE == '/') {
            if (p.n()) {
                g1Var = g1.P;
                p.o(g1Var);
                return;
            }
            e(p, c0174a);
        }
        if (cE == '>' && p.n()) {
            p.k();
            g1Var = g1.a;
            p.o(g1Var);
            return;
        }
        e(p, c0174a);
    }
}