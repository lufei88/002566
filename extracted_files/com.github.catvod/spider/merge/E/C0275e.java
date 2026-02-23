package com.github.catvod.spider.merge.e;

import android.util.SparseArray;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* renamed from: com.github.catvod.spider.merge.e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275e implements Cloneable {
    public long[] a;
    public Object[] b;
    public int c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f774short = {745, 751, 3024, 3036, 2407, 2363, 2343, 2342, 2364, 2415, 2306, 2350, 2367, 2406};
    public static final Object d = new Object();

    public C0275e() {
        int i;
        int i2 = 4;
        while (true) {
            i = 24;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (24 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.a = new long[i4];
        this.b = new Object[i4];
    }

    /* renamed from: ۟ۥۧۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m8164() {
        if (C0041.m6823() < 0) {
            return f774short;
        }
        return null;
    }

    /* renamed from: ۤۧۨۨ, reason: not valid java name and contains not printable characters */
    public static Object m8165(Object obj) {
        if (C0021.m4379() > 0) {
            return ((long[]) obj).clone();
        }
        return null;
    }

    /* renamed from: ۧۤ۠ۡ, reason: not valid java name and contains not printable characters */
    public static Object m8166(Object obj) {
        if (C0035.m6140() < 0) {
            return ((Object[]) obj).clone();
        }
        return null;
    }

    public final Object a(long j) {
        Object obj;
        int iM4617 = C0023.m4617(C0039.m6543(this), C0019.m4037(this), j);
        if (iM4617 < 0 || (obj = C0062.m9393(this)[iM4617]) == C0036.m6249()) {
            return null;
        }
        return obj;
    }

    public final void b(long j, SparseArray sparseArray) {
        int iM4617 = C0023.m4617(C0039.m6543(this), C0019.m4037(this), j);
        if (iM4617 >= 0) {
            C0062.m9393(this)[iM4617] = sparseArray;
            return;
        }
        int i = iM4617 ^ (-1);
        int iM4037 = C0019.m4037(this);
        if (i < iM4037) {
            Object[] objArrM9393 = C0062.m9393(this);
            if (objArrM9393[i] == C0036.m6249()) {
                C0039.m6543(this)[i] = j;
                objArrM9393[i] = sparseArray;
                return;
            }
        }
        if (iM4037 >= C0039.m6543(this).length) {
            int i2 = (iM4037 + 1) * 8;
            int i3 = 4;
            while (true) {
                if (i3 >= 32) {
                    break;
                }
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
            int i5 = i2 / 8;
            long[] jArr = new long[i5];
            Object[] objArr = new Object[i5];
            long[] jArrM6543 = C0039.m6543(this);
            C0062.m9384(jArrM6543, 0, jArr, 0, jArrM6543.length);
            Object[] objArrM93932 = C0062.m9393(this);
            C0062.m9384(objArrM93932, 0, objArr, 0, objArrM93932.length);
            this.a = jArr;
            this.b = objArr;
        }
        int iM40372 = C0019.m4037(this) - i;
        if (iM40372 != 0) {
            long[] jArrM65432 = C0039.m6543(this);
            int i6 = i + 1;
            C0062.m9384(jArrM65432, i, jArrM65432, i6, iM40372);
            Object[] objArrM93933 = C0062.m9393(this);
            C0062.m9384(objArrM93933, i, objArrM93933, i6, C0019.m4037(this) - i);
        }
        C0039.m6543(this)[i] = j;
        C0062.m9393(this)[i] = sparseArray;
        this.c = C0019.m4037(this) + 1;
    }

    public final Object clone() {
        try {
            C0275e c0275e = (C0275e) super.clone();
            c0275e.a = (long[]) m8165(C0039.m6543(this));
            c0275e.b = (Object[]) m8166(C0062.m9393(this));
            return c0275e;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final String toString() {
        int iM4037 = C0019.m4037(this);
        if (iM4037 <= 0) {
            return C0049.m8007(m8164(), 0, 2, 658);
        }
        StringBuilder sb = new StringBuilder(iM4037 * 28);
        C0062.m9399(sb, '{');
        for (int i = 0; i < C0019.m4037(this); i++) {
            if (i > 0) {
                C0018.m3933(sb, C0009.m2037(m8164(), 2, 2, 3068));
            }
            C0058.m9141(sb, C0039.m6543(this)[i]);
            C0062.m9399(sb, '=');
            Object obj = C0062.m9393(this)[i];
            if (obj != this) {
                C0016.m3605(sb, obj);
            } else {
                C0018.m3933(sb, C0058.m9106(m8164(), 4, 10, 2383));
            }
        }
        C0062.m9399(sb, '}');
        return C0047.m7763(sb);
    }
}