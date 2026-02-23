package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.d;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.G.a;
import com.github.catvod.spider.merge.G.c;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
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
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AList extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f0short = {478, 492, 508, 490, 493, 441, 492, 490, 508, 491, 441, 496, 490, 441, 509, 496, 490, 504, 507, 501, 508, 509, 1417, 1423, 1433, 1422, 1426, 1437, 1425, 1433, 1094, 1111, 1093, 1093, 1089, 1113, 1092, 1106, 2598, 2664, 2681, 2656, 2598, 2664, 2684, 2685, 2657, 2598, 2661, 2662, 2670, 2656, 2663, 551, 546, 567, 546, 3190, 3181, 3177, 3175, 3180, 1968, 1964, 1964, 1960, 2105, 813, 828, 809, 821, 2974, 2959, 2973, 2973, 2969, 2945, 2972, 2954, 1120, 1070, 1087, 1062, 1120, 1065, 1084, 1120, 1064, 1066, 1083, 2040, 1974, 1959, 1982, 2040, 1959, 1954, 1973, 1979, 1982, 1972, 2040, 1959, 1974, 1955, 1983, 2329, 2332, 2313, 2332, 3029, 3034, 3039, 3030, 3008, 1426, 1439, 1430, 1411, 441, 420, 434, 435, 420, 2823, 490, 507, 494, 498, 630, 615, 629, 629, 625, 617, 628, 610, 1108, 1050, 1035, 1042, 1108, 1053, 1032, 1108, 1047, 1042, 1032, 1039, 850, 796, 781, 788, 850, 781, 776, 799, 785, 788, 798, 850, 781, 796, 777, 789, 3233, 3236, 3249, 3236, 1434, 1430, 1431, 1421, 1436, 1431, 1421, 2779, 2772, 2769, 2776, 2766, 2571, 1926, 1929, 1925, 1933, 654, 668, 652, 437, 976, 976, 976, 2118, 2118, 2118, 463, 750, -28372, -31983, 22281, 31029, 2296, 2295, 2299, 2291, 21830, 20590, 2517, 2511, 2524, 2499, 19877, 26482, 25609, -26664, 784, 789, 768, 785, 3007, 2994, 3003, 2990, 25962, 22647, -24922, 20851, 10920, 488, 506, 490, 10461, 1475, 1474, 1492, 1476, 1096, 1109, 1091, 1090, 1109, 24762, 23975, 26257, 23591, 1941, 1941, 1941, 1598, 1598, 1594, 1569, 1644, 1632, 1634, 724, 754, 740, 755, 684, 704, 742, 740, 751, 757, 2822, 2852, 2865, 2850, 2855, 2855, 2858, 2916, 2942, 2917, 2939, 2923, 2915, 2844, 2850, 2853, 2863, 2852, 2876, 2872, 2923, 2821, 2847, 2923, 2938, 2939, 2917, 2939, 2928, 2923, 2844, 2850, 2853, 2941, 2943, 2928, 2923, 2867, 2941, 2943, 2914, 2923, 2826, 2875, 2875, 2855, 2862, 2844, 2862, 2857, 2816, 2850, 2879, 2916, 2942, 2936, 2940, 2917, 2936, 2941, 2923, 2915, 2816, 2819, 2847, 2822, 2823, 2919, 2923, 2855, 2850, 2848, 2862, 2923, 2828, 2862, 2856, 2848, 2852, 2914, 2923, 2824, 2851, 2873, 2852, 2854, 2862, 2916, 2938, 2937, 2937, 2917, 2939, 2917, 2939, 2917, 2939, 2923, 2840, 2858, 2861, 2858, 2873, 2850, 2916, 2942, 2936, 2940, 2917, 2936, 2941, 980, 983, 991, 978, 963, 966, 981, 965, 920, 981, 985, 987, 653, 668, 659, 723, 671, 668, 660, 665, 648, 723, 670, 658, 656, 1890, 1890, 1890};
    public List a;
    public String b;
    public String c;

    class Job implements Callable<List<m>> {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f1short = {465, 415, 398, 407, 465, 408, 397, 465, 397, 411, 415, 396, 413, 406, 3045, 2987, 3002, 2979, 3045, 3002, 3007, 2984, 2982, 2979, 2985, 3045, 3001, 2991, 2987, 3000, 2985, 2978, 1060, 1057, 1076, 1057, 1824, 1836, 1837, 1847, 1830, 1837, 1847, 1932, 2000, 1990, 1986, 2001, 1984, 1995, 1948, 1985, 1996, 2011, 1950, 3011, 2960, 2967, 2953, 3032, 3011, 2961, 2972, 2965, 2944, 3032, 2963, 2956, 2945, 2944, 2954, 2690, 2715, 2775, 2761, 2775, 2710, 2789, 3002};
        public final a a;
        public final String b;

        public Job(a aVar, String str) {
            this.a = aVar;
            this.b = str;
        }

        /* renamed from: ۟ۤ۟ۤۢ, reason: not valid java name and contains not printable characters */
        public static List m3(Object obj) {
            if (C0026.m4977() <= 0) {
                return ((Job) obj).call2();
            }
            return null;
        }

        /* renamed from: ۟ۤ۠ۥۣ, reason: not valid java name and contains not printable characters */
        public static a m4(Object obj) {
            if (C0000.m1116() <= 0) {
                return ((Job) obj).a;
            }
            return null;
        }

        /* renamed from: ۟ۨۤ۟, reason: not valid java name and contains not printable characters */
        public static AList m5(Object obj) {
            if (C0029.m5282() > 0) {
                return AList.this;
            }
            return null;
        }

        /* renamed from: ۥۦۧۡ, reason: contains not printable characters */
        public static String m6(Object obj) {
            if (C0052.m8320() > 0) {
                return ((Job) obj).b;
            }
            return null;
        }

        /* renamed from: ۧۦ۠ۧ, reason: not valid java name and contains not printable characters */
        public static short[] m7() {
            if (C0042.m7147() <= 0) {
                return f1short;
            }
            return null;
        }

        @Override // java.util.concurrent.Callable
        public /* bridge */ /* synthetic */ List<m> call() {
            return m3(this);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: call, reason: avoid collision after fix types in other method */
        public List<m> call2() {
            List<m> listM1961;
            String strM6 = m6(this);
            a aVarM4 = m4(this);
            AList aListM5 = m5(this);
            try {
                listM1961 = new ArrayList<>();
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0030.m5339(aVarM4));
                C0018.m3933(sb, C0046.m7706(aVarM4) ? C0013.m3106(m7(), 0, 14, 510) : C0038.m6452(m7(), 14, 18, 3018));
                String strM7763 = C0047.m7763(sb);
                String strM7884 = C0048.m7884(aVarM4, strM6);
                C0047.m7777(aListM5);
                String strM1453 = C0003.m1453(aVarM4, strM7763, strM7884, true);
                boolean zM7706 = C0046.m7706(aVarM4);
                String strM8477 = C0053.m8477(m7(), 32, 4, 1088);
                Iterator itM3109 = C0013.m3109(C0013.m3126(C0041.m6770(zM7706 ? C0021.m4333(C0003.m1370(new JSONObject(strM1453), strM8477), C0018.m3917(m7(), 36, 7, 1859)) : C0021.m4333(new JSONObject(strM1453), strM8477))));
                while (C0012.m2962(itM3109)) {
                    c cVar = (c) C0048.m7949(itM3109);
                    if (!C0047.m7768(cVar, C0046.m7706(aVarM4))) {
                        C0004.m1532(listM1961, C0027.m5029(cVar, aVarM4, C0036.m6183(aListM5)));
                    }
                }
            } catch (Exception unused) {
                listM1961 = C0008.m1961();
            }
            if (C0064.m9636(listM1961) <= 0) {
                listM1961 = new ArrayList<>();
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0030.m5339(aVarM4));
                C0018.m3933(sb2, C0055.m8814(m7(), 43, 12, 1955));
                C0018.m3933(sb2, strM6);
                C0018.m3933(sb2, C0012.m2973(m7(), 55, 16, 3045));
                Iterator itM7807 = C0047.m7807(C0030.m5333(C0016.m3577(C0032.m5769(C0047.m7763(sb2), null)), C0016.m3525(m7(), 71, 6, 2807)));
                while (C0012.m2962(itM7807)) {
                    String[] strArrM4752 = C0024.m4752(C0064.m9669((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)), C0027.m5062(m7(), 77, 1, 2758));
                    String str = strArrM4752[0];
                    String strM5362 = C0030.m5362(m7(), 78, 1, 2965);
                    if (C0058.m9127(str, strM5362)) {
                        int iM1279 = C0002.m1279(strArrM4752[0], strM5362);
                        boolean zM4355 = C0021.m4355(C0017.m3692(), C0023.m4587(C0004.m1522(strArrM4752[0])));
                        c cVar2 = new c();
                        C0064.m9602(cVar2, !zM4355 ? 1 : 0);
                        C0008.m2026(cVar2, strArrM4752.length > 3 ? strArrM4752[4] : C0007.m1840());
                        StringBuilder sb3 = new StringBuilder(strM5362);
                        C0018.m3933(sb3, C0054.m8636(strArrM4752[0], 0, iM1279));
                        C0019.m4059(cVar2, C0047.m7763(sb3));
                        C0017.m3634(cVar2, C0056.m8890(strArrM4752[0], iM1279 + 1));
                        C0004.m1532(listM1961, C0027.m5029(cVar2, aVarM4, C0036.m6183(aListM5)));
                    }
                }
            }
            return listM1961;
        }
    }

    public static String e(a aVar, String str, String str2, boolean z) {
        String strM2029 = C0008.m2029(C0045.m7628(str, str2, C0003.m1422(aVar)));
        m2(strM2029);
        if (z && C0058.m9127(strM2029, C0058.m9106(m0(), 0, 22, 409))) {
            try {
                JSONObject jSONObject = new JSONObject();
                C0047.m7743(jSONObject, C0030.m5362(m0(), 22, 8, 1532), C0030.m5421(C0053.m8400(aVar)));
                C0047.m7743(jSONObject, C0014.m3332(m0(), 30, 8, 1078), C0044.m7383(C0053.m8400(aVar)));
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0030.m5339(aVar));
                C0018.m3933(sb, C0017.m3646(m0(), 38, 15, 2569));
                C0034.m6000(aVar, C0001.m1212(C0003.m1370(new JSONObject(C0008.m2029(C0045.m7628(C0047.m7763(sb), C0004.m1539(jSONObject), null))), C0000.m1077(m0(), 53, 4, 579)), C0041.m6779(m0(), 57, 5, 3074)));
                return C0003.m1453(aVar, str, str2, false);
            } catch (Exception e) {
                C0049.m7975(e);
            }
        }
        return strM2029;
    }

    /* renamed from: ۟۟ۡۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m0() {
        if (C0010.m2320() <= 0) {
            return f0short;
        }
        return null;
    }

    /* renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Object m1(Object obj, Object obj2, Object obj3) {
        if (C0000.m1116() < 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۨۨۥۥ, reason: not valid java name and contains not printable characters */
    public static void m2(Object obj) {
        if (C0058.m9131() <= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    public final void a() {
        List listM8872 = C0056.m8872(this);
        if (listM8872 == null || C0035.m6132(listM8872)) {
            if (C0043.m7277(C0057.m8989(this), C0058.m9106(m0(), 62, 4, 2008))) {
                this.c = C0032.m5769(C0057.m8989(this), null);
            }
            a aVar = (a) C0033.m5856(C0057.m8989(this), a.class);
            this.a = C0053.m8393(aVar);
            this.b = C0036.m6195(aVar);
        }
    }

    public final c b(String str) {
        String strM1645 = C0005.m1645(m0(), 66, 1, 2070);
        try {
            String strM8636 = C0058.m9127(str, strM1645) ? C0054.m8636(str, 0, C0059.m9178(str, strM1645)) : str;
            String strM8890 = C0058.m9127(str, strM1645) ? C0056.m8890(str, C0059.m9178(str, strM1645)) : C0007.m1840();
            a aVarM8074 = C0050.m8074(this, strM8636);
            if (!C0043.m7277(strM8890, C0000.m1104(aVarM8074))) {
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0000.m1104(aVarM8074));
                C0018.m3933(sb, strM8890);
                strM8890 = C0047.m7763(sb);
            }
            JSONObject jSONObject = new JSONObject();
            C0047.m7743(jSONObject, C0044.m7509(m0(), 67, 4, 861), strM8890);
            C0047.m7743(jSONObject, C0014.m3332(m0(), 71, 8, 3054), C0023.m4542(aVarM8074, strM8890));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0030.m5339(aVarM8074));
            C0018.m3933(sb2, C0046.m7706(aVarM8074) ? C0050.m8131(m0(), 79, 11, 1103) : C0008.m1970(m0(), 90, 16, 2007));
            String strM1453 = C0003.m1453(aVarM8074, C0047.m7763(sb2), C0004.m1539(jSONObject), true);
            boolean zM7706 = C0046.m7706(aVarM8074);
            String strM1842 = C0007.m1842(m0(), 106, 4, 2429);
            return (c) m1(new Gson(), C0004.m1539(zM7706 ? C0003.m1370(new JSONObject(strM1453), strM1842) : C0018.m3923(C0021.m4333(C0003.m1370(new JSONObject(strM1453), strM1842), C0055.m8814(m0(), 110, 5, 2995)), 0)), c.class);
        } catch (Exception unused) {
            return new c();
        }
    }

    public final a c(String str) {
        List listM8872 = C0056.m8872(this);
        a aVar = (a) C0048.m7915(listM8872, C0013.m3094(listM8872, new a(str)));
        C0057.m8979(aVar);
        return aVar;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C0001.m1139(this);
        String strM7151 = C0042.m7151(m0(), 115, 4, 1510);
        boolean zM9098 = C0058.m9098(map, strM7151);
        String strM1840 = C0007.m1840();
        String str3 = zM9098 ? (String) C0065.m9715(map, strM7151) : strM1840;
        String strM3484 = C0015.m3484(m0(), 119, 5, 470);
        if (C0058.m9098(map, strM3484)) {
            strM1840 = (String) C0065.m9715(map, strM3484);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator itM3109 = C0013.m3109(C0049.m8051(this, str, true));
        while (C0012.m2962(itM3109)) {
            c cVar = (c) C0048.m7949(itM3109);
            if (C0008.m2007(cVar)) {
                C0004.m1532(arrayList, cVar);
            } else {
                C0004.m1532(arrayList2, cVar);
            }
        }
        if (!C0043.m7327(str3) && !C0043.m7327(strM1840)) {
            C0027.m5077(arrayList, new f(0, str3, strM1840));
            C0027.m5077(arrayList2, new f(0, str3, strM1840));
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            C0004.m1532(arrayList3, C0016.m3518((c) C0048.m7949(itM7816), str, C0036.m6183(this)));
        }
        Iterator itM78162 = C0047.m7816(arrayList2);
        while (C0012.m2962(itM78162)) {
            C0004.m1532(arrayList3, C0016.m3518((c) C0048.m7949(itM78162), str, C0036.m6183(this)));
        }
        g gVar = new g();
        C0045.m7632(gVar, arrayList3);
        C0049.m7974(gVar, 1, 1, 0, 1);
        return C0033.m5828(gVar);
    }

    public final List d(String str, boolean z) {
        JSONObject jSONObjectM1370;
        String strM2300;
        String strM4951 = C0026.m4951(m0(), 124, 1, 2856);
        try {
            String strM8636 = C0058.m9127(str, strM4951) ? C0054.m8636(str, 0, C0059.m9178(str, strM4951)) : str;
            String strM8890 = C0058.m9127(str, strM4951) ? C0056.m8890(str, C0059.m9178(str, strM4951)) : C0007.m1840();
            a aVarM8074 = C0050.m8074(this, strM8636);
            if (!C0043.m7277(strM8890, C0000.m1104(aVarM8074))) {
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0000.m1104(aVarM8074));
                C0018.m3933(sb, strM8890);
                strM8890 = C0047.m7763(sb);
            }
            JSONObject jSONObject = new JSONObject();
            C0047.m7743(jSONObject, C0013.m3106(m0(), 125, 4, 410), strM8890);
            C0047.m7743(jSONObject, C0052.m8337(m0(), 129, 8, 518), C0023.m4542(aVarM8074, strM8890));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0030.m5339(aVarM8074));
            C0018.m3933(sb2, C0046.m7706(aVarM8074) ? C0013.m3106(m0(), 137, 12, 1147) : C0022.m4403(m0(), 149, 16, 893));
            String strM1453 = C0003.m1453(aVarM8074, C0047.m7763(sb2), C0004.m1539(jSONObject), true);
            boolean zM7706 = C0046.m7706(aVarM8074);
            String strM5256 = C0029.m5256(m0(), 165, 4, 3269);
            if (zM7706) {
                jSONObjectM1370 = C0003.m1370(new JSONObject(strM1453), strM5256);
                strM2300 = C0055.m8814(m0(), 169, 7, 1529);
            } else {
                jSONObjectM1370 = C0003.m1370(new JSONObject(strM1453), strM5256);
                strM2300 = C0010.m2300(m0(), 176, 5, 2749);
            }
            List listM3126 = C0013.m3126(C0041.m6770(C0021.m4333(jSONObjectM1370, strM2300)));
            Iterator itM3109 = C0013.m3109(listM3126);
            if (z) {
                while (C0012.m2962(itM3109)) {
                    if (C0047.m7768((c) C0048.m7949(itM3109), C0046.m7706(aVarM8074))) {
                        C0005.m1641(itM3109);
                    }
                }
            }
            return listM3126;
        } catch (Exception unused) {
            return C0008.m1961();
        }
    }

    public String detailContent(List<String> list) {
        C0001.m1139(this);
        String str = (String) C0048.m7915(list, 0);
        String strM4536 = C0023.m4536(m0(), 181, 1, 2596);
        String strM8636 = C0058.m9127(str, strM4536) ? C0054.m8636(str, 0, C0059.m9178(str, strM4536)) : str;
        String strM86362 = C0054.m8636(str, 0, C0002.m1279(str, strM4536));
        String strM8890 = C0056.m8890(strM86362, C0002.m1279(strM86362, strM4536) + 1);
        a aVarM8074 = C0050.m8074(this, strM8636);
        List listM8051 = C0049.m8051(this, strM86362, false);
        C0027.m5077(listM8051, new f(0, C0015.m3484(m0(), 182, 4, 2024), C0000.m1077(m0(), 186, 3, 751)));
        m mVar = new m();
        C0054.m8596(mVar, strM8636);
        C0011.m2828(mVar, str);
        C0005.m1628(mVar, strM8890);
        C0026.m4947(mVar, C0036.m6183(this));
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(listM8051);
        while (C0012.m2962(itM3109)) {
            c cVar = (c) C0048.m7949(itM3109);
            if (C0023.m4541(cVar, C0046.m7706(aVarM8074))) {
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0040.m6619(cVar));
                C0018.m3933(sb, C0043.m7290(m0(), 189, 1, 401));
                C0018.m3933(sb, C0008.m1967(cVar, strM86362));
                StringBuilder sb2 = new StringBuilder();
                Iterator itM31092 = C0013.m3109(listM8051);
                while (C0012.m2962(itM31092)) {
                    c cVar2 = (c) C0048.m7949(itM31092);
                    if (C0021.m4355(C0027.m5030(), C0004.m1522(C0040.m6619(cVar2)))) {
                        C0018.m3933(sb2, C0024.m4740(m0(), 190, 3, 942));
                        C0018.m3933(sb2, C0040.m6619(cVar2));
                        String strM4340 = C0021.m4340(m0(), 193, 3, 2054);
                        C0018.m3933(sb2, strM4340);
                        C0018.m3933(sb2, C0004.m1522(C0040.m6619(cVar2)));
                        C0018.m3933(sb2, strM4340);
                        C0018.m3933(sb2, C0008.m1967(cVar2, strM86362));
                    }
                }
                C0018.m3933(sb, C0047.m7763(sb2));
                C0004.m1532(arrayList, C0047.m7763(sb));
            }
        }
        C0044.m7449(mVar, C0036.m6194(C0053.m8477(m0(), 196, 1, 492), arrayList));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        C0001.m1139(this);
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itM3109 = C0013.m3109(C0056.m8872(this));
        while (C0012.m2962(itM3109)) {
            a aVar = (a) C0048.m7949(itM3109);
            if (!C0010.m2318(C0028.m5158(aVar))) {
                C0004.m1532(arrayList, new b(C0018.m3899(aVar), C0018.m3899(aVar), C0040.m6584(m0(), 197, 1, 735)));
            }
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            String strM8377 = C0052.m8377((b) C0048.m7949(itM7816));
            ArrayList arrayList2 = new ArrayList();
            String strM5256 = C0029.m5256(m0(), 198, 2, 2364);
            String strM1840 = C0007.m1840();
            C0004.m1532(arrayList2, new d(C0040.m6584(m0(), 220, 4, 3019), C0041.m6779(m0(), 224, 4, 1784), C0001.m1203(new com.github.catvod.spider.merge.E.c[]{new com.github.catvod.spider.merge.E.c(strM5256, strM1840), new com.github.catvod.spider.merge.E.c(C0043.m7290(m0(), 200, 2, 772), C0005.m1645(m0(), 202, 4, 2198)), new com.github.catvod.spider.merge.E.c(C0055.m8814(m0(), 206, 2, 3169), C0007.m1842(m0(), 208, 4, 2470)), new com.github.catvod.spider.merge.E.c(C0065.m9775(m0(), 212, 4, 587), C0013.m3106(m0(), 216, 4, 884))})));
            C0004.m1532(arrayList2, new d(C0002.m1305(m0(), 237, 5, 1063), C0049.m8007(m0(), 242, 4, 808), C0001.m1203(new com.github.catvod.spider.merge.E.c[]{new com.github.catvod.spider.merge.E.c(strM5256, strM1840), new com.github.catvod.spider.merge.E.c(C0048.m7902(m0(), 228, 1, 430), C0058.m9106(m0(), 229, 3, 393)), new com.github.catvod.spider.merge.E.c(C0020.m4199(m0(), 232, 1, 986), C0052.m8337(m0(), 233, 4, 1447))})));
            C0037.m6362(linkedHashMap, strM8377, arrayList2);
        }
        return C0015.m3468(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            this.c = str;
            C0001.m1139(this);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String playerContent(java.lang.String r59, java.lang.String r60, java.util.List<java.lang.String> r61) {
        /*
            r58 = this;
            r10 = r61
            r9 = r60
            r8 = r59
            r7 = r58
            short[] r45 = m0()
            r48 = 2027(0x7eb, float:2.84E-42)
            r46 = 246(0xf6, float:3.45E-43)
            r47 = 3
            java.lang.String r45 = com.github.catvod.spider.p000mergexbpq.x.C0016.m3525(r45, r46, r47, r48)
            r8 = r45
            java.lang.String[] r8 = com.github.catvod.spider.merge.P0.C0024.m4752(r9, r8)
            r9 = 0
            r10 = r8[r9]
            com.github.catvod.spider.merge.G.c r10 = com.github.catvod.spider.p000mergexbpq.c0.C0010.m2390(r7, r10)
            java.lang.String r10 = com.github.catvod.spider.merge.f0.C0052.m8359(r10)
            com.github.catvod.spider.merge.E.g r0 = new com.github.catvod.spider.merge.E.g
            r0.<init>()
            com.github.catvod.spider.merge.C.C0017.m3667(r0, r10)
            android.net.Uri r10 = com.github.catvod.spider.merge.K0.C0022.m4422(r10)     // Catch: java.lang.Exception -> Lb3
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Exception -> Lb3
            r1.<init>()     // Catch: java.lang.Exception -> Lb3
            java.lang.String r2 = com.github.catvod.spider.merge.d0.C0048.m7889(r10)     // Catch: java.lang.Exception -> Lb3
            short[] r40 = m0()     // Catch: java.lang.Exception -> Lb3
            r43 = 1551(0x60f, float:2.173E-42)
            r41 = 249(0xf9, float:3.49E-43)
            r42 = 7
            java.lang.String r40 = com.github.catvod.spider.merge.Y.C0036.m6188(r40, r41, r42, r43)     // Catch: java.lang.Exception -> Lb3
            r3 = r40
            boolean r2 = com.github.catvod.spider.merge.q.C0058.m9127(r2, r3)     // Catch: java.lang.Exception -> Lb3
            short[] r42 = m0()
            r45 = 641(0x281, float:8.98E-43)
            r43 = 256(0x100, float:3.59E-43)
            r44 = 10
            java.lang.String r42 = com.github.catvod.spider.merge.S0.C0029.m5256(r42, r43, r44, r45)
            r3 = r42
            if (r2 == 0) goto L82
            short[] r42 = m0()     // Catch: java.lang.Exception -> Lb3
            r45 = 2891(0xb4b, float:4.051E-42)
            r43 = 266(0x10a, float:3.73E-43)
            r44 = 111(0x6f, float:1.56E-43)
            java.lang.String r42 = com.github.catvod.spider.merge.d1.C0049.m8007(r42, r43, r44, r45)     // Catch: java.lang.Exception -> Lb3
            r10 = r42
        L7e:
            com.github.catvod.spider.merge.f1.C0053.m8424(r1, r3, r10)     // Catch: java.lang.Exception -> Lb3
            goto Lb8
        L82:
            java.lang.String r10 = com.github.catvod.spider.merge.d0.C0048.m7889(r10)     // Catch: java.lang.Exception -> Lb3
            short[] r24 = m0()     // Catch: java.lang.Exception -> Lb3
            r27 = 950(0x3b6, float:1.331E-42)
            r25 = 377(0x179, float:5.28E-43)
            r26 = 12
            java.lang.String r24 = com.github.catvod.spider.merge.c1.C0046.m7718(r24, r25, r26, r27)     // Catch: java.lang.Exception -> Lb3
            r2 = r24
            boolean r10 = com.github.catvod.spider.merge.q.C0058.m9127(r10, r2)     // Catch: java.lang.Exception -> Lb3
            if (r10 == 0) goto Lb8
            short[] r42 = m0()     // Catch: java.lang.Exception -> Lb3
            r45 = 765(0x2fd, float:1.072E-42)
            r43 = 389(0x185, float:5.45E-43)
            r44 = 13
            java.lang.String r42 = com.github.catvod.spider.merge.r0.C0060.m9352(r42, r43, r44, r45)     // Catch: java.lang.Exception -> Lb3
            r10 = r42
            goto L7e
        Lb3:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        Lb8:
            com.github.catvod.spider.merge.p.C0057.m9029(r0, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r1 = r8.length
            r2 = 0
        Lc2:
            if (r2 >= r1) goto L108
            r3 = r8[r2]
            short[] r21 = m0()
            r24 = 1826(0x722, float:2.559E-42)
            r22 = 402(0x192, float:5.63E-43)
            r23 = 3
            java.lang.String r21 = com.github.catvod.spider.p000mergexbpq.Q.C0000.m1077(r21, r22, r23, r24)
            r4 = r21
            boolean r5 = com.github.catvod.spider.merge.q.C0058.m9127(r3, r4)
            if (r5 != 0) goto Le0
            goto L105
        Le0:
            java.lang.String[] r3 = com.github.catvod.spider.merge.P0.C0024.m4752(r3, r4)
            r4 = r3[r9]
            r5 = 1
            r5 = r3[r5]
            r6 = 2
            r3 = r3[r6]
            com.github.catvod.spider.merge.G.c r3 = com.github.catvod.spider.p000mergexbpq.c0.C0010.m2390(r7, r3)
            java.lang.String r3 = com.github.catvod.spider.merge.f0.C0052.m8359(r3)
            com.github.catvod.spider.merge.E.h r6 = new com.github.catvod.spider.merge.E.h
            r6.<init>()
            com.github.catvod.spider.merge.I0.C0020.m4249(r6, r4)
            com.github.catvod.spider.merge.Y.C0036.m6229(r6, r5)
            com.github.catvod.spider.p000mergexbpq.i.C0012.m3013(r6, r3)
            com.github.catvod.spider.p000mergexbpq.S.C0004.m1532(r10, r6)
        L105:
            int r2 = r2 + 1
            goto Lc2
        L108:
            com.github.catvod.spider.merge.Q0.C0025.m4788(r0, r10)
            java.lang.String r8 = com.github.catvod.spider.merge.V.C0033.m5828(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.AList.playerContent(java.lang.String, java.lang.String, java.util.List):java.lang.String");
    }

    public String searchContent(String str, boolean z) {
        C0001.m1139(this);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ExecutorService executorServiceM9330 = C0060.m9330();
        Iterator itM3109 = C0013.m3109(C0056.m8872(this));
        while (C0012.m2962(itM3109)) {
            a aVar = (a) C0048.m7949(itM3109);
            if (C0010.m2318(C0062.m9400(aVar))) {
                C0057.m8979(aVar);
                C0004.m1532(arrayList2, new Job(aVar, str));
            }
        }
        Iterator itM31092 = C0013.m3109(C0016.m3549(executorServiceM9330, arrayList2, 15L, C0050.m8151()));
        while (C0012.m2962(itM31092)) {
            C0034.m6012(arrayList, (Collection) C0002.m1288((Future) C0048.m7949(itM31092)));
        }
        return C0047.m7783(arrayList);
    }
}