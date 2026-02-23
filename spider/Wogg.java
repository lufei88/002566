package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Wogg extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f115short = {1836, 1840, 1840, 1844, 1847, 1918, 1899, 1899, 1843, 1835, 1827, 1827, 1898, 1852, 1852, 1835, 1835, 1835, 1898, 1831, 1826, 1899, 3099, 3138, 3163, 3152, 3136, 3149, 3140, 3153, 3099, 3100, 3176, 3139, 3103, 3101, 3098, 3164, 3136, 3161, 3160, 1990, 1982, 1990, 1970, 1976, 1990, 1972, 2039, 2043, 2041, 1989, 2030, 2037, 2030, 2043, 2038, 1976, 1990, 1971, 1990, 1972, 2030, 2047, 2018, 2030, 1990, 1970, 1981, 1970, 1990, 2046, 1969, 1971, 1981, 1990, 1971, 1953, 1839, 1801, 1823, 1800, 1879, 1851, 1821, 1823, 1812, 1806, 532, 566, 547, 560, 565, 565, 568, 630, 620, 631, 617, 633, 625, 526, 560, 567, 573, 566, 558, 554, 633, 535, 525, 633, 616, 617, 631, 617, 610, 633, 526, 560, 567, 623, 621, 610, 633, 545, 623, 621, 624, 633, 536, 553, 553, 565, 572, 526, 572, 571, 530, 560, 557, 630, 620, 618, 622, 631, 618, 623, 633, 625, 530, 529, 525, 532, 533, 629, 633, 565, 560, 562, 572, 633, 542, 572, 570, 562, 566, 624, 633, 538, 561, 555, 566, 564, 572, 630, 616, 619, 619, 631, 617, 631, 617, 631, 617, 633, 522, 568, 575, 568, 555, 560, 630, 620, 618, 622, 631, 618, 623, 878, 813, 815, 804, 821, 812, 805, 877, 809, 820, 805, 813, 3089, 3145, 3158, 3163, 3162, 3152, 3090, 3153, 3166, 3154, 3162, 3103, 3166, 3165, 3143, 3152, 3155, 1881, 1818, 1816, 1811, 1794, 1819, 1810, 1882, 1822, 1795, 1810, 1818, 1882, 1799, 1822, 1812, 1879, 1865, 1879, 1822, 1818, 1808, 1610, 1615, 1626, 1615, 1539, 1629, 1628, 1613, 832, 792, 775, 778, 779, 769, 835, 768, 783, 771, 779, 441, 506, 504, 499, 482, 507, 498, 442, 510, 483, 498, 506, 442, 483, 498, 495, 483, 1244, 1178, 1181, 1175, 1174, 1163, 1245, 1155, 1179, 1155, 1244, 1157, 1180, 1175, 1152, 1174, 1170, 1153, 1168, 1179, 1244, 2647, 2647, 2647, 2647, 2647, 2647, 2647, 2647, 2647, 2647, 688, 688, 688, 691, 757, 745, 752, 753, 718, 653, 655, 644, 661, 652, 645, 717, 659, 645, 641, 658, 643, 648, 717, 649, 660, 645, 653, 392, 464, 463, 450, 451, 457, 395, 469, 451, 468, 463, 455, 458, 661, 655, 664, 667, 739, 766, 739, 763, 754, 2454, 2517, 2519, 2524, 2509, 2516, 2525, 2453, 2513, 2508, 2525, 2517, 2453, 2504, 2513, 2523, 2456, 2438, 2456, 2513, 2517, 2527, 614, 611, 630, 611, 559, 625, 624, 609, 3228, 3268, 3291, 3286, 3287, 3293, 3231, 3270, 3283, 3285, 3231, 3291, 3281, 3293, 3292, 1112, 1935, 1993, 1998, 1988, 1989, 2008, 1934, 2000, 1992, 2000, 1935, 2006, 1999, 1988, 2003, 1992, 1999, 2007, 1935, 1921, 1991, 2011, 1986, 1987, 321, 281, 262, 267, 266, 256, 322, 262, 257, 265, 256, 322, 263, 266, 270, 267, 266, 285, 335, 337, 335, 321, 287, 270, 264, 266, 322, 283, 262, 283, 259, 266, 1807, 1868, 1870, 1861, 1876, 1869, 1860, 1804, 1864, 1877, 1860, 1868, 1804, 1873, 1864, 1858, 1793, 1864, 1868, 1862, 1729, 1732, 1745, 1732, 1672, 1750, 1751, 1734, 2716, 2756, 2779, 2774, 2775, 2781, 2719, 2779, 2780, 2772, 2781, 2719, 2778, 2775, 2771, 2774, 2775, 2752, 2706, 2771, 2716, 2758, 2771, 2773, 2719, 2782, 2779, 2780, 2777, 2466, 2554, 2533, 2536, 2537, 2531, 2465, 2533, 2530, 2538, 2531, 2465, 2532, 2537, 2541, 2536, 2537, 2558, 2476, 2536, 2533, 2554, 2466, 2552, 2541, 2539, 2465, 2528, 2533, 2530, 2535, 2476, 2541, 2719, 615, 548, 550, 557, 572, 549, 556, 612, 571, 550, 574, 612, 573, 556, 561, 573, 2816, 2821, 2832, 2821, 2889, 2823, 2824, 2829, 2836, 2822, 2827, 2821, 2838, 2816, 2889, 2832, 2817, 2844, 2832, 3199, 3111, 3128, 3125, 3124, 3134, 3196, 3128, 3135, 3127, 3134, 3196, 3128, 3109, 3124, 3132, 21405, 26485, 848, 18541, 26946, 21168, 16935, 20535, 26072, 21472, 24898, 2184, 2261, 2263, 2252, 2252, 2297, 2247, 397, 25824, -29535, -28354, 21456, 395, 1187, 1251, 1260, 1275, 1184, 1249, 1252, 1251, 1254, 752, 746, 765, 766, 536, 514, 543, 526, 2767};
    public String g = C0024.m4740(m588(), 0, 22, 1860);
    public final Pattern h = C0005.m1602(C0009.m2037(m588(), 22, 19, 3124));
    public final Pattern i = C0005.m1602(C0002.m1305(m588(), 41, 37, 1946));

    public static HashMap a() {
        return C0020.m4251(C0025.m4795(m588(), 78, 10, 1914), C0051.m8259(m588(), 88, 111, 601));
    }

    public static ArrayList b(h hVar) {
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVar, C0013.m3106(m588(), 199, 12, 832)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0055.m8732(C0010.m2339(C0036.m6243(mVar, C0030.m5362(m588(), 211, 13, 3135)), C0064.m9599(m588(), 224, 4, 3125)), C0064.m9669(C0036.m6243(mVar, C0005.m1645(m588(), 258, 11, 878))), C0010.m2339(C0036.m6243(mVar, C0054.m8574(m588(), 228, 22, 1911)), C0028.m5109(m588(), 250, 8, 1582)), C0064.m9669(C0036.m6243(mVar, C0051.m8259(m588(), 269, 17, 407))), arrayList);
        }
        return arrayList;
    }

    /* renamed from: ۟ۢۢۤۨ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m587(Object obj, Object obj2) {
        if (C0058.m9131() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m588() {
        if (C0043.m7332() > 0) {
            return f115short;
        }
        return null;
    }

    /* renamed from: ۟ۦۧ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m589(Object obj) {
        if (C0010.m2320() < 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۣۧۥۡ, reason: not valid java name and contains not printable characters */
    public static JsonObject m590(Object obj) {
        if (C0030.m5375() >= 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    public final String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0009.m2134(this));
        C0018.m3933(sb, C0058.m9145(C0013.m3106(m588(), 286, 21, 1267), C0056.m8909(str), C0000.m1077(m588(), 307, 10, 2682), str2, C0053.m8477(m588(), 317, 8, 669)));
        d dVarM5333 = C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb), C0063.m9539())), C0022.m4403(m588(), 325, 19, 736));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(dVarM5333);
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            String strM2805 = C0011.m2805(m588(), 344, 13, 422);
            C0055.m8732(C0049.m8058(C0030.m5333(mVar, strM2805), C0027.m5062(m588(), 357, 4, 765)), C0049.m8058(C0030.m5333(mVar, strM2805), C0003.m1398(m588(), 361, 5, 663)), C0049.m8058(C0030.m5333(mVar, C0005.m1645(m588(), 366, 22, 2488)), C0040.m6584(m588(), 388, 8, 514)), C0024.m4684(C0030.m5333(mVar, C0046.m7718(m588(), 396, 15, 3250))), arrayList);
        }
        return C0047.m7783(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String[] strArr = new String[12];
        strArr[0] = str;
        int iM1140 = 1;
        String strM1840 = C0007.m1840();
        strArr[1] = strM1840;
        strArr[2] = strM1840;
        strArr[3] = strM1840;
        strArr[4] = strM1840;
        strArr[5] = strM1840;
        strArr[6] = strM1840;
        strArr[7] = strM1840;
        strArr[8] = str2;
        strArr[9] = strM1840;
        strArr[10] = strM1840;
        strArr[11] = strM1840;
        if (map != null && C0014.m3311(map) > 0) {
            Iterator itM5199 = C0029.m5199(C0000.m1121(map));
            while (C0012.m2962(itM5199)) {
                String str3 = (String) C0048.m7949(itM5199);
                strArr[C0038.m6456(str3)] = (String) C0065.m9715(map, str3);
            }
        }
        String strM2134 = C0009.m2134(this);
        StringBuilder sb = new StringBuilder();
        C0056.m8896(sb, strArr[0]);
        for (int i = 1; i < 12; i++) {
            C0056.m8896(sb, C0034.m6001(m588(), 411, 1, 1141));
            C0056.m8896(sb, strArr[i]);
        }
        h hVarM3577 = C0016.m3577(C0032.m5769(C0004.m1488(strM2134, C0025.m4795(m588(), 412, 19, 1952), C0047.m7763(sb), C0044.m7509(m588(), 431, 5, 1967)), C0063.m9539()));
        int iM6456 = C0038.m6456(str2);
        Matcher matcherM6026 = C0034.m6026(C0034.m6043(this), C0000.m1081(hVarM3577));
        int iM64562 = C0003.m1405(matcherM6026) ? C0038.m6456(C0021.m4306(matcherM6026, 1)) : 0;
        if (iM64562 > 72) {
            double d = iM64562;
            double d2 = 72;
            C0004.m1564(d);
            C0004.m1564(d2);
            iM1140 = (int) C0001.m1140(d / d2);
        }
        g gVar = new g();
        C0045.m7632(gVar, C0049.m8049(hVarM3577));
        C0049.m7974(gVar, iM6456, iM1140, 72, iM64562);
        return C0033.m5828(gVar);
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        String str = (String) C0048.m7915(list, 0);
        h hVarM3577 = C0016.m3577(C0032.m5769(C0028.m5188(new StringBuilder(), C0009.m2134(this), str), C0063.m9539()));
        com.github.catvod.spider.merge.E.m mVar = new com.github.catvod.spider.merge.E.m();
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, C0064.m9669(C0036.m6243(hVarM3577, C0024.m4740(m588(), 436, 32, 367))));
        C0026.m4947(mVar, C0010.m2339(C0036.m6243(hVarM3577, C0029.m5256(m588(), 468, 20, 1825)), C0034.m6001(m588(), 488, 8, 1701)));
        C0017.m3671(mVar, C0064.m9669(C0053.m8455(C0030.m5333(hVarM3577, C0023.m4536(m588(), 496, 29, 2738)))));
        ArrayList arrayListM6481 = C0039.m6481(C0030.m5333(hVarM3577, C0040.m6584(m588(), 525, 33, 2444)));
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayListM6481);
        boolean zM2962 = C0012.m2962(itM7816);
        String strM4403 = C0022.m4403(m588(), 558, 1, 2739);
        if (zM2962) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, strM4403);
            }
        }
        C0058.m9085(mVar, C0047.m7763(sb));
        ArrayList arrayListM5773 = C0032.m5773(C0030.m5333(hVarM3577, C0046.m7718(m588(), 559, 16, 585)), C0006.m1774(m588(), 575, 19, 2916));
        for (int i = 0; i < C0009.m2139(arrayListM5773); i++) {
            C0055.m8716(arrayListM5773, i, C0064.m9640((String) C0028.m5167(arrayListM5773, i)));
        }
        C0044.m7449(mVar, C0014.m3356(this, arrayListM5773));
        C0054.m8596(mVar, C0030.m5351(this));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0041.m6779(m588(), 594, 16, 3153)));
        while (C0012.m2962(itM7807)) {
            m mVar2 = (m) C0048.m7949(itM7807);
            String strM9669 = C0064.m9669(C0054.m8640(mVar2));
            boolean zM9127 = C0058.m9127(strM9669, C0032.m5708(m588(), 610, 2, 2145));
            String strM7657 = C0045.m7657(m588(), 612, 1, 817);
            if (zM9127) {
                ArrayList arrayListM64812 = C0039.m6481(C0030.m5333(mVar2, strM7657));
                StringBuilder sb2 = new StringBuilder();
                Iterator itM78162 = C0047.m7816(arrayListM64812);
                if (C0012.m2962(itM78162)) {
                    while (true) {
                        C0056.m8896(sb2, (CharSequence) C0048.m7949(itM78162));
                        if (!C0012.m2962(itM78162)) {
                            break;
                        }
                        C0056.m8896(sb2, strM4403);
                    }
                }
                C0058.m9159(mVar, C0047.m7763(sb2));
            } else if (C0058.m9127(strM9669, C0045.m7657(m588(), 613, 2, 1622))) {
                ArrayList arrayListM64813 = C0039.m6481(C0030.m5333(mVar2, strM7657));
                StringBuilder sb3 = new StringBuilder();
                Iterator itM78163 = C0047.m7816(arrayListM64813);
                if (C0012.m2962(itM78163)) {
                    while (true) {
                        C0056.m8896(sb3, (CharSequence) C0048.m7949(itM78163));
                        if (!C0012.m2962(itM78163)) {
                            break;
                        }
                        C0056.m8896(sb3, strM4403);
                    }
                }
                C0058.m9152(mVar, C0047.m7763(sb3));
            } else if (C0058.m9127(strM9669, C0049.m8007(m588(), 615, 2, 3268))) {
                C0022.m4432(mVar, C0064.m9640(C0064.m9669(C0036.m6243(mVar2, strM7657))));
            } else if (C0058.m9127(strM9669, C0034.m6001(m588(), 617, 2, 2352))) {
                C0019.m4073(mVar, C0064.m9640(C0064.m9669(mVar2)));
            } else if (C0058.m9127(strM9669, C0062.m9389(m588(), 619, 2, 391))) {
                C0027.m5000(mVar, C0064.m9640(C0015.m3446(C0064.m9669(C0036.m6243(mVar2, C0035.m6131(m588(), 621, 7, 2214))), C0042.m7151(m588(), 628, 6, 470), C0007.m1840())));
            }
        }
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        h hVarM3577 = C0016.m3577(C0032.m5769(C0009.m2134(this), C0063.m9539()));
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0023.m4536(m588(), 634, 9, 1165)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            Matcher matcherM6026 = C0034.m6026(C0014.m3382(this), C0010.m2339(mVar, C0014.m3332(m588(), 643, 4, 664)));
            if (C0003.m1405(matcherM6026)) {
                C0004.m1532(arrayList, new b(C0021.m4306(matcherM6026, 1), C0064.m9640(C0064.m9669(mVar)), null));
            }
        }
        return C0025.m4831(arrayList, C0049.m8049(hVarM3577));
    }

    @Override // com.github.catvod.spider.Cloud
    public void init(Context context, String str) {
        String strM589 = m589(m587(m590(str), C0000.m1077(m588(), 647, 4, 619)));
        if (!C0057.m8953(strM589)) {
            this.g = strM589;
        }
        super.init(context, str);
    }

    public String searchContent(String str, boolean z) {
        return C0043.m7376(this, str, C0031.m5565(m588(), 651, 1, 2814));
    }

    public String searchContent(String str, boolean z, String str2) {
        return C0043.m7376(this, str, str2);
    }
}