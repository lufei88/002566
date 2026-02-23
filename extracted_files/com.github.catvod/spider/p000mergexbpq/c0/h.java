package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.d0.C0069b;
import com.github.catvod.spider.p000mergexbpq.d0.E;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends l {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f185short = {1233, 1152, 1181, 1181, 1158, 2617, 2597, 2620, 2621, 1654, 1659, 1648, 1645, 1366, 1346, 1361, 1373, 1365, 1347, 1365, 1348, 2662, 2593, 2602, 2598, 2608, 2600, 2592, 2603, 2609};
    private g l;
    private E m;
    private int n;

    public h() {
        super(C0051.m8211(C0005.m1645(m2191(), 0, 5, 1266), C0029.m5248()), C0007.m1840(), null);
        this.l = new g();
        this.n = 1;
        this.m = new E(new C0069b());
    }

    /* renamed from: ۣ۟ۧ۟۟, reason: not valid java name and contains not printable characters */
    public static E m2189(Object obj) {
        if (C0058.m9131() < 0) {
            return ((h) obj).m;
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۧ۠, reason: not valid java name and contains not printable characters */
    public static int m2190(Object obj) {
        if (C0047.m7837() > 0) {
            return ((h) obj).n;
        }
        return 0;
    }

    /* renamed from: ۟ۦۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2191() {
        if (C0019.m4065() < 0) {
            return f185short;
        }
        return null;
    }

    /* renamed from: ۢۢۢۥ, reason: not valid java name and contains not printable characters */
    public static List m2192(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((l) obj).Q();
        }
        return null;
    }

    /* renamed from: ۦۢۥۤ, reason: contains not printable characters */
    public static g m2193(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((h) obj).l;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.l
    public final /* bridge */ /* synthetic */ l S() {
        return C0000.m1080(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.l, com.github.catvod.spider.p000mergexbpq.c0.r
    public final /* bridge */ /* synthetic */ Object clone() {
        return C0000.m1080(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.l, com.github.catvod.spider.p000mergexbpq.c0.r
    public final /* bridge */ /* synthetic */ r j() {
        return C0000.m1080(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.l
    public final l o0(String str) {
        l lVarM6415;
        l lVarM64152;
        Iterator itM3109 = C0013.m3109(m2192(this));
        while (true) {
            boolean zM2962 = C0012.m2962(itM3109);
            String strM8574 = C0054.m8574(m2191(), 5, 4, 2641);
            if (!zM2962) {
                lVarM6415 = C0038.m6415(this, strM8574);
                break;
            }
            lVarM6415 = (l) C0048.m7949(itM3109);
            if (C0007.m1815(C0049.m8027(lVarM6415), strM8574)) {
                break;
            }
        }
        Iterator itM31092 = C0013.m3109(m2192(lVarM6415));
        while (true) {
            boolean zM29622 = C0012.m2962(itM31092);
            String strM8477 = C0053.m8477(m2191(), 9, 4, 1556);
            if (!zM29622) {
                lVarM64152 = C0038.m6415(lVarM6415, strM8477);
                break;
            }
            lVarM64152 = (l) C0048.m7949(itM31092);
            if (C0007.m1815(strM8477, C0049.m8027(lVarM64152))) {
                break;
            }
            if (C0007.m1815(C0042.m7151(m2191(), 13, 8, 1328), C0049.m8027(lVarM64152))) {
                break;
            }
        }
        C0046.m7692(lVarM64152, str);
        return this;
    }

    public final h r0() {
        h hVar = (h) super.S();
        hVar.l = C0031.m5635(m2193(this));
        return hVar;
    }

    public final g s0() {
        return m2193(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.l, com.github.catvod.spider.p000mergexbpq.c0.r
    public final String t() {
        return C0037.m6307(m2191(), 21, 9, 2629);
    }

    public final h t0(E e) {
        this.m = e;
        return this;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final String u() {
        return C0002.m1258(this);
    }

    public final E u0() {
        return m2189(this);
    }

    public final h v0() {
        this.n = 2;
        return this;
    }

    public final int w0() {
        return m2190(this);
    }
}