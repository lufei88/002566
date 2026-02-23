package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.F0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0148e implements Set {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f429short = {1910, 1866, 1867, 1873, 1794, 1873, 1863, 1878, 1794, 1867, 1873, 1794, 1872, 1863, 1859, 1862, 1869, 1868, 1870, 1883, 2641, 2669, 2668, 2678, 2597, 2678, 2656, 2673, 2597, 2668, 2678, 2597, 2679, 2656, 2660, 2657, 2666, 2667, 2665, 2684, 603, 615, 614, 636, 559, 636, 618, 635, 559, 614, 636, 559, 637, 618, 622, 619, 608, 609, 611, 630, 1335, 1291, 1290, 1296, 1347, 1294, 1286, 1303, 1291, 1292, 1287, 1347, 1290, 1296, 1347, 1293, 1292, 1303, 1347, 1290, 1294, 1299, 1295, 1286, 1294, 1286, 1293, 1303, 1286, 1287, 1347, 1285, 1292, 1297, 1347, 1297, 1286, 1282, 1287, 1292, 1293, 1295, 1306, 1347, 1296, 1286, 1303, 1296, 1357, 3111, 3171, 3178, 3192, 3160, 3182, 3174, 3178, 3173, 3199, 3170, 3176, 3144, 3172, 3173, 3199, 3182, 3187, 3199, 3126, 2473, 2544, 2539, 2540, 2548, 2544, 2528, 2500, 2537, 2545, 2488, 1615, 1536, 1548, 1549, 1541, 1551, 1546, 1536, 1559, 1546, 1549, 1540, 1570, 1551, 1559, 1552, 1630, 2087, 2159, 2146, 2171, 2168, 2114, 2149, 2175, 2148, 2116, 2174, 2175, 2158, 2169, 2120, 2148, 2149, 2175, 2158, 2163, 2175};
    public int d;
    public BitSet e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public boolean a = false;
    public final ArrayList c = new ArrayList(7);
    public int i = -1;
    public C0147d b = new C0147d(0);

    public C0148e(boolean z) {
        this.h = z;
    }

    /* renamed from: ۟۟ۦۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3866() {
        if (C0021.m4379() > 0) {
            return f429short;
        }
        return null;
    }

    public final void a(C0145b c0145b, C0163u c0163u) {
        if (C0041.m6765(this)) {
            throw new IllegalStateException(C0004.m1549(m3866(), 0, 20, 1826));
        }
        if (C0048.m7921(c0145b) != C0058.m9087()) {
            this.f = true;
        }
        if ((C0020.m4213(c0145b) & (-1073741825)) > 0) {
            this.g = true;
        }
        C0145b c0145b2 = (C0145b) C0042.m7137(C0055.m8743(this), c0145b);
        if (c0145b2 == c0145b) {
            this.i = -1;
            C0004.m1532(C0065.m9781(this), c0145b);
            return;
        }
        Q qM4096 = C0019.m4096(C0055.m8777(c0145b2), C0055.m8777(c0145b), !C0010.m2279(this), c0163u);
        c0145b2.d = C0008.m1965(C0020.m4213(c0145b2), C0020.m4213(c0145b));
        if (C0056.m8930(c0145b)) {
            c0145b2.d = C0020.m4213(c0145b2) | 1073741824;
        }
        c0145b2.c = qM4096;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        C0041.m6835(this, (C0145b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        while (C0012.m2962(itM1943)) {
            C0041.m6835(this, (C0145b) C0048.m7949(itM1943), null);
        }
        return false;
    }

    public final void b(AbstractC0151h abstractC0151h) {
        if (C0041.m6765(this)) {
            throw new IllegalStateException(C0013.m3106(m3866(), 20, 20, 2565));
        }
        if (C0010.m2323(C0055.m8743(this))) {
            return;
        }
        Iterator itM7816 = C0047.m7816(C0065.m9781(this));
        while (C0012.m2962(itM7816)) {
            C0145b c0145b = (C0145b) C0048.m7949(itM7816);
            Q qM8777 = C0055.m8777(c0145b);
            S sM8142 = C0050.m8142(abstractC0151h);
            if (sM8142 != null) {
                synchronized (sM8142) {
                    qM8777 = C0011.m2771(qM8777, C0050.m8142(abstractC0151h), new IdentityHashMap());
                }
            }
            c0145b.c = qM8777;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (C0041.m6765(this)) {
            throw new IllegalStateException(C0050.m8131(m3866(), 40, 20, 527));
        }
        C0017.m3687(C0065.m9781(this));
        this.i = -1;
        C0006.m1724(C0055.m8743(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0147d c0147dM8743 = C0055.m8743(this);
        if (c0147dM8743 != null) {
            return C0055.m8770(c0147dM8743, obj);
        }
        throw new UnsupportedOperationException(C0016.m3525(m3866(), 60, 49, 1379));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0148e)) {
            return false;
        }
        C0148e c0148e = (C0148e) obj;
        ArrayList arrayListM9781 = C0065.m9781(this);
        return arrayListM9781 != null && C0007.m1866(arrayListM9781, C0065.m9781(c0148e)) && C0010.m2279(this) == C0010.m2279(c0148e) && C0062.m9410(this) == C0062.m9410(c0148e) && C0029.m5296(this) == C0029.m5296(c0148e) && C0046.m7660(this) == C0046.m7660(c0148e) && C0058.m9107(this) == C0058.m9107(c0148e);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean zM6765 = C0041.m6765(this);
        ArrayList arrayListM9781 = C0065.m9781(this);
        if (!zM6765) {
            return C0052.m8371(arrayListM9781);
        }
        if (C0047.m7828(this) == -1) {
            this.i = C0052.m8371(arrayListM9781);
        }
        return C0047.m7828(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return C0007.m1817(C0065.m9781(this));
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return C0047.m7816(C0065.m9781(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return C0009.m2139(C0065.m9781(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (C0145b[]) C0046.m7690(C0055.m8743(this));
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return C0042.m7145(C0055.m8743(this), objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0037.m6312(C0065.m9781(this)));
        if (C0046.m7660(this)) {
            C0018.m3933(sb, C0035.m6131(m3866(), 109, 20, 3083));
            C0006.m1736(sb, C0046.m7660(this));
        }
        if (C0062.m9410(this) != 0) {
            C0018.m3933(sb, C0056.m8911(m3866(), 129, 11, 2437));
            C0036.m6177(sb, C0062.m9410(this));
        }
        if (C0029.m5296(this) != null) {
            C0018.m3933(sb, C0035.m6131(m3866(), 140, 17, 1635));
            C0016.m3605(sb, C0029.m5296(this));
        }
        if (C0058.m9107(this)) {
            C0018.m3933(sb, C0055.m8814(m3866(), 157, 21, 2059));
        }
        return C0047.m7763(sb);
    }
}