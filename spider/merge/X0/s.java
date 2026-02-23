package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public final class s extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f678short = {2261, 2247, 2240, 2251, 2266, 2247, 2251, 2397, 2388, 2375, 2379, 2393, 2389, 2397, 2375, 2380, 2393, 2399, 2375, 2393, 2388, 2388, 2375, 2390, 2381, 2389, 307, 314, 297, 293, 311, 315, 307, 297, 290, 311, 305, 297, 319, 312, 306, 307, 302, 1134, 1141, 1136, 1141, 1140, 1132, 1141, 1083, 1150, 1123, 1131, 1129, 1083, 1133, 1146, 1143, 1057};

    public s(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۦۤۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6065() {
        if (C0012.m3024() >= 0) {
            return f678short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        int iM6456;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        com.github.catvod.spider.merge.V0.d dVar = new com.github.catvod.spider.merge.V0.d();
        Iterator itM7807 = C0047.m7807(C0000.m1092(C0055.m8764(cVar)));
        while (C0012.m2962(itM7807)) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
            Stack stackM1317 = C0002.m1317(cVar);
            com.github.catvod.spider.merge.Y0.a aVar = new com.github.catvod.spider.merge.Y0.a(mVar);
            aVar.c = C0055.m8764(cVar);
            C0005.m1657(stackM1317, aVar);
            com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0031.m5596((h) C0013.m3164(this, h.class), cVar);
            C0047.m7745(stackM1317);
            Object objM6834 = C0041.m6834(bVar);
            if (objM6834 instanceof Number) {
                long jM5649 = C0031.m5649(C0032.m5764(bVar));
                String strM6131 = C0035.m6131(m6065(), 0, 7, 2207);
                if (jM5649 < 0) {
                    String strM4326 = C0021.m4326(C0039.m6507(mVar));
                    if (strM4326 == strM6131 || (strM4326 != null && C0058.m9103(strM4326, strM6131))) {
                        String strM2339 = C0010.m2339(mVar, C0002.m1305(m6065(), 7, 19, 2328));
                        iM6456 = C0003.m1430(strM2339) ? -1 : C0038.m6456(strM2339);
                    } else {
                        com.github.catvod.spider.merge.Y0.a aVarM8764 = C0055.m8764(cVar);
                        com.github.catvod.spider.merge.V0.d dVar2 = new com.github.catvod.spider.merge.V0.d();
                        com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar);
                        String strM43262 = C0021.m4326(C0039.m6507(mVar));
                        C0047.m7777(mVar2);
                        C0008.m2009(strM43262);
                        com.github.catvod.spider.merge.V0.f fVar = new com.github.catvod.spider.merge.V0.f(C0036.m6248(strM43262), 9, false);
                        com.github.catvod.spider.merge.V0.d dVar3 = new com.github.catvod.spider.merge.V0.d();
                        C0006.m1738(new com.github.catvod.spider.merge.U.p(mVar2, dVar3, fVar), mVar2);
                        Iterator itM78072 = C0047.m7807(dVar3);
                        while (C0012.m2962(itM78072)) {
                            com.github.catvod.spider.merge.T0.m mVar3 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78072);
                            if (C0036.m6244(C0000.m1092(aVarM8764), mVar3)) {
                                C0018.m3918(dVar2, mVar3);
                            }
                        }
                        iM6456 = C0009.m2095(dVar2);
                    }
                    long j = iM6456 + jM5649;
                    jM5649 = 1;
                    long j2 = j + 1;
                    if (j2 >= 0) {
                        jM5649 = j2;
                    }
                }
                String strM43263 = C0021.m4326(C0039.m6507(mVar));
                if (strM43263 == strM6131 || (strM43263 != null && C0058.m9103(strM43263, strM6131))) {
                    if (jM5649 == (C0003.m1430(C0010.m2339(mVar, C0043.m7290(m6065(), 26, 17, 374))) ? -1 : C0038.m6456(r7))) {
                        C0018.m3918(dVar, mVar);
                    }
                } else {
                    com.github.catvod.spider.merge.Y0.a aVarM87642 = C0055.m8764(cVar);
                    Iterator itM78073 = C0047.m7807(C0065.m9765((com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar)));
                    int i = 1;
                    while (C0012.m2962(itM78073)) {
                        com.github.catvod.spider.merge.T0.m mVar4 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM78073);
                        if (C0007.m1815(C0021.m4326(C0039.m6507(mVar)), C0021.m4326(C0039.m6507(mVar4))) && C0036.m6244(C0000.m1092(aVarM87642), mVar4)) {
                            if (C0042.m7157(mVar, mVar4)) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (jM5649 == i) {
                        C0018.m3918(dVar, mVar);
                    }
                }
            } else if (objM6834 instanceof Boolean) {
                if (C0010.m2318(C0000.m1120(bVar))) {
                    C0018.m3918(dVar, mVar);
                }
            } else if (objM6834 instanceof String) {
                if (!C0003.m1430(C0047.m7744(bVar))) {
                    C0018.m3918(dVar, mVar);
                }
            } else if (objM6834 instanceof com.github.catvod.spider.merge.V0.d) {
                if (C0009.m2095((com.github.catvod.spider.merge.V0.d) objM6834) > 0) {
                    C0018.m3918(dVar, mVar);
                }
            } else {
                if (!(objM6834 instanceof List)) {
                    StringBuilder sb = new StringBuilder(C0001.m1189(m6065(), 43, 17, 1051));
                    C0016.m3605(sb, bVar);
                    throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
                }
                if (C0064.m9636((List) objM6834) > 0) {
                    C0018.m3918(dVar, mVar);
                }
            }
        }
        return new com.github.catvod.spider.merge.Y0.b(dVar);
    }
}