package com.github.catvod.spider.merge.e;

import android.graphics.Typeface;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.LinkedHashMap;

/* renamed from: com.github.catvod.spider.merge.e.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276f {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f775short = {1424, 1438, 1410, 1499, 1478, 1478, 1499, 1429, 1422, 1431, 1431, 1668, 1674, 1686, 1743, 1746, 1746, 1743, 1665, 1690, 1667, 1667, 1743, 1683, 1683, 1743, 1689, 1678, 1667, 1690, 1674, 1743, 1746, 1746, 1743, 1665, 1690, 1667, 1667, 2665, 2612, 2606, 2621, 2594, 2568, 2593, 2671, 2670, 2663, 2606, 2612, 2663, 2613, 2594, 2615, 2600, 2613, 2611, 2606, 2601, 2592, 2663, 2606, 2601, 2596, 2600, 2601, 2612, 2606, 2612, 2611, 2594, 2601, 2611, 2663, 2613, 2594, 2612, 2610, 2603, 2611, 2612, 2662, 1175, 1193, 1198, 1176, 1210, 1208, 1203, 1214, 1152, 1206, 1210, 1187, 1160, 1202, 1185, 1214, 1254, 1258, 1261, 1271, 1203, 1202, 1199, 1192, 1254, 1691, 1754, 1758, 1732, 1732, 1746, 1732, 1674, 2490, 2558, 2559, 2530, 2500, 2551, 2530, 2547, 2475, 1840, 1864};
    public final LinkedHashMap a = new LinkedHashMap(0, 0.75f, true);
    public int b;
    public int c;
    public int d;

    /* renamed from: ۟ۥۡۥ, reason: not valid java name and contains not printable characters */
    public static short[] m8167() {
        if (C0052.m8320() >= 0) {
            return f775short;
        }
        return null;
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException(C0035.m6131(m8167(), 0, 11, 1531));
        }
        synchronized (this) {
            try {
                Object objM6401 = C0038.m6401(C0062.m9377(this), obj);
                if (objM6401 != null) {
                    this.c = C0027.m5007(this) + 1;
                    return objM6401;
                }
                this.d = C0018.m3935(this) + 1;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Object obj, Typeface typeface) {
        if (obj == null) {
            throw new NullPointerException(C0031.m5565(m8167(), 11, 28, 1775));
        }
        synchronized (this) {
            try {
                this.b = C0048.m7932(this) + 1;
                if (C0037.m6362(C0062.m9377(this), obj, typeface) != null) {
                    this.b = C0048.m7932(this) - 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C0059.m9216(this, 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r0 = new java.lang.StringBuilder();
        com.github.catvod.spider.merge.F0.C0018.m3933(r0, com.github.catvod.spider.p000mergexbpq.j.C0013.m3085(com.github.catvod.spider.merge.e.C0276f.class));
        com.github.catvod.spider.merge.F0.C0018.m3933(r0, com.github.catvod.spider.merge.S0.C0028.m5109(m8167(), 39, 44, 2631));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        throw new java.lang.IllegalStateException(com.github.catvod.spider.merge.d.C0047.m7763(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r54) {
        /*
            r53 = this;
            r3 = r54
            r2 = r53
        L4:
            monitor-enter(r2)
            int r0 = com.github.catvod.spider.merge.d0.C0048.m7932(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 < 0) goto L5b
            java.util.LinkedHashMap r0 = com.github.catvod.spider.merge.v.C0062.m9377(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = com.github.catvod.spider.merge.S0.C0029.m5267(r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            int r0 = com.github.catvod.spider.merge.d0.C0048.m7932(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L5b
            goto L1e
        L1c:
            r3 = move-exception
            goto L89
        L1e:
            int r0 = com.github.catvod.spider.merge.d0.C0048.m7932(r2)     // Catch: java.lang.Throwable -> L1c
            if (r0 <= r3) goto L59
            java.util.LinkedHashMap r0 = com.github.catvod.spider.merge.v.C0062.m9377(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r0 = com.github.catvod.spider.merge.S0.C0029.m5267(r0)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L2f
            goto L59
        L2f:
            java.util.LinkedHashMap r0 = com.github.catvod.spider.merge.v.C0062.m9377(r2)     // Catch: java.lang.Throwable -> L1c
            java.util.Set r0 = com.github.catvod.spider.merge.d0.C0048.m7895(r0)     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r0 = com.github.catvod.spider.merge.S0.C0029.m5199(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r0 = com.github.catvod.spider.merge.d0.C0048.m7949(r0)     // Catch: java.lang.Throwable -> L1c
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = com.github.catvod.spider.merge.b0.C0045.m7624(r0)     // Catch: java.lang.Throwable -> L1c
            com.github.catvod.spider.merge.Z.C0039.m6540(r0)     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r0 = com.github.catvod.spider.merge.v.C0062.m9377(r2)     // Catch: java.lang.Throwable -> L1c
            com.github.catvod.spider.merge.Q0.C0026.m4885(r0, r1)     // Catch: java.lang.Throwable -> L1c
            int r0 = com.github.catvod.spider.merge.d0.C0048.m7932(r2)     // Catch: java.lang.Throwable -> L1c
            int r0 = r0 + (-1)
            r2.b = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L4
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            return
        L5b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.Class<com.github.catvod.spider.merge.e.f> r1 = com.github.catvod.spider.merge.e.C0276f.class
            java.lang.String r1 = com.github.catvod.spider.p000mergexbpq.j.C0013.m3085(r1)     // Catch: java.lang.Throwable -> L1c
            com.github.catvod.spider.merge.F0.C0018.m3933(r0, r1)     // Catch: java.lang.Throwable -> L1c
            short[] r13 = m8167()     // Catch: java.lang.Throwable -> L1c
            r16 = 2631(0xa47, float:3.687E-42)
            r14 = 39
            r15 = 44
            java.lang.String r13 = com.github.catvod.spider.merge.S0.C0028.m5109(r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L1c
            r1 = r13
            com.github.catvod.spider.merge.F0.C0018.m3933(r0, r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = com.github.catvod.spider.merge.d.C0047.m7763(r0)     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            throw r3     // Catch: java.lang.Throwable -> L1c
        L89:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            goto L8c
        L8b:
            throw r3
        L8c:
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.e.C0276f.c(int):void");
    }

    public final synchronized String toString() {
        String strM7763;
        String strM3332 = C0014.m3332(m8167(), 83, 25, 1243);
        synchronized (this) {
            try {
                int iM5007 = C0027.m5007(this);
                int iM3935 = C0018.m3935(this) + iM5007;
                int i = iM3935 != 0 ? (iM5007 * 100) / iM3935 : 0;
                C0025.m4785();
                int iM50072 = C0027.m5007(this);
                int iM39352 = C0018.m3935(this);
                StringBuilder sb = new StringBuilder(strM3332);
                C0036.m6177(sb, iM50072);
                C0018.m3933(sb, C0004.m1549(m8167(), 108, 8, 1719));
                C0036.m6177(sb, iM39352);
                C0018.m3933(sb, C0063.m9585(m8167(), 116, 9, 2454));
                C0036.m6177(sb, i);
                C0018.m3933(sb, C0025.m4795(m8167(), 125, 2, 1813));
                strM7763 = C0047.m7763(sb);
            } catch (Throwable th) {
                throw th;
            }
        }
        return strM7763;
    }
}