package com.github.catvod.spider.merge.U;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.r;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class p implements com.github.catvod.spider.merge.V0.o {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f521short = {3123, 3109, 3118, 3108, 3076, 3105, 3117, 3105, 3120, 3113, 1930, 1942, 1942, 1938, 2008, 1997, 1997, 2003, 2002, 2001, 1996, 2006, 2007, 1996, 2003, 2004, 2000, 1996, 2000, 2002, 2005, 2008, 2003, 2007, 2003, 2007, 2000, 1997, 1926, 1935, 1929, 1943, 1997, 816, 817, 822, 825, 816, 819, 826, 1043, 1046, 1049, 1050, 1026, 1052, 1026, 2586, 2685, 2679, 2657, 2659, 2586, 2587, 2641, 2644, 2651, 2648, 2624, 2710, 2707, 2707, 2724, 2690, 2695, 2695, 2693, 2706, 2692, 2692, 2706, 2707, 17147, 24225, 28263, -31668, 21250, 21048, 3130, 3104, 1257, 1202, 1204, 1186, 1205, 1193, 1190, 1194, 1186, 28611, 25707, -32555, 20660, 20818, 23643, 23863, 811, 806, 2513, 2509, 2509, 2505, 2435, 2454, 2454, 2440, 2443, 2446, 2455, 2441, 2455, 2441, 2455, 2440, 2435, 2432, 2432, 2446, 2433, 2454, 2516, 2524, 2525, 2512, 2520, 2431, 23401, 22135, 23753, 24426, 18999, 24853, 26427, 28510, 22181, -31545, 1377, 1406, 1378, 1400, 1381, 1400, 1406, 1407, 2430, 532, 627, 1208, 1192, 1270, 1268, 1194, 1252, 1266, 1273, 1267, 1267, 1270, 1273, 1274, 1250, 1201, 1253, 1266, 1265, 1266, 1253, 1266, 1253, 1194, 1263, 1278, 1270, 1272, 1279, 1250, 1269, 1270, 1273, 1201, 1255, 1275, 1270, 1262, 1266, 1253, 1194, 1525, 1447, 1466, 1470, 1462, 1518, 1711, 1789, 1772, 1777, 1789, 1716, 870, 890, 890, 894, 820, 801, 801, 831, 828, 825, 800, 830, 800, 830, 800, 831, 820, 823, 823, 825, 822, 801, 879, 877, 890, 871, 865, 864, 817, 874, 865, 819, 892, 875, 872, 892, 875, 893, 870, 808, 890, 887, 894, 875, 819, 874, 879, 864, 867, 879, 869, 891, 808, 894, 879, 890, 870, 819, 870, 890, 890, 894, 811, 829, 847, 811, 828, 840, 811, 828, 840, 831, 828, 825, 800, 830, 800, 830, 800, 831, 811, 829, 847, 823, 823, 823, 825, 811, 828, 840, 894, 892, 865, 886, 887, 811, 829, 840, 874, 865, 811, 829, 842, 893, 875, 879, 877, 870, 874, 879, 864, 867, 891, 811, 828, 824, 873, 865, 811, 829, 842, 892, 875, 872, 892, 875, 893, 870, 874, 879, 864, 867, 891, 22778, 22934, 21522, -26686, 26067, 21852};
    public Object a;
    public Object b;
    public final Object c;

    public p(int i) {
        switch (i) {
            case 3:
                this.b = new Gson();
                ExecutorService executorServiceM4370 = C0021.m4370(5);
                this.a = executorServiceM4370;
                this.c = new ExecutorCompletionService(executorServiceM4370);
                break;
            default:
                String strM1840 = C0007.m1840();
                this.a = strM1840;
                this.b = strM1840;
                this.c = m5498(C0055.m8744(C0035.m6110()), C0022.m4403(m5496(), 0, 10, 3136), C0046.m7718(m5496(), 10, 33, 2018));
                break;
        }
    }

    public p(com.github.catvod.spider.merge.V0.n nVar) {
        this.a = null;
        this.b = null;
        this.c = nVar;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public static String e(String str) {
        boolean zM5499 = m5499(C0055.m8744(C0035.m6110()), C0053.m8477(m5496(), 43, 7, 855), false);
        String strM1840 = C0007.m1840();
        if (zM5499) {
            try {
                String strM1461 = C0003.m1461(str);
                if (m5493(m5492((JsonObject) m5497(new Gson(), strM1461, JsonObject.class), C0047.m7833(m5496(), 50, 7, 1143))) > 5) {
                    strM1840 = strM1461;
                }
            } catch (Exception unused) {
            }
        }
        if (strM1840 != null && !C0057.m8953(strM1840)) {
            return strM1840;
        }
        p pVar = new p(3);
        C0047.m7777(C0035.m6110());
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(C0049.m7985(), C0036.m6188(m5496(), 57, 12, 2613))));
            while (true) {
                try {
                    String strM4438 = C0022.m4438(bufferedReader);
                    if (strM4438 == null) {
                        break;
                    }
                    C0004.m1532(arrayList, C0064.m9640(strM4438));
                } catch (Throwable th) {
                    try {
                        C0057.m8961(bufferedReader);
                    } catch (Throwable th2) {
                        try {
                            C0052.m8352(C0057.m8970(Throwable.class, C0029.m5256(m5496(), 69, 13, 2807), new Class[]{Throwable.class}), th, new Object[]{th2});
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            }
            C0057.m8961(bufferedReader);
        } catch (IOException unused3) {
        }
        C0034.m6012(arrayList, C0051.m8224(C0035.m6110()));
        try {
            strM1840 = C0038.m6433(pVar, str, arrayList);
        } catch (InterruptedException unused4) {
            C0034.m6006(C0031.m5631());
        }
        return !C0057.m8953(strM1840) ? strM1840 : strM1840;
    }

    /* renamed from: ۟۠۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static JsonArray m5492(Object obj, Object obj2) {
        if (C0032.m5686() <= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۤۦۡ, reason: not valid java name and contains not printable characters */
    public static int m5493(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۣ۟ۥ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m5494(int i, Object obj, Object obj2) {
        if (C0056.m8886() <= 0) {
            return AbstractC0308c.b(i, (JsonObject) obj, (String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static JsonObject m5495(Object obj) {
        if (C0042.m7147() < 0) {
            return AbstractC0308c.i((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5496() {
        if (C0031.m5628() > 0) {
            return f521short;
        }
        return null;
    }

    /* renamed from: ۡۨۦۣ, reason: not valid java name and contains not printable characters */
    public static Object m5497(Object obj, Object obj2, Object obj3) {
        if (C0025.m4797() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static String m5498(Object obj, Object obj2, Object obj3) {
        if (C0041.m6823() < 0) {
            return AbstractC0308c.f((JsonObject) obj, (String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۧۧ, reason: not valid java name and contains not printable characters */
    public static boolean m5499(Object obj, Object obj2, boolean z) {
        if (C0049.m8038() < 0) {
            return AbstractC0308c.a((JsonObject) obj, (String) obj2, z);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void a(r rVar, int i) {
        if (rVar instanceof com.github.catvod.spider.merge.T0.m) {
            com.github.catvod.spider.merge.T0.m mVar = (com.github.catvod.spider.merge.T0.m) rVar;
            if (C0012.m3021((com.github.catvod.spider.merge.V0.n) C0020.m4224(this), (com.github.catvod.spider.merge.T0.m) C0021.m4381(this), mVar)) {
                C0018.m3918((com.github.catvod.spider.merge.V0.d) C0039.m6515(this), mVar);
            }
        }
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void b(r rVar, int i) {
    }

    public String c(String str, ArrayList arrayList) {
        ExecutorCompletionService executorCompletionService;
        String str2;
        ExecutorService executorService = (ExecutorService) C0021.m4381(this);
        ArrayList arrayList2 = new ArrayList();
        try {
            Iterator itM7816 = C0047.m7816(arrayList);
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean zM2962 = C0012.m2962(itM7816);
                executorCompletionService = (ExecutorCompletionService) C0020.m4224(this);
                if (!zM2962) {
                    break;
                }
                C0004.m1532(arrayList2, C0049.m7989(executorCompletionService, new com.github.catvod.spider.merge.b0.h(1, (String) C0048.m7949(itM7816), this, str)));
                i2++;
            }
            String strM1840 = C0007.m1840();
            while (true) {
                if (i >= i2) {
                    break;
                }
                try {
                    str2 = (String) C0002.m1288(C0025.m4862(executorCompletionService));
                } catch (ExecutionException e) {
                    PrintStream printStreamM7298 = C0043.m7298();
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, C0029.m5256(m5496(), 82, 8, 3072));
                    C0018.m3933(sb, C0036.m6261(C0022.m4471(e)));
                    C0012.m2969(printStreamM7298, C0047.m7763(sb));
                }
                if (str2 != null) {
                    strM1840 = str2;
                    break;
                }
                i++;
            }
            Iterator itM78162 = C0047.m7816(arrayList2);
            while (C0012.m2962(itM78162)) {
                Future future = (Future) C0048.m7949(itM78162);
                if (!C0025.m4875(future)) {
                    C0064.m9685(future, true);
                }
            }
            C0009.m2093(executorService);
            return strM1840;
        } catch (Throwable th) {
            Iterator itM78163 = C0047.m7816(arrayList2);
            while (C0012.m2962(itM78163)) {
                Future future2 = (Future) C0048.m7949(itM78163);
                if (!C0025.m4875(future2)) {
                    C0064.m9685(future2, true);
                }
            }
            C0009.m2093(executorService);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.github.catvod.spider.merge.T0.m d(com.github.catvod.spider.merge.T0.m r59, com.github.catvod.spider.merge.T0.m r60) {
        /*
            r58 = this;
            r9 = r60
            r8 = r59
            r7 = r58
            r7.a = r8
            r8 = 0
            r7.b = r8
            r8 = 0
            r0 = r9
            r1 = 0
        Le:
            if (r0 == 0) goto L7a
            boolean r2 = r0 instanceof com.github.catvod.spider.merge.T0.m
            r3 = 1
            r4 = 5
            if (r2 == 0) goto L2f
            r2 = r0
            com.github.catvod.spider.merge.T0.m r2 = (com.github.catvod.spider.merge.T0.m) r2
            java.lang.Object r5 = com.github.catvod.spider.merge.I0.C0020.m4224(r7)
            com.github.catvod.spider.merge.V0.n r5 = (com.github.catvod.spider.merge.V0.n) r5
            java.lang.Object r6 = com.github.catvod.spider.merge.J0.C0021.m4381(r7)
            com.github.catvod.spider.merge.T0.m r6 = (com.github.catvod.spider.merge.T0.m) r6
            boolean r5 = com.github.catvod.spider.p000mergexbpq.i.C0012.m3021(r5, r6, r2)
            if (r5 == 0) goto L2f
            r7.b = r2
            r2 = 5
            goto L30
        L2f:
            r2 = 1
        L30:
            if (r2 != r4) goto L33
            goto L7a
        L33:
            if (r2 != r3) goto L48
            int r4 = com.github.catvod.spider.merge.T0.C0030.m5344(r0)
            if (r4 <= 0) goto L48
            java.util.List r0 = com.github.catvod.spider.merge.r0.C0059.m9225(r0)
            java.lang.Object r0 = com.github.catvod.spider.merge.d0.C0048.m7915(r0, r8)
            com.github.catvod.spider.merge.T0.r r0 = (com.github.catvod.spider.merge.T0.r) r0
            int r1 = r1 + 1
            goto Le
        L48:
            com.github.catvod.spider.merge.T0.r r4 = com.github.catvod.spider.p000mergexbpq.j.C0013.m3117(r0)
            r5 = 4
            r6 = 2
            if (r4 != 0) goto L66
            if (r1 > 0) goto L53
            goto L66
        L53:
            if (r2 == r3) goto L57
            if (r2 != r6) goto L58
        L57:
            r2 = 1
        L58:
            com.github.catvod.spider.merge.T0.r r4 = com.github.catvod.spider.merge.b.C0044.m7395(r0)
            int r1 = r1 + (-1)
            if (r2 != r5) goto L63
            com.github.catvod.spider.merge.o0.C0056.m8923(r0)
        L63:
            r0 = r4
            r2 = 1
            goto L48
        L66:
            if (r2 == r3) goto L6c
            if (r2 != r6) goto L6b
            goto L6c
        L6b:
            r3 = r2
        L6c:
            if (r0 != r9) goto L6f
            goto L7a
        L6f:
            com.github.catvod.spider.merge.T0.r r2 = com.github.catvod.spider.p000mergexbpq.j.C0013.m3117(r0)
            if (r3 != r5) goto L78
            com.github.catvod.spider.merge.o0.C0056.m8923(r0)
        L78:
            r0 = r2
            goto Le
        L7a:
            java.lang.Object r8 = com.github.catvod.spider.merge.Z.C0039.m6515(r7)
            com.github.catvod.spider.merge.T0.m r8 = (com.github.catvod.spider.merge.T0.m) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.U.p.d(com.github.catvod.spider.merge.T0.m, com.github.catvod.spider.merge.T0.m):com.github.catvod.spider.merge.T0.m");
    }

    public String f(String str, String str2) {
        String strM9421 = C0062.m9421(str);
        C0042.m7162(strM9421, C0024.m4740(m5496(), 90, 9, 1223));
        String strM94212 = C0062.m9421(str2);
        if (C0057.m8953((String) C0021.m4381(this))) {
            return C0057.m8978(m5496(), 99, 9, 866);
        }
        String strM5769 = C0032.m5769(C0024.m4740(m5496(), 108, 27, 2489), null);
        if (!C0058.m9127(strM5769, C0005.m1645(m5496(), 135, 1, 2308))) {
            return C0041.m6779(m5496(), 136, 10, 1082);
        }
        double dM5494 = m5494(0, m5495(strM5769), C0017.m3646(m5496(), 146, 8, 1297)) + 1000;
        C0004.m1564(dM5494);
        String str3 = (String) C0021.m4381(this);
        StringBuilder sb = new StringBuilder(C0061.m9361(m5496(), 154, 1, 2341));
        C0018.m3933(sb, strM9421);
        C0018.m3933(sb, C0053.m8477(m5496(), 155, 2, 585));
        C0018.m3933(sb, strM94212);
        String strM7763 = C0047.m7763(sb);
        StringBuilder sb2 = new StringBuilder();
        C0018.m3933(sb2, (String) C0020.m4224(this));
        C0018.m3933(sb2, C0050.m8131(m5496(), 157, 40, 1175));
        C0018.m3933(sb2, str3);
        C0018.m3933(sb2, C0058.m9106(m5496(), 197, 6, 1491));
        C0010.m2354(sb2, dM5494 / 1000.0d);
        C0018.m3933(sb2, C0012.m2973(m5496(), 203, 6, 1673));
        C0018.m3933(sb2, strM7763);
        C0032.m5769(C0047.m7763(sb2), null);
        C0032.m5769(C0038.m6452(m5496(), 209, 133, 782), null);
        return C0065.m9775(m5496(), 342, 6, 1987);
    }
}