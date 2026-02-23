package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l extends n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f641short = {2607, 2613, 2601, 2668, 2606, 2599, 2668, 2613, 2616, 2609, 2596, 3185, 3179, 3191, 3122, 3187, 3198, 3180, 3179, 3122, 3184, 3193, 3122, 3179, 3174, 3183, 3194, 1116, 1094, 1114, 1055, 1118, 1107, 1089, 1094, 1055, 1105, 1114, 1115, 1118, 1110, 1656, 1634, 1662, 1595, 1653, 1662, 1663, 1658, 1650, 958, 929, 1015, 940, 929, 992, 941, 637, 610, 564, 623, 610, 547, 553, 622, 1087, 1056, 1142, 1069, 1056, 1121, 1131, 1056, 1070, 1121, 1068};
    public final int a;
    public final int b;
    public final /* synthetic */ int c;

    public l(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    /* renamed from: ۦۦۧۨ, reason: contains not printable characters */
    public static short[] m5906() {
        if (C0013.m3167() > 0) {
            return f641short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        com.github.catvod.spider.merge.T0.m mVar3 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar2);
        if (mVar3 == null || (mVar3 instanceof com.github.catvod.spider.merge.T0.h)) {
            return false;
        }
        int iM2014 = C0008.m2014(this, mVar2);
        int iM6397 = C0038.m6397(this);
        int iM8233 = C0051.m8233(this);
        if (iM8233 == 0) {
            return iM2014 == iM6397;
        }
        int i = iM2014 - iM6397;
        return i * iM8233 >= 0 && i % iM8233 == 0;
    }

    public final int b(com.github.catvod.spider.merge.T0.m mVar) {
        switch (C0063.m9531(this)) {
            case 0:
                return C0047.m7810(mVar) + 1;
            case 1:
                com.github.catvod.spider.merge.T0.m mVar2 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar);
                if (mVar2 == null) {
                    return 0;
                }
                return C0009.m2095(C0065.m9765(mVar2)) - C0047.m7810(mVar);
            case 2:
                com.github.catvod.spider.merge.T0.m mVar3 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar);
                int i = 0;
                if (mVar3 != null) {
                    d dVarM9765 = C0065.m9765(mVar3);
                    for (int iM7810 = C0047.m7810(mVar); iM7810 < C0009.m2095(dVarM9765); iM7810++) {
                        if (C0042.m7129(C0039.m6507((com.github.catvod.spider.merge.T0.m) C0028.m5161(dVarM9765, iM7810)), C0039.m6507(mVar))) {
                            i++;
                        }
                    }
                }
                return i;
            default:
                com.github.catvod.spider.merge.T0.m mVar4 = (com.github.catvod.spider.merge.T0.m) C0044.m7395(mVar);
                int i2 = 0;
                if (mVar4 != null) {
                    Iterator itM7807 = C0047.m7807(C0065.m9765(mVar4));
                    while (C0012.m2962(itM7807)) {
                        com.github.catvod.spider.merge.T0.m mVar5 = (com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807);
                        if (C0042.m7129(C0039.m6507(mVar5), C0039.m6507(mVar))) {
                            i2++;
                        }
                        if (mVar5 == mVar) {
                        }
                    }
                }
                return i2;
        }
    }

    public final String c() {
        switch (C0063.m9531(this)) {
            case 0:
                return C0029.m5256(m5906(), 41, 9, 1558);
            case 1:
                return C0001.m1189(m5906(), 27, 14, 1074);
            case 2:
                return C0028.m5109(m5906(), 11, 16, 3103);
            default:
                return C0034.m6001(m5906(), 0, 11, 2625);
        }
    }

    public String toString() {
        int iM6397 = C0038.m6397(this);
        int iM8233 = C0051.m8233(this);
        return iM8233 == 0 ? C0002.m1327(C0040.m6584(m5906(), 50, 7, 900), new Object[]{C0031.m5648(this), C0011.m2808(iM6397)}) : iM6397 == 0 ? C0002.m1327(C0038.m6452(m5906(), 57, 8, 583), new Object[]{C0031.m5648(this), C0011.m2808(iM8233)}) : C0002.m1327(C0051.m8259(m5906(), 65, 11, 1029), new Object[]{C0031.m5648(this), C0011.m2808(iM8233), C0011.m2808(iM6397)});
    }
}