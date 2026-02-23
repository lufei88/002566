package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f698short = {3240, 3257, 3257, 3237, 3232, 3242, 3240, 3261, 3232, 3238, 3239, 3302, 3249, 3300, 3262, 3262, 3262, 3300, 3247, 3238, 3259, 3236, 3300, 3260, 3259, 3237, 3244, 3239, 3242, 3238, 3245, 3244, 3245, 2786, 2756, 2770, 2757, 2714, 2806, 2768, 2770, 2777, 2755, 493, 463, 474, 457, 460, 460, 449, 399, 405, 398, 400, 384, 392, 503, 457, 462, 452, 463, 471, 467, 384, 494, 500, 384, 401, 400, 398, 400, 411, 384, 503, 457, 462, 406, 404, 411, 384, 472, 406, 404, 393, 384, 481, 464, 464, 460, 453, 503, 453, 450, 491, 457, 468, 399, 405, 403, 407, 398, 403, 406, 384, 392, 491, 488, 500, 493, 492, 396, 384, 460, 457, 459, 453, 384, 487, 453, 451, 459, 463, 393, 384, 483, 456, 466, 463, 461, 453, 399, 409, 408, 398, 400, 398, 404, 407, 405, 408, 398, 401, 403, 409, 384, 499, 449, 454, 449, 466, 457, 399, 405, 403, 407, 398, 403, 406, 481, 508, 487, 489, 487, 480, 1833, 1845, 1845, 1841, 1915, 1902, 1902, 1835, 1849, 1903, 1824, 1827, 1841, 1837, 1824, 1848, 1828, 1843, 1903, 1845, 1838, 1841, 2492, 2480, 2480, 2484, 2486, 2490, 2611, 2610, 2610, 2623, 2622, 2617, 2617, 2616, 2611, 2611, 2616, 2618, 2611, 2610, 2610, 2623, 1047, 1057, 1072, 1129, 1031, 1067, 1067, 1071, 1069, 1057, 1150, 1048, 1079, 1134, 1132, 1055, 1050, 1048, 1078, 1048, 1066, 1049, 1134, 1133, 2501, 2537, 2546, 1208, 1182, 1160, 1183, 1216, 1196, 1162, 1160, 1155, 1177, 3085, 3119, 3130, 3113, 3116, 3116, 3105, 3183, 3189, 3182, 3184, 3168, 3176, 3095, 3113, 3118, 3108, 3119, 3127, 3123, 3168, 3086, 3092, 3168, 3185, 3184, 3182, 3184, 3195, 3168, 3095, 3113, 3118, 3190, 3188, 3195, 3168, 3128, 3190, 3188, 3177, 3168, 3073, 3120, 3120, 3116, 3109, 3095, 3109, 3106, 3083, 3113, 3124, 3183, 3189, 3187, 3191, 3182, 3187, 3190, 3168, 3176, 3083, 3080, 3092, 3085, 3084, 3180, 3168, 3116, 3113, 3115, 3109, 3168, 3079, 3109, 3107, 3115, 3119, 3177, 3168, 3075, 3112, 3122, 3119, 3117, 3109, 3183, 3185, 3187, 3190, 3182, 3184, 3182, 3184, 3182, 3184, 3168, 3091, 3105, 3110, 3105, 3122, 3113, 3183, 3189, 3187, 3191, 3182, 3187, 3190, 2652, 2686, 2686, 2680, 2669, 2665, 2608, 2648, 2675, 2686, 2674, 2681, 2676, 2675, 2682, 1505, 1508, 1508, 1491, 1525, 1520, 1520, 1522, 1509, 1523, 1523, 1509, 1508, 1689, 1780, 1730, 1747, 1674, 1764, 1736, 1736, 1740, 1742, 1730, 3180, 3190};

    public static String a(String str, String str2, String str3) {
        return m6709(m6703(m6708(m6705(new OkHttpClient(), m6710(m6704(m6701(m6707(new Request.Builder(), str), m6706(m6711(C0011.m2805(m6702(), 0, 33, 3273)), str2)), C0010.m2300(m6702(), 33, 10, 2743), C0018.m3917(m6702(), 43, 115, 416)), C0047.m7833(m6702(), 158, 6, 398), C0017.m3646(m6702(), 164, 22, 1857), C0024.m4740(m6702(), 186, 6, 2527), str3)))));
    }

    public static String b(String str) {
        String strM1840 = C0007.m1840();
        if (str != null && !C0057.m8953(str)) {
            try {
                String strM8259 = C0051.m8259(m6702(), 192, 16, 2570);
                byte[] bArrM1882 = C0007.m1882(str);
                int length = bArrM1882.length;
                byte[] bArr = new byte[length];
                for (int i = 0; i < bArrM1882.length; i++) {
                    bArr[i] = (byte) (bArrM1882[i] ^ C0007.m1823(strM8259, i % 16));
                }
                com.github.catvod.spider.merge.K0.a aVar = new com.github.catvod.spider.merge.K0.a();
                if (length != 0) {
                    com.github.catvod.spider.merge.K0.b bVar = new com.github.catvod.spider.merge.K0.b();
                    C0015.m3473(aVar, bArr, length, bVar);
                    C0015.m3473(aVar, bArr, -1, bVar);
                    int iM6547 = C0039.m6547(bVar);
                    bArr = new byte[iM6547];
                    C0029.m5246(bArr, iM6547, bVar);
                }
                return new String(bArr, C0034.m5989());
            } catch (Exception unused) {
            }
        }
        return strM1840;
    }

    public static String c(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcherM6026 = C0034.m6026(C0026.m4930(C0020.m4199(m6702(), 208, 24, 1092), 2), str);
        while (C0003.m1405(matcherM6026)) {
            String strM4306 = C0021.m4306(matcherM6026, 1);
            String strM2037 = C0009.m2037(m6702(), 232, 1, 2558);
            if (C0058.m9127(strM4306, strM2037)) {
                strM4306 = C0054.m8636(strM4306, 0, C0059.m9178(strM4306, strM2037));
            }
            C0004.m1532(arrayList, C0064.m9640(strM4306));
        }
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0041.m6779(m6702(), 233, 2, 2514));
            }
        }
        return C0047.m7763(sb);
    }

    public static String d(String str) throws IOException {
        int i = 0;
        HttpURLConnection httpURLConnection = (HttpURLConnection) C0018.m3955(new URL(str));
        C0046.m7664(httpURLConnection, 30000);
        C0017.m3641(httpURLConnection, C0022.m4403(m6702(), 235, 10, 1261), C0013.m3106(m6702(), 245, 111, 3136));
        C0017.m3641(httpURLConnection, C0064.m9599(m6702(), 356, 15, 2589), C0007.m1840());
        String strM3106 = C0013.m3106(m6702(), 371, 13, 1408);
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C0057.m9040(httpURLConnection), C0034.m5989()));
        while (true) {
            try {
                String strM4438 = C0022.m4438(bufferedReader);
                if (strM4438 == null) {
                    break;
                }
                C0018.m3933(sb, C0064.m9640(strM4438));
            } catch (Throwable th) {
                try {
                    C0057.m8961(bufferedReader);
                } catch (Throwable th2) {
                    try {
                        C0052.m8352(C0057.m8970(Throwable.class, strM3106, new Class[]{Throwable.class}), th, new Object[]{th2});
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        }
        C0057.m8961(bufferedReader);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, C0047.m7763(sb));
        String strM9775 = C0065.m9775(m6702(), 384, 1, 1683);
        C0018.m3933(sb2, strM9775);
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            String strM5780 = C0032.m5780(httpURLConnection, i);
            String strM4314 = C0021.m4314(httpURLConnection, i);
            if (strM5780 == null && strM4314 == null) {
                C0018.m3933(sb2, C0047.m7763(sb3));
                return C0047.m7763(sb2);
            }
            if (C0000.m1057(C0009.m2037(m6702(), 385, 10, 1703), strM5780)) {
                C0011.m2747(sb3, strM5780, C0056.m8911(m6702(), 395, 2, 3158), strM4314, strM9775);
            }
            i++;
        }
    }

    /* renamed from: ۟ۡۦۣۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6701(Object obj, Object obj2) {
        if (C0026.m4977() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6702() {
        if (C0040.m6582() >= 0) {
            return f698short;
        }
        return null;
    }

    /* renamed from: ۢۢ۠, reason: not valid java name and contains not printable characters */
    public static ResponseBody m6703(Object obj) {
        if (C0038.m6471() > 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۣۡ۠, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6704(Object obj, Object obj2, Object obj3) {
        if (C0054.m8557() < 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۤۤۥۤ, reason: not valid java name and contains not printable characters */
    public static Call m6705(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۤۨۡۤ, reason: not valid java name and contains not printable characters */
    public static RequestBody m6706(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۡۤ, reason: contains not printable characters */
    public static Request.Builder m6707(Object obj, Object obj2) {
        if (C0004.m1557() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۥۦ, reason: contains not printable characters */
    public static Response m6708(Object obj) {
        if (C0053.m8389() > 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۦۧۦۦ, reason: contains not printable characters */
    public static String m6709(Object obj) {
        if (C0012.m3024() > 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۣۨۨ, reason: not valid java name and contains not printable characters */
    public static Request m6710(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0062.m9429() > 0) {
            return com.github.catvod.spider.merge.B0.a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۨۥۧ۠, reason: not valid java name and contains not printable characters */
    public static MediaType m6711(Object obj) {
        if (C0010.m2320() <= 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }
}