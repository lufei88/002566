package com.github.catvod.spider.merge.f;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.a1.k;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.i0.InterfaceFutureC0346a;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.github.catvod.spider.merge.f.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0296g implements InterfaceFutureC0346a {
    public static final boolean d;
    public static final Logger e;
    public static final k f;
    public static final Object g;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f784short = {3057, 2762, 867, 881, 869, 882, 869, 810, 871, 875, 874, 871, 881, 886, 886, 865, 874, 880, 810, 867, 865, 874, 865, 886, 869, 880, 865, 859, 871, 869, 874, 871, 865, 872, 872, 869, 880, 877, 875, 874, 859, 871, 869, 881, 887, 865, 479, 472, 469, 458, 476, 2624, 2325, 2343, 2336, 2339, 2311, 2354, 2345, 2347, 2351, 2341, 2318, 2339, 2346, 2358, 2339, 2356, 2406, 2351, 2357, 2406, 2340, 2356, 2345, 2349, 2339, 2344, 2407, 2287, 2248, 2259, 2249, 2260, 2256, 2264, 2296, 2245, 2270, 2264, 2253, 2249, 2260, 2258, 2259, 2205, 2250, 2261, 2260, 2257, 2264, 2205, 2264, 2245, 2264, 2270, 2248, 2249, 2260, 2259, 2266, 2205, 2255, 2248, 2259, 2259, 2268, 2271, 2257, 2264, 2205, 2839, 2880, 2910, 2883, 2911, 2839, 2898, 2895, 2898, 2900, 2882, 2883, 2904, 2885, 2839, 1820, 1833, 1851, 1827, 1896, 1855, 1833, 1851, 1896, 1835, 1833, 1830, 1835, 1837, 1828, 1828, 1837, 1836, 1894, 752, 2919, 2913, 2935, 2935, 2929, 2919, 2919, 2840, 2836, 2886, 2897, 2887, 2881, 2904, 2880, 2825, 2927, 2278, 2298, 2299, 2273, 2226, 2292, 2279, 2278, 2279, 2272, 2295, 2784, 2811, 2814, 2811, 2810, 2786, 2811, 2713, 2709, 2774, 2772, 2752, 2758, 2768, 2696, 2798, 988, 904, 916, 910, 915, 907, 914, 988, 922, 910, 915, 913, 988, 923, 921, 904, 980, 981, 929, 1023, 1021, 1010, 1023, 1017, 1008, 1008, 1017, 1016, 1219, 1220, 1228, 1225, 1232, 1239, 1216, 1193, 1189, 1254, 1252, 1264, 1270, 1248, 1208, 1246, 2626, 2673, 2672, 2673, 2678, 2657, 2602, 2663, 2661, 2666, 2663, 2657, 2664, 2604, 2605, 2596, 2675, 2661, 2679, 2596, 2663, 2661, 2664, 2664, 2657, 2656, 2602, 481, 471, 479, 450, 467, 466, 406, 2164, 2581, 2589, 2629, 2649, 2624, 2630, 2581, 2516, 1299, 1373, 1362, 1373, 1372, 1344, 1366, 1360, 1372, 1373, 1367, 1344, 1299, 3162, 3163, 3154, 3167, 3143, 3095, 2578, 2640, 2631, 2630, 2578, 2644, 2631, 2630, 2631, 2624, 2647, 2578, 2641, 2653, 2655, 2626, 2654, 2647, 2630, 2647, 2646, 2578, 2643, 2625, 2578, 2630, 2651, 2655, 2647, 2653, 2631, 2630, 2578, 2647, 2634, 2626, 2651, 2624, 2647, 2646, 3147, 3085, 3076, 3097, 3147, 1518, 1478, 1473, 1492, 1473, 1472, 1478, 1416, 1846, 3021, 3023, 3008, 3021, 3019, 3010, 3010, 3019, 3018, 3005, 2986, 2978, 2990, 2982, 2977, 2982, 2977, 2984, 3055, 2987, 2986, 2979, 2990, 2998, 3058, 2964, 1709, 1760, 1790, 1744, 2864, 2829, 2838, 2832, 2821, 2817, 2844, 2842, 2843, 2901, 2817, 2845, 2823, 2842, 2818, 2843, 2901, 2835, 2823, 2842, 2840, 2901, 2844, 2840, 2821, 2841, 2832, 2840, 2832, 2843, 2817, 2836, 2817, 2844, 2842, 2843, 2895, 2901, 2257, 2244, 2255, 2245, 2248, 2255, 2246, 2221, 2209, 2280, 2287, 2279, 2286, 2236, 2266, 430, 443, 432, 442, 439, 432, 441};
    public volatile Object a;
    public volatile C0292c b;
    public volatile C0295f c;

    static {
        k c0294e;
        String strM4536 = C0023.m4536(m8176(), 0, 1, 2963);
        String strM7151 = C0042.m7151(m8176(), 1, 1, 2731);
        d = C0020.m4197(C0026.m4948(C0021.m4340(m8176(), 2, 44, 772), C0005.m1645(m8176(), 46, 5, 441)));
        e = C0007.m1811(C0013.m3085(AbstractC0296g.class));
        try {
            c0294e = new C0293d(C0024.m4659(C0295f.class, Thread.class, strM7151), C0024.m4659(C0295f.class, C0295f.class, strM4536), C0024.m4659(AbstractC0296g.class, C0295f.class, C0049.m8007(m8176(), 51, 1, 2595)), C0024.m4659(AbstractC0296g.class, C0292c.class, strM4536), C0024.m4659(AbstractC0296g.class, Object.class, strM7151));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0294e = new C0294e();
        }
        f = c0294e;
        if (th != null) {
            C0006.m1730(C0003.m1425(), C0010.m2304(), C0020.m4199(m8176(), 52, 27, 2374), th);
        }
        g = new Object();
    }

    public static void b(AbstractC0296g abstractC0296g) {
        C0295f c0295fM7108;
        C0292c c0292c;
        C0292c c0292cM3318;
        C0292c c0292c2;
        do {
            c0295fM7108 = C0042.m7108(abstractC0296g);
        } while (!C0031.m5647(C0063.m9491(), abstractC0296g, c0295fM7108, C0026.m4896()));
        while (true) {
            c0292c = null;
            if (c0295fM7108 == null) {
                break;
            }
            Thread threadM4600 = C0023.m4600(c0295fM7108);
            if (threadM4600 != null) {
                c0295fM7108.a = null;
                C0038.m6447(threadM4600);
            }
            c0295fM7108 = C0063.m9571(c0295fM7108);
        }
        do {
            c0292cM3318 = C0014.m3318(abstractC0296g);
        } while (!C0029.m5258(C0063.m9491(), abstractC0296g, c0292cM3318, C0015.m3467()));
        while (true) {
            c0292c2 = c0292c;
            c0292c = c0292cM3318;
            if (c0292c == null) {
                break;
            }
            c0292cM3318 = C0001.m1137(c0292c);
            c0292c.c = c0292c2;
        }
        while (c0292c2 != null) {
            C0292c c0292cM1137 = C0001.m1137(c0292c2);
            m8177(C0019.m4083(c0292c2), (ExecutorService) C0052.m8366(c0292c2));
            c0292c2 = c0292cM1137;
        }
    }

    public static void c(androidx.core.content.a aVar, ExecutorService executorService) {
        try {
            C0058.m9122(executorService, aVar);
        } catch (RuntimeException e2) {
            Level levelM2304 = C0010.m2304();
            StringBuilder sb = new StringBuilder(C0015.m3484(m8176(), 79, 42, 2237));
            C0016.m3605(sb, aVar);
            C0018.m3933(sb, C0017.m3646(m8176(), 121, 15, 2871));
            C0016.m3605(sb, executorService);
            C0006.m1730(C0003.m1425(), levelM2304, C0047.m7763(sb), e2);
        }
    }

    public static Object d(Object obj) throws ExecutionException {
        if (obj instanceof C0290a) {
            Throwable thM4452 = C0022.m4452((C0290a) obj);
            CancellationException cancellationException = new CancellationException(C0063.m9585(m8176(), 136, 19, 1864));
            C0052.m8308(cancellationException, thM4452);
            throw cancellationException;
        }
        if (obj instanceof AbstractC0291b) {
            C0047.m7777((AbstractC0291b) obj);
            throw new ExecutionException((Throwable) null);
        }
        if (obj == C0011.m2815()) {
            return null;
        }
        return obj;
    }

    /* renamed from: ۟۠ۦۤۧ, reason: not valid java name and contains not printable characters */
    public static short[] m8176() {
        if (C0012.m3024() >= 0) {
            return f784short;
        }
        return null;
    }

    /* renamed from: ۟ۢۥۨۢ, reason: not valid java name and contains not printable characters */
    public static void m8177(Object obj, Object obj2) {
        if (C0055.m8740() >= 0) {
            c((androidx.core.content.a) obj, (ExecutorService) obj2);
        }
    }

    public final void a(StringBuilder sb) {
        Object objM7614;
        String strM7718 = C0046.m7718(m8176(), 155, 1, 685);
        boolean z = false;
        while (true) {
            try {
                try {
                    objM7614 = C0045.m7614(this);
                    break;
                } catch (CancellationException unused) {
                    strM7718 = C0049.m8007(m8176(), 219, 9, 956);
                    C0018.m3933(sb, strM7718);
                    return;
                } catch (RuntimeException e2) {
                    C0018.m3933(sb, C0004.m1549(m8176(), 184, 16, 2741));
                    C0016.m3605(sb, C0047.m7777(e2));
                    strM7718 = C0005.m1645(m8176(), 200, 19, 1020);
                    C0018.m3933(sb, strM7718);
                    return;
                } catch (ExecutionException e3) {
                    C0018.m3933(sb, C0006.m1774(m8176(), 228, 16, 1157));
                    C0016.m3605(sb, C0022.m4471(e3));
                    C0018.m3933(sb, strM7718);
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    C0034.m6006(C0031.m5631());
                }
                throw th;
            }
        }
        if (z) {
            C0034.m6006(C0031.m5631());
        }
        C0018.m3933(sb, C0021.m4340(m8176(), 156, 17, 2868));
        C0018.m3933(sb, objM7614 == this ? C0032.m5708(m8176(), 173, 11, 2194) : C0000.m1096(objM7614));
        C0018.m3933(sb, strM7718);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object objM1550 = C0004.m1550(this);
        if (objM1550 != null) {
            return false;
        }
        if (!C0014.m3349(C0063.m9491(), this, objM1550, C0056.m8935() ? new C0290a(z, new CancellationException(C0039.m6551(m8176(), 244, 27, 2564))) : z ? C0018.m3965() : C0023.m4583())) {
            return false;
        }
        C0051.m8182(this);
        return true;
    }

    public final void e(C0295f c0295f) {
        c0295f.a = null;
        while (true) {
            C0295f c0295fM7108 = C0042.m7108(this);
            if (c0295fM7108 == C0026.m4896()) {
                return;
            }
            C0295f c0295f2 = null;
            while (c0295fM7108 != null) {
                C0295f c0295fM9571 = C0063.m9571(c0295fM7108);
                if (C0023.m4600(c0295fM7108) != null) {
                    c0295f2 = c0295fM7108;
                } else if (c0295f2 != null) {
                    c0295f2.b = c0295fM9571;
                    if (C0023.m4600(c0295f2) == null) {
                        break;
                    }
                } else if (!C0031.m5647(C0063.m9491(), this, c0295fM7108, c0295fM9571)) {
                    break;
                }
                c0295fM7108 = c0295fM9571;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object objM1550;
        if (C0053.m8453()) {
            throw new InterruptedException();
        }
        Object objM15502 = C0004.m1550(this);
        if (objM15502 != null) {
            return C0004.m1545(objM15502);
        }
        C0295f c0295fM7108 = C0042.m7108(this);
        C0295f c0295fM4896 = C0026.m4896();
        if (c0295fM7108 != c0295fM4896) {
            C0295f c0295f = new C0295f();
            do {
                k kVarM9491 = C0063.m9491();
                C0034.m5963(kVarM9491, c0295f, c0295fM7108);
                if (C0031.m5647(kVarM9491, this, c0295fM7108, c0295f)) {
                    do {
                        C0052.m8346(this);
                        if (C0053.m8453()) {
                            C0060.m9270(this, c0295f);
                            throw new InterruptedException();
                        }
                        objM1550 = C0004.m1550(this);
                    } while (objM1550 == null);
                    return C0004.m1545(objM1550);
                }
                c0295fM7108 = C0042.m7108(this);
            } while (c0295fM7108 != c0295fM4896);
        }
        return C0004.m1545(C0004.m1550(this));
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long jM8265 = C0051.m8265(timeUnit, j);
        if (C0053.m8453()) {
            throw new InterruptedException();
        }
        Object objM1550 = C0004.m1550(this);
        if (objM1550 != null) {
            return C0004.m1545(objM1550);
        }
        long jM8092 = jM8265 > 0 ? C0050.m8092() + jM8265 : 0L;
        if (jM8265 >= 1000) {
            C0295f c0295fM7108 = C0042.m7108(this);
            C0295f c0295fM4896 = C0026.m4896();
            if (c0295fM7108 != c0295fM4896) {
                C0295f c0295f = new C0295f();
                do {
                    k kVarM9491 = C0063.m9491();
                    C0034.m5963(kVarM9491, c0295f, c0295fM7108);
                    if (C0031.m5647(kVarM9491, this, c0295fM7108, c0295f)) {
                        do {
                            C0063.m9532(this, jM8265);
                            if (C0053.m8453()) {
                                C0060.m9270(this, c0295f);
                                throw new InterruptedException();
                            }
                            Object objM15502 = C0004.m1550(this);
                            if (objM15502 != null) {
                                return C0004.m1545(objM15502);
                            }
                            jM8265 = jM8092 - C0050.m8092();
                        } while (jM8265 >= 1000);
                        C0060.m9270(this, c0295f);
                    } else {
                        c0295fM7108 = C0042.m7108(this);
                    }
                } while (c0295fM7108 != c0295fM4896);
            }
            return C0004.m1545(C0004.m1550(this));
        }
        while (jM8265 > 0) {
            Object objM15503 = C0004.m1550(this);
            if (objM15503 != null) {
                return C0004.m1545(objM15503);
            }
            if (C0053.m8453()) {
                throw new InterruptedException();
            }
            jM8265 = jM8092 - C0050.m8092();
        }
        String strM4935 = C0026.m4935(this);
        String strM6312 = C0037.m6312(timeUnit);
        Locale localeM8730 = C0055.m8730();
        String strM6565 = C0039.m6565(strM6312, localeM8730);
        StringBuilder sb = new StringBuilder(C0023.m4536(m8176(), 271, 7, 438));
        C0058.m9141(sb, j);
        String strM6307 = C0037.m6307(m8176(), 278, 1, 2132);
        C0018.m3933(sb, strM6307);
        C0018.m3933(sb, C0039.m6565(C0037.m6312(timeUnit), localeM8730));
        String strM7763 = C0047.m7763(sb);
        if (jM8265 + 1000 < 0) {
            String strM9804 = C0065.m9804(strM7763, C0039.m6551(m8176(), 279, 7, 2613));
            long j2 = -jM8265;
            long jM6496 = C0039.m6496(timeUnit, j2, C0002.m1318());
            long jM82652 = j2 - C0051.m8265(timeUnit, jM6496);
            boolean z = jM6496 == 0 || jM82652 > 1000;
            if (jM6496 > 0) {
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, strM9804);
                C0058.m9141(sb2, jM6496);
                C0018.m3933(sb2, strM6307);
                C0018.m3933(sb2, strM6565);
                String strM77632 = C0047.m7763(sb2);
                if (z) {
                    strM77632 = C0065.m9804(strM77632, C0038.m6452(m8176(), 286, 1, 2552));
                }
                strM9804 = C0065.m9804(strM77632, strM6307);
            }
            if (z) {
                StringBuilder sb3 = new StringBuilder();
                C0018.m3933(sb3, strM9804);
                C0058.m9141(sb3, jM82652);
                C0018.m3933(sb3, C0014.m3332(m8176(), 287, 13, 1331));
                strM9804 = C0047.m7763(sb3);
            }
            strM7763 = C0065.m9804(strM9804, C0020.m4199(m8176(), 300, 6, 3134));
        }
        if (C0024.m4706(this)) {
            throw new TimeoutException(C0065.m9804(strM7763, C0019.m4107(m8176(), 306, 40, 2610)));
        }
        throw new TimeoutException(C0028.m5172(strM7763, C0020.m4199(m8176(), 346, 5, 3179), strM4935));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return C0004.m1550(this) instanceof C0290a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return C0004.m1550(this) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String strM7763;
        String strM8131;
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, super.toString());
        C0018.m3933(sb, C0038.m6452(m8176(), 351, 8, 1461));
        boolean z = C0004.m1550(this) instanceof C0290a;
        String strM6188 = C0036.m6188(m8176(), 359, 1, 1899);
        if (!z) {
            if (C0024.m4706(this)) {
                C0043.m7325(this, sb);
            } else {
                try {
                    if (this instanceof ScheduledFuture) {
                        StringBuilder sb2 = new StringBuilder(C0061.m9361(m8176(), 369, 17, 3023));
                        C0058.m9141(sb2, C0032.m5683((ScheduledFuture) this, C0006.m1731()));
                        C0018.m3933(sb2, C0002.m1305(m8176(), 386, 4, 1677));
                        strM7763 = C0047.m7763(sb2);
                    } else {
                        strM7763 = null;
                    }
                } catch (RuntimeException e2) {
                    StringBuilder sb3 = new StringBuilder(C0049.m8007(m8176(), 390, 38, 2933));
                    C0016.m3605(sb3, C0047.m7777(e2));
                    strM7763 = C0047.m7763(sb3);
                }
                if (strM7763 == null || C0057.m8953(strM7763)) {
                    if (!C0024.m4706(this)) {
                        strM8131 = C0050.m8131(m8176(), 443, 7, 510);
                    }
                    C0043.m7325(this, sb);
                } else {
                    C0018.m3933(sb, C0022.m4403(m8176(), 428, 15, 2177));
                    C0018.m3933(sb, strM7763);
                    C0018.m3933(sb, strM6188);
                }
            }
            C0018.m3933(sb, strM6188);
            return C0047.m7763(sb);
        }
        strM8131 = C0062.m9389(m8176(), 360, 9, 2958);
        C0018.m3933(sb, strM8131);
        C0018.m3933(sb, strM6188);
        return C0047.m7763(sb);
    }
}