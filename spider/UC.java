package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z.d;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a0.M;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class UC extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f110short = {1111, 1114, 1107, 1094, 1900, 1907, 1918, 1919, 1909, 1582, 1577, 1591, 691, 689, 684, 699, 698, 739, 694, 689, 687, 739, 761, 2397, 2384, 2388, 2385, 2384, 2375, 1729, 1731, 1758, 1737, 1736, 1681, 1753, 1748, 1744, 1749, 1748, 1731, 1681, 1675, 292, 279, 280, 273, 275, 2734, 2700, 2700, 2698, 2719, 2715, 1769, 1739, 1739, 1741, 1752, 1756, 1669, 1773, 1734, 1739, 1735, 1740, 1729, 1734, 1743, 2073, 2107, 2107, 2109, 2088, 2092, 2165, 2068, 2105, 2102, 2111, 2093, 2105, 2111, 2109, 775, 811, 811, 815, 813, 801, 2726, 2715, 2688, 2702, 2688, 2695, 2505, 2558, 2557, 2558, 2537, 2558, 2537, 784, 806, 800, 878, 768, 811, 878, 790, 802, 2354, 2308, 2306, 2380, 2338, 2313, 2380, 2356, 2304, 2380, 2348, 2318, 2307, 2312, 2317, 2308, 1199, 1177, 1183, 1233, 1215, 1172, 1233, 1193, 1181, 1233, 1196, 1168, 1181, 1160, 1178, 1171, 1166, 1169, 3321, 3279, 3273, 3207, 3308, 3279, 3294, 3273, 3266, 3207, 3310, 3279, 3289, 3294, 2893, 2939, 2941, 2867, 2904, 2939, 2922, 2941, 2934, 2867, 2899, 2929, 2938, 2939, 1002, 988, 986, 916, 1023, 988, 973, 986, 977, 916, 1002, 976, 973, 988, 2226, 2196, 2178, 2197, 2250, 2214, 2176, 2178, 2185, 2195, 930, 1020, 954, 1015, 697, 743, 673, 748, 756, 673, 678, 696, 756, 756, 750, 628, 1667, 2249, 2195, 2196, 2228, 2287, 2276, 2230, 2302, 2280, 2221, 2303, 2290, 2299, 2286, 2230, 2301, 2274, 2287, 2286, 2276, 2221, 2302, 2297, 2279, 2230, 2222, 2296, 2221, 2275, 2286, 2282, 2287, 2286, 2297, 2230, 2222, 2296, 1094, 1048, 1118, 1043, 1035, 1095, 1090, 1093, 1102, 1035, 1069, 1292, 1362, 1300, 1369, 1345, 1297, 1299, 1294, 1305, 1304, 1284, 1285, 1345, 1293, 1288, 1295, 1284, 1345, 504, 482, 1229, 1249, 1248, 1274, 1259, 1248, 1274, 1187, 1242, 1271, 1278, 1259, 3009, 3009, 3009, 2080, 2136, 2080, 2136, 2080, 2136, 2028, 2028, 2028, 438, 426, 426, 430, 484, 497, 497, 1554, 1550, 1550, 1546, 1545, 1600, 1621, 1621, 1744, 1744, 1791, 1786, 1788, 3103, 3176, 3103, 3176, 1822, 1812, 1817, 1823, 1858, 2678, 2650, 2651, 2625, 2640, 2651, 2625, 2584, 2657, 2636, 2629, 2640, 2792, 2767, 2771, 2772, 2440, 2442, 2441, 2463, 433, 443, 21094, 21557, 29329, 28062, 31951, 21985, 2668, 2613, 2663, 2678, 2661, 2660, 2674, 2613, 2605, 2599, 2619, 2613, 2658, 2661, 2683, 2613, 2605, 2613, 2613, 2619, 2613, 2682, 2660, 2672, 2613, 2605, 2613, 2626, 2644, -30927, 23008, 21286, 28511, 26625, 27965, 31852, 21826, -2789, -32288, -25766, 30073, 17466, 22583, -25485, 24089, -25638, 28583, -25766, 30073, 2613, 2619, 2613, 2674, 2661, 2661, 2650, 2660, 2672, 2613, 2605, 2613, 2626, 2644, -30927, 23008, 21286, 28511, 26625, 27965, 31852, 21826, -2789, -32288, -25766, 30073, 17466, 22583, -25485, 24089, -25638, 28583, -25766, 30073, 2613, 2666, 2602, 2614, 2619, 2595, 2585, 2613, 2612, 2606, 2623, 2612, 2606, 2656};
    public m a = null;

    public static Object[] proxy(Map<String, String> map) {
        int i = 1;
        if (!C0007.m1815(C0003.m1398(m562(), 4, 5, 1818), (String) C0062.m9431(map, C0065.m9775(m562(), 0, 4, 1059)))) {
            return null;
        }
        C0047.m7777(C0042.m7135());
        String strM2083 = C0009.m2083((String) C0062.m9431(map, C0046.m7718(m562(), 9, 3, 1627)));
        m561(C0050.m8125(C0044.m7509(m562(), 12, 11, 707), strM2083));
        String strM1549 = C0004.m1549(m562(), 23, 6, 2357);
        m561(C0050.m8125(C0017.m3646(m562(), 29, 14, 1713), C0009.m2083((String) C0062.m9431(map, strM1549))));
        Object map2 = (Map) m560(new Gson(), C0009.m2083((String) C0062.m9431(map, strM1549)), Map.class);
        if (map2 == null) {
            map2 = new HashMap();
        }
        String[] strArr = {C0024.m4740(m562(), 43, 5, 374), C0009.m2037(m562(), 48, 6, 2799), C0020.m4199(m562(), 54, 15, 1704), C0027.m5062(m562(), 69, 15, 2136), C0055.m8814(m562(), 84, 6, 836), C0003.m1398(m562(), 90, 6, 2793), C0036.m6188(m562(), 96, 7, 2459), C0031.m5565(m562(), 103, 9, 835), C0039.m6551(m562(), 112, 16, 2401), C0048.m7902(m562(), 128, 18, 1276), C0011.m2805(m562(), 146, 14, 3242), C0046.m7718(m562(), 160, 14, 2846), C0031.m5565(m562(), 174, 14, 953), C0016.m3525(m562(), 188, 10, 2279)};
        ArrayList arrayList = new ArrayList(14);
        for (int i2 = 0; i2 < 14; i2++) {
            String str = strArr[i2];
            C0047.m7777(str);
            C0004.m1532(arrayList, str);
        }
        List listM5209 = C0029.m5209(arrayList);
        Iterator itM5199 = C0029.m5199(C0026.m4887(map));
        while (C0012.m2962(itM5199)) {
            String str2 = (String) C0048.m7949(itM5199);
            Iterator itM3109 = C0013.m3109(listM5209);
            while (C0012.m2962(itM3109)) {
                if (C0007.m1815(C0023.m4587((String) C0048.m7949(itM3109)), C0023.m4587(str2))) {
                    C0006.m1755(map2, str2, C0062.m9431(map, str2));
                }
            }
        }
        if (!C0058.m9127(C0004.m1522(strM2083), C0004.m1549(m562(), 198, 4, 975))) {
            return C0057.m8993(strM2083, map2);
        }
        m561(C0050.m8125(C0042.m7151(m562(), 202, 11, 724), strM2083));
        d dVarM1803 = C0007.m1803(strM2083, new HashMap(), map2);
        String strM2029 = C0008.m2029(dVarM1803);
        String strM5708 = C0032.m5708(m562(), 213, 1, 638);
        String[] strArrM4752 = C0024.m4752(strM2029, strM5708);
        ArrayList arrayList2 = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String strM1970 = C0008.m1970(m562(), 214, 1, 1708);
        C0018.m3933(sb, C0054.m8636(strM2083, 0, C0002.m1279(strM2083, strM1970)));
        C0018.m3933(sb, strM1970);
        String strM7763 = C0047.m7763(sb);
        int length = strArrM4752.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            String str3 = strArrM4752[i3];
            if (C0058.m9127(str3, C0015.m3484(m562(), 215, 3, 2279))) {
                i4 += i;
                String strM9804 = C0065.m9804(strM7763, str3);
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0051.m8217());
                C0018.m3933(sb2, C0028.m5109(m562(), 218, 34, 2187));
                String strM1327 = C0002.m1327(C0047.m7763(sb2), new Object[]{C0050.m8153(C0012.m3018(strM9804, C0002.m1270())), C0050.m8153(C0012.m3018(C0041.m6815(map2), C0002.m1270()))});
                StringBuilder sb3 = new StringBuilder(C0017.m3646(m562(), 252, 10, 1067));
                C0036.m6177(sb3, i4);
                C0018.m3933(sb3, C0042.m7151(m562(), 262, 1, 1047));
                C0018.m3933(sb3, str3);
                m561(C0047.m7763(sb3));
                StringBuilder sb4 = new StringBuilder(C0042.m7151(m562(), 263, 18, 1377));
                C0036.m6177(sb4, i4);
                C0018.m3933(sb4, C0010.m2300(m562(), 281, 2, 472));
                C0018.m3933(sb4, strM1327);
                m561(C0047.m7763(sb4));
                str3 = strM1327;
            }
            C0004.m1532(arrayList2, str3);
            i3++;
            i = 1;
        }
        String strM6194 = C0036.m6194(strM5708, arrayList2);
        Map mapM6192 = C0036.m6192(dVarM1803);
        String str4 = (String) C0048.m7915((List) C0062.m9431(mapM6192, C0008.m1970(m562(), 283, 12, 1166)), 0);
        HashMap map3 = new HashMap();
        Iterator itM51992 = C0029.m5199(C0026.m4887(mapM6192));
        while (C0012.m2962(itM51992)) {
            String str5 = (String) C0048.m7949(itM51992);
            C0053.m8424(map3, str5, (String) C0048.m7915((List) C0062.m9431(mapM6192, str5), 0));
        }
        return new Object[]{C0011.m2808(C0057.m9021(dVarM1803)), str4, new ByteArrayInputStream(C0012.m3018(strM6194, C0002.m1270())), map3};
    }

    /* renamed from: ۟۠ۢۨ, reason: not valid java name and contains not printable characters */
    public static Object m560(Object obj, Object obj2, Object obj3) {
        if (C0031.m5628() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۠ۡۦۧ, reason: not valid java name and contains not printable characters */
    public static void m561(Object obj) {
        if (C0012.m3024() > 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m562() {
        if (C0002.m1242() > 0) {
            return f110short;
        }
        return null;
    }

    public String detailContent(List<String> list) {
        M mM7135 = C0042.m7135();
        String str = (String) C0048.m7915(list, 0);
        C0047.m7777(mM7135);
        return C0053.m8428(C0005.m1643(C0042.m7135(), C0062.m9390(str)));
    }

    public String detailContentVodPlayFrom(List<String> list, int i) {
        String strM4740 = C0024.m4740(m562(), 295, 3, 3045);
        ArrayList arrayList = new ArrayList();
        try {
            for (String str : C0024.m4752(C0024.m4710(C0054.m8559(this)), C0052.m8337(m562(), 298, 6, 2172))) {
                Locale localeM7549 = C0045.m7549();
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, str);
                C0036.m6177(sb, i);
                C0004.m1532(arrayList, C0029.m5240(localeM7549, C0047.m7763(sb), new Object[0]));
            }
            return C0036.m6194(strM4740, arrayList);
        } catch (Exception unused) {
            return C0036.m6194(strM4740, arrayList);
        }
    }

    public String detailContentVodPlayUrl(List<String> list) {
        ArrayList arrayList = new ArrayList();
        this.a = new m();
        Iterator itM3109 = C0013.m3109(list);
        while (true) {
            boolean zM2962 = C0012.m2962(itM3109);
            String strM5852 = C0033.m5852(m562(), 304, 3, 1992);
            if (!zM2962) {
                return C0036.m6194(strM5852, arrayList);
            }
            String str = (String) C0048.m7949(itM3109);
            C0047.m7777(C0042.m7135());
            try {
                m mVarM1643 = C0005.m1643(C0042.m7135(), C0062.m9390(str));
                this.a = mVarM1643;
                C0004.m1532(arrayList, C0035.m6167(mVarM1643));
            } catch (Exception unused) {
                return C0036.m6194(strM5852, arrayList);
            }
        }
    }

    public void init(Context context, String str) {
        String strM5769 = str;
        if (C0058.m9127(strM5769, C0014.m3332(m562(), 307, 7, 478)) || C0058.m9127(strM5769, C0016.m3525(m562(), 314, 8, 1658))) {
            strM5769 = C0032.m5769(strM5769, null);
        }
        M mM7135 = C0042.m7135();
        C0047.m7777(mM7135);
        if (C0040.m6623(new CharSequence[]{strM5769}) && C0058.m9127(strM5769, C0041.m6779(m562(), 322, 5, 1679))) {
            mM7135.a = strM5769;
            C0035.m6119(mM7135);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r60, java.lang.String r61, java.util.List<java.lang.String> r62) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.UC.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }
}