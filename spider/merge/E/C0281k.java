package com.github.catvod.spider.merge.e;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.e.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0281k {
    public static Object[] d;
    public static int e;
    public static Object[] f;
    public static int g;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f777short = {1132, 1130, 858, 854, 1902, 1842, 1838, 1839, 1845, 1894, 1803, 1831, 1846, 1903};
    public int[] a = C0041.m6805();
    public Object[] b = C0011.m2770();
    public int c = 0;

    public static void b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0281k.class) {
                try {
                    if (C0018.m3957() < 10) {
                        objArr[0] = C0025.m4811();
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f = objArr;
                        g = C0018.m3957() + 1;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0281k.class) {
                try {
                    if (C0037.m6308() < 10) {
                        objArr[0] = C0046.m7659();
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        d = objArr;
                        e = C0037.m6308() + 1;
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: ۟ۥ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8169() {
        if (C0056.m8886() < 0) {
            return f777short;
        }
        return null;
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (C0281k.class) {
                try {
                    Object[] objArrM4811 = C0025.m4811();
                    if (objArrM4811 != null) {
                        this.b = objArrM4811;
                        f = (Object[]) objArrM4811[0];
                        this.a = (int[]) objArrM4811[1];
                        objArrM4811[1] = null;
                        objArrM4811[0] = null;
                        g = C0018.m3957() - 1;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0281k.class) {
                try {
                    Object[] objArrM7659 = C0046.m7659();
                    if (objArrM7659 != null) {
                        this.b = objArrM7659;
                        d = (Object[]) objArrM7659[0];
                        this.a = (int[]) objArrM7659[1];
                        objArrM7659[1] = null;
                        objArrM7659[0] = null;
                        e = C0037.m6308() - 1;
                        return;
                    }
                } finally {
                }
            }
        }
        this.a = new int[i];
        this.b = new Object[i << 1];
    }

    public final int c(int i, Object obj) {
        int iM7150 = C0042.m7150(this);
        if (iM7150 == 0) {
            return -1;
        }
        try {
            int iM1339 = C0002.m1339(C0002.m1306(this), iM7150, i);
            if (iM1339 < 0 || C0058.m9103(obj, C0009.m2126(this)[iM1339 << 1])) {
                return iM1339;
            }
            int i2 = iM1339 + 1;
            while (i2 < iM7150 && C0002.m1306(this)[i2] == i) {
                if (C0058.m9103(obj, C0009.m2126(this)[i2 << 1])) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM1339 - 1; i3 >= 0 && C0002.m1306(this)[i3] == i; i3--) {
                if (C0058.m9103(obj, C0009.m2126(this)[i3 << 1])) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int iM7150 = C0042.m7150(this);
        if (iM7150 > 0) {
            int[] iArrM1306 = C0002.m1306(this);
            Object[] objArrM2126 = C0009.m2126(this);
            this.a = C0041.m6805();
            this.b = C0011.m2770();
            this.c = 0;
            C0054.m8606(iArrM1306, objArrM2126, iM7150);
        }
        if (C0042.m7150(this) > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return C0046.m7730(this, obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return C0045.m7540(this, obj) >= 0;
    }

    public final int d(Object obj) {
        return obj == null ? C0052.m8342(this) : C0044.m7478(this, C0050.m8087(obj), obj);
    }

    public final int e() {
        int iM7150 = C0042.m7150(this);
        if (iM7150 == 0) {
            return -1;
        }
        try {
            int iM1339 = C0002.m1339(C0002.m1306(this), iM7150, 0);
            if (iM1339 < 0 || C0009.m2126(this)[iM1339 << 1] == null) {
                return iM1339;
            }
            int i = iM1339 + 1;
            while (i < iM7150 && C0002.m1306(this)[i] == 0) {
                if (C0009.m2126(this)[i << 1] == null) {
                    return i;
                }
                i++;
            }
            for (int i2 = iM1339 - 1; i2 >= 0 && C0002.m1306(this)[i2] == 0; i2--) {
                if (C0009.m2126(this)[i2 << 1] == null) {
                    return i2;
                }
            }
            return i ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0281k) {
            C0281k c0281k = (C0281k) obj;
            if (C0042.m7150(this) != C0042.m7150(c0281k)) {
                return false;
            }
            for (int i = 0; i < C0042.m7150(this); i++) {
                try {
                    Object[] objArrM2126 = C0009.m2126(this);
                    int i2 = i << 1;
                    Object obj2 = objArrM2126[i2];
                    Object obj3 = objArrM2126[i2 + 1];
                    Object objM4868 = C0025.m4868(c0281k, obj2, null);
                    if (obj3 == null) {
                        if (objM4868 != null || !C0023.m4552(c0281k, obj2)) {
                            return false;
                        }
                    } else if (!C0058.m9103(obj3, objM4868)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (C0042.m7150(this) != C0038.m6428(map)) {
                return false;
            }
            for (int i3 = 0; i3 < C0042.m7150(this); i3++) {
                try {
                    Object[] objArrM21262 = C0009.m2126(this);
                    int i4 = i3 << 1;
                    Object obj4 = objArrM21262[i4];
                    Object obj5 = objArrM21262[i4 + 1];
                    Object objM9431 = C0062.m9431(map, obj4);
                    if (obj5 == null) {
                        if (objM9431 != null || !C0024.m4748(map, obj4)) {
                            return false;
                        }
                    } else if (!C0058.m9103(obj5, objM9431)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int iM7150 = C0042.m7150(this) * 2;
        Object[] objArrM2126 = C0009.m2126(this);
        if (obj == null) {
            for (int i = 1; i < iM7150; i += 2) {
                if (objArrM2126[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < iM7150; i2 += 2) {
            if (C0058.m9103(obj, objArrM2126[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int i) {
        Object[] objArrM2126 = C0009.m2126(this);
        int i2 = i << 1;
        Object obj = objArrM2126[i2 + 1];
        int iM7150 = C0042.m7150(this);
        int i3 = 0;
        if (iM7150 <= 1) {
            C0054.m8606(C0002.m1306(this), objArrM2126, iM7150);
            this.a = C0041.m6805();
            this.b = C0011.m2770();
        } else {
            int i4 = iM7150 - 1;
            int[] iArrM1306 = C0002.m1306(this);
            if (iArrM1306.length <= 8 || iM7150 >= iArrM1306.length / 3) {
                if (i < i4) {
                    int i5 = i + 1;
                    int i6 = i4 - i;
                    C0062.m9384(iArrM1306, i5, iArrM1306, i, i6);
                    Object[] objArrM21262 = C0009.m2126(this);
                    C0062.m9384(objArrM21262, i5 << 1, objArrM21262, i2, i6 << 1);
                }
                Object[] objArrM21263 = C0009.m2126(this);
                int i7 = i4 << 1;
                objArrM21263[i7] = null;
                objArrM21263[i7 + 1] = null;
            } else {
                C0063.m9559(this, iM7150 > 8 ? iM7150 + (iM7150 >> 1) : 8);
                if (iM7150 != C0042.m7150(this)) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    C0062.m9384(iArrM1306, 0, C0002.m1306(this), 0, i);
                    C0062.m9384(objArrM2126, 0, C0009.m2126(this), 0, i2);
                }
                if (i < i4) {
                    int i8 = i + 1;
                    int i9 = i4 - i;
                    C0062.m9384(iArrM1306, i8, C0002.m1306(this), i, i9);
                    C0062.m9384(objArrM2126, i8 << 1, C0009.m2126(this), i2, i9 << 1);
                }
            }
            i3 = i4;
        }
        if (iM7150 != C0042.m7150(this)) {
            throw new ConcurrentModificationException();
        }
        this.c = i3;
        return obj;
    }

    public final Object get(Object obj) {
        return C0025.m4868(this, obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM7730 = C0046.m7730(this, obj);
        return iM7730 >= 0 ? C0009.m2126(this)[(iM7730 << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArrM1306 = C0002.m1306(this);
        Object[] objArrM2126 = C0009.m2126(this);
        int iM7150 = C0042.m7150(this);
        int i = 1;
        int i2 = 0;
        int iM8087 = 0;
        while (i2 < iM7150) {
            Object obj = objArrM2126[i];
            iM8087 += (obj == null ? 0 : C0050.m8087(obj)) ^ iArrM1306[i2];
            i2++;
            i += 2;
        }
        return iM8087;
    }

    public final boolean isEmpty() {
        return C0042.m7150(this) <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iM7478;
        int iM7150 = C0042.m7150(this);
        if (obj == null) {
            iM7478 = C0052.m8342(this);
            i = 0;
        } else {
            int iM8087 = C0050.m8087(obj);
            i = iM8087;
            iM7478 = C0044.m7478(this, iM8087, obj);
        }
        if (iM7478 >= 0) {
            int i2 = (iM7478 << 1) + 1;
            Object[] objArrM2126 = C0009.m2126(this);
            Object obj3 = objArrM2126[i2];
            objArrM2126[i2] = obj2;
            return obj3;
        }
        int i3 = iM7478 ^ (-1);
        int[] iArrM1306 = C0002.m1306(this);
        if (iM7150 >= iArrM1306.length) {
            int i4 = 8;
            if (iM7150 >= 8) {
                i4 = (iM7150 >> 1) + iM7150;
            } else if (iM7150 < 4) {
                i4 = 4;
            }
            Object[] objArrM21262 = C0009.m2126(this);
            C0063.m9559(this, i4);
            if (iM7150 != C0042.m7150(this)) {
                throw new ConcurrentModificationException();
            }
            int[] iArrM13062 = C0002.m1306(this);
            if (iArrM13062.length > 0) {
                C0062.m9384(iArrM1306, 0, iArrM13062, 0, iArrM1306.length);
                C0062.m9384(objArrM21262, 0, C0009.m2126(this), 0, objArrM21262.length);
            }
            C0054.m8606(iArrM1306, objArrM21262, iM7150);
        }
        if (i3 < iM7150) {
            int[] iArrM13063 = C0002.m1306(this);
            int i5 = i3 + 1;
            C0062.m9384(iArrM13063, i3, iArrM13063, i5, iM7150 - i3);
            Object[] objArrM21263 = C0009.m2126(this);
            C0062.m9384(objArrM21263, i3 << 1, objArrM21263, i5 << 1, (C0042.m7150(this) - i3) << 1);
        }
        int iM71502 = C0042.m7150(this);
        if (iM7150 == iM71502) {
            int[] iArrM13064 = C0002.m1306(this);
            if (i3 < iArrM13064.length) {
                iArrM13064[i3] = i;
                Object[] objArrM21264 = C0009.m2126(this);
                int i6 = i3 << 1;
                objArrM21264[i6] = obj;
                objArrM21264[i6 + 1] = obj2;
                this.c = iM71502 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object objM4868 = C0025.m4868(this, obj, null);
        return objM4868 == null ? C0005.m1666(this, obj, obj2) : objM4868;
    }

    public final Object remove(Object obj) {
        int iM7730 = C0046.m7730(this, obj);
        if (iM7730 >= 0) {
            return C0052.m8300(this, iM7730);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM7730 = C0046.m7730(this, obj);
        if (iM7730 < 0) {
            return false;
        }
        Object obj3 = C0009.m2126(this)[(iM7730 << 1) + 1];
        if (obj2 != obj3 && (obj2 == null || !C0058.m9103(obj2, obj3))) {
            return false;
        }
        C0052.m8300(this, iM7730);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM7730 = C0046.m7730(this, obj);
        if (iM7730 < 0) {
            return null;
        }
        int i = (iM7730 << 1) + 1;
        Object[] objArrM2126 = C0009.m2126(this);
        Object obj3 = objArrM2126[i];
        objArrM2126[i] = obj2;
        return obj3;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM7730 = C0046.m7730(this, obj);
        if (iM7730 < 0) {
            return false;
        }
        int i = (iM7730 << 1) + 1;
        Object obj4 = C0009.m2126(this)[i];
        if (obj4 != obj2 && (obj2 == null || !C0058.m9103(obj2, obj4))) {
            return false;
        }
        Object[] objArrM2126 = C0009.m2126(this);
        Object obj5 = objArrM2126[i];
        objArrM2126[i] = obj3;
        return true;
    }

    public final int size() {
        return C0042.m7150(this);
    }

    public final String toString() {
        if (C0048.m7972(this)) {
            return C0000.m1077(m8169(), 0, 2, 1047);
        }
        StringBuilder sb = new StringBuilder(C0042.m7150(this) * 28);
        C0062.m9399(sb, '{');
        for (int i = 0; i < C0042.m7150(this); i++) {
            if (i > 0) {
                C0018.m3933(sb, C0051.m8259(m8169(), 2, 2, 886));
            }
            int i2 = i << 1;
            Object obj = C0009.m2126(this)[i2];
            String strM3525 = C0016.m3525(m8169(), 4, 10, 1862);
            if (obj != this) {
                C0016.m3605(sb, obj);
            } else {
                C0018.m3933(sb, strM3525);
            }
            C0062.m9399(sb, '=');
            Object obj2 = C0009.m2126(this)[i2 + 1];
            if (obj2 != this) {
                C0016.m3605(sb, obj2);
            } else {
                C0018.m3933(sb, strM3525);
            }
        }
        C0062.m9399(sb, '}');
        return C0047.m7763(sb);
    }
}