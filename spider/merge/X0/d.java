package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f670short = {522, 1185, 1306, 1296, 1287, 1309, 1288, 1297, 1353, 1292, 1307, 1307, 1286, 1307, 1349, 1353};
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.github.catvod.spider.merge.E0.p pVar, int i, int i2) {
        super(i, pVar);
        this.e = i2;
    }

    /* renamed from: ۟ۥۦۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6057() {
        if (C0049.m8038() <= 0) {
            return f670short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        switch (C0033.m5803(this)) {
            case 0:
                if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
                    return C0016.m3595(cVar, this);
                }
                C0047.m7777(cVar);
                List listM7111 = C0042.m7111(this, m.class);
                int iM9636 = C0064.m9636(listM7111);
                com.github.catvod.spider.merge.I0.b bVar = (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0);
                if (iM9636 == 1) {
                    return (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, bVar);
                }
                Double dM6470 = C0038.m6470((com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, bVar));
                String strM5428 = null;
                for (int i = 1; i < C0039.m6500(this); i++) {
                    com.github.catvod.spider.merge.I0.b bVarM5972 = C0034.m5972(this, i);
                    if (bVarM5972 instanceof m) {
                        com.github.catvod.spider.merge.Y0.b bVar2 = (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, bVarM5972);
                        if (C0007.m1815(C0007.m1842(m6057(), 0, 1, 545), strM5428)) {
                            dM6470 = C0013.m3079(C0032.m5676(C0038.m6470(bVar2)) + C0032.m5676(dM6470));
                        } else {
                            if (!C0007.m1815(C0026.m4951(m6057(), 1, 1, 1164), strM5428)) {
                                StringBuilder sb = new StringBuilder(C0015.m3484(m6057(), 2, 14, 1385));
                                C0018.m3933(sb, C0014.m3331(this));
                                throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
                            }
                            dM6470 = C0013.m3079(C0032.m5676(dM6470) - C0032.m5676(C0038.m6470(bVar2)));
                        }
                    } else {
                        strM5428 = C0030.m5428(bVarM5972);
                    }
                }
                return new com.github.catvod.spider.merge.Y0.b(dM6470);
            default:
                if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
                    return C0016.m3595(cVar, this);
                }
                C0047.m7777(cVar);
                return (com.github.catvod.spider.merge.Y0.b) C0031.m5596((h) C0013.m3164(this, h.class), cVar);
        }
    }
}