package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0136t extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f338short = {665, 646, 720, 651, 646, 711, 650, 2318, 2321, 2375, 2332, 2321, 2384, 2394, 2333, 2197, 2186, 2268, 2183, 2186, 2251, 2241, 2186, 2180, 2251, 2182};
    protected final int a;
    protected final int b;

    public AbstractC0136t(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    /* renamed from: ۣ۟۠۟۟, reason: not valid java name and contains not printable characters */
    public static String m2729(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((AbstractC0136t) obj).c();
        }
        return null;
    }

    /* renamed from: ۟ۤۤۢۡ, reason: not valid java name and contains not printable characters */
    public static int m2730(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((AbstractC0136t) obj).b;
        }
        return 0;
    }

    /* renamed from: ۠۠۠ۤ, reason: not valid java name and contains not printable characters */
    public static int m2731(Object obj) {
        if (C0038.m6471() > 0) {
            return ((AbstractC0136t) obj).a;
        }
        return 0;
    }

    /* renamed from: ۠ۦۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m2732() {
        if (C0035.m6140() <= 0) {
            return f338short;
        }
        return null;
    }

    /* renamed from: ۣۥۦ۟, reason: not valid java name and contains not printable characters */
    public static int m2733(Object obj, Object obj2) {
        if (C0058.m9131() <= 0) {
            return ((AbstractC0136t) obj).b((l) obj2);
        }
        return 0;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM9066 = C0058.m9066(lVar2);
        if (lVarM9066 != null && !(lVarM9066 instanceof h)) {
            int iM2733 = m2733(this, lVar2);
            int iM2731 = m2731(this);
            if (iM2731 == 0) {
                return iM2733 == m2730(this);
            }
            int iM2730 = iM2733 - m2730(this);
            if (iM2730 * iM2731 >= 0 && iM2730 % iM2731 == 0) {
                return true;
            }
        }
        return false;
    }

    protected abstract int b(l lVar);

    protected abstract String c();

    public String toString() {
        return m2731(this) == 0 ? C0002.m1327(C0048.m7902(m2732(), 0, 7, 675), new Object[]{m2729(this), C0011.m2808(m2730(this))}) : m2730(this) == 0 ? C0002.m1327(C0034.m6001(m2732(), 7, 8, 2356), new Object[]{m2729(this), C0011.m2808(m2731(this))}) : C0002.m1327(C0024.m4740(m2732(), 15, 11, 2223), new Object[]{m2729(this), C0011.m2808(m2731(this)), C0011.m2808(m2730(this))});
    }
}