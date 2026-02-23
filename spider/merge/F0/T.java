package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class T implements Map {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f420short = {2500, 2498, 3067, 2012, 2000};
    public int b = 0;
    public int c = 12;
    public LinkedList[] a = new LinkedList[8];

    /* renamed from: ۠ۥ۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m3857() {
        if (C0001.m1164() <= 0) {
            return f420short;
        }
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        this.a = new LinkedList[16];
        this.b = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return C0014.m3292(this, obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r61) {
        /*
            r60 = this;
            r10 = r61
            r9 = r60
            r0 = 0
            if (r10 != 0) goto L8
            return r0
        L8:
            r1 = r10
            com.github.catvod.spider.merge.F0.b r1 = (com.github.catvod.spider.merge.F0.C0145b) r1
            com.github.catvod.spider.merge.F0.i r2 = com.github.catvod.spider.merge.d.C0047.m7799(r1)
            int r2 = com.github.catvod.spider.merge.i0.C0055.m8704(r2)
            r3 = 7
            int r2 = com.github.catvod.spider.merge.r0.C0059.m9238(r3, r2)
            com.github.catvod.spider.merge.F0.Q r1 = com.github.catvod.spider.merge.i0.C0055.m8777(r1)
            int r1 = com.github.catvod.spider.merge.V.C0031.m5632(r2, r1)
            r2 = 2
            int r1 = com.github.catvod.spider.merge.a1.C0043.m7334(r1, r2)
            java.util.LinkedList[] r2 = com.github.catvod.spider.p000mergexbpq.c.C0009.m2065(r9)
            int r3 = r2.length
            r4 = 1
            int r3 = r3 - r4
            r1 = r1 & r3
            r1 = r2[r1]
            if (r1 != 0) goto L32
            return r0
        L32:
            java.util.Iterator r1 = com.github.catvod.spider.merge.d.C0047.m7807(r1)
        L36:
            boolean r2 = com.github.catvod.spider.p000mergexbpq.i.C0012.m2962(r1)
            if (r2 == 0) goto L7a
            java.lang.Object r2 = com.github.catvod.spider.merge.d0.C0048.m7949(r1)
            com.github.catvod.spider.merge.H0.b r2 = (com.github.catvod.spider.merge.H0.b) r2
            java.lang.Object r3 = com.github.catvod.spider.merge.V.C0032.m5738(r2)
            com.github.catvod.spider.merge.F0.b r3 = (com.github.catvod.spider.merge.F0.C0145b) r3
            r5 = r10
            com.github.catvod.spider.merge.F0.b r5 = (com.github.catvod.spider.merge.F0.C0145b) r5
            if (r3 != r5) goto L4f
        L4d:
            r6 = 1
            goto L73
        L4f:
            r6 = 0
            if (r3 == 0) goto L73
            com.github.catvod.spider.merge.F0.i r7 = com.github.catvod.spider.merge.d.C0047.m7799(r3)
            int r7 = com.github.catvod.spider.merge.i0.C0055.m8704(r7)
            com.github.catvod.spider.merge.F0.i r8 = com.github.catvod.spider.merge.d.C0047.m7799(r5)
            int r8 = com.github.catvod.spider.merge.i0.C0055.m8704(r8)
            if (r7 != r8) goto L73
            com.github.catvod.spider.merge.F0.Q r3 = com.github.catvod.spider.merge.i0.C0055.m8777(r3)
            com.github.catvod.spider.merge.F0.Q r5 = com.github.catvod.spider.merge.i0.C0055.m8777(r5)
            boolean r3 = com.github.catvod.spider.merge.G.C0019.m4058(r3, r5)
            if (r3 == 0) goto L73
            goto L4d
        L73:
            if (r6 == 0) goto L36
            java.lang.Object r10 = com.github.catvod.spider.merge.P0.C0024.m4749(r2)
            return r10
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.F0.T.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int hashCode() {
        com.github.catvod.spider.merge.H0.b bVar;
        int iM9238 = 0;
        for (LinkedList linkedList : C0009.m2065(this)) {
            if (linkedList != null) {
                Iterator itM7807 = C0047.m7807(linkedList);
                while (C0012.m2962(itM7807) && (bVar = (com.github.catvod.spider.merge.H0.b) C0048.m7949(itM7807)) != null) {
                    C0145b c0145b = (C0145b) C0032.m5738(bVar);
                    iM9238 = C0059.m9238(iM9238, C0043.m7334(C0031.m5632(C0059.m9238(7, C0055.m8704(C0047.m7799(c0145b))), C0055.m8777(c0145b)), 2));
                }
            }
        }
        return C0043.m7334(iM9238, C0013.m3157(this));
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return C0013.m3157(this) == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        com.github.catvod.spider.merge.H0.b bVar;
        if (obj == null) {
            return null;
        }
        int iM3157 = C0013.m3157(this);
        if (iM3157 > C0038.m6404(this)) {
            LinkedList[] linkedListArrM2065 = C0009.m2065(this);
            int length = linkedListArrM2065.length * 2;
            this.a = new LinkedList[length];
            double d = length;
            C0004.m1564(d);
            this.c = (int) (d * 0.75d);
            for (LinkedList linkedList : linkedListArrM2065) {
                if (linkedList != null) {
                    Iterator itM7807 = C0047.m7807(linkedList);
                    while (C0012.m2962(itM7807) && (bVar = (com.github.catvod.spider.merge.H0.b) C0048.m7949(itM7807)) != null) {
                        C0029.m5299(this, C0032.m5738(bVar), C0024.m4749(bVar));
                    }
                }
            }
            this.b = iM3157;
        }
        C0145b c0145b = (C0145b) obj;
        int iM7334 = C0043.m7334(C0031.m5632(C0059.m9238(7, C0055.m8704(C0047.m7799(c0145b))), C0055.m8777(c0145b)), 2);
        LinkedList[] linkedListArrM20652 = C0009.m2065(this);
        int length2 = iM7334 & (linkedListArrM20652.length - 1);
        LinkedList linkedList2 = linkedListArrM20652[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArrM20652[length2] = linkedList2;
        }
        Iterator itM78072 = C0047.m7807(linkedList2);
        while (C0012.m2962(itM78072)) {
            com.github.catvod.spider.merge.H0.b bVar2 = (com.github.catvod.spider.merge.H0.b) C0048.m7949(itM78072);
            C0145b c0145b2 = (C0145b) C0032.m5738(bVar2);
            C0145b c0145b3 = (C0145b) obj;
            if (c0145b2 == c0145b3 || (c0145b2 != null && C0055.m8704(C0047.m7799(c0145b2)) == C0055.m8704(C0047.m7799(c0145b3)) && C0019.m4058(C0055.m8777(c0145b2), C0055.m8777(c0145b3)))) {
                Object objM4749 = C0024.m4749(bVar2);
                bVar2.b = obj2;
                this.b = C0013.m3157(this) + 1;
                return objM4749;
            }
        }
        C0031.m5644(linkedList2, new com.github.catvod.spider.merge.H0.b(obj, obj2));
        this.b = C0013.m3157(this) + 1;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return C0013.m3157(this);
    }

    public final String toString() {
        com.github.catvod.spider.merge.H0.b bVar;
        if (C0013.m3157(this) == 0) {
            return C0025.m4795(m3857(), 0, 2, 2495);
        }
        StringBuilder sb = new StringBuilder(C0027.m5062(m3857(), 2, 1, 2944));
        boolean z = true;
        for (LinkedList linkedList : C0009.m2065(this)) {
            if (linkedList != null) {
                Iterator itM7807 = C0047.m7807(linkedList);
                while (C0012.m2962(itM7807) && (bVar = (com.github.catvod.spider.merge.H0.b) C0048.m7949(itM7807)) != null) {
                    if (z) {
                        z = false;
                    } else {
                        C0018.m3933(sb, C0030.m5362(m3857(), 3, 2, 2032));
                    }
                    C0018.m3933(sb, C0031.m5578(bVar));
                }
            }
        }
        C0062.m9399(sb, '}');
        return C0047.m7763(sb);
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(C0013.m3157(this));
        for (LinkedList linkedList : C0009.m2065(this)) {
            if (linkedList != null) {
                Iterator itM7807 = C0047.m7807(linkedList);
                while (C0012.m2962(itM7807)) {
                    C0004.m1532(arrayList, C0024.m4749((com.github.catvod.spider.merge.H0.b) C0048.m7949(itM7807)));
                }
            }
        }
        return arrayList;
    }
}