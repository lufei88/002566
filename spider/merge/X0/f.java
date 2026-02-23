package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class f extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f671short = {1563, 3311, 3310, 3317, 3233, 3314, 3316, 3313, 3313, 3310, 3315, 3317, 3233, 3296, 3321, 3304, 3314, 3259, 3233};

    public f(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۢ۠ۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6058() {
        if (C0049.m8038() <= 0) {
            return f671short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (C0048.m7964(this, 7) != null) {
            String strM1511 = C0004.m1511(C0048.m7964(this, 7));
            C0022.m4478(C0065.m9715(C0043.m7370(), strM1511));
            throw new com.github.catvod.spider.merge.Q0.a(C0026.m4915(C0030.m5362(m6058(), 1, 18, 3201), strM1511));
        }
        if (!C0007.m1815(C0053.m8477(m6058(), 0, 1, 1627), C0014.m3331(this))) {
            return null;
        }
        com.github.catvod.spider.merge.Y0.b bVar = new com.github.catvod.spider.merge.Y0.b(null);
        bVar.b = true;
        return bVar;
    }
}