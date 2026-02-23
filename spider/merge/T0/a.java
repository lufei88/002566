package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.IOException;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements Map.Entry, Cloneable {
    public final String a;
    public String b;
    public c c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f499short = {2980, 2985, 2985, 2986, 2994, 2979, 2992, 2985, 2985, 2998, 2982, 2999, 2976, 2976, 2987, 3093, 3079, 3085, 3098, 3095, 1843, 1831, 1830, 1853, 1844, 1853, 1841, 1831, 1825, 1943, 1948, 1937, 1943, 1951, 1937, 1936, 2140, 2128, 2130, 2127, 2142, 2140, 2123, 535, 534, 528, 543, 530, 513, 534, 753, 752, 755, 756, 736, 761, 737, 430, 431, 428, 431, 440, 563, 574, 548, 566, 565, 571, 562, 563, 3298, 3307, 3318, 3305, 3306, 3307, 3314, 3301, 3304, 3309, 3296, 3301, 3312, 3297, 683, 682, 679, 679, 678, 685, 570, 573, 566, 545, 551, 3297, 3323, 3301, 3305, 3320, 2378, 2391, 2374, 2382, 2384, 2368, 2380, 2387, 2374, 2627, 2651, 2626, 2650, 2631, 2654, 2626, 2635, 1939, 1931, 1930, 1947, 1946, 313, 312, 319, 293, 306, 305, 3020, 3021, 3024, 3015, 3025, 3019, 3032, 3015, 1189, 1188, 1208, 1187, 1194, 1199, 1198, 3102, 3103, 3078, 3089, 3100, 3097, 3092, 3089, 3076, 3093, 1745, 1744, 1736, 1741, 1758, 1743, 1101, 1106, 1095, 1100, 1175, 1152, 1156, 1153, 1162, 1163, 1161, 1180, 1309, 1290, 1310, 1306, 1286, 1309, 1290, 1291, 954, 941, 958, 941, 954, 955, 941, 940, 952, 942, 938, 934, 935, 942, 952, 952, 1246, 1224, 1217, 1224, 1230, 1241, 1224, 1225, 2818, 2846, 2819, 2821, 2832, 2835, 2845, 2836, 2908, 2906, 2909, 2893, 2907, 2904, 2893, 2893, 2892, 949, 952, 945, 932, 940, 948, 946, 949, 940, 928, 949, 930, 937, 1065, 1043, 1119, 1032, 1075, 1119, 1064, 1069, 1096, 1071, 1065, 1119, 1043, 1119, 1032, 1075, 1119, 1064, 1090, 1119, 1099, 1069, 1096, 1116, 1071, 1112, 458, 463, 444, 496, 444, 491, 464, 444, 459, 417, 444, 424, 462, 427, 447, 460, 758, 755, 753, 725, 669, 669, 640, 753, 725, 668, 715, 753, 725, 666, 715, 640, 753, 725, 660, 715, 653, 655, 650, 642, 656, 752, 646, 2690, 2693, 2721, 2793, 2793, 2804, 2693, 2721, 2792, 2751, 2693, 2721, 2798, 2751, 2804, 2693, 2721, 2784, 2751, 2809, 2811, 2814, 2806, 2788, 2692, 2309, 2330};
    public static final String[] d = {C0014.m3332(m5313(), 0, 15, 3013), C0003.m1398(m5313(), 15, 5, 3188), C0019.m4107(m5313(), 20, 9, 1874), C0052.m8337(m5313(), 29, 7, 2036), C0065.m9775(m5313(), 36, 7, 2111), C0026.m4951(m5313(), 43, 7, 627), C0058.m9106(m5313(), 50, 7, 661), C0041.m6779(m5313(), 57, 5, 458), C0060.m9352(m5313(), 62, 8, 599), C0045.m7657(m5313(), 70, 14, 3204), C0005.m1645(m5313(), 84, 6, 707), C0057.m8978(m5313(), 90, 5, 595), C0019.m4107(m5313(), 95, 5, 3208), C0048.m7902(m5313(), 100, 9, 2339), C0060.m9352(m5313(), 109, 8, 2606), C0034.m6001(m5313(), 117, 5, 2046), C0052.m8337(m5313(), 122, 6, 343), C0042.m7151(m5313(), 128, 8, 2978), C0051.m8259(m5313(), 136, 7, 1227), C0044.m7509(m5313(), 143, 10, 3184), C0011.m2805(m5313(), 153, 6, 1727), C0046.m7718(m5313(), 159, 4, 1058), C0010.m2300(m5313(), 163, 8, 1253), C0040.m6584(m5313(), 171, 8, 1391), C0038.m6452(m5313(), 179, 8, 968), C0009.m2037(m5313(), 187, 8, 971), C0034.m6001(m5313(), 195, 8, 1197), C0015.m3484(m5313(), 203, 8, 2929), C0050.m8131(m5313(), 211, 9, 2856), C0056.m8911(m5313(), 220, 13, 961)};
    public static final Pattern e = C0005.m1602(C0018.m3917(m5313(), 233, 26, 1138));
    public static final Pattern f = C0005.m1602(C0034.m6001(m5313(), 259, 16, 401));
    public static final Pattern g = C0005.m1602(C0062.m9389(m5313(), 275, 27, 685));
    public static final Pattern h = C0005.m1602(C0020.m4199(m5313(), 302, 25, 2777));

    public a(String str, String str2, c cVar) {
        C0065.m9779(str);
        String strM9640 = C0064.m9640(str);
        C0008.m2009(strM9640);
        this.a = strM9640;
        this.b = str2;
        this.c = cVar;
    }

    public static String a(int i, String str) {
        String strM1840 = C0007.m1840();
        if (i == 2) {
            Pattern patternM1589 = C0005.m1589();
            if (!C0015.m3411(C0034.m6026(patternM1589, str))) {
                String strM1623 = C0005.m1623(C0034.m6026(C0011.m2806(), str), strM1840);
                if (C0015.m3411(C0034.m6026(patternM1589, strM1623))) {
                    return strM1623;
                }
                return null;
            }
        }
        if (i == 1) {
            Pattern patternM4220 = C0020.m4220();
            if (!C0015.m3411(C0034.m6026(patternM4220, str))) {
                String strM16232 = C0005.m1623(C0034.m6026(C0032.m5779(), str), strM1840);
                if (C0015.m3411(C0034.m6026(patternM4220, strM16232))) {
                    return strM16232;
                }
                return null;
            }
        }
        return str;
    }

    public static void b(String str, String str2, Appendable appendable, g gVar) {
        String strM1840 = str2;
        C0024.m4699(appendable, str);
        if (C0013.m3081(gVar) == 1) {
            if (strM1840 == null) {
                return;
            }
            if ((C0057.m8953(strM1840) || C0000.m1057(strM1840, str)) && C0002.m1273(C0036.m6224(), C0063.m9572(str)) >= 0) {
                return;
            }
        }
        C0024.m4699(appendable, C0037.m6307(m5313(), 327, 2, 2360));
        if (strM1840 == null) {
            strM1840 = C0007.m1840();
        }
        C0004.m1489(appendable, strM1840, gVar, true, false, false, false);
        C0045.m7565(appendable, '\"');
    }

    /* renamed from: ۟ۧۥۣۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5313() {
        if (C0034.m6048() < 0) {
            return f499short;
        }
        return null;
    }

    public final Object clone() {
        try {
            return (a) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != C0047.m7777(obj)) {
            return false;
        }
        a aVar = (a) obj;
        String strM9420 = C0062.m9420(aVar);
        String strM94202 = C0062.m9420(this);
        if (strM94202 == null ? strM9420 != null : !C0007.m1815(strM94202, strM9420)) {
            return false;
        }
        String strM3647 = C0017.m3647(this);
        String strM36472 = C0017.m3647(aVar);
        return strM3647 != null ? C0007.m1815(strM3647, strM36472) : strM36472 == null;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return C0062.m9420(this);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String strM3647 = C0017.m3647(this);
        return strM3647 == null ? C0007.m1840() : strM3647;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String strM9420 = C0062.m9420(this);
        int iM8590 = (strM9420 != null ? C0054.m8590(strM9420) : 0) * 31;
        String strM3647 = C0017.m3647(this);
        return iM8590 + (strM3647 != null ? C0054.m8590(strM3647) : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String strM9420;
        int iM5991;
        String str = (String) obj;
        String strM3647 = C0017.m3647(this);
        c cVarM7944 = C0048.m7944(this);
        if (cVarM7944 != null && (iM5991 = C0034.m5991(cVarM7944, (strM9420 = C0062.m9420(this)))) != -1) {
            strM3647 = C0028.m5175(C0048.m7944(this), strM9420);
            C0052.m8318(C0048.m7944(this))[iM5991] = str;
        }
        this.b = str;
        return strM3647 == null ? C0007.m1840() : strM3647;
    }

    public final String toString() {
        StringBuilder sbM8572 = C0054.m8572();
        try {
            g gVarM8160 = C0050.m8160(new h(C0007.m1840()));
            String strM3647 = C0017.m3647(this);
            String strM8335 = C0052.m8335(C0013.m3081(gVarM8160), C0062.m9420(this));
            if (strM8335 != null) {
                C0054.m8616(strM8335, strM3647, sbM8572, gVarM8160);
            }
            return C0004.m1543(sbM8572);
        } catch (IOException e2) {
            throw new com.github.catvod.spider.merge.Q0.a(e2);
        }
    }
}