package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f634short = {1285, 1362, 1374, 1355, 1372, 1367, 1387, 1370, 1351, 1355, 2227, 2299, 2278, 2278, 2301, 665, 716, 717, 719, 730, 654, 716, 709, 654, 727, 730, 723, 710, 1051, 1102, 1103, 1101, 1112, 1036, 1090, 1097, 1096, 1101, 1093, 1868, 1818, 1815, 1797, 1794, 1883, 1813, 1822, 1823, 1818, 1810, 2548, 2472, 2471, 2492, 2493, 2490, 2531, 2477, 2470, 2471, 2466, 2474, 645, 730, 722, 719, 715, 710, 1351};
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    /* renamed from: ۣ۟ۡۦ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5899() {
        if (C0049.m8038() < 0) {
            return f634short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        List listM5209;
        d dVar;
        com.github.catvod.spider.merge.T0.m mVar3 = mVar;
        switch (C0026.m4957(this)) {
            case 0:
                break;
            case 1:
                if (C0058.m9095(mVar2) == 0) {
                    listM5209 = C0020.m4227();
                } else {
                    List listM1286 = C0002.m1286(mVar2);
                    ArrayList arrayList = new ArrayList(C0064.m9636(listM1286));
                    C0034.m6012(arrayList, listM1286);
                    listM5209 = C0029.m5209(arrayList);
                }
                Iterator itM3109 = C0013.m3109(listM5209);
                while (C0012.m2962(itM3109)) {
                    com.github.catvod.spider.merge.T0.r rVar = (com.github.catvod.spider.merge.T0.r) C0048.m7949(itM3109);
                    if (!(rVar instanceof com.github.catvod.spider.merge.T0.e) && !(rVar instanceof com.github.catvod.spider.merge.T0.i)) {
                        break;
                    }
                }
                break;
            case 2:
                com.github.catvod.spider.merge.T0.m mVar4 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar2);
                if (mVar4 == null || (mVar4 instanceof com.github.catvod.spider.merge.T0.h) || C0047.m7810(mVar2) != 0) {
                }
                break;
            case 3:
                com.github.catvod.spider.merge.T0.m mVar5 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar2);
                if (mVar5 == null || (mVar5 instanceof com.github.catvod.spider.merge.T0.h) || C0047.m7810(mVar2) != C0009.m2095(C0065.m9765(mVar5)) - 1) {
                }
                break;
            case 4:
                com.github.catvod.spider.merge.T0.r rVarM7395 = C0044.m7395(mVar2);
                com.github.catvod.spider.merge.T0.m mVar6 = (com.github.catvod.spider.merge.T0.m) rVarM7395;
                if (mVar6 != null && !(mVar6 instanceof com.github.catvod.spider.merge.T0.h)) {
                    if (rVarM7395 == null) {
                        dVar = new d(0);
                    } else {
                        List listM5031 = C0027.m5031((com.github.catvod.spider.merge.T0.m) rVarM7395);
                        d dVar2 = new d(C0064.m9636(listM5031) - 1);
                        Iterator itM31092 = C0013.m3109(listM5031);
                        while (C0012.m2962(itM31092)) {
                            com.github.catvod.spider.merge.T0.m mVar7 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM31092);
                            if (mVar7 != mVar2) {
                                C0018.m3918(dVar2, mVar7);
                            }
                        }
                        dVar = dVar2;
                    }
                    if (C0019.m4116(dVar)) {
                    }
                }
                break;
            case 5:
                com.github.catvod.spider.merge.T0.m mVar8 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar2);
                if (mVar8 != null && !(mVar8 instanceof com.github.catvod.spider.merge.T0.h)) {
                    Iterator itM7807 = C0047.m7807(C0065.m9765(mVar8));
                    int i = 0;
                    while (C0012.m2962(itM7807)) {
                        if (C0042.m7129(C0039.m6507((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)), C0039.m6507(mVar2))) {
                            i++;
                        }
                    }
                    if (i == 1) {
                    }
                }
                break;
            case 6:
                if (mVar3 instanceof com.github.catvod.spider.merge.T0.h) {
                    mVar3 = (com.github.catvod.spider.merge.T0.m) C0048.m7915(C0027.m5031(mVar3), 0);
                }
                if (mVar2 == mVar3) {
                }
                break;
            case 7:
                if (!(mVar2 instanceof com.github.catvod.spider.merge.T0.s)) {
                    C0047.m7777(mVar2);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator itM31093 = C0013.m3109(C0058.m9057(mVar2));
                    while (C0012.m2962(itM31093)) {
                        com.github.catvod.spider.merge.T0.r rVar2 = (com.github.catvod.spider.merge.T0.r) C0048.m7949(itM31093);
                        if (rVar2 instanceof com.github.catvod.spider.merge.T0.t) {
                            C0004.m1532(arrayList2, (com.github.catvod.spider.merge.T0.t) rVar2);
                        }
                    }
                    Iterator itM31094 = C0013.m3109(C0029.m5209(arrayList2));
                    while (true) {
                        if (!C0012.m2962(itM31094)) {
                            break;
                        } else {
                            com.github.catvod.spider.merge.T0.t tVar = (com.github.catvod.spider.merge.T0.t) C0048.m7949(itM31094);
                            com.github.catvod.spider.merge.T0.s sVar = new com.github.catvod.spider.merge.T0.s(C0058.m9111(C0021.m4326(C0039.m6507(mVar2)), C0039.m6544()), C0052.m8347(mVar2), C0039.m6535(mVar2));
                            C0047.m7777(tVar);
                            C0065.m9779(C0044.m7395(tVar));
                            com.github.catvod.spider.merge.T0.r rVarM73952 = C0044.m7395(tVar);
                            C0047.m7777(rVarM73952);
                            C0042.m7163(C0044.m7395(tVar) == rVarM73952);
                            com.github.catvod.spider.merge.T0.r rVarM73953 = C0044.m7395(sVar);
                            if (rVarM73953 != null) {
                                C0024.m4715(rVarM73953, sVar);
                            }
                            int iM6143 = C0035.m6143(tVar);
                            C0036.m6193(C0059.m9225(rVarM73952), iM6143, sVar);
                            sVar.a = rVarM73952;
                            sVar.b = iM6143;
                            tVar.a = null;
                            C0035.m6086(sVar, tVar);
                        }
                    }
                }
                break;
            default:
                if (mVar3 == mVar2) {
                }
                break;
        }
        return true;
    }

    public String toString() {
        switch (C0026.m4957(this)) {
            case 0:
                return C0008.m1970(m5899(), 68, 1, 1389);
            case 1:
                return C0012.m2973(m5899(), 62, 6, 703);
            case 2:
                return C0002.m1305(m5899(), 50, 12, 2510);
            case 3:
                return C0004.m1549(m5899(), 39, 11, 1910);
            case 4:
                return C0001.m1189(m5899(), 28, 11, 1057);
            case 5:
                return C0025.m4795(m5899(), 15, 13, 675);
            case 6:
                return C0018.m3917(m5899(), 10, 5, 2185);
            case 7:
                return C0028.m5109(m5899(), 0, 10, 1343);
            default:
                return super.toString();
        }
    }
}