package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.X0.C0230a;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.File;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.F0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163u {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f440short = {926, 917, 898, 917, 986, 925, 923, 986, 896, 921, 900, 912, 925, 902, 895, 883, 873, 880, 888, 828, 882, 883, 872, 828, 888, 889, 880, 889, 872, 889, 828, 890, 885, 880, 889, 828, 581, 633, 624, 628, 614, 624, 565, 630, 637, 624, 630, 638, 565, 609, 637, 624, 565, 614, 620, 635, 609, 628, 621, 565, 634, 627, 565, 620, 634, 608, 615, 565, 621, 613, 628, 609, 637, 565, 624, 621, 613, 615, 565, 634, 615, 565, 630, 634, 632, 632, 636, 609, 565, 628, 565};
    public Object a;

    public C0163u(int i) {
        switch (i) {
            case 5:
                break;
            case 6:
                File file = new File(C0056.m8891(C0030.m5362(m3878(), 0, 14, 1012)));
                if (!C0028.m5187(file)) {
                    C0045.m7616(file);
                }
                this.a = new ArrayList();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public C0163u(C0176b c0176b) {
        this.a = new com.github.catvod.spider.merge.U0.C();
    }

    public /* synthetic */ C0163u(Object obj) {
        this.a = obj;
    }

    public static void g(String str) {
        C0016.m3575(new com.github.catvod.spider.merge.F.b(12, str));
    }

    /* renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m3878() {
        if (C0028.m5152() < 0) {
            return f440short;
        }
        return null;
    }

    public void a(AbstractC0152i abstractC0152i, Q q, com.github.catvod.spider.merge.H0.f fVar, HashSet hashSet, BitSet bitSet) {
        com.github.catvod.spider.merge.H0.f fVar2;
        X x;
        AbstractC0152i abstractC0152i2 = abstractC0152i;
        Q q2 = q;
        if (C0051.m8266(hashSet, new C0145b(abstractC0152i2, 0, q2))) {
            if (abstractC0152i2 == null) {
                if (q2 == null) {
                    C0065.m9745(fVar, -2);
                    return;
                } else if (C0065.m9709(q)) {
                    C0065.m9745(fVar, -1);
                    return;
                }
            }
            boolean z = abstractC0152i2 instanceof W;
            C0144a c0144a = (C0144a) C0025.m4771(this);
            if (z) {
                if (q2 == null) {
                    C0065.m9745(fVar, -2);
                    return;
                }
                if (C0065.m9709(q)) {
                    C0065.m9745(fVar, -1);
                    return;
                }
                if (q2 != C0041.m6743()) {
                    boolean zM5270 = C0029.m5270(bitSet, C0021.m4362(abstractC0152i2));
                    try {
                        C0024.m4744(bitSet, C0021.m4362(abstractC0152i2));
                        for (int i = 0; i < C0049.m8016(q); i++) {
                            C0038.m6421(this, (AbstractC0152i) C0028.m5167(C0039.m6516(c0144a), C0045.m7537(q2, i)), C0016.m3564(q2, i), fVar, hashSet, bitSet);
                        }
                        if (zM5270) {
                            return;
                        } else {
                            return;
                        }
                    } finally {
                        if (zM5270) {
                            C0049.m8060(bitSet, C0021.m4362(abstractC0152i2));
                        }
                    }
                }
            }
            int iM2139 = C0009.m2139(C0037.m6349(abstractC0152i2));
            int i2 = 0;
            while (i2 < iM2139) {
                l0 l0VarM4126 = C0019.m4126(abstractC0152i2, i2);
                if (C0047.m7777(l0VarM4126) == X.class) {
                    X x2 = (X) l0VarM4126;
                    if (C0029.m5270(bitSet, C0021.m4362(C0053.m8417(x2)))) {
                        continue;
                    } else {
                        f0 f0VarM6334 = C0037.m6334(q2, C0055.m8704(C0036.m6203(x2)));
                        try {
                            C0049.m8060(bitSet, C0021.m4362(C0053.m8417((X) l0VarM4126)));
                            x = x2;
                        } catch (Throwable th) {
                            th = th;
                            x = x2;
                        }
                        try {
                            C0038.m6421(this, C0053.m8417(l0VarM4126), f0VarM6334, fVar, hashSet, bitSet);
                            C0024.m4744(bitSet, C0021.m4362(C0053.m8417(x)));
                        } catch (Throwable th2) {
                            th = th2;
                            C0024.m4744(bitSet, C0021.m4362(C0053.m8417(x)));
                            throw th;
                        }
                    }
                } else if ((l0VarM4126 instanceof AbstractC0153j) || C0041.m6764(l0VarM4126)) {
                    C0038.m6421(this, C0053.m8417(l0VarM4126), q, fVar, hashSet, bitSet);
                } else if (C0047.m7777(l0VarM4126) == m0.class) {
                    int iM3934 = C0018.m3934(c0144a);
                    com.github.catvod.spider.merge.H0.f fVar3 = new com.github.catvod.spider.merge.H0.f(new int[0]);
                    C0018.m3984(fVar3, 1, iM3934);
                    C0032.m5775(fVar, fVar3);
                } else {
                    com.github.catvod.spider.merge.H0.f fVarM8328 = C0052.m8328(l0VarM4126);
                    if (fVarM8328 != null) {
                        if (l0VarM4126 instanceof J) {
                            int iM39342 = C0018.m3934(c0144a);
                            com.github.catvod.spider.merge.H0.f fVar4 = new com.github.catvod.spider.merge.H0.f(new int[0]);
                            C0018.m3984(fVar4, 1, iM39342);
                            if (C0003.m1406(fVar4)) {
                                fVarM8328 = null;
                            } else {
                                if (C0003.m1406(fVarM8328)) {
                                    fVar2 = new com.github.catvod.spider.merge.H0.f(fVar4);
                                } else if (C0003.m1406(fVar4)) {
                                    fVar2 = new com.github.catvod.spider.merge.H0.f(new int[0]);
                                } else {
                                    fVar2 = new com.github.catvod.spider.merge.H0.f(fVar4);
                                    if (!C0003.m1406(fVarM8328)) {
                                        int i3 = 0;
                                        int i4 = 0;
                                        while (i3 < C0009.m2139(C0022.m4436(fVar2))) {
                                            ArrayList arrayListM4436 = C0022.m4436(fVarM8328);
                                            if (i4 >= C0009.m2139(arrayListM4436)) {
                                                break;
                                            }
                                            com.github.catvod.spider.merge.H0.e eVar = (com.github.catvod.spider.merge.H0.e) C0028.m5167(C0022.m4436(fVar2), i3);
                                            com.github.catvod.spider.merge.H0.e eVar2 = (com.github.catvod.spider.merge.H0.e) C0028.m5167(arrayListM4436, i4);
                                            int iM5364 = C0030.m5364(eVar2);
                                            int iM5636 = C0031.m5636(eVar);
                                            if (iM5364 < iM5636) {
                                                i4++;
                                            } else {
                                                int iM56362 = C0031.m5636(eVar2);
                                                int iM53642 = C0030.m5364(eVar);
                                                if (iM56362 > iM53642) {
                                                    i3++;
                                                } else {
                                                    com.github.catvod.spider.merge.H0.e eVar3 = iM56362 > iM5636 ? new com.github.catvod.spider.merge.H0.e(iM5636, iM56362 - 1) : null;
                                                    com.github.catvod.spider.merge.H0.e eVar4 = iM5364 < iM53642 ? new com.github.catvod.spider.merge.H0.e(iM5364 + 1, iM53642) : null;
                                                    if (eVar3 != null) {
                                                        if (eVar4 != null) {
                                                            C0055.m8716(C0022.m4436(fVar2), i3, eVar3);
                                                            i3++;
                                                            C0063.m9500(C0022.m4436(fVar2), i3, eVar4);
                                                            i4++;
                                                        } else {
                                                            C0055.m8716(C0022.m4436(fVar2), i3, eVar3);
                                                            i3++;
                                                        }
                                                    } else if (eVar4 != null) {
                                                        C0055.m8716(C0022.m4436(fVar2), i3, eVar4);
                                                        i4++;
                                                    } else {
                                                        C0045.m7536(C0022.m4436(fVar2), i3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                fVarM8328 = fVar2;
                            }
                        }
                        C0032.m5775(fVar, fVarM8328);
                    }
                }
                i2++;
                abstractC0152i2 = abstractC0152i;
                q2 = q;
            }
        }
    }

    public void b() {
        ArrayList arrayList = (ArrayList) C0025.m4771(this);
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            C0022.m4478(C0048.m7949(itM7816));
            try {
                throw null;
            } catch (Exception e) {
                C0006.m1730(C0013.m3148(), C0013.m3150(), C0038.m6452(m3878(), 14, 22, 796), e);
            }
        }
        C0017.m3687(arrayList);
    }

    public char c(int i) {
        char[] cArrM5137 = C0028.m5137();
        Character chM1775 = C0006.m1775(C0007.m1823((String) C0025.m4771(this), i));
        HashMap mapM2012 = C0008.m2012();
        Object map = (Map) C0065.m9715(mapM2012, cArrM5137);
        if (map == null) {
            map = new HashMap();
            C0053.m8424(mapM2012, cArrM5137, map);
            for (int i2 = 0; i2 < cArrM5137.length; i2++) {
                C0053.m8424(map, C0006.m1775(cArrM5137[i2]), C0011.m2808(i2));
            }
        }
        return (char) C0024.m4690((Integer) C0062.m9431(map, chM1775));
    }

    public Object d(Object obj, Object obj2) {
        Map map = (Map) C0038.m6401((LinkedHashMap) C0025.m4771(this), obj);
        if (map == null) {
            return null;
        }
        return C0062.m9431(map, obj2);
    }

    public void e(Object obj, Object obj2, Q q) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) C0025.m4771(this);
        Object linkedHashMap2 = (Map) C0038.m6401(linkedHashMap, obj);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            C0006.m1755(linkedHashMap, obj, linkedHashMap2);
        } else {
            C0062.m9431(linkedHashMap2, obj2);
        }
        C0006.m1755(linkedHashMap2, obj2, q);
    }

    public LinkedList f(String str) {
        LinkedList linkedList = new LinkedList();
        try {
            com.github.catvod.spider.merge.X0.A a = new com.github.catvod.spider.merge.X0.A(new com.github.catvod.spider.merge.E0.f(new C0230a(C0063.m9536(str))));
            a.d = new com.github.catvod.spider.merge.c1.a();
            com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0032.m5754(C0030.m5405(a), new com.github.catvod.spider.merge.Y0.c((com.github.catvod.spider.merge.V0.d) C0025.m4771(this)));
            if (bVar == null) {
                C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a(C0007.m1840()));
                return linkedList;
            }
            Object objM6834 = C0041.m6834(bVar);
            if (objM6834 instanceof com.github.catvod.spider.merge.V0.d) {
                Iterator itM7807 = C0047.m7807((com.github.catvod.spider.merge.V0.d) objM6834);
                while (C0012.m2962(itM7807)) {
                    C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)));
                }
                return linkedList;
            }
            if (objM6834 instanceof List) {
                Iterator itM3109 = C0013.m3109((List) objM6834);
                while (C0012.m2962(itM3109)) {
                    C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a((String) C0048.m7949(itM3109)));
                }
                return linkedList;
            }
            if (objM6834 instanceof String) {
                C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a(C0047.m7744(bVar)));
                return linkedList;
            }
            if (objM6834 instanceof Number) {
                Class<Object> clsM7777 = objM6834 == null ? Object.class : C0047.m7777(objM6834);
                C0031.m5644(linkedList, (C0051.m8197(clsM7777, Long.class) || C0051.m8197(clsM7777, Integer.class)) ? new com.github.catvod.spider.merge.W0.a(C0032.m5764(bVar)) : new com.github.catvod.spider.merge.W0.a(C0038.m6470(bVar)));
                return linkedList;
            }
            if (objM6834 instanceof Boolean) {
                C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a(C0000.m1120(bVar)));
                return linkedList;
            }
            if (objM6834 instanceof Date) {
                C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a(C0025.m4870(bVar)));
                return linkedList;
            }
            C0031.m5644(linkedList, new com.github.catvod.spider.merge.W0.a(C0047.m7744(bVar)));
            return linkedList;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0001.m1189(m3878(), 36, 55, 533));
            C0018.m3933(sb, C0005.m1621(e));
            throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb), e);
        }
    }
}