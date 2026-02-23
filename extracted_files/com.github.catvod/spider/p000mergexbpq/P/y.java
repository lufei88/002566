package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.R.b;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f147short = {3051, 3050, 3043, 3050, 3048, 3054, 3067, 3050, 3068};
    private final Collection<? extends a> a;

    public y(Collection<? extends a> collection) {
        if (collection == null) {
            throw new NullPointerException(C0047.m7833(m857(), 0, 9, 2959));
        }
        this.a = collection;
    }

    /* renamed from: ۟۟ۧ۟ۥ, reason: not valid java name and contains not printable characters */
    public static void m852(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0037.m6350() <= 0) {
            ((a) obj).b((w) obj2, (b) obj3, i, i2, (BitSet) obj4, (f) obj5);
        }
    }

    /* renamed from: ۟۠۟ۦ۟, reason: not valid java name and contains not printable characters */
    public static void m853(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0063.m9589() <= 0) {
            ((a) obj).a((B) obj2, obj3, i, i2, (String) obj4, (z) obj5);
        }
    }

    /* renamed from: ۟ۡۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static void m854(Object obj, Object obj2, Object obj3, int i, int i2, int i3, Object obj4) {
        if (C0006.m1726() <= 0) {
            ((a) obj).d((w) obj2, (b) obj3, i, i2, i3, (f) obj4);
        }
    }

    /* renamed from: ۤۢۥۦ, reason: not valid java name and contains not printable characters */
    public static void m855(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4, Object obj5) {
        if (C0043.m7332() >= 0) {
            ((a) obj).c((w) obj2, (b) obj3, i, i2, (BitSet) obj4, (f) obj5);
        }
    }

    /* renamed from: ۣۨۢۥ, reason: not valid java name and contains not printable characters */
    public static Collection m856(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((y) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m857() {
        if (C0002.m1242() > 0) {
            return f147short;
        }
        return null;
    }

    public final void a(B<?, ?> b, Object obj, int i, int i2, String str, z zVar) {
        Iterator itM1943 = C0008.m1943(m856(this));
        while (C0012.m2962(itM1943)) {
            m853((a) C0048.m7949(itM1943), b, obj, i, i2, str, zVar);
        }
    }

    public final void b(w wVar, b bVar, int i, int i2, BitSet bitSet, f fVar) {
        Iterator itM1943 = C0008.m1943(m856(this));
        while (C0012.m2962(itM1943)) {
            m852((a) C0048.m7949(itM1943), wVar, bVar, i, i2, bitSet, fVar);
        }
    }

    public final void c(w wVar, b bVar, int i, int i2, BitSet bitSet, f fVar) {
        Iterator itM1943 = C0008.m1943(m856(this));
        while (C0012.m2962(itM1943)) {
            m855((a) C0048.m7949(itM1943), wVar, bVar, i, i2, bitSet, fVar);
        }
    }

    public final void d(w wVar, b bVar, int i, int i2, int i3, f fVar) {
        Iterator itM1943 = C0008.m1943(m856(this));
        while (C0012.m2962(itM1943)) {
            m854((a) C0048.m7949(itM1943), wVar, bVar, i, i2, i3, fVar);
        }
    }
}