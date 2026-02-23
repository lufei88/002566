package com.github.catvod.spider.merge.Y0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
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
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f688short = {2006, 2004, 1990, 1985, 1941, 1985, 2010, 1941, 2001, 2004, 1985, 2000, 1941, 2003, 2004, 2012, 2009, 1947, 1941, 1987, 2004, 2009, 2000, 1941, 1928, 1941, 532, 534, 516, 515, 599, 515, 536, 599, 537, 514, 538, 533, 530, 517, 599, 529, 534, 542, 539, 601, 599, 513, 534, 539, 530, 599, 586, 599, 2591, 2589, 2575, 2568, 2652, 2568, 2579, 2652, 2578, 2569, 2577, 2590, 2585, 2574, 2652, 2586, 2589, 2581, 2576, 2642, 2652, 2570, 2589, 2576, 2585, 2652, 2625, 2652, 2785, 2803, 2804, 2815, 2798, 2803, 2815, 1374, 2651, 2656, 2685, 2683, 2686, 2686, 2657, 2684, 2682, 2667, 2666, 2606, 2669, 2657, 2659, 2686, 2671, 2684, 2671, 2668, 2658, 2667, 2606, 2646, 2648, 2671, 2658, 2683, 2667, 2606, 2611, 2606, 1706, 2797, 1337, 1315, 1297, 1316, 1316, 1314, 1258, 1264, 1222, 1275, 1267, 1265, 1232, 1271, 1265};
    public Object a;
    public boolean b = false;
    public boolean c = false;

    public b(Object obj) {
        this.a = obj;
    }

    /* renamed from: ۣۣ۟ۦۣ, reason: not valid java name and contains not printable characters */
    public static short[] m6267() {
        if (C0042.m7147() < 0) {
            return f688short;
        }
        return null;
    }

    public final Boolean a() {
        Object objM6834 = C0041.m6834(this);
        if (objM6834 instanceof Boolean) {
            return (Boolean) objM6834;
        }
        return C0028.m5186((objM6834 == null || C0003.m1430(C0047.m7744(this))) ? false : true);
    }

    public final Date b() {
        Object objM6834 = C0041.m6834(this);
        boolean z = objM6834 instanceof String;
        String strM8007 = C0049.m8007(m6267(), 0, 26, 1973);
        if (z) {
            try {
                return C0047.m7752(C0055.m8751(), (String) objM6834);
            } catch (ParseException unused) {
                StringBuilder sb = new StringBuilder(strM8007);
                C0016.m3605(sb, C0041.m6834(this));
                throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
            }
        }
        if (objM6834 instanceof Date) {
            return (Date) objM6834;
        }
        StringBuilder sb2 = new StringBuilder(strM8007);
        C0016.m3605(sb2, C0041.m6834(this));
        throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb2));
    }

    public final Double c() {
        double dM9741;
        Object objM6834 = C0041.m6834(this);
        if (objM6834 instanceof String) {
            dM9741 = C0034.m5951(new BigDecimal((String) C0041.m6834(this)));
        } else {
            if (!(objM6834 instanceof Number)) {
                StringBuilder sb = new StringBuilder(C0015.m3484(m6267(), 26, 28, 631));
                C0016.m3605(sb, C0041.m6834(this));
                throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
            }
            dM9741 = C0065.m9741((Number) objM6834);
        }
        return C0013.m3079(dM9741);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return C0024.m4695(this, (b) obj);
    }

    public final Long d() {
        long jM5148;
        Object objM6834 = C0041.m6834(this);
        if (objM6834 instanceof String) {
            jM5148 = C0002.m1246(C0057.m8991(new BigDecimal((String) C0041.m6834(this)), 0, 4));
        } else {
            if (!(objM6834 instanceof Number)) {
                StringBuilder sb = new StringBuilder(C0004.m1549(m6267(), 54, 28, 2684));
                C0016.m3605(sb, C0041.m6834(this));
                throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
            }
            jM5148 = C0028.m5148((Number) objM6834);
        }
        return C0004.m1568(jM5148);
    }

    public final String e() {
        String strM4326;
        String strM8911;
        Object objM6834 = C0041.m6834(this);
        if (objM6834 instanceof d) {
            StringBuilder sb = new StringBuilder();
            Iterator itM7807 = C0047.m7807((d) C0041.m6834(this));
            while (C0012.m2962(itM7807)) {
                C0018.m3933(sb, C0055.m8697((m) C0048.m7949(itM7807)));
            }
            return C0047.m7763(sb);
        }
        if ((objM6834 instanceof m) && ((strM4326 = C0021.m4326(C0039.m6507((m) objM6834))) == (strM8911 = C0056.m8911(m6267(), 82, 7, 2731)) || (strM4326 != null && C0058.m9103(strM4326, strM8911)))) {
            return C0055.m8697((m) C0041.m6834(this));
        }
        Object objM68342 = C0041.m6834(this);
        return objM68342 instanceof List ? C0032.m5761((List) objM68342, C0047.m7833(m6267(), 89, 1, 1394)) : C0064.m9640(C0000.m1096(objM68342));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != C0047.m7777(obj)) {
            return false;
        }
        Object objM6834 = C0041.m6834(this);
        Object objM68342 = C0041.m6834((b) obj);
        if (objM6834 != objM68342) {
            return objM6834 != null && C0058.m9103(objM6834, objM68342);
        }
        return true;
    }

    public final int f(b bVar) {
        if (C0049.m8017(this, bVar)) {
            return 0;
        }
        if (bVar == null || C0041.m6834(bVar) == null) {
            return 1;
        }
        Object objM6834 = C0041.m6834(this);
        if (objM6834 == null) {
            return -1;
        }
        if (objM6834 instanceof String) {
            return C0050.m8124(C0047.m7744(this), C0047.m7744(bVar));
        }
        if (objM6834 instanceof Number) {
            return C0038.m6464(C0038.m6470(this), C0038.m6470(bVar));
        }
        StringBuilder sb = new StringBuilder(C0004.m1549(m6267(), 90, 32, 2574));
        C0018.m3933(sb, C0033.m5876(this));
        throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
    }

    public final void g() {
        this.c = true;
        String strM1096 = C0000.m1096(C0041.m6834(this));
        boolean zM1433 = C0003.m1433(strM1096);
        String strM7718 = C0046.m7718(m6267(), 122, 1, 1677);
        if (!zM1433 && !C0003.m1433(strM7718) && C0043.m7277(strM1096, strM7718)) {
            strM1096 = C0056.m8890(strM1096, 1);
        }
        boolean zM14332 = C0003.m1433(strM1096);
        String strM3525 = C0016.m3525(m6267(), 123, 1, 2767);
        if (!zM14332 && !C0003.m1433(strM3525) && C0043.m7277(strM1096, strM3525)) {
            strM1096 = C0056.m8890(strM1096, 1);
        }
        this.a = C0049.m7999(C0049.m7999(strM1096, strM7718), strM3525);
    }

    public final int hashCode() {
        Object objM6834 = C0041.m6834(this);
        if (objM6834 == null) {
            return 0;
        }
        return C0050.m8087(objM6834);
    }

    public final String toString() {
        com.github.catvod.spider.merge.N0.a aVar = new com.github.catvod.spider.merge.N0.a(this);
        Object objM6834 = C0041.m6834(this);
        com.github.catvod.spider.merge.N0.b bVarM6250 = C0036.m6250(aVar);
        StringBuffer stringBufferM9196 = C0059.m9196(aVar);
        C0031.m5608(bVarM6250, stringBufferM9196, objM6834);
        boolean zM6322 = C0037.m6322(this);
        C0036.m6190(bVarM6250, stringBufferM9196, C0016.m3525(m6267(), 124, 6, 1360));
        C0036.m6237(stringBufferM9196, zM6322);
        C0051.m8251(stringBufferM9196, C0036.m6242(bVarM6250));
        boolean zM1541 = C0004.m1541(this);
        C0036.m6190(bVarM6250, stringBufferM9196, C0054.m8574(m6267(), 130, 9, 1155));
        C0036.m6237(stringBufferM9196, zM1541);
        C0051.m8251(stringBufferM9196, C0036.m6242(bVarM6250));
        return C0052.m8343(aVar);
    }
}