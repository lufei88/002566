package com.github.catvod.spider.merge.d0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
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
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f766short = {2912, 2939, 2934, 2919, 2929, 2910, 2929, 2857, 2858, 2910, 2918, 2857, 2859, 2863, 2858, 2910, 2918, 2857, 2859, 2861, 2858, 2910, 2918, 2857, 2859, 286, 261, 264, 281, 271, 321, 340, 288, 280, 343, 341, 337, 340, 288, 280, 342, 341, 2924, 2923, 2935, 2928, 1689, 1674, 1669, 1676, 1678, 1275, 1256, 1255, 1262, 1260, 1555, 1553, 1553, 1559, 1538, 1542, 1631, 1559, 1564, 1553, 1565, 1558, 1563, 1564, 1557, 3172, 3171, 3199, 3192, 1997, 2046, 2033, 2040, 2042, 813, 822, 827, 810, 828, 882, 874, 811, 866, 874, 811, 668, 702, 702, 696, 685, 681, 752, 664, 691, 702, 690, 697, 692, 691, 698, 1729, 1740, 1741, 1734, 1756, 1729, 1756, 1745, 1533, 1489, 1488, 1482, 1499, 1488, 1482, 1427, 1516, 1503, 1488, 1497, 1499, 690, 673, 686, 679, 677, 736, 685, 681, 691, 685, 673, 692, 675, 680, 762, 736, 695, 673, 686, 692, 736, 741, 676, 749, 741, 676, 748, 736, 679, 687, 692, 736, 741, 676, 749, 741, 676, 1797, 1822, 1817, 1796, 1794, 1878, 1796, 1811, 1815, 1810, 1868, 1878, 1809, 1817, 1794, 1878, 2613, 2617, 2670, 2680, 2679, 2669, 2617, 963, 991, 991, 987, 939, 798, 818, 819, 809, 824, 819, 809, 880, 777, 804, 813, 824, 1166, 1181, 1170, 1179, 1177, 2189, 2191, 2191, 2185, 2204, 2200, 2241, 2185, 2178, 2191, 2179, 2184, 2181, 2178, 2187, 1454, 1449, 1461, 1458, 789, 782, 771, 786, 772, 842, 839, 858, 850, 787, 1071, 1052, 1043, 1050, 1048, 593, 627, 627, 629, 608, 612, 573, 597, 638, 627, 639, 628, 633, 638, 631, 1123, 1134, 1135, 1124, 1150, 1123, 1150, 1139, 1152, 1169, 1169, 1165, 1160, 1154, 1152, 1173, 1160, 1166, 1167, 1230, 1166, 1154, 1173, 1156, 1173, 1228, 1170, 1173, 1171, 1156, 1152, 1164, 1207, 1179, 1178, 1152, 1169, 1178, 1152, 1241, 1190, 1173, 1178, 1171, 1169, 1120, 1100, 1101, 1111, 1094, 1101, 1111, 1038, 1135, 1094, 1101, 1092, 1111, 1099, 1538, 1577, 1585, 1576, 1578, 1577, 1575, 1570, 1547, 1554, 1638, 1570, 1571, 1586, 1571, 1573, 1586, 1571, 1570, 1638, 1558, 1544, 1537, 1638, 1568, 1575, 1581, 1571, 1638, 1582, 1571, 1575, 1570, 1571, 1588, 1642, 1638, 1568, 1575, 1581, 1571, 1545, 1568, 1568, 1589, 1571, 1586, 1659, 1662, 1167, 1197, 1197, 1195, 1214, 1210, 1251, 1180, 1199, 1184, 1193, 1195, 1213, 1015, 1004, 993, 1008, 998, 2294, 2285, 2272, 2289, 2279, 2228, 2225, 2288, 2233, 2225, 2288, 2235, 2225, 2288, 3198, 3157, 3149, 3156, 3158, 3157, 3163, 3166, 3191, 3182, 3095, 3145, 3161, 3154, 3167, 3166, 3151, 3158, 3167, 3144, 864, 843, 851, 842, 840, 843, 837, 832, 873, 880, 777, 851, 854, 845, 848, 833, 854, 2480, 2459, 2435, 2458, 2456, 2459, 2453, 2448, 2489, 2464, 2521, 2439, 2432, 2453, 2456, 2456, 3067, 3068, 3044, 3059, 3070, 3067, 3062, 2994, 3060, 3067, 3070, 3063, 2994, 3041, 3067, 3048, 3063, 2994, 3059, 3060, 3046, 3063, 3040, 2994, 3060, 3059, 3065, 3063, 2994, 3066, 3063, 3059, 3062, 3063, 3040, 2994, 3059, 3062, 3064, 3047, 3041, 3046, 3071, 3063, 3068, 3046, 792, 794, 789, 789, 788, 783, 859, 799, 798, 783, 798, 777, 790, 786, 789, 798, 859, 797, 786, 791, 798, 859, 776, 786, 769, 798, 2141, 2166, 2158, 2167, 2165, 2166, 2168, 2173, 2132, 2125, 2105, 2170, 2161, 2156, 2167, 2162, 2105, 2154, 2172, 2152, 2084, 1868, 1816, 1797, 1793, 1801, 1795, 1817, 1816, 1868, 1860, 1886, 1884, 1823, 1861};
    public static final Pattern t = C0005.m1602(C0030.m5362(m7872(), 0, 25, 2818));
    public static final Pattern u = C0005.m1602(C0038.m6452(m7872(), 25, 17, 380));
    public static final byte[] v = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static volatile OkHttpClient w;
    public final String a;
    public final int c;
    public long d;
    public final long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public volatile long k;
    public volatile long n;
    public ExecutorService r;
    public volatile long l = -1;
    public volatile boolean m = true;
    public final ReentrantLock o = new ReentrantLock();
    public final ConcurrentHashMap p = new ConcurrentHashMap();
    public final Object q = new Object();
    public final List s = C0044.m7507(new ArrayList());
    public final int e = C0008.m1965(16, 4);
    public final HashMap b = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(java.lang.String r60, java.util.Map r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.d.<init>(java.lang.String, java.util.Map, int, int):void");
    }

    /* renamed from: ۟۟۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7856(Object obj, long j, Object obj2) {
        if (C0059.m9257() <= 0) {
            return ((OkHttpClient.Builder) obj).writeTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۟۠ۥۧ۠, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7857(Object obj, Object obj2) {
        if (C0014.m3353() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Request m7858(Object obj) {
        if (C0059.m9257() < 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۢ۠ۦۧ, reason: not valid java name and contains not printable characters */
    public static void m7859(Object obj) {
        if (C0011.m2755() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣ۟۟ۨ, reason: not valid java name and contains not printable characters */
    public static int m7860(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۣ۟۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7861(Object obj, Object obj2) {
        if (C0002.m1242() >= 0) {
            return ((OkHttpClient.Builder) obj).connectionPool((ConnectionPool) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۥۡۤ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m7862(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۟ۥۨۡۥ, reason: not valid java name and contains not printable characters */
    public static Call m7863(Object obj, Object obj2) {
        if (C0030.m5375() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۣۥۤ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m7864(Object obj, Object obj2, Object obj3) {
        if (C0014.m3353() <= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۣۥ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7865(Object obj, boolean z) {
        if (C0056.m8886() < 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۟ۦۥۣۨ, reason: not valid java name and contains not printable characters */
    public static void m7866(Object obj) {
        if (C0015.m3433() > 0) {
            ((Response) obj).close();
        }
    }

    /* renamed from: ۟ۧۤۡۤ, reason: not valid java name and contains not printable characters */
    public static String m7867(Object obj, Object obj2) {
        if (C0048.m7971() >= 0) {
            return ((Response) obj).header((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۤۥۦ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m7868(Object obj) {
        if (C0006.m1726() < 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Response m7869(Object obj) {
        if (C0056.m8886() < 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۣۣ۠ۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7870(Object obj, long j, Object obj2) {
        if (C0049.m8038() <= 0) {
            return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۤۡۥ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m7871(Object obj, long j, Object obj2) {
        if (C0022.m4497() > 0) {
            return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static short[] m7872() {
        if (C0056.m8886() <= 0) {
            return f766short;
        }
        return null;
    }

    /* renamed from: ۥۦۦۧ, reason: contains not printable characters */
    public static OkHttpClient.Builder m7873(Object obj, boolean z) {
        if (C0034.m6048() <= 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۧ۟ۤۤ, reason: not valid java name and contains not printable characters */
    public static String m7874(Object obj, Object obj2, Object obj3) {
        if (C0029.m5282() >= 0) {
            return ((Response) obj).header((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۧ۠ۧۦ, reason: not valid java name and contains not printable characters */
    public static void m7875(Object obj) {
        if (C0049.m8038() <= 0) {
            ((Call) obj).cancel();
        }
    }

    /* renamed from: ۣۨ۟۟, reason: not valid java name and contains not printable characters */
    public static byte[] m7876(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((ResponseBody) obj).bytes();
        }
        return null;
    }

    public final void a() {
        this.m = false;
        try {
            Iterator itM7816 = C0047.m7816(new ArrayList(C0030.m5329(this)));
            while (C0012.m2962(itM7816)) {
                try {
                    m7875((Call) C0048.m7949(itM7816));
                } catch (Exception unused) {
                }
            }
            C0022.m4479(C0030.m5329(this));
        } catch (Exception unused2) {
        }
        ExecutorService executorServiceM3360 = C0014.m3360(this);
        if (executorServiceM3360 != null) {
            try {
                C0009.m2093(executorServiceM3360);
            } catch (Exception unused3) {
            }
        }
        synchronized (C0033.m5782(this)) {
            C0041.m6778(C0033.m5782(this));
        }
    }

    public final byte[] b(long j, long j2) {
        String strM7867;
        long jM4024 = C0019.m4024(this);
        long j3 = j + jM4024;
        long j4 = j2 + jM4024;
        long j5 = (j2 - j) + 1;
        Request.Builder builderM7857 = m7857(new Request.Builder(), C0016.m3612(this));
        Iterator itM5199 = C0029.m5199(C0043.m7267(C0041.m6753(this)));
        while (C0012.m2962(itM5199)) {
            Map.Entry entry = (Map.Entry) C0048.m7949(itM5199);
            String strM4587 = C0023.m4587((String) C0045.m7624(entry));
            if (!C0007.m1815(C0043.m7290(m7872(), 51, 5, 1161), strM4587) && !C0007.m1815(C0030.m5362(m7872(), 56, 15, 1650), strM4587) && !C0007.m1815(C0048.m7902(m7872(), 71, 4, 3084), strM4587)) {
                m7864(builderM7857, (String) C0045.m7624(entry), (String) C0039.m6540(entry));
            }
        }
        m7864(builderM7857, C0000.m1077(m7872(), 75, 5, 1951), C0002.m1327(C0044.m7509(m7872(), 80, 11, 847), new Object[]{C0004.m1568(j3), C0004.m1568(j4)}));
        m7864(builderM7857, C0005.m1645(m7872(), 91, 15, 733), C0049.m8007(m7872(), 106, 8, 1704));
        if (C0043.m7365() == null) {
            synchronized (d.class) {
                try {
                    if (C0043.m7365() == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        TimeUnit timeUnitM8151 = C0050.m8151();
                        w = m7868(m7861(m7865(m7873(m7856(m7871(m7870(builder, 15L, timeUnitM8151), 0L, timeUnitM8151), 0L, timeUnitM8151), true), true), new ConnectionPool(32, 5L, C0015.m3488())));
                    }
                } finally {
                }
            }
        }
        Call callM7863 = m7863(C0043.m7365(), m7858(builderM7857));
        C0063.m9550(C0030.m5329(this), callM7863);
        try {
            Response responseM7869 = m7869(callM7863);
            try {
                int iM7860 = m7860(responseM7869);
                if (iM7860 < 200 || iM7860 > 206) {
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0065.m9775(m7872(), 187, 5, 907));
                    C0036.m6177(sb, iM7860);
                    throw new IOException(C0047.m7763(sb));
                }
                if (iM7860 == 206 && (strM7867 = m7867(responseM7869, C0058.m9106(m7872(), 114, 13, 1470))) != null) {
                    Matcher matcherM6026 = C0034.m6026(C0058.m9092(), strM7867);
                    if (C0003.m1405(matcherM6026)) {
                        long jM2023 = C0008.m2023(C0021.m4306(matcherM6026, 1));
                        long jM20232 = C0008.m2023(C0021.m4306(matcherM6026, 2));
                        if (jM2023 != j3 || jM20232 != j4) {
                            throw new IOException(C0002.m1327(C0010.m2300(m7872(), 127, 37, 704), new Object[]{C0004.m1568(j3), C0004.m1568(j4), C0004.m1568(jM2023), C0004.m1568(jM20232)}));
                        }
                    }
                }
                byte[] bArrM7876 = m7862(responseM7869) != null ? m7876(m7862(responseM7869)) : null;
                if (bArrM7876 != null && bArrM7876.length >= j5) {
                    m7866(responseM7869);
                    return bArrM7876;
                }
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0023.m4536(m7872(), 164, 16, 1910));
                C0036.m6177(sb2, bArrM7876 != null ? bArrM7876.length : 0);
                C0018.m3933(sb2, C0031.m5565(m7872(), 180, 7, 2585));
                C0058.m9141(sb2, j5);
                throw new IOException(C0047.m7763(sb2));
            } catch (Throwable th) {
                m7866(responseM7869);
                throw th;
            }
        } finally {
            C0036.m6212(C0030.m5329(this), callM7863);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c2 A[Catch: all -> 0x0196, TRY_ENTER, TryCatch #2 {all -> 0x0196, blocks: (B:14:0x0145, B:17:0x0179, B:19:0x017f, B:21:0x018d, B:28:0x01b2, B:30:0x01b8, B:35:0x01c2, B:37:0x01ca, B:41:0x01d9, B:46:0x01e3, B:48:0x01ea, B:51:0x01f1, B:52:0x01f5, B:55:0x0214, B:58:0x0219, B:60:0x021c), top: B:121:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object[] c() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1069
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d0.d.c():java.lang.Object[]");
    }

    public final byte[] d(long j) {
        long jM2099 = C0009.m2099() + 20000;
        while (C0035.m6125(this)) {
            byte[] bArr = (byte[]) C0040.m6664(C0022.m4440(this), C0004.m1568(j));
            if (bArr != null) {
                return bArr;
            }
            long jM20992 = jM2099 - C0009.m2099();
            if (jM20992 <= 0) {
                StringBuilder sb = new StringBuilder(C0024.m4740(m7872(), 523, 21, 2073));
                C0058.m9141(sb, j);
                C0018.m3933(sb, C0052.m8337(m7872(), 544, 14, 1900));
                m7859(C0047.m7763(sb));
                C0022.m4402(this);
                return null;
            }
            synchronized (C0033.m5782(this)) {
                try {
                    try {
                        C0050.m8136(C0033.m5782(this), C0027.m5037(jM20992, 500L));
                    } catch (InterruptedException unused) {
                        return null;
                    }
                } finally {
                }
            }
        }
        return null;
    }
}