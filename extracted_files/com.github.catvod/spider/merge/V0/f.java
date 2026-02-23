package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f extends n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f635short = {2636, 2625, 1503, 1488, 1501, 1487, 1487, 2614, 2989, 3060, 3064, 3065, 3043, 3062, 3070, 3065, 3044, 3008, 3071, 3064, 3067, 3058, 3011, 3058, 3055, 3043, 3007, 518, 3168, 3129, 3125, 3124, 3118, 3131, 3123, 3124, 3113, 3085, 3122, 3125, 3126, 3135, 3093, 3117, 3124, 3086, 3135, 3106, 3118, 3186, 2044, 1994, 1939, 1951, 1950, 1924, 1937, 1945, 1950, 1923, 2008, 718, 2804, 2733, 2721, 2720, 2746, 2735, 2727, 2720, 2749, 2689, 2745, 2720, 2790, 1178, 2102, 2159, 2147, 2146, 2168, 2157, 2149, 2146, 2175, 2120, 2157, 2168, 2157, 2084, 2970, 2488, 1445, 1440, 1160, 2568, 1492};
    public final /* synthetic */ int a;
    public final String b;

    public f(String str, int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = C0063.m9572(str);
                break;
            case 4:
                StringBuilder sbM8572 = C0054.m8572();
                C0020.m4248(sbM8572, str, false);
                this.b = C0063.m9572(C0004.m1543(sbM8572));
                break;
            case 5:
                StringBuilder sbM85722 = C0054.m8572();
                C0020.m4248(sbM85722, str, false);
                this.b = C0063.m9572(C0004.m1543(sbM85722));
                break;
            default:
                C0008.m2009(str);
                this.b = C0063.m9572(str);
                break;
        }
    }

    public /* synthetic */ f(String str, int i, boolean z) {
        this.a = i;
        this.b = str;
    }

    /* renamed from: ۟ۥۣۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5900() {
        if (C0011.m2755() >= 0) {
            return f635short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        switch (C0042.m7182(this)) {
            case 0:
                return C0019.m4098(mVar2, C0024.m4722(this));
            case 1:
                com.github.catvod.spider.merge.T0.c cVarM6535 = C0039.m6535(mVar2);
                C0047.m7777(cVarM6535);
                ArrayList arrayList = new ArrayList(C0029.m5233(cVarM6535));
                for (int i = 0; i < C0029.m5233(cVarM6535); i++) {
                    if (!C0025.m4774(C0022.m4450(cVarM6535)[i])) {
                        C0004.m1532(arrayList, new com.github.catvod.spider.merge.T0.a(C0022.m4450(cVarM6535)[i], (String) C0052.m8318(cVarM6535)[i], cVarM6535));
                    }
                }
                Iterator itM3109 = C0013.m3109(C0029.m5209(arrayList));
                while (C0012.m2962(itM3109)) {
                    if (C0043.m7277(C0063.m9572(C0062.m9420((com.github.catvod.spider.merge.T0.a) C0048.m7949(itM3109))), C0024.m4722(this))) {
                        return true;
                    }
                }
                return false;
            case 2:
                com.github.catvod.spider.merge.T0.c cVarM3929 = C0018.m3929(mVar2);
                if (cVarM3929 == null) {
                    return false;
                }
                String strM8334 = C0052.m8334(cVarM3929, C0025.m4795(m5900(), 2, 5, 1468));
                int iM1584 = C0004.m1584(strM8334);
                String strM4722 = C0024.m4722(this);
                int iM15842 = C0004.m1584(strM4722);
                if (iM1584 == 0 || iM1584 < iM15842) {
                    return false;
                }
                if (iM1584 == iM15842) {
                    return C0000.m1057(strM4722, strM8334);
                }
                boolean z = false;
                int i2 = 0;
                for (int i3 = 0; i3 < iM1584; i3++) {
                    if (C0005.m1617(C0007.m1823(strM8334, i3))) {
                        if (!z) {
                            continue;
                        } else {
                            if (i3 - i2 == iM15842 && C0062.m9433(strM8334, true, i2, strM4722, 0, iM15842)) {
                                return true;
                            }
                            z = false;
                        }
                    } else if (!z) {
                        i2 = i3;
                        z = true;
                    }
                }
                if (z && iM1584 - i2 == iM15842) {
                    return C0062.m9433(strM8334, true, i2, strM4722, 0, iM15842);
                }
                return false;
            case 3:
                return C0058.m9127(C0063.m9572(C0062.m9381(mVar2)), C0024.m4722(this));
            case 4:
                return C0058.m9127(C0063.m9572(C0055.m8697(mVar2)), C0024.m4722(this));
            case 5:
                return C0058.m9127(C0063.m9572(C0064.m9669(mVar2)), C0024.m4722(this));
            case 6:
                return C0058.m9127(C0055.m8778(mVar2), C0024.m4722(this));
            case 7:
                C0047.m7777(mVar2);
                StringBuilder sbM8572 = C0054.m8572();
                C0006.m1738(new com.github.catvod.spider.merge.T0.j(sbM8572), mVar2);
                return C0058.m9127(C0004.m1543(sbM8572), C0024.m4722(this));
            case 8:
                com.github.catvod.spider.merge.T0.c cVarM39292 = C0018.m3929(mVar2);
                return C0007.m1815(C0024.m4722(this), cVarM39292 != null ? C0052.m8334(cVarM39292, C0022.m4403(m5900(), 0, 2, 2597)) : C0007.m1840());
            case 9:
                return C0007.m1815(C0025.m4804(C0039.m6507(mVar2)), C0024.m4722(this));
            default:
                return C0060.m9349(C0025.m4804(C0039.m6507(mVar2)), C0024.m4722(this));
        }
    }

    public final String toString() {
        switch (C0042.m7182(this)) {
            case 0:
                return C0028.m5188(new StringBuilder(C0055.m8814(m5900(), 95, 1, 2643)), C0024.m4722(this), C0008.m1970(m5900(), 96, 1, 1417));
            case 1:
                return C0028.m5188(new StringBuilder(C0064.m9599(m5900(), 92, 2, 1534)), C0024.m4722(this), C0001.m1189(m5900(), 94, 1, 1237));
            case 2:
                StringBuilder sb = new StringBuilder(C0009.m2037(m5900(), 91, 1, 2454));
                C0018.m3933(sb, C0024.m4722(this));
                return C0047.m7763(sb);
            case 3:
                return C0028.m5188(new StringBuilder(C0048.m7902(m5900(), 76, 14, 2060)), C0024.m4722(this), C0034.m6001(m5900(), 90, 1, 2995));
            case 4:
                return C0028.m5188(new StringBuilder(C0041.m6779(m5900(), 62, 13, 2766)), C0024.m4722(this), C0033.m5852(m5900(), 75, 1, 1203));
            case 5:
                return C0028.m5188(new StringBuilder(C0033.m5852(m5900(), 51, 10, 2032)), C0024.m4722(this), C0000.m1077(m5900(), 61, 1, 743));
            case 6:
                return C0028.m5188(new StringBuilder(C0032.m5708(m5900(), 28, 22, 3162)), C0024.m4722(this), C0048.m7902(m5900(), 50, 1, 2005));
            case 7:
                return C0028.m5188(new StringBuilder(C0058.m9106(m5900(), 8, 19, 2967)), C0024.m4722(this), C0005.m1645(m5900(), 27, 1, 559));
            case 8:
                StringBuilder sb2 = new StringBuilder(C0022.m4403(m5900(), 7, 1, 2581));
                C0018.m3933(sb2, C0024.m4722(this));
                return C0047.m7763(sb2);
            case 9:
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, C0024.m4722(this));
                return C0047.m7763(sb3);
            default:
                StringBuilder sb4 = new StringBuilder();
                C0018.m3933(sb4, C0024.m4722(this));
                return C0047.m7763(sb4);
        }
    }
}