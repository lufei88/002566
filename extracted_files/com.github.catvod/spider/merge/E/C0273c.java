package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.e.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273c implements Collection, Set {
    public static Object[] g;
    public static int h;
    public static Object[] i;
    public static int j;
    public int[] a;
    public Object[] b;
    public int c;
    public C0271a d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f773short = {1687, 1681, 844, 832, 1750, 1674, 1686, 1687, 1677, 1758, 1709, 1691, 1674, 1751};
    public static final int[] e = new int[0];
    public static final Object[] f = new Object[0];

    public C0273c(int i2) {
        if (i2 == 0) {
            this.a = C0045.m7555();
            this.b = C0034.m5979();
        } else {
            C0014.m3358(this, i2);
        }
        this.c = 0;
    }

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0273c.class) {
                try {
                    if (C0053.m8409() < 10) {
                        objArr[0] = C0024.m4697();
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        i = objArr;
                        j = C0053.m8409() + 1;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0273c.class) {
                try {
                    if (C0065.m9734() < 10) {
                        objArr[0] = C0024.m4658();
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        g = objArr;
                        h = C0065.m9734() + 1;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ۦۢۧۤ, reason: contains not printable characters */
    public static short[] m8163() {
        if (C0020.m4210() <= 0) {
            return f773short;
        }
        return null;
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (C0273c.class) {
                try {
                    Object[] objArrM4697 = C0024.m4697();
                    if (objArrM4697 != null) {
                        this.b = objArrM4697;
                        i = (Object[]) objArrM4697[0];
                        this.a = (int[]) objArrM4697[1];
                        objArrM4697[1] = null;
                        objArrM4697[0] = null;
                        j = C0053.m8409() - 1;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0273c.class) {
                try {
                    Object[] objArrM4658 = C0024.m4658();
                    if (objArrM4658 != null) {
                        this.b = objArrM4658;
                        g = (Object[]) objArrM4658[0];
                        this.a = (int[]) objArrM4658[1];
                        objArrM4658[1] = null;
                        objArrM4658[0] = null;
                        h = C0065.m9734() - 1;
                        return;
                    }
                } finally {
                }
            }
        }
        this.a = new int[i2];
        this.b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iM9755;
        if (obj == null) {
            iM9755 = C0042.m7193(this);
            i2 = 0;
        } else {
            int iM8087 = C0050.m8087(obj);
            i2 = iM8087;
            iM9755 = C0065.m9755(this, iM8087, obj);
        }
        if (iM9755 >= 0) {
            return false;
        }
        int i3 = iM9755 ^ (-1);
        int iM7475 = C0044.m7475(this);
        int[] iArrM1296 = C0002.m1296(this);
        if (iM7475 >= iArrM1296.length) {
            int i4 = 8;
            if (iM7475 >= 8) {
                i4 = (iM7475 >> 1) + iM7475;
            } else if (iM7475 < 4) {
                i4 = 4;
            }
            Object[] objArrM6158 = C0035.m6158(this);
            C0014.m3358(this, i4);
            int[] iArrM12962 = C0002.m1296(this);
            if (iArrM12962.length > 0) {
                C0062.m9384(iArrM1296, 0, iArrM12962, 0, iArrM1296.length);
                C0062.m9384(objArrM6158, 0, C0035.m6158(this), 0, objArrM6158.length);
            }
            C0023.m4576(iArrM1296, objArrM6158, C0044.m7475(this));
        }
        int iM74752 = C0044.m7475(this);
        if (i3 < iM74752) {
            int[] iArrM12963 = C0002.m1296(this);
            int i5 = i3 + 1;
            C0062.m9384(iArrM12963, i3, iArrM12963, i5, iM74752 - i3);
            Object[] objArrM61582 = C0035.m6158(this);
            C0062.m9384(objArrM61582, i3, objArrM61582, i5, C0044.m7475(this) - i3);
        }
        C0002.m1296(this)[i3] = i2;
        C0035.m6158(this)[i3] = obj;
        this.c = C0044.m7475(this) + 1;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int iM8006 = C0049.m8006(collection) + C0044.m7475(this);
        int[] iArrM1296 = C0002.m1296(this);
        boolean zM1097 = false;
        if (iArrM1296.length < iM8006) {
            Object[] objArrM6158 = C0035.m6158(this);
            C0014.m3358(this, iM8006);
            int iM7475 = C0044.m7475(this);
            if (iM7475 > 0) {
                C0062.m9384(iArrM1296, 0, C0002.m1296(this), 0, iM7475);
                C0062.m9384(objArrM6158, 0, C0035.m6158(this), 0, C0044.m7475(this));
            }
            C0023.m4576(iArrM1296, objArrM6158, C0044.m7475(this));
        }
        Iterator itM1943 = C0008.m1943(collection);
        while (C0012.m2962(itM1943)) {
            zM1097 |= C0000.m1097(this, C0048.m7949(itM1943));
        }
        return zM1097;
    }

    public final int c(int i2, Object obj) {
        int iM7475 = C0044.m7475(this);
        if (iM7475 == 0) {
            return -1;
        }
        int iM1339 = C0002.m1339(C0002.m1296(this), iM7475, i2);
        if (iM1339 < 0 || C0058.m9103(obj, C0035.m6158(this)[iM1339])) {
            return iM1339;
        }
        int i3 = iM1339 + 1;
        while (i3 < iM7475 && C0002.m1296(this)[i3] == i2) {
            if (C0058.m9103(obj, C0035.m6158(this)[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1339 - 1; i4 >= 0 && C0002.m1296(this)[i4] == i2; i4--) {
            if (C0058.m9103(obj, C0035.m6158(this)[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int iM7475 = C0044.m7475(this);
        if (iM7475 != 0) {
            C0023.m4576(C0002.m1296(this), C0035.m6158(this), iM7475);
            this.a = C0045.m7555();
            this.b = C0034.m5979();
            this.c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return C0026.m4898(this, obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        while (C0012.m2962(itM1943)) {
            if (!C0005.m1673(this, C0048.m7949(itM1943))) {
                return false;
            }
        }
        return true;
    }

    public final int d() {
        int iM7475 = C0044.m7475(this);
        if (iM7475 == 0) {
            return -1;
        }
        int iM1339 = C0002.m1339(C0002.m1296(this), iM7475, 0);
        if (iM1339 < 0 || C0035.m6158(this)[iM1339] == null) {
            return iM1339;
        }
        int i2 = iM1339 + 1;
        while (i2 < iM7475 && C0002.m1296(this)[i2] == 0) {
            if (C0035.m6158(this)[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1339 - 1; i3 >= 0 && C0002.m1296(this)[i3] == 0; i3--) {
            if (C0035.m6158(this)[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public final void e(int i2) {
        Object[] objArrM6158 = C0035.m6158(this);
        Object obj = objArrM6158[i2];
        int iM7475 = C0044.m7475(this);
        if (iM7475 <= 1) {
            C0023.m4576(C0002.m1296(this), objArrM6158, iM7475);
            this.a = C0045.m7555();
            this.b = C0034.m5979();
            this.c = 0;
            return;
        }
        int[] iArrM1296 = C0002.m1296(this);
        if (iArrM1296.length <= 8 || iM7475 >= iArrM1296.length / 3) {
            int i3 = iM7475 - 1;
            this.c = i3;
            if (i2 < i3) {
                int i4 = i2 + 1;
                C0062.m9384(iArrM1296, i4, iArrM1296, i2, i3 - i2);
                Object[] objArrM61582 = C0035.m6158(this);
                C0062.m9384(objArrM61582, i4, objArrM61582, i2, C0044.m7475(this) - i2);
            }
            C0035.m6158(this)[C0044.m7475(this)] = null;
            return;
        }
        C0014.m3358(this, iM7475 > 8 ? iM7475 + (iM7475 >> 1) : 8);
        this.c = C0044.m7475(this) - 1;
        if (i2 > 0) {
            C0062.m9384(iArrM1296, 0, C0002.m1296(this), 0, i2);
            C0062.m9384(objArrM6158, 0, C0035.m6158(this), 0, i2);
        }
        int iM74752 = C0044.m7475(this);
        if (i2 < iM74752) {
            int i5 = i2 + 1;
            C0062.m9384(iArrM1296, i5, C0002.m1296(this), i2, iM74752 - i2);
            C0062.m9384(objArrM6158, i5, C0035.m6158(this), i2, C0044.m7475(this) - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (C0044.m7475(this) != C0007.m1832(set)) {
                return false;
            }
            for (int i2 = 0; i2 < C0044.m7475(this); i2++) {
                try {
                    if (!C0057.m9034(set, C0035.m6158(this)[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArrM1296 = C0002.m1296(this);
        int iM7475 = C0044.m7475(this);
        int i2 = 0;
        for (int i3 = 0; i3 < iM7475; i3++) {
            i2 += iArrM1296[i3];
        }
        return i2;
    }

    public final int indexOf(Object obj) {
        return obj == null ? C0042.m7193(this) : C0065.m9755(this, C0050.m8087(obj), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return C0044.m7475(this) <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (C0013.m3154(this) == null) {
            this.d = new C0271a(1, this);
        }
        C0271a c0271aM3154 = C0013.m3154(this);
        if (C0024.m4707(c0271aM3154) == null) {
            c0271aM3154.b = new C0278h(c0271aM3154, 1);
        }
        return C0030.m5413(C0024.m4707(c0271aM3154));
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM4898 = C0026.m4898(this, obj);
        if (iM4898 < 0) {
            return false;
        }
        C0052.m8298(this, iM4898);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator itM1943 = C0008.m1943(collection);
        boolean zM3092 = false;
        while (C0012.m2962(itM1943)) {
            zM3092 |= C0013.m3092(this, C0048.m7949(itM1943));
        }
        return zM3092;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int iM7475 = C0044.m7475(this) - 1; iM7475 >= 0; iM7475--) {
            if (!C0035.m6107(collection, C0035.m6158(this)[iM7475])) {
                C0052.m8298(this, iM7475);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return C0044.m7475(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int iM7475 = C0044.m7475(this);
        Object[] objArr = new Object[iM7475];
        C0062.m9384(C0035.m6158(this), 0, objArr, 0, iM7475);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length < C0044.m7475(this)) {
            objArr2 = (Object[]) C0047.m7792(C0030.m5404(C0047.m7777(objArr2)), C0044.m7475(this));
        }
        C0062.m9384(C0035.m6158(this), 0, objArr2, 0, C0044.m7475(this));
        int length = objArr2.length;
        int iM7475 = C0044.m7475(this);
        if (length > iM7475) {
            objArr2[iM7475] = null;
        }
        return objArr2;
    }

    public final String toString() {
        if (C0064.m9681(this)) {
            return C0024.m4740(m8163(), 0, 2, 1772);
        }
        StringBuilder sb = new StringBuilder(C0044.m7475(this) * 14);
        C0062.m9399(sb, '{');
        for (int i2 = 0; i2 < C0044.m7475(this); i2++) {
            if (i2 > 0) {
                C0018.m3933(sb, C0049.m8007(m8163(), 2, 2, 864));
            }
            Object obj = C0035.m6158(this)[i2];
            if (obj != this) {
                C0016.m3605(sb, obj);
            } else {
                C0018.m3933(sb, C0051.m8259(m8163(), 4, 10, 1790));
            }
        }
        C0062.m9399(sb, '}');
        return C0047.m7763(sb);
    }
}