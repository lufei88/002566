package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.V.C0032;

/* renamed from: com.github.catvod.spider.merge.U0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0218w0 extends g1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f619short = {1350, 1395, 1395, 1397, 1390, 1381, 1394, 1395, 1378, 1361, 1382, 1387, 1394, 1378, 1368, 1396, 1390, 1385, 1376, 1387, 1378, 1366, 1394, 1384, 1395, 1378, 1379};

    public C0218w0() {
        super(C0032.m5708(f619short, 0, 27, 1287), 38);
    }

    @Override // com.github.catvod.spider.merge.U0.g1
    public final void d(P p, C0174a c0174a) {
        M m;
        g1 g1Var;
        String strF = c0174a.f(true);
        if (strF.length() > 0) {
            p.k.i(strF);
        } else {
            p.k.j = true;
        }
        char cE = c0174a.e();
        if (cE != 0) {
            if (cE == 65535) {
                p.l(this);
                g1Var = g1.a;
            } else {
                if (cE == '&') {
                    int[] iArrB = p.b('\'', true);
                    M m2 = p.k;
                    if (iArrB != null) {
                        m2.j(iArrB);
                        return;
                    } else {
                        m2.h('&');
                        return;
                    }
                }
                if (cE != '\'') {
                    m = p.k;
                } else {
                    g1Var = g1.O;
                }
            }
            p.o(g1Var);
            return;
        }
        p.m(this);
        m = p.k;
        cE = 65533;
        m.h(cE);
    }
}