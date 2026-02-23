package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class r extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f677short = {2878, 2878};
    public com.github.catvod.spider.merge.E0.d e;

    public r(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6064() {
        if (C0032.m5686() <= 0) {
            return f677short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        Object objM9582;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (((l) C0013.m3164(this, l.class)) != null && !C0050.m8105((l) C0013.m3164(this, l.class))) {
            return (com.github.catvod.spider.merge.Y0.b) C0030.m5407((l) C0013.m3164(this, l.class), cVar);
        }
        com.github.catvod.spider.merge.E0.d dVarM2064 = C0009.m2064(this);
        if (dVarM2064 == null) {
            objM9582 = C0064.m9630((i) C0013.m3164(this, i.class), cVar);
        } else {
            if (C0007.m1815(C0001.m1189(m6064(), 0, 2, 2833), C0024.m4730(dVarM2064))) {
                C0055.m8764(cVar).b = true;
            }
            objM9582 = C0063.m9582((w) C0013.m3164(this, w.class), cVar);
        }
        return (com.github.catvod.spider.merge.Y0.b) objM9582;
    }
}