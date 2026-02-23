package com.github.catvod.spider.merge.d;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.github.catvod.spider.merge.d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0266a implements Iterable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f761short = {1723, 1928, 1924, 915};
    public C0268c a;
    public C0268c b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;
    public final HashMap e = new HashMap();

    /* renamed from: ۢ۠ۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m7740() {
        if (C0051.m8216() < 0) {
            return f761short;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (com.github.catvod.spider.merge.Z.C0038.m6444(r3) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (com.github.catvod.spider.merge.Z.C0038.m6444((com.github.catvod.spider.merge.d.C0267b) r7) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r58) {
        /*
            r57 = this;
            r7 = r58
            r6 = r57
            r0 = 1
            if (r7 != r6) goto L8
            return r0
        L8:
            boolean r1 = r7 instanceof com.github.catvod.spider.merge.d.C0266a
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            com.github.catvod.spider.merge.d.a r7 = (com.github.catvod.spider.merge.d.C0266a) r7
            int r1 = com.github.catvod.spider.p000mergexbpq.R.C0003.m1458(r6)
            int r3 = com.github.catvod.spider.p000mergexbpq.R.C0003.m1458(r7)
            if (r1 == r3) goto L1b
            return r2
        L1b:
            java.util.Iterator r1 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2959(r6)
            java.util.Iterator r7 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2959(r7)
        L23:
            r3 = r1
            com.github.catvod.spider.merge.d.b r3 = (com.github.catvod.spider.merge.d.C0267b) r3
            boolean r4 = com.github.catvod.spider.merge.Z.C0038.m6444(r3)
            if (r4 == 0) goto L4c
            r4 = r7
            com.github.catvod.spider.merge.d.b r4 = (com.github.catvod.spider.merge.d.C0267b) r4
            boolean r5 = com.github.catvod.spider.merge.Z.C0038.m6444(r4)
            if (r5 == 0) goto L4c
            java.lang.Object r3 = com.github.catvod.spider.merge.o0.C0056.m8910(r3)
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = com.github.catvod.spider.merge.o0.C0056.m8910(r4)
            if (r3 != 0) goto L43
            if (r4 != 0) goto L4b
        L43:
            if (r3 == 0) goto L23
            boolean r3 = com.github.catvod.spider.merge.Z0.C0041.m6763(r3, r4)
            if (r3 != 0) goto L23
        L4b:
            return r2
        L4c:
            boolean r1 = com.github.catvod.spider.merge.Z.C0038.m6444(r3)
            if (r1 != 0) goto L5b
            com.github.catvod.spider.merge.d.b r7 = (com.github.catvod.spider.merge.d.C0267b) r7
            boolean r7 = com.github.catvod.spider.merge.Z.C0038.m6444(r7)
            if (r7 != 0) goto L5b
            goto L5c
        L5b:
            r0 = 0
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.d.C0266a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator itM2959 = C0012.m2959(this);
        int iM1163 = 0;
        while (true) {
            C0267b c0267b = (C0267b) itM2959;
            if (!C0038.m6444(c0267b)) {
                return iM1163;
            }
            iM1163 += C0001.m1163((Map.Entry) C0056.m8910(c0267b));
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0267b c0267b = new C0267b(C0041.m6787(this), C0035.m6141(this), 0);
        C0056.m8948(C0041.m6766(this), c0267b, C0057.m9003());
        return c0267b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0052.m8337(m7740(), 0, 1, 1760));
        Iterator itM2959 = C0012.m2959(this);
        while (true) {
            C0267b c0267b = (C0267b) itM2959;
            if (!C0038.m6444(c0267b)) {
                C0018.m3933(sb, C0022.m4403(m7740(), 3, 1, 974));
                return C0047.m7763(sb);
            }
            C0018.m3933(sb, C0037.m6312((Map.Entry) C0056.m8910(c0267b)));
            if (C0038.m6444(c0267b)) {
                C0018.m3933(sb, C0042.m7151(m7740(), 1, 2, 1956));
            }
        }
    }
}