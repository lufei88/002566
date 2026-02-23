package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.O;

/* loaded from: classes.dex */
final class j implements O {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f187short = {2048, 2064};
    final /* synthetic */ StringBuilder a;

    j(StringBuilder sb) {
        this.a = sb;
    }

    /* renamed from: ۣ۟۠ۦۦ, reason: not valid java name and contains not printable characters */
    public static void m2196(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            l.m2210((StringBuilder) obj, (u) obj2);
        }
    }

    /* renamed from: ۟ۥ۟ۥۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2197(Object obj) {
        if (C0058.m9131() < 0) {
            return u.M((StringBuilder) obj);
        }
        return false;
    }

    /* renamed from: ۡۡۥۢ, reason: not valid java name and contains not printable characters */
    public static F m2198(Object obj) {
        if (C0024.m4693() < 0) {
            return l.m2216((l) obj);
        }
        return null;
    }

    /* renamed from: ۡۤۦۢ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2199(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((j) obj).a;
        }
        return null;
    }

    /* renamed from: ۣۢۨۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2200() {
        if (C0002.m1242() > 0) {
            return f187short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.O
    public final void a(r rVar, int i) {
        if (rVar instanceof u) {
            m2196(m2199(this), (u) rVar);
        } else if (rVar instanceof l) {
            l lVar = (l) rVar;
            if (C0006.m1693(m2199(this)) > 0) {
                if ((C0000.m1078(lVar) || C0007.m1815(C0017.m3670(m2198(lVar)), C0031.m5565(m2200(), 0, 2, 2146))) && !m2197(m2199(this))) {
                    C0062.m9399(m2199(this), ' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.O
    public final void b(r rVar, int i) {
        if ((rVar instanceof l) && C0000.m1078((l) rVar) && (C0027.m5045(rVar) instanceof u) && !m2197(m2199(this))) {
            C0062.m9399(m2199(this), ' ');
        }
    }
}