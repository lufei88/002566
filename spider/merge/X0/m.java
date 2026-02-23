package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class m extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f674short = {1305, 1299, 1284, 1310, 1291, 1298, 1354, 1295, 1304, 1304, 1285, 1304, 1350, 1354};
    public com.github.catvod.spider.merge.E0.d e;

    public m(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۣۢۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m6061() {
        if (C0013.m3167() >= 0) {
            return f674short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (((m) C0013.m3164(this, m.class)) == null || C0050.m8105((m) C0013.m3164(this, m.class))) {
            return (com.github.catvod.spider.merge.Y0.b) C0025.m4787((y) C0013.m3164(this, y.class), cVar);
        }
        com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0025.m4787((y) C0013.m3164(this, y.class), cVar);
        com.github.catvod.spider.merge.Y0.b bVar2 = (com.github.catvod.spider.merge.Y0.b) C0030.m5444((m) C0013.m3164(this, m.class), cVar);
        switch (C0022.m4461(C0040.m6604(this))) {
            case 17:
                return new com.github.catvod.spider.merge.Y0.b(C0013.m3079(C0032.m5676(C0038.m6470(bVar2)) * C0032.m5676(C0038.m6470(bVar))));
            case 18:
                return new com.github.catvod.spider.merge.Y0.b(C0013.m3079(C0032.m5676(C0038.m6470(bVar)) / C0032.m5676(C0038.m6470(bVar2))));
            case 19:
                return new com.github.catvod.spider.merge.Y0.b(C0013.m3079(C0032.m5676(C0038.m6470(bVar)) % C0032.m5676(C0038.m6470(bVar2))));
            default:
                StringBuilder sb = new StringBuilder(C0006.m1774(m6061(), 0, 14, 1386));
                C0018.m3933(sb, C0014.m3331(this));
                throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
        }
    }
}