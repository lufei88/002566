package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f867short = {457, 388, 412, 410, 413, 457, 391, 390, 413, 457, 395, 396, 457, 391, 412, 389, 389, 574, 527, 540, 527, 515, 523, 538, 523, 540, 590, 541, 542, 523, 525, 519, 520, 519, 523, 522, 590, 527, 541, 590, 512, 513, 512, 579, 512, 539, 514, 514, 590, 519, 541, 590, 512, 539, 514, 514, 596, 590, 515, 523, 538, 518, 513, 522, 590, 2262, 2623, 2611, 2659, 2674, 2657, 2674, 2686, 2678, 2663, 2678, 2657, 2611, 2200, 2196, 2199, 2199, 2206, 2200, 2191, 2194, 2196, 2197, 1234, 1246, 1217, 1224, 1278, 1239, 1177, 1183, 1183, 1183, 1176, 2566, 2570, 2569, 2569, 2560, 2566, 2577, 2572, 2570, 2571, 2372, 2376, 2391, 2398, 2408, 2369, 2319, 2313, 2313, 2313, 2318, 1351, 1372, 1349, 1349, 1289, 1354, 1352, 1351, 1351, 1350, 1373, 1289, 1355, 1356, 1289, 1354, 1352, 1370, 1373, 1289, 1373, 1350, 1289, 1351, 1350, 1351, 1284, 1351, 1372, 1349, 1349, 1289, 1373, 1360, 1369, 1356, 1289, 1346, 1350, 1373, 1349, 1344, 1351, 1287, 1384, 1371, 1371, 1352, 1360, 1301, 1346, 1350, 1373, 1349, 1344, 1351, 1287, 1384, 1351, 1360, 1302, 1303};
    public static final Object[] a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : C0058.m9103(obj, obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        C0065.m9802(nullPointerException);
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(C0050.m8125(str, C0052.m8337(m9479(), 0, 17, 489)));
        C0065.m9802(nullPointerException);
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTraceElementArrM3378 = C0014.m3378(C0031.m5631());
            String strM3085 = C0013.m3085(g.class);
            int i = 0;
            while (!C0007.m1815(C0062.m9394(stackTraceElementArrM3378[i]), strM3085)) {
                i++;
            }
            while (C0007.m1815(C0062.m9394(stackTraceElementArrM3378[i]), strM3085)) {
                i++;
            }
            StackTraceElement stackTraceElement = stackTraceElementArrM3378[i];
            StringBuilder sbM8368 = C0052.m8368(C0019.m4107(m9479(), 17, 48, 622), C0062.m9394(stackTraceElement), C0047.m7833(m9479(), 65, 1, 2296), C0007.m1821(stackTraceElement), C0026.m4951(m9479(), 66, 12, 2579));
            C0018.m3933(sbM8368, str);
            NullPointerException nullPointerException = new NullPointerException(C0047.m7763(sbM8368));
            C0065.m9802(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void e(NullPointerException nullPointerException) {
        String strM3085 = C0013.m3085(g.class);
        StackTraceElement[] stackTraceElementArrM1275 = C0002.m1275(nullPointerException);
        int length = stackTraceElementArrM1275.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (C0007.m1815(strM3085, C0062.m9394(stackTraceElementArrM1275[i2]))) {
                i = i2;
            }
        }
        C0042.m7103(nullPointerException, (StackTraceElement[]) C0024.m4732(stackTraceElementArrM1275, i + 1, length));
    }

    public static final Object[] f(Collection collection) {
        C0057.m8982(collection, C0046.m7718(m9479(), 78, 10, 2299));
        int iM8006 = C0049.m8006(collection);
        Object[] objArrM1079 = C0000.m1079();
        if (iM8006 == 0) {
            return objArrM1079;
        }
        Iterator itM1943 = C0008.m1943(collection);
        if (!C0012.m2962(itM1943)) {
            return objArrM1079;
        }
        Object[] objArrM1439 = new Object[iM8006];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrM1439[i] = C0048.m7949(itM1943);
            int length = objArrM1439.length;
            String strM9352 = C0060.m9352(m9479(), 88, 11, 1201);
            if (i2 >= length) {
                if (!C0012.m2962(itM1943)) {
                    return objArrM1439;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrM1439 = C0003.m1439(objArrM1439, i3);
                C0055.m8753(objArrM1439, strM9352);
            } else if (!C0012.m2962(itM1943)) {
                Object[] objArrM14392 = C0003.m1439(objArrM1439, i2);
                C0055.m8753(objArrM14392, strM9352);
                return objArrM14392;
            }
            i = i2;
        }
    }

    public static final Object[] g(Collection collection, Object[] objArr) {
        Object[] objArrM1439;
        C0057.m8982(collection, C0021.m4340(m9479(), 99, 10, 2661));
        C0047.m7777(objArr);
        int iM8006 = C0049.m8006(collection);
        int i = 0;
        if (iM8006 == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator itM1943 = C0008.m1943(collection);
        if (!C0012.m2962(itM1943)) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (iM8006 <= objArr.length) {
            objArrM1439 = objArr;
        } else {
            Object objM7792 = C0047.m7792(C0030.m5404(C0047.m7777(objArr)), iM8006);
            if (objM7792 == null) {
                NullPointerException nullPointerException = new NullPointerException(C0007.m1842(m9479(), 120, 62, 1321));
                C0065.m9802(nullPointerException);
                throw nullPointerException;
            }
            objArrM1439 = (Object[]) objM7792;
        }
        while (true) {
            int i2 = i + 1;
            objArrM1439[i] = C0048.m7949(itM1943);
            int length = objArrM1439.length;
            String strM6307 = C0037.m6307(m9479(), 109, 11, 2343);
            if (i2 >= length) {
                if (!C0012.m2962(itM1943)) {
                    return objArrM1439;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrM1439 = C0003.m1439(objArrM1439, i3);
                C0055.m8753(objArrM1439, strM6307);
            } else if (!C0012.m2962(itM1943)) {
                if (objArrM1439 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] objArrM14392 = C0003.m1439(objArrM1439, i2);
                C0055.m8753(objArrM14392, strM6307);
                return objArrM14392;
            }
            i = i2;
        }
    }

    /* renamed from: ۣۣۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9479() {
        if (C0036.m6252() >= 0) {
            return f867short;
        }
        return null;
    }
}