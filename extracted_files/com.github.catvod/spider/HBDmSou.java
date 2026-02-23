package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V.a;
import com.github.catvod.spider.merge.V.b;
import com.github.catvod.spider.merge.V.c;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.b0.d;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class HBDmSou extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f28short = {2345, 2362, 2352, 2358, 2335, 2337, 2333, 2311, 2351, 2386, 19325, 22311, 26593, -29238, 23172, 23486, 1468, 1446, 1683, 1685, 1189, 1187, 3268, 3265, 3291, 3292, 2946, 2961, 2971, 2973, 2996, 2954, 2998, 2988, 2948, 3065, 2963, 2954, 2966, 2967, 28329, 29981, -32198, 27721, 21224, -30980, 3043, 3065, 1364, 1351, 1357, 1355, 1378, 1372, 1376, 1402, 1362, 1327, 1349, 1372, 1344, 1345, -29460, 25247, 23614, -30678, 1333, 1327, 740, 750, 765, 767, 2549, 2541, 2549, 2533, 2549, 2646, 2650, 2643, 2643, 1837, 1851, 1825, 1855, 1825, 1534, 1525, 1520, 1525, 1534, 1525, 1520, 1525, 3314, 3301, 3310, 3314, 3301, 3310, 1019, 1010, 1021, 1017, 998, 994, 998, 1010, 1021, 838, 835, 837, 837, 2005, 2000, 2015, 2005, 2000, 2015, 1989, 2000, 2015, 2006, 2787, 2793, 2792, 2790, 2808, 2746, 2747, 1175, 1170, 1181, 1182, 1155, 1158, 1153, 1183, 2057, 2069, 2069, 2065, 2066, 2139, 2126, 2126, 2075, 2072, 2127, 2073, 2060, 2060, 2127, 2057, 2058, 2126, 2048, 2065, 2056, 2127, 2065, 2057, 2065, 2126, 2065, 2067, 2062, 2071, 2056, 2053, 2052, 2126, 2071, 2062, 2053, 2126, 2725, 606, 589, 583, 577, 616, 598, 618, 624, 600, 549, -31877, -30294, 19710, 20644, 25045, 19617, 23348, -28896, 575, 549, 2424, 2411, 2401, 2407, 2382, 2416, 2380, 2390, 2430, 2307, -29775, 28351, 18392, 23426, 27379, 18311, 20498, -31738, 2329, 2307, 1613, 1630, 1620, 1618, 1659, 1605, 1657, 1635, 1611, 1590, 29735, 24401, -31636, 18669, 21687, 26054, 18610, 24359, -29901, 1580, 1590, 1438, 1421, 1415, 1409, 1448, 1430, 1450, 1456, 1432, 1509, 19165, -27470, 19262, 22372, 26133, 19297, 23796, -30496, 1535, 1509, 2245, 2262, 2268, 2266, 2291, 2253, 2289, 2283, 2243, 2238, 23626, 23671, 18021, 23103, 27470, 17978, 20911, -31301, 2212, 2238, 573, 558, 548, 546, 523, 565, 521, 531, 571, 582, 19676, 19676, 19613, 20679, 25014, 19650, 23383, -28861, 604, 582, 859, 840, 834, 836, 877, 851, 879, 885, 861, 800, -27415, 21512, 19963, 20897, 24784, 19876, 23089, -29147, 826, 800, 1806, 1821, 1815, 1809, 1848, 1798, 1850, 1824, 1800, 1909, 1894, 1891, 1893, 18862, 22004, 25733, 18929, 24164, -30096, 1903, 1909, 496, 483, 489, 495, 454, 504, 452, 478, 502, 395, 488, 486, 504, 20304, 21258, 25211, 20239, 22682, -29554, 401, 395, 299, 312, 306, 308, 285, 291, 287, 261, 301, 336, 24137, 24137, 20363, 21457, 25248, 20436, 22593, -29611, 330, 336, 1585, 1588, 1582, 1577};
    public a a;
    public a b;
    public a c;
    public b d;
    public a e;
    public c f;
    public a g;
    public HB360 h;
    public HBcms10 i;
    public a j;

    public static String a(Callable callable, String str) {
        try {
            return (String) C0064.m9656(callable);
        } catch (Exception e) {
            C0043.m7366(e, C0046.m7672(C0012.m2973(m188(), 0, 10, 2418), str, C0024.m4740(m188(), 10, 8, 1414)));
            return C0022.m4403(m188(), 18, 2, 1768);
        }
    }

    public static String b(Future future, TimeUnit timeUnit) {
        String strM4951 = C0026.m4951(m188(), 20, 2, 1246);
        try {
            return (String) C0059.m9267(future, 5L, timeUnit);
        } catch (InterruptedException | ExecutionException unused) {
            return strM4951;
        } catch (TimeoutException unused2) {
            C0064.m9685(future, true);
            return strM4951;
        }
    }

    public static JsonArray c(JsonObject jsonObject) {
        try {
            return m176(jsonObject, C0018.m3917(m188(), 22, 4, 3240));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0043.m7290(m188(), 26, 22, 3033));
            C0018.m3933(sb, C0036.m6261(e));
            m179(C0047.m7763(sb));
            return new JsonArray();
        }
    }

    public static JsonObject d(String str) {
        try {
            return m184(str);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0039.m6551(m188(), 48, 20, 1295));
            C0018.m3933(sb, C0036.m6261(e));
            m179(C0047.m7763(sb));
            return new JsonObject();
        }
    }

    public static JsonArray mergeJsonArrays(JsonArray... jsonArrayArr) {
        JsonArray jsonArray = new JsonArray();
        for (JsonArray jsonArray2 : jsonArrayArr) {
            if (jsonArray2 != null) {
                for (int i = 0; i < m187(jsonArray2); i++) {
                    m186(jsonArray, m185(jsonArray2, i));
                }
            }
        }
        return jsonArray;
    }

    /* renamed from: ۣ۟۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static JsonArray m176(Object obj, Object obj2) {
        if (C0042.m7147() <= 0) {
            return AbstractC0308c.c((JsonObject) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۡ۟, reason: not valid java name and contains not printable characters */
    public static JsonArray m177(Object obj) {
        if (C0056.m8886() < 0) {
            return c((JsonObject) obj);
        }
        return null;
    }

    /* renamed from: ۟۟ۨۦ۠, reason: not valid java name and contains not printable characters */
    public static JsonArray m178(Object obj) {
        if (C0038.m6471() > 0) {
            return mergeJsonArrays((JsonArray[]) obj);
        }
        return null;
    }

    /* renamed from: ۟ۡۡ۟۟, reason: not valid java name and contains not printable characters */
    public static void m179(Object obj) {
        if (C0027.m5017() > 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۟ۡۧ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m180(Object obj) {
        if (C0007.m1886() > 0) {
            return ((JsonElement) obj).toString();
        }
        return null;
    }

    /* renamed from: ۟ۢۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static JsonObject m181(Object obj) {
        if (C0000.m1116() <= 0) {
            return d((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۟۠۠۠, reason: not valid java name and contains not printable characters */
    public static void m182(Object obj, Object obj2, Object obj3) {
        if (C0032.m5686() < 0) {
            ((JsonObject) obj).add((String) obj2, (JsonElement) obj3);
        }
    }

    /* renamed from: ۟ۤۡۦ۟, reason: not valid java name and contains not printable characters */
    public static void m183(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            ((Spider) obj).init((Context) obj2);
        }
    }

    /* renamed from: ۟ۦۣۡۨ, reason: not valid java name and contains not printable characters */
    public static JsonObject m184(Object obj) {
        if (C0011.m2755() > 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۠ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static JsonElement m185(Object obj, int i) {
        if (C0049.m8038() < 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۣۡ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m186(Object obj, Object obj2) {
        if (C0032.m5686() < 0) {
            ((JsonArray) obj).add((JsonElement) obj2);
        }
    }

    /* renamed from: ۣۣۥ۟, reason: not valid java name and contains not printable characters */
    public static int m187(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static short[] m188() {
        if (C0012.m3024() >= 0) {
            return f28short;
        }
        return null;
    }

    /* renamed from: ۨۥۡۡ, reason: not valid java name and contains not printable characters */
    public static String m189(Object obj, Object obj2, Object obj3) {
        if (C0027.m5017() > 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    public String detailContent(List<String> list) {
        return C0058.m9127((String) C0048.m7915(list, 0), C0035.m6131(m188(), 68, 4, 649)) ? C0012.m2960(C0062.m9415(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0008.m1970(m188(), 72, 5, 2460)) ? C0012.m2960(C0040.m6613(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0063.m9585(m188(), 77, 4, 2594)) ? C0012.m2960(C0022.m4425(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0027.m5062(m188(), 81, 5, 1876)) ? C0056.m8877(C0020.m4268(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0063.m9585(m188(), 86, 8, 1436)) ? C0012.m2960(C0027.m5034(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0021.m4340(m188(), 94, 6, 3200)) ? C0035.m6152(C0035.m6081(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0004.m1549(m188(), 100, 9, 915)) ? C0012.m2960(C0022.m4483(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0022.m4403(m188(), 109, 4, 885)) ? C0037.m6372(C0064.m9651(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0019.m4107(m188(), 113, 10, 1969)) ? C0012.m2960(C0008.m2008(this), list) : C0058.m9127((String) C0048.m7915(list, 0), C0064.m9599(m188(), 123, 7, 2699)) ? C0045.m7591(C0010.m2364(this), list) : C0007.m1840();
    }

    public void init(Context context) {
        this.a = new a(5);
        this.b = new a(3);
        this.c = new a(4);
        this.d = new b();
        this.e = new a(1);
        this.f = new c();
        this.g = new a(2);
        this.h = new HB360();
        this.i = new HBcms10();
        this.j = new a(0);
        m183(C0022.m4425(this), context);
        m183(C0062.m9415(this), context);
        m183(C0040.m6613(this), context);
        C0062.m9396(C0020.m4268(this), context);
        m183(C0027.m5034(this), context);
        m183(C0035.m6081(this), context);
        m183(C0022.m4483(this), context);
        m183(C0064.m9651(this), context);
        m183(C0008.m2008(this), context);
        C0010.m2364(this).a = m189(C0055.m8744(C0035.m6110()), C0058.m9106(m188(), 130, 8, 1267), C0064.m9599(m188(), 138, 38, 2145));
        super.init(context);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C0036.m6219();
        String strM6133 = C0035.m6133(str2);
        g gVar = new g();
        C0017.m3667(gVar, str2);
        C0064.m9646(gVar);
        C0006.m1720(gVar, 0);
        C0002.m1282(gVar, strM6133);
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        return C0021.m4336(this, str, true, C0027.m5062(m188(), 176, 1, 2708));
    }

    public String searchContent(String str, boolean z, String str2) {
        ExecutorService executorServiceM4370 = C0021.m4370(10);
        ArrayList arrayList = new ArrayList();
        C0004.m1532(arrayList, new d(this, str, z, str2, 0));
        C0004.m1532(arrayList, new d(this, str, z, str2, 27));
        C0004.m1532(arrayList, new d(this, str, z, str2, 4));
        C0004.m1532(arrayList, new d(this, str, z, str2, 5));
        C0004.m1532(arrayList, new d(this, str, z, str2, 6));
        C0004.m1532(arrayList, new d(this, str, z, str2, 7));
        C0004.m1532(arrayList, new d(this, str, z, str2, 8));
        C0004.m1532(arrayList, new d(this, str, z, str2, 9));
        C0004.m1532(arrayList, new d(this, str, z, str2, 10));
        C0004.m1532(arrayList, new d(this, str, z, str2, 12));
        ArrayList arrayList2 = new ArrayList();
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 11)));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(C0034.m6001(m188(), 177, 20, 517));
            C0018.m3933(sb, C0036.m6261(e));
            m179(C0047.m7763(sb));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 23)));
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder(C0033.m5852(m188(), 197, 20, 2339));
            C0018.m3933(sb2, C0036.m6261(e2));
            m179(C0047.m7763(sb2));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 24)));
        } catch (Exception e3) {
            StringBuilder sb3 = new StringBuilder(C0056.m8911(m188(), 217, 21, 1558));
            C0018.m3933(sb3, C0036.m6261(e3));
            m179(C0047.m7763(sb3));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 25)));
        } catch (Exception e4) {
            StringBuilder sb4 = new StringBuilder(C0033.m5852(m188(), 238, 20, 1477));
            C0018.m3933(sb4, C0036.m6261(e4));
            m179(C0047.m7763(sb4));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 26)));
        } catch (Exception e5) {
            StringBuilder sb5 = new StringBuilder(C0012.m2973(m188(), 258, 20, 2206));
            C0018.m3933(sb5, C0036.m6261(e5));
            m179(C0047.m7763(sb5));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 28)));
        } catch (Exception e6) {
            StringBuilder sb6 = new StringBuilder(C0030.m5362(m188(), 278, 20, 614));
            C0018.m3933(sb6, C0036.m6261(e6));
            m179(C0047.m7763(sb6));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 29)));
        } catch (Exception e7) {
            StringBuilder sb7 = new StringBuilder(C0041.m6779(m188(), 298, 20, 768));
            C0018.m3933(sb7, C0036.m6261(e7));
            m179(C0047.m7763(sb7));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 1)));
        } catch (Exception e8) {
            StringBuilder sb8 = new StringBuilder(C0063.m9585(m188(), 318, 21, 1877));
            C0018.m3933(sb8, C0036.m6261(e8));
            m179(C0047.m7763(sb8));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 2)));
        } catch (Exception e9) {
            StringBuilder sb9 = new StringBuilder(C0005.m1645(m188(), 339, 21, 427));
            C0018.m3933(sb9, C0036.m6261(e9));
            m179(C0047.m7763(sb9));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        try {
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new d(this, str, z, str2, 3)));
        } catch (Exception e10) {
            StringBuilder sb10 = new StringBuilder(C0054.m8574(m188(), 360, 20, 368));
            C0018.m3933(sb10, C0036.m6261(e10));
            m179(C0047.m7763(sb10));
            C0004.m1532(arrayList2, C0049.m8042(executorServiceM4370, new Callable() { // from class: com.github.catvod.spider.merge.b0.e

                /* renamed from: short, reason: not valid java name */
                private static final short[] f750short = {259, 261};

                /* renamed from: ۟ۢۢۡ۠, reason: not valid java name and contains not printable characters */
                public static short[] m7518() {
                    if (C0007.m1886() > 0) {
                        return f750short;
                    }
                    return null;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C0037.m6307(m7518(), 0, 2, 376);
                }
            }));
        }
        C0027.m5072(executorServiceM4370);
        TimeUnit timeUnitM8151 = C0050.m8151();
        String strM9312 = C0060.m9312((Future) C0028.m5167(arrayList2, 0), timeUnitM8151);
        String strM93122 = C0060.m9312((Future) C0028.m5167(arrayList2, 1), timeUnitM8151);
        String strM93123 = C0060.m9312((Future) C0028.m5167(arrayList2, 2), timeUnitM8151);
        String strM93124 = C0060.m9312((Future) C0028.m5167(arrayList2, 3), timeUnitM8151);
        String strM93125 = C0060.m9312((Future) C0028.m5167(arrayList2, 4), timeUnitM8151);
        String strM93126 = C0060.m9312((Future) C0028.m5167(arrayList2, 5), timeUnitM8151);
        String strM93127 = C0060.m9312((Future) C0028.m5167(arrayList2, 6), timeUnitM8151);
        String strM93128 = C0060.m9312((Future) C0028.m5167(arrayList2, 7), timeUnitM8151);
        String strM93129 = C0060.m9312((Future) C0028.m5167(arrayList2, 8), timeUnitM8151);
        String strM931210 = C0060.m9312((Future) C0028.m5167(arrayList2, 9), timeUnitM8151);
        JsonArray jsonArrayM178 = m178(new JsonArray[]{m177(m181(strM9312)), m177(m181(strM93122)), m177(m181(strM93123)), m177(m181(strM93124)), m177(m181(strM93125)), m177(m181(strM93126)), m177(m181(strM93127)), m177(m181(strM93128)), m177(m181(strM93129)), m177(m181(strM931210))});
        JsonObject jsonObject = new JsonObject();
        m182(jsonObject, C0031.m5565(m188(), 380, 4, 1629), jsonArrayM178);
        return m180(jsonObject);
    }
}