package com.github.catvod.spider.merge.C;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.e.C0272b;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f380short = {2040, 3100, 3117, 3134, 3119, 3113, 3104, 3109, 3126, 3113, 3134, 2267, 2252, 2248, 2253, 1056, 1061, 1086, 1059, 1074, 689, 642, 661, 660, 654, 648, 649, 642, 643, 695, 646, 661, 644, 642, 651, 711, 642, 649, 644, 648, 658, 649, 659, 642, 661, 642, 643, 711, 676, 651, 646, 660, 660, 681, 648, 659, 673, 648, 658, 649, 643, 674, 671, 644, 642, 663, 659, 654, 648, 649, 1218, 1265, 1254, 1255, 1277, 1275, 1274, 1265, 1264, 1220, 1269, 1254, 1271, 1265, 1272, 1204, 1265, 1274, 1271, 1275, 1249, 1274, 1248, 1265, 1254, 1265, 1264, 1204, 1242, 1275, 1223, 1249, 1271, 1276, 1241, 1265, 1248, 1276, 1275, 1264, 1233, 1260, 1271, 1265, 1252, 1248, 1277, 1275, 1274, 1459, 1408, 1431, 1430, 1420, 1418, 1419, 1408, 1409, 1461, 1412, 1431, 1414, 1408, 1417, 1477, 1408, 1419, 1414, 1418, 1424, 1419, 1425, 1408, 1431, 1408, 1409, 1477, 1452, 1419, 1427, 1418, 1414, 1412, 1425, 1420, 1418, 1419, 1457, 1412, 1431, 1410, 1408, 1425, 1440, 1437, 1414, 1408, 1429, 1425, 1420, 1418, 1419, 1762, 1745, 1734, 1735, 1757, 1755, 1754, 1745, 1744, 1764, 1749, 1734, 1751, 1745, 1752, 1684, 1745, 1754, 1751, 1755, 1729, 1754, 1728, 1745, 1734, 1745, 1744, 1684, 1789, 1752, 1752, 1745, 1747, 1749, 1752, 1781, 1751, 1751, 1745, 1735, 1735, 1777, 1740, 1751, 1745, 1732, 1728, 1757, 1755, 1754, 2619, 2568, 2591, 2590, 2564, 2562, 2563, 2568, 2569, 2621, 2572, 2591, 2574, 2568, 2561, 2637, 2568, 2563, 2574, 2562, 2584, 2563, 2585, 2568, 2591, 2568, 2569, 2637, 2606, 2561, 2572, 2590, 2590, 2595, 2562, 2585, 2603, 2562, 2584, 2563, 2569, 2600, 2581, 2574, 2568, 2589, 2585, 2564, 2562, 2563, 2840, 2859, 2876, 2877, 2855, 2849, 2848, 2859, 2858, 2846, 2863, 2876, 2861, 2859, 2850, 2926, 2859, 2848, 2861, 2849, 2875, 2848, 2874, 2859, 2876, 2859, 2858, 2926, 2816, 2849, 2845, 2875, 2861, 2854, 2819, 2859, 2874, 2854, 2849, 2858, 2827, 2870, 2861, 2859, 2878, 2874, 2855, 2849, 2848, 1451, 1432, 1423, 1422, 1428, 1426, 1427, 1432, 1433, 1453, 1436, 1423, 1438, 1432, 1425, 1501, 1432, 1427, 1438, 1426, 1416, 1427, 1417, 1432, 1423, 1432, 1433, 1501, 1460, 1427, 1419, 1426, 1438, 1436, 1417, 1428, 1426, 1427, 1449, 1436, 1423, 1434, 1432, 1417, 1464, 1413, 1438, 1432, 1421, 1417, 1428, 1426, 1427, 2186, 2233, 2222, 2223, 2229, 2227, 2226, 2233, 2232, 2188, 2237, 2222, 2239, 2233, 2224, 2300, 2233, 2226, 2239, 2227, 2217, 2226, 2216, 2233, 2222, 2233, 2232, 2300, 2197, 2224, 2224, 2233, 2235, 2237, 2224, 2205, 2239, 2239, 2233, 2223, 2223, 2201, 2212, 2239, 2233, 2220, 2216, 2229, 2227, 2226, 1155, 1223, 1228, 1222, 1232, 1155, 1229, 1228, 1239, 1155, 1227, 1218, 1237, 1222, 1155, 1218, 1155, 1267, 1218, 1233, 1216, 1222, 1231, 1226, 1241, 1222, 1233};
    public final C0272b a;
    public final C0272b b;
    public final C0272b c;

    public a(C0272b c0272b, C0272b c0272b2, C0272b c0272b3) {
        this.a = c0272b;
        this.b = c0272b2;
        this.c = c0272b3;
    }

    /* renamed from: ۟ۡۤۥۦ, reason: not valid java name and contains not printable characters */
    public static short[] m3631() {
        if (C0019.m4065() < 0) {
            return f380short;
        }
        return null;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String strM3085 = C0013.m3085(cls);
        C0272b c0272bM8905 = C0056.m8905(this);
        Class cls2 = (Class) C0025.m4868(c0272bM8905, strM3085, null);
        if (cls2 != null) {
            return cls2;
        }
        Class clsM8975 = C0057.m8975(C0004.m1488(C0045.m7606(C0058.m9101(cls)), C0055.m8814(m3631(), 0, 1, 2006), C0008.m2013(cls), C0025.m4795(m3631(), 1, 10, 3148)), false, C0045.m7605(cls));
        C0005.m1666(c0272bM8905, C0013.m3085(cls), clsM8975);
        return clsM8975;
    }

    public final Method c(String str) {
        C0272b c0272bM3300 = C0014.m3300(this);
        Method method = (Method) C0025.m4868(c0272bM3300, str, null);
        if (method != null) {
            return method;
        }
        C0009.m2099();
        Method methodM8970 = C0057.m8970(C0057.m8975(str, true, C0045.m7605(a.class)), C0065.m9775(m3631(), 11, 4, 2217), new Class[]{a.class});
        C0005.m1666(c0272bM3300, str, methodM8970);
        return methodM8970;
    }

    public final Method d(Class cls) {
        String strM3085 = C0013.m3085(cls);
        C0272b c0272bM2309 = C0010.m2309(this);
        Method method = (Method) C0025.m4868(c0272bM2309, strM3085, null);
        if (method != null) {
            return method;
        }
        Class clsM2048 = C0009.m2048(this, cls);
        C0009.m2099();
        Method methodM8970 = C0057.m8970(clsM2048, C0057.m8978(m3631(), 15, 5, 1111), new Class[]{cls, a.class});
        C0005.m1666(c0272bM2309, C0013.m3085(cls), methodM8970);
        return methodM8970;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!C0064.m9684(this, i)) {
            return parcelable;
        }
        return C0022.m4492(C0056.m8887((b) this), C0045.m7605(b.class));
    }

    public final c g() {
        String strM7430 = C0044.m7430(C0056.m8887((b) this));
        if (strM7430 == null) {
            return null;
        }
        try {
            return (c) C0052.m8352(C0034.m6002(this, strM7430), null, new Object[]{C0029.m5227(this)});
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(C0004.m1549(m3631(), 20, 50, 743), e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(C0003.m1398(m3631(), 172, 50, 1716), e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(C0045.m7657(m3631(), 70, 49, 1172), e3);
        } catch (InvocationTargetException e4) {
            if (C0021.m4357(e4) instanceof RuntimeException) {
                throw ((RuntimeException) C0021.m4357(e4));
            }
            throw new RuntimeException(C0015.m3484(m3631(), 119, 53, 1509), e4);
        }
    }

    public abstract void h(int i);

    public final void i(c cVar) {
        if (cVar == null) {
            C0026.m4972(C0056.m8887((b) this), null);
            return;
        }
        try {
            C0026.m4972(C0056.m8887((b) this), C0013.m3085(C0009.m2048(this, C0047.m7777(cVar))));
            b bVarM5227 = C0029.m5227(this);
            try {
                C0052.m8352(C0016.m3587(this, C0047.m7777(cVar)), null, new Object[]{cVar, bVarM5227});
                int iM1235 = C0001.m1235(bVarM5227);
                if (iM1235 >= 0) {
                    int iM1191 = C0001.m1191(C0047.m7829(bVarM5227), iM1235);
                    Parcel parcelM8887 = C0056.m8887(bVarM5227);
                    int iM5675 = C0032.m5675(parcelM8887);
                    C0010.m2311(parcelM8887, iM1191);
                    C0033.m5818(parcelM8887, iM5675 - iM1191);
                    C0010.m2311(parcelM8887, iM5675);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(C0019.m4107(m3631(), 222, 50, 2669), e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(C0005.m1645(m3631(), 374, 50, 2268), e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(C0063.m9585(m3631(), 272, 49, 2894), e3);
            } catch (InvocationTargetException e4) {
                if (!(C0021.m4357(e4) instanceof RuntimeException)) {
                    throw new RuntimeException(C0065.m9775(m3631(), 321, 53, 1533), e4);
                }
                throw ((RuntimeException) C0021.m4357(e4));
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(C0050.m8125(C0008.m2013(C0047.m7777(cVar)), C0001.m1189(m3631(), 424, 27, 1187)), e5);
        }
    }
}