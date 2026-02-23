package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge-xbpq.Z.a;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.O;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes.dex */
final class q implements O {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f192short = {1345, 1302, 1287, 1306, 1302};
    private final Appendable a;
    private final g b;

    q(Appendable appendable, g gVar) {
        this.a = appendable;
        this.b = gVar;
        m2254(gVar);
    }

    /* renamed from: ۟ۡۦۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m2252() {
        if (C0060.m9355() > 0) {
            return f192short;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static void m2253(Object obj, Object obj2, int i, Object obj3) {
        if (C0053.m8389() >= 0) {
            ((r) obj).w((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۟ۤۢۢۡ, reason: not valid java name and contains not printable characters */
    public static CharsetEncoder m2254(Object obj) {
        if (C0021.m4379() > 0) {
            return ((g) obj).e();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Appendable m2255(Object obj) {
        if (C0038.m6471() > 0) {
            return ((q) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static void m2256(Object obj, Object obj2, int i, Object obj3) {
        if (C0033.m5872() > 0) {
            ((r) obj).x((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۣۨ۟۠, reason: not valid java name and contains not printable characters */
    public static g m2257(Object obj) {
        if (C0054.m8557() < 0) {
            return ((q) obj).b;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge-xbpq.Z.a */
    @Override // com.github.catvod.spider.p000mergexbpq.e0.O
    public final void a(r rVar, int i) throws a {
        try {
            m2253(rVar, m2255(this), i, m2257(this));
        } catch (IOException e) {
            throw new a(e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.merge-xbpq.Z.a */
    @Override // com.github.catvod.spider.p000mergexbpq.e0.O
    public final void b(r rVar, int i) throws a {
        if (C0007.m1815(C0024.m4670(rVar), C0025.m4795(m2252(), 0, 5, 1378))) {
            return;
        }
        try {
            m2256(rVar, m2255(this), i, m2257(this));
        } catch (IOException e) {
            throw new a(e);
        }
    }
}