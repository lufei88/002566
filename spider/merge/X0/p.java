package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class p extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f676short = {700, 701, 678, 754, 673, 679, 674, 674, 701, 672, 678, 754, 700, 701, 694, 695, 646, 695, 673, 678, 744, 754};

    public p(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۦۤۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6063() {
        if (C0016.m3596() < 0) {
            return f676short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (((o) C0013.m3164(this, o.class)) != null) {
            return (com.github.catvod.spider.merge.Y0.b) C0022.m4469((o) C0013.m3164(this, o.class), cVar);
        }
        if (C0048.m7964(this, 5) == null) {
            return null;
        }
        String strM1511 = C0004.m1511(C0048.m7964(this, 5));
        C0022.m4478(C0065.m9715(C0045.m7618(), strM1511));
        throw new com.github.catvod.spider.merge.Q0.a(C0026.m4915(C0056.m8911(m6063(), 0, 22, 722), strM1511));
    }
}